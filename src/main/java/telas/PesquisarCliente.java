/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import beans.ClienteBeans;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import persistencia.ClienteDAO;
import static persistencia.ClienteDAO.AtualizacaoRealizada;

/**
 *
 * @author Eduar
 */
public class PesquisarCliente extends javax.swing.JInternalFrame {

    /**
     * Creates new form PesquisarCliente
     */
    public PesquisarCliente() {
        initComponents();
    }

    private static PesquisarCliente instancia = null;

    public static PesquisarCliente getInstancia() {
        if (instancia == null) {
            instancia = new PesquisarCliente();
        }

        return instancia;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtdados = new javax.swing.JTextField();
        ConsID = new javax.swing.JRadioButton();
        ConsCpf = new javax.swing.JRadioButton();
        btnConsultar = new javax.swing.JButton();
        txtStatus = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        inforNome = new javax.swing.JLabel();
        infoCpf = new javax.swing.JLabel();
        infoEmail = new javax.swing.JLabel();
        infoTelefone = new javax.swing.JLabel();
        infoEndereco = new javax.swing.JLabel();
        infoUf = new javax.swing.JLabel();
        Btn_Excluir = new javax.swing.JButton();
        Btn_Update = new javax.swing.JButton();
        txtClienteNome = new javax.swing.JTextField();
        txtClienteCpf = new javax.swing.JTextField();
        txtClienteEmail = new javax.swing.JTextField();
        txtClienteTelefone = new javax.swing.JTextField();
        txtClienteEndereco = new javax.swing.JTextField();
        txtClienteUF = new javax.swing.JTextField();

        setClosable(true);
        setTitle("AutoLinkUp");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Consultar Cliente"));

        jLabel1.setText("Nome/Cpf");

        ConsID.setText("Consultar por ID");
        ConsID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsIDActionPerformed(evt);
            }
        });

        ConsCpf.setText("Consultar por CPF");
        ConsCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsCpfActionPerformed(evt);
            }
        });

        btnConsultar.setText("Consultar");
        btnConsultar.setEnabled(false);
        btnConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(37, 37, 37)
                        .addComponent(txtdados, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(ConsID)
                        .addGap(26, 26, 26)
                        .addComponent(ConsCpf)
                        .addGap(67, 67, 67)
                        .addComponent(btnConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtdados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ConsID)
                    .addComponent(ConsCpf)
                    .addComponent(btnConsultar))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        txtStatus.setText("Status");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        inforNome.setText("Nome");

        infoCpf.setText("Cpf");

        infoEmail.setText("Email");

        infoTelefone.setText("Telefone");

        infoEndereco.setText("Endereço");

        infoUf.setText("UF");

        Btn_Excluir.setText("Excluir Cliente");
        Btn_Excluir.setEnabled(false);
        Btn_Excluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                excluirCliente(evt);
            }
        });

        Btn_Update.setText("Editar Cliente");
        Btn_Update.setEnabled(false);
        Btn_Update.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateCliente(evt);
            }
        });

        txtClienteCpf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtClienteCpfActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(infoCpf, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(infoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(inforNome, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                    .addComponent(txtClienteCpf)
                    .addComponent(txtClienteEmail))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(infoEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(infoUf, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(62, 62, 62)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtClienteEndereco, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(txtClienteUF)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(infoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(txtClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 49, Short.MAX_VALUE))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Btn_Excluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Btn_Update)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inforNome)
                    .addComponent(infoTelefone)
                    .addComponent(txtClienteNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoCpf)
                    .addComponent(infoEndereco)
                    .addComponent(txtClienteCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(infoEmail)
                    .addComponent(infoUf)
                    .addComponent(txtClienteEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtClienteUF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Btn_Excluir)
                    .addComponent(Btn_Update))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(txtStatus)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtStatus)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsIDActionPerformed
      if(ConsID.isSelected()) {
          ConsCpf.setSelected(false);
            btnConsultar.setEnabled(true);
           

      } else if(!ConsCpf.isSelected() || !ConsID.isSelected()){
          btnConsultar.setEnabled(false);
          ConsID.setSelected(false);
      }
      
      
      
      
    }//GEN-LAST:event_ConsIDActionPerformed
