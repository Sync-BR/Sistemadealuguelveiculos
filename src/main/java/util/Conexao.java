
package util;


import persistencia.LoginDAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import telas.Programa;
import static telas.Programa.menucliente;
import static telas.Programa.menuveiculo;
public class Conexao {
 public Conexao() {}
    private static Connection conexaos = null;
    public static Connection getconnection() throws Exception {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            return DriverManager.getConnection("jdbc:mysql://50.6.138.76/icmnts66_locadora", "icmnts66_locadora", "L0c@d0r@");

        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, e.getMessage());
            System.out.println(e + "");
        }
        return conexaos;
    }
               
               //Fechar conexão
    private static void close(Connection conn, Statement stmt, ResultSet rs) throws Exception {
        try {
            if (rs != null) {
                rs.close();
            }
            if (stmt != null) {
                stmt.close();
            }
            if (conn != null) {
                conn.close();
            }
        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }
    // Fechar conexão Statement & Conjunto de resultado do ResultSet

    public static void closeConnection(Connection conn, Statement stmt, ResultSet rs) throws Exception {
        close(conn, stmt, rs);
    }
    //Fechar conexão sem fechar o conjunto do ResultSet

    public static void closeConnection(Connection conn, Statement stmt) throws Exception {
        close(conn, stmt, null);
    }
    //Fechar apenas a conexão

    public static void closeConnection(Connection conn) throws Exception {
        close(conn, null, null);
    }

             
}
