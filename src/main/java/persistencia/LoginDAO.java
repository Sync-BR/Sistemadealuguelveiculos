package persistencia;

import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import telas.PesquisarCliente;
import telas.Programa;
import telas.TeladeLogin;


public class LoginDAO { 
 
    public static boolean  Loginefetuado = false;
    /**
     * Constructor da autenticação
     * @param usuario
     * @param senha
     * @return
     */
    public static boolean autenticar(String usuario, char[] senha) throws Exception {
         
        Connection conexao = null;
        PreparedStatement stm = null;
        ResultSet rs = null;
        try {
            
            conexao = Conexao.getconnection();
            String sql = "SELECT * FROM icmnts66_locadora.login WHERE usuario = ? AND senha = ?";
            stm = conexao.prepareStatement(sql);
            String senhaSTR = new String(senha);
            stm.setString(1, usuario);
            stm.setString(2, senhaSTR);
  
            rs = stm.executeQuery();
               if(rs.next()){
                   String user = rs.getString("usuario");
                   String pass = rs.getString("senha");
                   Loginefetuado = true;
               } else{
                   Loginefetuado = false;
               }
            } catch (SQLException e) {
                e.printStackTrace();
            }
        return false;

        
    }
    //Verificar se o login está ativo
  public static void   verificarconexao(){
            
      if (LoginDAO.Loginefetuado == true) {
          Programa.menucliente.setEnabled(true);
          Programa.menuveiculo.setEnabled(true);
          Programa.finalizarcount.setEnabled(true);
          Programa.menualuguel.setEnabled(true);
          Programa.menufaturamento.setEnabled(true);
          Programa.iniciarsection.setEnabled(false);
          Programa.VeiculosComAtrasos.setEnabled(true);
          Programa.ListaVeiculosAlugados.setEnabled(true);

      } else if (LoginDAO.Loginefetuado == false) {
          Programa.iniciarsection.setEnabled(true);
          Programa.finalizarcount.setEnabled(false);
          Programa.menucliente.setEnabled(false);
          Programa.menuveiculo.setEnabled(false);
          Programa.menualuguel.setEnabled(false);
          Programa.menufaturamento.setEnabled(false);
          Programa.VeiculosComAtrasos.setEnabled(false);
          Programa.ListaVeiculosAlugados.setEnabled(false);
      }
            
        }
        //Finalizar login
        public static boolean  finalizarconexao()  {
            try {
                    LoginDAO.Loginefetuado = false;
                   return true;
            } catch (Exception e) {
                e.printStackTrace();
            }

            return false;
        }
}
