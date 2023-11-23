
package persistencia;

import beans.VeiculoBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import util.Conexao;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import telas.AluguelVeiculos;
import telas.CadastrarVeiculo;
import telas.ListadeAluguel;
import telas.PesquisarVeiculo;
import telas.TelaFaturamento;


public  class VeiculoListaDAO implements VeiculoListaDAOListener{

    //Listar todos veiculos
    public boolean ListarAllVeiculos() throws Exception {
        PreparedStatement stm = null;
        Connection Conexao = null;
        ResultSet rs = null;
        //Array list
        List<String> VeiculoList = new ArrayList<>();
        try {
            Conexao conection = new Conexao();
            Conexao = conection.getconnection();
            String sql = "SELECT modelo FROM icmnts66_locadora.veiculo";
            stm = Conexao.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String VeiculoNomes = rs.getString("modelo");
                VeiculoList.add(VeiculoNomes);
            }

            for (int i = 0; i < VeiculoList.size(); i++) {
                AluguelVeiculos.VeiculoLista.addItem(VeiculoList.get(i));
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Listar veículos cadastrado");

        }
        return false;

    }
@Override
    //Lista clientes
    public boolean ListarAllClientes() throws Exception {
        PreparedStatement stm = null;
        Connection Conexao = null;
        ResultSet rs = null;
        Conexao conexao = new Conexao();
        //Array list
        List<String> ClienteList = new ArrayList<>();
        try {
            Conexao conection = new Conexao();
            Conexao = conection.getconnection();
            String sql = "SELECT cliente.nomeCliente FROM icmnts66_locadora.cliente";
            stm = Conexao.prepareStatement(sql);
            rs = stm.executeQuery();
            while (rs.next()) {
                String ClientesNomes = rs.getString("nomeCliente");
                ClienteList.add(ClientesNomes);
            }
            for (int i = 0; i < ClienteList.size(); i++) {
                AluguelVeiculos.txtCliente.addItem(ClienteList.get(i));
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro ao Listar veículos Clientes");
        }
        return false;
    }
    @Override
    //Listar Alugueis
   public void ListarAlugueis() throws Exception{
           PreparedStatement stm = null;
           Connection Conexao = null;
            ResultSet rs = null;
            Conexao conexao = new Conexao();
            //Array listas
             List<Integer > Idlist = new ArrayList<>();
             List<String> VeiculosList = new ArrayList<>();
             List<String> ClientesList = new ArrayList<>();
             List<String> DatasAluguelList = new ArrayList<>();
             List<String> DatasEntregarList = new ArrayList<>();
                try {
                    Conexao conection = new Conexao();
                    Conexao = conection.getconnection();
                    String sql = "SELECT * FROM icmnts66_locadora.aluguel ";
                     stm = Conexao.prepareStatement(sql);
                     rs = stm.executeQuery();

                        while(rs.next()){
                            int Id = rs.getInt("idaluguel");
                            Idlist.add(Id);
                            String VeiculoNomes = rs.getString("veiculo");
                            VeiculosList.add(VeiculoNomes);
                            String ClienteNomes = rs.getString("cliente");
                            ClientesList.add(ClienteNomes);
                            String DatasAlugueis = rs.getString("dataAluguel");
                            DatasAluguelList.add(DatasAlugueis);
                            String DatasEntregar = rs.getString("dataentrega");
                            DatasEntregarList.add(DatasEntregar);
                        }
                        DefaultTableModel model = (DefaultTableModel) ListadeAluguel.TableAlugueis.getModel();
                        int proximaLinha = model.getRowCount();
                        
                        for(int i = 0; i < Idlist.size(); i++){
                            model.addRow(new Object[] {
                                    Idlist.get(i),
                                    VeiculosList.get(i),
                                    ClientesList.get(i),
                                    DatasAluguelList.get(i),
                                    DatasEntregarList.get(i) });
                        }

                } catch (SQLException e) {
                    e.printStackTrace();
                    JOptionPane.showMessageDialog(null, "Erro ao Listar todos alugueis");

                 }
   
   } 
   
   @Override
   //Listar acessorios
    public  void ListarAcessorios() throws Exception{
           PreparedStatement stm = null;
           Connection Conexao = null;
            ResultSet rs = null;
            Conexao conexao = new Conexao();
            //Array listas
             List<String> AcessoriosLista = new ArrayList<>();
                try {
                    Conexao conection = new Conexao();
                    Conexao = conection.getconnection();
                    String sql = "SELECT acessorios_veiculos.nomeAcessorio FROM icmnts66_locadora.acessorios_veiculos";
                     stm = Conexao.prepareStatement(sql);
                     rs = stm.executeQuery();

                        while(rs.next()){
                
                            String AcessoriosNomes = rs.getString("nomeAcessorio");
                            AcessoriosLista.add(AcessoriosNomes);
                           
                        }
                        for(int i = 0; i < AcessoriosLista.size(); i++){
                           CadastrarVeiculo.txtAcessorios.addItem(AcessoriosLista.get(i));
                        }
                        
                } catch (SQLException e) {
                    e.printStackTrace();

                 }
   
   } 
    @Override
        public  void ListarAcessoriosVeiculos() throws Exception{
           PreparedStatement stm = null;
           Connection Conexao = null;
            ResultSet rs = null;
            Conexao conexao = new Conexao();
            //Array listas
             List<String> AcessoriosLista = new ArrayList<>();
                try {
                    Conexao conection = new Conexao();
                    Conexao = conection.getconnection();
                    String sql = "SELECT acessorios_veiculos.nomeAcessorio FROM icmnts66_locadora.acessorios_veiculos";
                     stm = Conexao.prepareStatement(sql);
                     rs = stm.executeQuery();

                        while(rs.next()){
                
                            String AcessoriosNomes = rs.getString("nomeAcessorio");
                            AcessoriosLista.add(AcessoriosNomes);
                           
                        }
                        for(int i = 0; i < AcessoriosLista.size(); i++){
                           PesquisarVeiculo.txtAcessorios.addItem(AcessoriosLista.get(i));
                        }
                        
                } catch (SQLException e) {
                    e.printStackTrace();

                 }
   
   } 



}
