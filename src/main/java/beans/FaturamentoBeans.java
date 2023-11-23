
package beans;

import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.swing.table.DefaultTableModel;
import telas.TelaFaturamento;

public class FaturamentoBeans {
    private String Cliente,Veiculo,Data,Valor;
    
    public FaturamentoBeans(String cliente,String veiculo, String data, String valor){
            this.Cliente = cliente;
            this.Veiculo = veiculo;
            this.Data = data;
            this.Valor = valor;
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
        public String getValor(){
            return Valor;
        }
        
        public void setCliente(String cliente){
            this.Cliente = cliente;
        }
        public void setVeiculo(String veiculo){
            this.Veiculo = veiculo;
        }
        public void setData(String data){
            this.Data = data;
        }
        public void setValor(String valor){
            this.Valor = valor;
        }
        
    
}
