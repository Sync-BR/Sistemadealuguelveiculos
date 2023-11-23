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
import telas.VeiculosAtrasado;
import util.Conexao;

public class VeiculosNaoEntregueDAO {
    
public static boolean AtualizarFrameVeiculo( ) throws Exception{
    PreparedStatement stm = null;
    Connection conexao = null;
    ResultSet rs = null;
    //Criar Lista Array
    List<Integer> IdsLista = new ArrayList<>();
    List<String> ClientesLista = new ArrayList<>();
    List<String> VeiculosLista = new ArrayList<>();
    List<String> DatasLista = new ArrayList<>();
    List<Integer> StatusLista = new ArrayList<>();
        try {
            conexao = Conexao.getconnection();
            String sql = "SELECT idaluguel,veiculo,dataAluguel,cliente,entregue FROM icmnts66_locadora.aluguel WHERE entregue = false ";
            stm = conexao.prepareStatement(sql);
            rs = stm.executeQuery();
            //Receber os parametros da consultar nas variavel
            while (rs.next()) {
                int IDdoaluguel = rs.getInt("idaluguel");
                String ClientesNomes = rs.getString("cliente");
                String VeiculosAlugados = rs.getString("veiculo");
                String DatasAlugueis = rs.getString("dataAluguel");
                int StatusAlugueis = rs.getInt("entregue");
                //Prencher array
                IdsLista.add(IDdoaluguel);
                ClientesLista.add(ClientesNomes);
                VeiculosLista.add(VeiculosAlugados);
                DatasLista.add(DatasAlugueis);
                StatusLista.add(StatusAlugueis);
            }
            //Definir tabela padrão Default
            DefaultTableModel model = (DefaultTableModel) VeiculosAtrasado.jTable1.getModel();
            //Prencher proxima linha da tabela
            for (int i = 0; i < IdsLista.size(); i++) {
                model.addRow(new Object[]{IdsLista.get(i), ClientesLista.get(i), VeiculosLista.get(i),
                    DatasLista.get(i), StatusLista.get(i)});
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, "Erro", JOptionPane.OK_OPTION);
        }
        return false;
    }
}