String IdsClientes,cpfsCliente;
    private void ConsCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsCpfActionPerformed
        if(ConsCpf.isSelected()){
            ConsID.setSelected(false);
            btnConsultar.setEnabled(true);
        } else if(!ConsCpf.isSelected() || !ConsID.isSelected()){
            btnConsultar.setEnabled(false);
        }
    }//GEN-LAST:event_ConsCpfActionPerformed

    private void btnConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultarActionPerformed
        ClienteDAO clientes = new ClienteDAO();
        ClienteBeans c1 = new ClienteBeans();
        
        //Verificar se consultar por ID está selecionado
        if (ConsID.isSelected()) {
            IdsClientes = txtdados.getText();
            String STRID = txtdados.getText();
            int id = 0;
                //converter em int
                try {
                     id = Integer.parseInt(STRID);
                } catch (ArithmeticException e) {
                    JOptionPane.showMessageDialog(null, "Ocorreu um erro ao converter o texto para o tipo inteiro.", "Erro ao converter", JOptionPane.INFORMATION_MESSAGE);
                }
            //Limpar campo
            txtdados.setText("");
            
            //Consultar por id
            try {
                clientes.consultaID(id);
               
            } catch (Exception ErroConversion) {
                JOptionPane.showMessageDialog(null, ErroConversion, "Erro", JOptionPane.INFORMATION_MESSAGE);
            }
        //Verificar se consultar por CPF está selecionada    
        } else if (ConsCpf.isSelected()) {
            try {
                cpfsCliente = txtdados.getText();
                c1.setCpf(cpfsCliente);
                txtdados.setText("");
                clientes.consultarCpf(c1);
            } catch (Exception ex) {
                txtStatus.setText("Falhar ao Consultar ");
                ex.printStackTrace();
            }
        }
        //Caso nehuma opção esteja marcada
        else{
            JOptionPane.showMessageDialog(null, "Você precisa selecionar um tipo de consulta.", "Selecione uma consulta", JOptionPane.INFORMATION_MESSAGE);
        }
        //Caso não encontre nenhum cliente
        if (ClienteDAO.ClienteIDEncontrado == false) {
            txtClienteCpf.setText("");
            txtClienteNome.setText("");
            txtClienteEmail.setText("");
            txtClienteTelefone.setText("");
            txtClienteUF.setText("");
            txtClienteEndereco.setText("");
            Btn_Excluir.setEnabled(false);
            Btn_Update.setEnabled(false);
            txtStatus.setText( " Não foi encontrado");
            //Caso encontre
        } else {
            txtStatus.setText(" Foi encontrado");
            Btn_Excluir.setEnabled(true);
            Btn_Update.setEnabled(true);
        }
    }//GEN-LAST:event_btnConsultarActionPerformed

    private void excluirCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_excluirCliente
       ClienteDAO clientes = new ClienteDAO();
        ClienteBeans c1 = new ClienteBeans();
         int id = 0 ;
         //Verificar o tipo selecionado para excluir
        if (ConsID.isSelected() || !ConsCpf.isSelected()) {
            //Converter String para int e Excluir
            try {
                   id = Integer.parseInt(IdsClientes);
            } catch (ArithmeticException e) {
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao converter o texto para o tipo inteiro.", "Erro ao converter", JOptionPane.INFORMATION_MESSAGE);
            }   
            
            try {
                //Verificar se o usuario tem certeza da operação
                
                int Joexcluir = JOptionPane.showConfirmDialog(null, "Tem certeza que desejar excluir esse usuario", "Atenção", JOptionPane.OK_CANCEL_OPTION);
                if(Joexcluir == JOptionPane.YES_OPTION){
                  clientes.excluirID(id);
                  
                } else{
                    JOptionPane.showMessageDialog(this, "Operação cancelada!");
                }

            } catch (Exception e) {
                txtStatus.setText("Falha ao apagar cliente pelo ID.");
                JOptionPane.showMessageDialog(null, e + "", "Erro ao Excuir por id", JOptionPane.INFORMATION_MESSAGE);
            }
        }//Excluir por cpf 
        else if (!ConsID.isSelected() || ConsCpf.isSelected()) {
            //Excluir por cpf
            try {
                 int cpfexcluir = JOptionPane.showConfirmDialog(null, "Tem certeza que desejar excluir esse usuario","Atenção",JOptionPane.OK_CANCEL_OPTION);
                 if(cpfexcluir == JOptionPane.OK_OPTION){
                     
                     clientes.excluirCliente(cpfsCliente);
                 } else{
                     JOptionPane.showMessageDialog(this, "Operação cancelada!");
                 }

            } catch (Exception e) {
                txtStatus.setText("Falha ao apagar cliente pelo CPF. ");
                JOptionPane.showMessageDialog(null, e + "", "Erro ao Excuir por id", JOptionPane.INFORMATION_MESSAGE);
            }
        }

    }//GEN-LAST:event_excluirCliente

    private void txtClienteCpfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtClienteCpfActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtClienteCpfActionPerformed

    private void UpdateCliente(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateCliente
      //Verificar se o usuario tem certeza da operação  
      int Editarcerteza = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja editar este usuário?","Tem certeza?",JOptionPane.OK_CANCEL_OPTION);
      if(Editarcerteza == JOptionPane.OK_OPTION){
          try {
              ClienteBeans cliente = new ClienteBeans();
              ClienteDAO updatecliente = new ClienteDAO();
              cliente.setNome(txtClienteNome.getText());
              cliente.setEndereco(txtClienteEndereco.getText());
              cliente.setUf(txtClienteUF.getText());
              cliente.setTelefone(txtClienteTelefone.getText());
              cliente.setCpf(txtClienteCpf.getText());
              cliente.setEmail(txtClienteEmail.getText());
              System.out.println("Nome: " + cliente.getNome());
              updatecliente.AtualizarCliente(cliente);
          } catch (Exception e) {
              txtStatus.setText("Falhar ao atualizar usuario ");
          }
      } else{
          JOptionPane.showMessageDialog(null, "Operação cancelada"," Cancelado",JOptionPane.INFORMATION_MESSAGE);
      }
      if(AtualizacaoRealizada == true){
      ClienteBeans cliente = new ClienteBeans();
        txtStatus.setText(cliente.getNome()+ " Foi atualizado com sucesso");
      } else{
          txtStatus.setText("Falhar ao atualizar usuario ");
      }

    }//GEN-LAST:event_UpdateCliente


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JButton Btn_Excluir;
    public static javax.swing.JButton Btn_Update;
    private javax.swing.JRadioButton ConsCpf;
    private javax.swing.JRadioButton ConsID;
    private javax.swing.JButton btnConsultar;
    public static javax.swing.JLabel infoCpf;
    public static javax.swing.JLabel infoEmail;
    public static javax.swing.JLabel infoEndereco;
    public static javax.swing.JLabel infoTelefone;
    public static javax.swing.JLabel infoUf;
    public static javax.swing.JLabel inforNome;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JTextField txtClienteCpf;
    public static javax.swing.JTextField txtClienteEmail;
    public static javax.swing.JTextField txtClienteEndereco;
    public static javax.swing.JTextField txtClienteNome;
    public static javax.swing.JTextField txtClienteTelefone;
    public static javax.swing.JTextField txtClienteUF;
    public static javax.swing.JLabel txtStatus;
    public static javax.swing.JTextField txtdados;
    // End of variables declaration//GEN-END:variables
}
