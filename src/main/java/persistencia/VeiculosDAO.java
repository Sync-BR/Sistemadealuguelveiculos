
package persistencia;

import beans.ClienteBeans;
import beans.VeiculoBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import telas.CadastrarVeiculo;
import telas.PesquisarVeiculo;
import util.Conexao;

public class VeiculosDAO implements VeiculosDAOListener{

    public VeiculosDAO() {
    }
     public static boolean VeiculoDeletado = false;
   public static boolean VeiculoEncontrado = false;
     //Consultar por número
        public VeiculosDAO consultarNumero(VeiculoBeans numero) throws Exception{
            PreparedStatement stm = null;
            Connection conexao = null;
            ResultSet rs = null;
             try {
                    conexao = Conexao.getconnection();
                    String sql = "SELECT * FROM icmnts66_locadora.veiculo WHERE numero = ?";  
                    stm = conexao.prepareStatement(sql);
                    stm.setString(1, numero.getNumero());
                    rs = stm.executeQuery();
                            if(rs.next()){
                                String VeiculoNumero = rs.getString("numero");
                                String VeiculoPlaca = rs.getString("placa");
                                String VeiculoFabrica = rs.getString("fabricante");
                                String VeiculoModelo = rs.getString("modelo");
                                String VeiculoAno = rs.getString("anoModelo");
                                String VeiculoPortas = rs.getString("qtdPortas");
                                String VeiculoAcessorios = rs.getString("Acessorios");
                                //Prencher as informações no campo de texto
                                PesquisarVeiculo.TxtNumero.setText(VeiculoNumero);
                                PesquisarVeiculo.TxtPlaca.setText(VeiculoPlaca);
                                PesquisarVeiculo.txtFabricante.setText(VeiculoFabrica);
                                PesquisarVeiculo.txtModelo.setText(VeiculoModelo.toString());
                                PesquisarVeiculo.txtAnodoModelo.setText(VeiculoAno);
                                PesquisarVeiculo.txtPortas.addItem(VeiculoPortas.toString());
                                PesquisarVeiculo.txtAcessorios.addItem(VeiculoAcessorios.toString());
                                VeiculoEncontrado = true;
                            }  else{
                                  VeiculoEncontrado = false;
                                }
                           
                } catch (SQLException e) {
                    throw new Exception("Erro ao consultar veículo por número");
                } finally{
                  Conexao.closeConnection(conexao,stm,rs);
                }
        return null;
        }
        
        
    @Override
    //Consultar por placa
    public VeiculosDAO consultarPlaca(VeiculoBeans placa) throws Exception {
            PreparedStatement stm = null;
            Connection conexao = null;
            ResultSet rs = null;
        try {
            String sql = "SELECT * FROM icmnts66_locadora.veiculo WHERE placa = ?";
            conexao = Conexao.getconnection();
            stm = conexao.prepareStatement(sql);
            stm.setString(1, placa.getPlaca());
            rs = stm.executeQuery();

            if (rs.next()) {
                String VeiculoNumero = rs.getString("numero");
                String VeiculoPlaca = rs.getString("placa");
                String VeiculoFabrica = rs.getString("fabricante");
                String VeiculoModelo = rs.getString("modelo");
                String VeiculoAno = rs.getString("anoModelo");
                String VeiculoPortas = rs.getString("qtdPortas");
                String VeiculoAcessorios = rs.getString("Acessorios");
                //Lista informações na caixa de texto
                PesquisarVeiculo.TxtNumero.setText(VeiculoNumero);
                PesquisarVeiculo.TxtPlaca.setText(VeiculoPlaca);
                PesquisarVeiculo.txtFabricante.setText(VeiculoFabrica);
                PesquisarVeiculo.txtModelo.setText(VeiculoModelo);
                PesquisarVeiculo.txtAnodoModelo.setText(VeiculoAno);
                PesquisarVeiculo.txtPortas.addItem(VeiculoPortas.toString());
                PesquisarVeiculo.txtAcessorios.addItem(VeiculoAcessorios.toString());
                VeiculoEncontrado = true;
            }  else{
                VeiculoEncontrado = false;
            }
        } catch (SQLException e) {
             throw new Exception("Erro ao consultar veículo por placa");
           
        } finally{
            Conexao.closeConnection(conexao, stm, rs);
        }
     return null;
    }

@Override
      //Inserir de veiculos Finalizado.
         public  void inserirveiculo(VeiculoBeans veiculo) throws Exception{
                Connection conexao = null;
                PreparedStatement ps = null;
                    try{
                    conexao = Conexao.getconnection();
                    String sql = "INSERT INTO icmnts66_locadora.veiculo (numero, placa, fabricante, modelo, anoModelo, qtdPortas, Acessorios) " + "VALUES (?,?,?,?,?,?,?)";
                    ps = conexao.prepareStatement(sql);
                    ps.setString(1,veiculo.getNumero());
                    ps.setString(2, veiculo.getPlaca());
                    ps.setString(3, veiculo.getFabrica());
                    ps.setString(4, veiculo.getModelo());
                    ps.setInt(5, veiculo.getAnoModelo());
                    ps.setInt(6, veiculo.getQtdPortas());
                    ps.setString(7, veiculo.getAcessorios());
                    ps.executeUpdate();
               
                    } catch (SQLException ex) {
                        throw new Exception("Erro ao inserir veiculo.");
                   } finally{
                    Conexao.closeConnection(conexao,ps);
                   }
         }
       

 public static boolean Veiculoatualizado = false;
 @Override

 public  void AtualizarVeiculo(VeiculoBeans veiculo) throws Exception{
 Connection conexao = null;
 PreparedStatement stm = null;
    try {
        conexao = Conexao.getconnection();
        String sql = "UPDATE icmnts66_locadora.veiculo SET modelo = ?, placa = ?, anoModelo = ?, fabricante = ?,"
                + " acessorios = ?, qtdPortas = ?  WHERE numero  = ? ";
        stm = conexao.prepareStatement(sql);
        VeiculoBeans veiculolist = new VeiculoBeans();;
        stm.setString(1,veiculo.getModelo() );
        stm.setString(2, veiculo.getPlaca());
        stm.setInt(3, veiculo.getAnoModelo());
        stm.setString(4, veiculo.getFabrica());
        stm.setString(5, veiculo.getAcessorios());
        stm.setInt(6,veiculo.getQtdPortas());
        stm.setString(7, veiculo.getNumero());
        int AtualizacaoRealizada =  stm.executeUpdate();
        if(AtualizacaoRealizada > 0){
            Veiculoatualizado = true;
        } else{
            Veiculoatualizado = false;
        }
        
    } catch (SQLException e) {
      throw new Exception("Erro ao atualizar um veículo");
        
    } finally{
        Conexao.closeConnection(conexao,stm);
    }

 
}
 


  @Override
    //Apagar veiculo
    public void excluir(VeiculoBeans numero) throws Exception {
        Connection conexao = null;
        PreparedStatement stm = null;
        try {
            conexao = Conexao.getconnection();
            String sqlDeletar = "DELETE FROM icmnts66_locadora.veiculo WHERE numero = ?";
            stm = conexao.prepareStatement(sqlDeletar);
            stm.setString(1, numero.getNumero());
             int ExcluirVeiculo = stm.executeUpdate();
             if(ExcluirVeiculo > 0){
                 VeiculoDeletado = true;
             }   else{
                 VeiculoDeletado = false;
             }


        } catch (SQLException ex) {
             throw new Exception("Erro ao excluir  veículo");
        } finally{
            Conexao.closeConnection(conexao, stm);
        }

    }
         
}
