
package persistencia;

import beans.AluguelBeans;
import beans.ClienteBeans;
import java.math.BigDecimal;
import java.sql.Connection;
import static java.sql.DriverManager.getConnection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.JOptionPane;
import telas.AluguelVeiculos;
import static telas.AluguelVeiculos.txtDataAluguel;
import static telas.AluguelVeiculos.txtDataEntregar;

import telas.PesquisarAluguel;
import telas.PesquisarVeiculo;
import util.Conexao;

public class AluguelDAO  implements  AluguelDAOListener{

    public AluguelDAO() {
    }
    public static boolean ConsultarAluguel = false;
    public static boolean  AluguelAtualizado = false;
    public static boolean  AluguelDeletado = false;
    public static boolean Aluguelinserido = false;
     // Verificar se existe usuario
    public static boolean userVerifique;
     //Verificar se existe Veiculo no banco de dados
    public static boolean ExisteVeiculo;
    //Variavel para verificar se existe aluguel pendente
    public static boolean AluguelPendente;
    //Variavel para verificar se existe um veiculo com mesmo nome no Aluguel.
    public static boolean ExisteveiculonoAluguel;
    //Verificar se existe o veiculo no Aluguel
    public  void verificarVeiculoAlugado(String veiculo) throws Exception {
        Connection Conexao = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM icmnts66_locadora.aluguel WHERE veiculo = ?";
            Conexao conection = new Conexao();
            Conexao = conection.getconnection();
            stm = Conexao.prepareStatement(sql);
            stm.setString(1, veiculo);
            rs = stm.executeQuery();
            // Receber resultado
            if (rs.next()) {
                String VeiculoModelo = rs.getString("veiculo");
                ExisteveiculonoAluguel = true;
            } else if (!rs.next()) {
                ExisteveiculonoAluguel = false;
            }

        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, " Erro ao verificar se existe Aluguel",
                    JOptionPane.INFORMATION_MESSAGE);
        }

    }


    @Override
    // 
    public void VerificarAluguel(String veiculo) throws Exception {
        Connection conexao = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conexao = Conexao.getconnection();
            String sql = "SELECT * FROM icmnts66_locadora.veiculo WHERE modelo = ?";
            stm = conexao.prepareStatement(sql);
            stm.setString(1, veiculo);
            rs = stm.executeQuery();
            // Receber resultado
            if (rs.next()) {
                String VeiculoModelo = rs.getString("modelo");
                ExisteVeiculo = true;
            } else if (!rs.next()) {
                ExisteVeiculo = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, e, " Erro ao Verificar Aluguel",
                    JOptionPane.INFORMATION_MESSAGE);
        } finally{
            Conexao.closeConnection(conexao,stm,rs);
        }
    }

    
@Override
    // Verificar se o usuario está com veiculo pendente
    public void VerificarPendencia(String nome) throws Exception {
        Connection conexao = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conexao = Conexao.getconnection();
            String sql = "SELECT * FROM icmnts66_locadora.aluguel  WHERE cliente=?   AND entregue = false";
            stm = conexao.prepareStatement(sql);
            stm.setString(1, nome);
            rs = stm.executeQuery();
                //verificar resultado
                if (rs.next()) {
                    String ClienteEncontrado = rs.getString("cliente");
                    boolean StatusEntregar = rs.getBoolean("entregue");
                    if (StatusEntregar == true) {
                        AluguelPendente = true;
                    } else if (StatusEntregar == false) {
                        
                        AluguelPendente = false;
                    }

                }
        } catch (SQLException ex) {
          throw new Exception("Erro ao verificar Aluguel Pendente");
        } finally{
            Conexao.closeConnection(conexao,stm,rs);
        }
    }


    @Override
    public void VerificarUser(String nome) throws Exception {
        Connection conexao = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conexao = Conexao.getconnection();
            String sql = "SELECT * FROM icmnts66_locadora.cliente WHERE nomeCliente= ?"; 
            stm = conexao.prepareStatement(sql);
            stm.setString(1, nome);
             rs = stm.executeQuery();
                if (rs.next()) {
                    String ClienteEncontrado = rs.getString("nomeCliente");
                    userVerifique = true;
                } else {
                    userVerifique = false;
                }
        } catch (SQLException ex) {
            throw new Exception("Erro ao verificar usuario existe");
        } finally{
            Conexao.closeConnection(conexao,stm, rs);
        }

    }
