
package beans;
import util.Conexao;

import java.util.Date;
import java.math.BigDecimal;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.swing.JFormattedTextField;
import javax.swing.JOptionPane;
import telas.AluguelVeiculos;
import telas.PesquisarVeiculo;
import telas.PesquisarAluguel;


public class AluguelBeans   {
public AluguelBeans() {}

  //Variaveis  
  private int idaluguel;
  private String veiculo;
  private Date dataAluguel ;
  private Date dataEntrega;
  private ClienteBeans cliente;
  private boolean entregue;
  private String observacao;
  private BigDecimal valorPago;

    
    
    public AluguelBeans(int id, String observacao1, String VeiculoClientes,ClienteBeans  AluguelCliente, boolean StatusVeiculo, Date txtDataAluguel, String  txtDataEntregar, BigDecimal ValorReals) {
      this.cliente = AluguelCliente;
      this.entregue = StatusVeiculo;
      this.veiculo = VeiculoClientes;
      this.valorPago = ValorReals;
      this.dataAluguel = txtDataAluguel;
    }


    
  
    /** Inicializar Dos atributos da classe
     * 
     * @param idaluguel
     * @param veiculo
     * @param dataAluguel
     * @param dataEntrega
     * @param cliente
     * @param entregue
     * @param observacao
     * @param valorPago 
     */

    public AluguelBeans(int idaluguel, String observacao, String veiculo, Date dataAluguel, Date dataEntrega, ClienteBeans Cliente, boolean entregue, BigDecimal valorDouble){
        this.idaluguel = idaluguel;
        this.veiculo = veiculo;
        this.dataAluguel = dataAluguel;
        this.dataEntrega = dataEntrega;
        this.cliente = Cliente;
        this.entregue = entregue;
        this.observacao = observacao;
        this.valorPago = valorDouble;
    }


    
    /** Parametro de retorno
     * 
     * @param idaluguel
     * @param veiculo
     * @param dataAluguel
     * @param dataEntrega
     * @param cliente
     * @param entregue
     * @param observacao
     * @param valorPago 
     */   
    public int getIdaluguel(){
        return idaluguel;
    }
    public String getVeiculo(){
        return veiculo;
    }
    public Date getDataAluguel(){
        return dataAluguel;
    }
    public Date getDataEntrega(){
        return dataEntrega;
    }
    public ClienteBeans getCliente(){
        return cliente;
    }
    public boolean  getEntregue(){
        return entregue;
    }
    public String getObservacao(){
        return observacao;
    }
    public BigDecimal getValorPago(){
        return valorPago;
    }

    /** Metado para modificar
     * 
     * @param idaluguel
     * @param veiculo
     * @param dataAluguel
     * @param dataEntrega
     * @param cliente
     * @param entregue
     * @param observacao
     * @param valorPago 
     */  

    public void setIdaluguel(int idaluguel){
        this.idaluguel = idaluguel;
    } 
    public void setVeiculo(String veiculo){
        this.veiculo = veiculo;
    }
    public void setDataAluguel(Date dataAluguel){
        this.dataAluguel = dataAluguel;
    }
    public void setDataEntrega(Date dataEntrega){
        this.dataEntrega = dataEntrega;
    }
    public void setCliente(ClienteBeans cliente){
        this.cliente = cliente;
    }
    public void setEntregue(boolean entregue){
        this.entregue = entregue;
    }
    public void setObservacao(String observacao){
        this.observacao = observacao;
    }
    public void setValorPago(BigDecimal valorPago){
        this.valorPago = valorPago;
    }

    public void setDataAluguel(String DataAluguel) {
     
    }

    public void setDataEntrega(String DataEntregar) {
    }

    public void setCliente(String ClienteName) {
    }
   
 
  
 }


