
package beans;

import util.Conexao;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import telas.CadastrarVeiculo;
import telas.PesquisarVeiculo;
import telas.Programa;

public class VeiculoBeans extends Programa {

    public VeiculoBeans() {
    }
    
    private String numero;
    private String placa;
    private String fabrica;
    private String modelo;
    private int anoModelo;
    private int qtdPortas;
    private String Acessorios;
    
        public VeiculoBeans(String numero, String placa, String fabrica, String modelo, int anoModelo, int qtdPortas, String acessorios){
                this.numero = numero;
                this.placa = placa;
                this.fabrica = fabrica;
                this.modelo = modelo;
                this.anoModelo = anoModelo;
                this.qtdPortas = qtdPortas;
                this.Acessorios = acessorios;
        }




        
        //Parametro de retorno
        public String getNumero(){
                return numero;
        }
        public String getPlaca(){
            return placa;
        }
        public String getFabrica(){
            return fabrica;
        }
        public String getModelo(){
            return modelo;
        }
        public int getAnoModelo(){
            return  anoModelo;
        }
        public int getQtdPortas(){
            return qtdPortas;
        }
        public String getAcessorios(){
            return Acessorios;
        }
        //Parametro de escrita
        public void setNumero(String numero){
            this.numero = numero;
        }
        public void setPlaca(String placa){
           this.placa = placa;
        }
        public void setFabrica(String fabrica){
            this.fabrica = fabrica;
        }
        public void setModelo(String modelo){
            this.modelo = modelo;
        }
        public void setAnoModelo(int anomodelo){
            this.anoModelo = anomodelo;
        }
        public void setQtdPortas(int qtds){
            this.qtdPortas = qtds;
        }
        public void setAcessorios(String acessorio){
            this.Acessorios = acessorio;
        }
       
        
        
  
         
}
