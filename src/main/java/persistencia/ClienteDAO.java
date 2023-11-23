
package persistencia;
import beans.ClienteBeans;
import beans.VeiculoBeans;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import telas.CadastrarCliente;
import telas.PesquisarCliente;
import util.Conexao;
public class ClienteDAO implements ClienteDAOListener {
    
public ClienteDAO(){
}
public static boolean AtualizacaoRealizada = false;
    //Parametro para atualizar cliente
    public void AtualizarCliente(ClienteBeans clientes) throws Exception {
        Connection conexao = null;
        PreparedStatement stm = null;
        try {
            conexao = Conexao.getconnection();
            String sql = "UPDATE icmnts66_locadora.cliente SET nomeCliente = ?, endereco = ?, uf = ?, telefone = ?, cpf = ?, email = ? WHERE nomeCliente  = ? ";
            stm = conexao.prepareStatement(sql);
            stm.setString(1, clientes.getNome());
            stm.setString(2, clientes.getEndereco());
            stm.setString(3, clientes.getUf());
            stm.setString(4, clientes.getTelefone());
            stm.setString(5, clientes.getCpf());
            stm.setString(6, clientes.getEmail());
            stm.setString(7, clientes.getNome());
            int update = stm.executeUpdate();
            if(update > 0){
                AtualizacaoRealizada = true;
            } else{
                AtualizacaoRealizada = false;
            }
            PesquisarCliente.txtStatus.setText(clientes.getNome()+" Foi atualizado com sucesso");
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e + "", "Erro ao tentar atualizar Cliente", JOptionPane.INFORMATION_MESSAGE);
        } finally{
            Conexao.closeConnection(conexao,stm);
        }
    }


public static boolean ClienteIDEncontrado ;

@Override
//Consultar por ID
    public ClienteDAO consultaID(int id) throws Exception {
        Connection conexao = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            conexao = Conexao.getconnection();
            //Buscar por resultado
            String sql = "SELECT * FROM icmnts66_locadora.cliente WHERE id = ?";
            stm = conexao.prepareStatement(sql);
            stm.setInt(1, id);
            rs = stm.executeQuery();
            if (rs.next()) {
                String nomeCliente = rs.getString("nomeCliente");
                String cpfCliente = rs.getString("cpf");
                String emailCliente = rs.getString("email");
                String telefoneCliente = rs.getString("telefone");
                String enderecoCliente = rs.getString("endereco");
                String ufCliente = rs.getString("uf");
                //Retorno das informaões
                PesquisarCliente.txtClienteNome.setText(nomeCliente);
                PesquisarCliente.txtClienteCpf.setText(cpfCliente);
                PesquisarCliente.txtClienteEmail.setText(emailCliente);
                PesquisarCliente.txtClienteUF.setText(ufCliente);
                PesquisarCliente.txtClienteEndereco.setText(enderecoCliente);
                PesquisarCliente.txtClienteTelefone.setText(telefoneCliente);
                //caso encontre ativar
                ClienteIDEncontrado = true;
            } else{
                ClienteIDEncontrado = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e + "");
        } finally {
            Conexao.closeConnection(conexao, stm, rs);
        }
        return null;
    }

    
    @Override
   //consultar cliente por cpf
   public void consultarCpf(ClienteBeans clientes) throws Exception {
        PreparedStatement stm = null;
        Connection conexao = null;
        ResultSet rs = null;
        try {
            String sql = "SELECT * FROM icmnts66_locadora.cliente WHERE cpf = ?";
            //Iniciar conexão com banco de dados
            conexao = Conexao.getconnection();
            stm = conexao.prepareStatement(sql);
            stm.setString(1, clientes.getCpf());
            rs = stm.executeQuery();
           
            //verificar se existe um resultado
            if (rs.next()) {
                String nomeCliente = rs.getString("nomeCliente");
                String cpfCliente = rs.getString("cpf");
                String emailCliente = rs.getString("email");
                String telefoneCliente = rs.getString("telefone");
                String enderecoCliente = rs.getString("endereco");
                String ufCliente = rs.getString("uf");
                //Prencher dados
                PesquisarCliente.txtClienteNome.setText(nomeCliente);
                PesquisarCliente.txtClienteCpf.setText(cpfCliente);
                PesquisarCliente.txtClienteEmail.setText(emailCliente);
                PesquisarCliente.txtClienteUF.setText(ufCliente);
                PesquisarCliente.txtClienteEndereco.setText(enderecoCliente);
                PesquisarCliente.txtClienteTelefone.setText(telefoneCliente);
                ClienteIDEncontrado = true;
        
            } else{
                ClienteIDEncontrado  = false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println(e + "");            
        } finally {
            Conexao.closeConnection(conexao, stm, rs);
        }
    }
   
   
   
   @Override
   //inserir dados
   public  void Inserirdados(ClienteBeans clientes) throws Exception {
        Connection conexao  = null;
        PreparedStatement ps = null;
            try{
                //Obter conexão com banco de dados
                conexao = Conexao.getconnection();
                String sql = "INSERT INTO icmnts66_locadora.cliente(nomeCliente , endereco, uf, telefone, cpf, email) VALUES(?, ?, ?, ?, ?, ?)";
                ps = conexao.prepareStatement(sql);
                //Atribuir os valores
                ps.setString(1,clientes.getNome() );
                ps.setString(2, clientes.getEndereco());
                ps.setString(3, clientes.getUf());
                ps.setString(4, clientes.getTelefone());
                ps.setString(5, clientes.getCpf());
                ps.setString(6,clientes.getEmail());
               // Comando para inserir o cliente
                 ps.executeUpdate();
                 JOptionPane.showMessageDialog(null, "Usuário cadastrado com êxito.");
                 CadastrarCliente.txtStatus.setText(clientes.getNome()+" Foi inserido com sucesso");
            } catch(SQLException e) {
                JOptionPane.showMessageDialog(null, e,"Erro ao inserir cliente",JOptionPane.OK_OPTION);
            } finally {
               Conexao.closeConnection(conexao,ps);
            }
   }
 //Apagar usuario por cpf
  @Override
   public  void excluirCliente( String cpf) throws Exception{
   Connection conexao  = null;
   PreparedStatement stm = null;
   ResultSet rs = null;
    try{
        conexao = Conexao.getconnection();
        String sqlDeletar = "DELETE FROM icmnts66_locadora.cliente WHERE cpf = ?";
        stm = conexao.prepareStatement(sqlDeletar);
        stm.setString(1, cpf);
        stm.executeUpdate();
        PesquisarCliente.txtStatus.setText(cpf+ "  Foi excluído com sucesso do banco de dados.");
           
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex+ "", "Erro de consultar.", JOptionPane.INFORMATION_MESSAGE);
        
       }  finally{
        Conexao.closeConnection(conexao,stm,rs);
    }
        
   }
   
   @Override
 //Apagar usuario por id
   public void excluirID(int id) throws Exception{
   Connection conexao  = null;
   PreparedStatement stm = null;

    try{
        conexao = Conexao.getconnection();
        String sqlDeletar = "DELETE FROM icmnts66_locadora.cliente WHERE id = ?";
        stm = conexao.prepareStatement(sqlDeletar);
        stm.setInt(1, id);
        stm.executeUpdate();
        PesquisarCliente.txtStatus.setText("ID: " +id+ "  Foi excluído com sucesso do banco de dados.");
           
             
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, ex+ "", "Erro ao apagar cliente", JOptionPane.INFORMATION_MESSAGE);
       }  finally{
        Conexao.closeConnection(conexao, stm);
        }
        
   } 

}
