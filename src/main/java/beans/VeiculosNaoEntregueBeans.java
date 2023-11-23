
package beans;
import javax.swing.JOptionPane;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import telas.TelaFaturamento;
import telas.VeiculosAtrasado;


public class VeiculosNaoEntregueBeans {
    
private int Id;
private String Cliente, Veiculo, Data,Status;

    public VeiculosNaoEntregueBeans(int id,String cliente, String veiculo, String data, String status){
        this.Id = id;
        this.Cliente = cliente;
        this.Veiculo = veiculo;
        this.Data = data;
        this.Status = status;
    }
        public int getId(){
            return Id;
        }
        public String getCliente(){
            return Cliente;
        }
        public String getVeiculo(){
            return Veiculo;
        }
        public String getData(){
            return Data;
        }
        public String getStatus(){
            return Status;
        }
        
     

        

    
  
}
