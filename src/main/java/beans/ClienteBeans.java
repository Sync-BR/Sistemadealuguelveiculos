package beans;
import telas.PesquisarCliente;
import telas.CadastrarCliente;
import telas.Programa;
import javax.swing.JComboBox;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import util.Conexao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
public class ClienteBeans  {

    public ClienteBeans() {
    }
    //Declaração da variavel
    private String nome, endereco, uf, telefone, cpf, email;
    /**
     * Inicialização dos atributos da classe Cliente
     * @param nome
     * @param endereco
     * @param uf
     * @param telefone
     * @param cpf
     * @param email 
     */
    public ClienteBeans(String nome, String endereco, String uf, String telefone, String cpf, String email){
        this.nome = nome;
        this.endereco = endereco;  
        this.uf = uf;
        this.telefone = telefone;
        this.cpf = cpf;
        this.email = email;
    }
    /**
     * Parametro de retorno
     * @param nome
     * @param endereco
     * @param uf
     * @param telefone
     * @param cpf
     * @param email 
     */
    public String getNome(){
        return nome;
    }
    public String getEndereco() {
        return endereco;
    }
    public String getUf(){
        return uf;
    }
    public String getTelefone(){
        return telefone;
    }
    public String getCpf(){
        return cpf;
    }
    public String getEmail(){
        return email;
    }
      /**
     * Parametro de modificação
     * @param nome
     * @param endereco
     * @param uf
     * @param telefone
     * @param cpf
     * @param email 
     */
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
    public void setUf(String uf){
        this.uf = uf;
    }
    public void setTelefone(String telefone){
        this.telefone = telefone;
    }
    public void setCpf(String cpf){
        this.cpf = cpf;
    }
    public void setEmail(String email){
        this.email = email;
    }
  
}