@Override
    // Inserir aluguel
    public  void inserirVeiculo(AluguelBeans aluguel) throws  Exception {
        Connection conexao = null;
        PreparedStatement ps = null;
        AluguelDAO verificarVeiculoAlugado = new AluguelDAO();
        //Verificar as Regras do Aluguel de veiculo.
        VerificarUser(AluguelVeiculos.txtCliente.getSelectedItem().toString());
        VerificarAluguel(AluguelVeiculos.VeiculoLista.getSelectedItem().toString());
        verificarVeiculoAlugado(AluguelVeiculos.VeiculoLista.getSelectedItem().toString());
        VerificarPendencia(AluguelVeiculos.txtCliente.getSelectedItem().toString());
        //verificar se o cliente existe
        if (userVerifique == true) {
            //Existe aluguel
            if (ExisteveiculonoAluguel == false) {
                //Verificar se o veiculo está aluguel
                if (ExisteVeiculo == true) {
                    //verificar se o cliente tem pendencia.
                    if (AluguelPendente == false) {
                        //Iinserir dados
                        try {
                            conexao = Conexao.getconnection();
                            AluguelBeans AlugarVeiculo = new AluguelBeans();
                            String sql = "INSERT INTO icmnts66_locadora.aluguel (observacao, veiculo,dataAluguel, dataentrega, cliente, entregue, valorPago ) VALUES(?, ?, ?, ?, ?, ?, ?)";
                            ps = conexao.prepareStatement(sql);
                            ps.setString(1, AluguelVeiculos.txtObservacao.getText());
                            ps.setString(2, AluguelVeiculos.VeiculoLista.getSelectedItem().toString());
                            ps.setString(3, AluguelVeiculos.txtDataAluguel.getText());
                            ps.setString(4, AluguelVeiculos.txtDataEntregar.getText());
                            ps.setString(5, AluguelVeiculos.txtCliente.getSelectedItem().toString());
                            ps.setBoolean(6, AluguelVeiculos.StatusVeiculo);
                            ps.setString(7, AluguelVeiculos.txtTotal.getText());
                            int inseriraluguel = ps.executeUpdate();
                            if(inseriraluguel > 0){
                                Aluguelinserido = true;
                            } else{
                                Aluguelinserido = false;
                            }
                            AluguelVeiculos.txtStatus.setText(" Foi inserido com sucesso");
                        } catch (SQLException ex) {
                              throw new Exception("Erro ao inserir aluguel por número");
                        }
                    } else {
                        AluguelPendente = false;
                        JOptionPane.showMessageDialog(null, "Existe uma pendencia para este usuario");
                    }

                } else {
                    JOptionPane.showMessageDialog(null, "Esse veículo não existe no Banco de dados");
                    ExisteVeiculo = false;
                }
            } else {
                JOptionPane.showMessageDialog(null, "Já existe esse aluguel no banco de dados");
                ExisteveiculonoAluguel = false;
            }

        } else {
             JOptionPane.showMessageDialog(null, "Cliente nao encontrado");
            userVerifique = false;
        }
    }
    @Override
    // Consultar aluguel por id
    public void  ConsultarVeiculo(int id)  throws Exception{
        Boolean VerificarData = false;
        PreparedStatement stm = null;
        Connection conexao = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM icmnts66_locadora.aluguel WHERE  idaluguel =  ?";
           conexao = Conexao.getconnection();
            stm = conexao.prepareStatement(sql);
            stm.setInt(1, id);
           rs = stm.executeQuery();
            // Buscar usuario
            if (rs.next()) {
                ConsultarAluguel = true;
                int ids = rs.getInt("idaluguel");
                String Veiculo = rs.getString("veiculo");
                Date DataAluguel = rs.getDate("dataAluguel");
                Date DataEntrega = rs.getDate("dataentrega");
                String ClienteNome = rs.getString("cliente");
                boolean StatusEntregar = rs.getBoolean("entregue");
                String Observacao = rs.getString("observacao");
                Double ValorPago = rs.getDouble("valorPago");
                // Setar resultado.
                PesquisarAluguel.txtID.setText("" + ids);
                PesquisarAluguel.txtVeiculos.setText("" + Veiculo);
                PesquisarAluguel.txtDataAluguel.setText(" " + DataAluguel);
                PesquisarAluguel.txtDataEntregar.setText("" + DataEntrega);
                PesquisarAluguel.txtCliente.setText("" + ClienteNome);
                    //Verificar o tipo do Status do veiculo
                    if (StatusEntregar == true) {
                        PesquisarAluguel.txtStatusEntregue.setSelected(true);
                        PesquisarAluguel.txtStatusNaoEntregue.setSelected(false);
                    } else if (StatusEntregar == false) {
                        PesquisarAluguel.txtStatusNaoEntregue.setSelected(true);
                        PesquisarAluguel.txtStatusEntregue.setSelected(false);
                    }
        
                PesquisarAluguel.txtValorPago.setText("" + ValorPago);
                PesquisarAluguel.txtObservacao.setText("" + Observacao);
             
            } else{
            // Caso nao encontre
            ConsultarAluguel = false;
            JOptionPane.showMessageDialog(null, "Veiculo não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);

            }
       
        } catch (SQLException ex) {
              throw new Exception("Erro ao consultar aluguel por id");
        } finally {
           Conexao.closeConnection(conexao, stm);
            }
        }

    
