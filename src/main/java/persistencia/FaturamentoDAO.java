/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import telas.TelaFaturamento;
import util.Conexao;

public class FaturamentoDAO {

    //Metado para consultar os faturamento
    public boolean ConsultarFaturamento(String date) throws Exception {
        PreparedStatement stm = null;
        Connection conexao = null;
        ResultSet rs = null;
        //Array lista para as guarda as informações
        List<String> datasAluguel = new ArrayList<>();
        List<String> clientes = new ArrayList<>();
        List<Double> ValorDosCliente = new ArrayList<>();
        //Iniciar consultar
        try {
            conexao = Conexao.getconnection();
            String sql = "SELECT dataAluguel, cliente, valorPago FROM icmnts66_locadora.aluguel WHERE dataAluguel = ?";
            stm = conexao.prepareStatement(sql);
            stm.setString(1, date);
            rs = stm.executeQuery();
            //Lista Resultado
            while (rs.next()) {
                String datasdoAluguels = rs.getString("dataAluguel");
                String Cliente = rs.getString("cliente");
                Double valor = rs.getDouble("valorPago");
                datasAluguel.add(datasdoAluguels);
                clientes.add(Cliente);
                ValorDosCliente.add(valor);
            }
            double valorSomado = 0.0;
            //Efetuar calculo total
            for (Double valores : ValorDosCliente) {
                valorSomado += valores;
            }
            //Definir modelo da tabela padrão
            DefaultTableModel model = (DefaultTableModel) TelaFaturamento.jTable1.getModel();
            //
            int proximaLinha = model.getRowCount();
            for (int i = 0; i < clientes.size(); i++) {
                model.addRow(new Object[]{clientes.get(i), datasAluguel.get(i), ValorDosCliente.get(i)});
                TelaFaturamento.txtValorTotal.setText("Valor total do faturamento:" + valorSomado);
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Falhar ao consultar faturamento");
        } finally {
            Conexao.closeConnection(conexao, stm, rs);
        }

        return false;
    }
}