@Override
    // Consultar AluguelBeans por ClienteBeans
    public void  ConsultarVeiculo(String cliente)  throws Exception{
        Boolean VerificarData = false;
        PreparedStatement stm = null;
        Connection conexao = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM icmnts66_locadora.aluguel WHERE  cliente =  ?";
            conexao = Conexao.getconnection();
            stm = conexao.prepareStatement(sql);
            stm.setString(1, cliente);
            rs = stm.executeQuery();

            // Buscar usuario
            if (rs.next()) {
                ConsultarAluguel = true;
                int ids = rs.getInt("idaluguel");
                String Veiculo = rs.getString("veiculo");
                Date DataAluguel = rs.getDate("dataAluguel");
                Date DataEntrega = rs.getDate("dataentrega");
                String ClienteNome = rs.getString("cliente");
                boolean StatusEntregar = rs.getBoolean("entregue");
                String Observacao = rs.getString("observacao");
                Double ValorPago = rs.getDouble("valorPago");

                // Setar resultado.
                PesquisarAluguel.txtID.setText("" + ids);
                PesquisarAluguel.txtVeiculos.setText("" + Veiculo);
                PesquisarAluguel.txtDataAluguel.setText(" " + DataAluguel);
                PesquisarAluguel.txtDataEntregar.setText("" + DataEntrega);
                PesquisarAluguel.txtCliente.setText("" + ClienteNome);
                PesquisarAluguel.txtStatus.setText("Cliente encontrado " + ClienteNome);

          

                    if (StatusEntregar == true) {
                        PesquisarAluguel.txtStatusEntregue.setSelected(true);
                        PesquisarAluguel.txtStatusNaoEntregue.setSelected(false);
                    } else if (StatusEntregar == false) {
                        PesquisarAluguel.txtStatusNaoEntregue.setSelected(true);
                        PesquisarAluguel.txtStatusEntregue.setSelected(false);
                    }

                PesquisarAluguel.txtValorPago.setText("" + ValorPago);
                PesquisarAluguel.txtObservacao.setText("" + Observacao);

            } else{
              ConsultarAluguel = false;
            JOptionPane.showMessageDialog(null, "Veiculo não encontrado", "Erro", JOptionPane.ERROR_MESSAGE);
           
            }
        } catch (SQLException ex) {
          throw new Exception("Erro ao consultar aluguel por Veiculo");
  
        } finally {
            Conexao.closeConnection(conexao,stm,rs);
        }

    }

    // Editar Veiculo
    public void AtualizarAluguel(AluguelBeans aluguel) throws Exception {
        PreparedStatement stm = null;
        Connection conexao = null;
        Conexao conection = new Conexao();
        try {
            conexao = conection.getconnection();
            String sql = " UPDATE icmnts66_locadora.aluguel SET veiculo = ?, entregue = ?, observacao = ?, valorPago = ?  WHERE cliente  = ? ";
            stm = conexao.prepareStatement(sql);
            stm.setString(1, aluguel.getVeiculo().toString());
            stm.setBoolean(2, aluguel.getEntregue());
            stm.setString(3, aluguel.getObservacao());
            stm.setBigDecimal(4, aluguel.getValorPago());
            stm.setString(5, PesquisarAluguel.txtCliente.getText());
            int updatesucesso = stm.executeUpdate();
                if(updatesucesso > 0){
                    AluguelAtualizado = true;
                } else{
                    AluguelAtualizado = false;
                }
        } catch (SQLException e) {
              throw new Exception("Erro ao Atualizar veículo ");
        }

    }

  
    // Apagar veiculo
    public void DeletarAluguel(AluguelBeans id) throws Exception {
        Connection conexao;
        PreparedStatement stm = null;
        try {
            conexao = Conexao.getconnection();
            String sqlDeletar = "DELETE FROM icmnts66_locadora.aluguel WHERE idaluguel = ?";
            stm = conexao.prepareStatement(sqlDeletar);
            stm.setInt(1, id.getIdaluguel());
            int DeletAluguel = stm.executeUpdate();
            if(DeletAluguel > 0){
                AluguelDeletado = true;
            } else{
                AluguelDeletado = false;
            }
        } catch (SQLException ex) {
              throw new Exception("Erro ao deletar veículo por número");
          

        }

    }

//

}

