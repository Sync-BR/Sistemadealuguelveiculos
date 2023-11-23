/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import beans.AluguelBeans;
import beans.ClienteBeans;
import java.math.BigDecimal;
import java.sql.SQLException;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import persistencia.AluguelDAO;
import static persistencia.AluguelDAO.ConsultarAluguel;
/**
 *
 * @author Eduar
 */
public class PesquisarAluguel extends javax.swing.JInternalFrame {
    private static PesquisarAluguel instancia = null;

    public static PesquisarAluguel getInstancia() {
        if (instancia == null) {
            instancia = new PesquisarAluguel();
        }

        return instancia;
    }
    public PesquisarAluguel() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCampos = new javax.swing.JTextField();
        RConsultarID = new javax.swing.JRadioButton();
        RConsultarCliente = new javax.swing.JRadioButton();
        BtnPesquisar = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        SqlID = new javax.swing.JLabel();
        txtVeiculo = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtVeiculos = new javax.swing.JTextField();
        txtDataAluguel = new javax.swing.JTextField();
        txtDataEntregar = new javax.swing.JTextField();
        txtCliente = new javax.swing.JTextField();
        txtValorPago = new javax.swing.JTextField();
        txtID = new javax.swing.JLabel();
        txtStatusEntregue = new javax.swing.JRadioButton();
        txtStatusNaoEntregue = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtObservacao = new javax.swing.JTextPane();
        Btnexcluir = new javax.swing.JButton();
        BtnEditar = new javax.swing.JButton();
        txtStatus = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Pesquisar Aluguel");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Aluguel"));

        jLabel1.setText("ID/Cliente");

        RConsultarID.setText("Consultar por ID");
        RConsultarID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RConsultarIDActionPerformed(evt);
            }
        });

        RConsultarCliente.setText("Consultar por Cliente");
        RConsultarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RConsultarClienteActionPerformed(evt);
            }
        });

        BtnPesquisar.setText("Pesquisar");
        BtnPesquisar.setEnabled(false);
        BtnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPesquisarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(txtCampos)
                        .addGap(18, 18, 18)
                        .addComponent(BtnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(34, 34, 34))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(RConsultarID)
                        .addGap(18, 18, 18)
                        .addComponent(RConsultarCliente)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCampos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(BtnPesquisar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RConsultarCliente)
                    .addComponent(RConsultarID))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        SqlID.setText("ID:");

        txtVeiculo.setText("Veiculo");

        jLabel4.setText("Data do Aluguel");

        jLabel5.setText("Data da Entregar");

        jLabel6.setText("Cliente");

        jLabel7.setText("Entregue");

        jLabel8.setText("Observação");

        jLabel9.setText("Valor Pago");

        txtVeiculos.setEnabled(false);

        txtDataAluguel.setEnabled(false);

        txtCliente.setEnabled(false);

        txtID.setText("0");

        txtStatusEntregue.setText("Sim");
        txtStatusEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusEntregueActionPerformed(evt);
            }
        });

        txtStatusNaoEntregue.setText("Não");
        txtStatusNaoEntregue.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtStatusNaoEntregueActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(txtObservacao);

        Btnexcluir.setText("Excluir Aluguel");
        Btnexcluir.setEnabled(false);
        Btnexcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExcluirAluguel(evt);
            }
        });

        BtnEditar.setText("Editar Aluguel");
        BtnEditar.setEnabled(false);
        BtnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UpdateAluguel(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel4)
                                            .addComponent(txtVeiculo)
                                            .addComponent(SqlID))
                                        .addGap(18, 18, 18)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txtDataAluguel, javax.swing.GroupLayout.DEFAULT_SIZE, 139, Short.MAX_VALUE)
                                            .addComponent(txtID)
                                            .addComponent(txtVeiculos)))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtDataEntregar, javax.swing.GroupLayout.DEFAULT_SIZE, 137, Short.MAX_VALUE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(txtValorPago))
                                    .addGroup(jPanel2Layout.createSequentialGroup()
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel7)
                                            .addComponent(jLabel6))
                                        .addGap(21, 21, 21)
                                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(jPanel2Layout.createSequentialGroup()
                                                .addComponent(txtStatusEntregue)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtStatusNaoEntregue))
                                            .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(43, 43, 43)
                                .addComponent(jScrollPane1)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(Btnexcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SqlID)
                    .addComponent(txtID))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtVeiculo)
                    .addComponent(txtVeiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtDataAluguel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(txtStatusEntregue)
                    .addComponent(txtStatusNaoEntregue))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtDataEntregar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(txtValorPago, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(jLabel8)))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(BtnEditar)
                    .addComponent(Btnexcluir))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        txtStatus.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(txtStatus)
                        .addGap(131, 131, 131))
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtStatus)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RConsultarIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RConsultarIDActionPerformed
        if(RConsultarID.isSelected() || !RConsultarCliente.isSelected()){
            RConsultarCliente.setSelected(false);
            BtnPesquisar.setEnabled(true);
        } else if(!RConsultarCliente.isSelected() || !RConsultarID.isSelected()){
            BtnPesquisar.setEnabled(false);
        }
    }//GEN-LAST:event_RConsultarIDActionPerformed

    private void RConsultarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RConsultarClienteActionPerformed
        if(RConsultarCliente.isSelected() || !RConsultarID.isSelected()){
            RConsultarID.setSelected(false);
            BtnPesquisar.setEnabled(true);
        } else if(!RConsultarCliente.isSelected() || !RConsultarID.isSelected()){
            BtnPesquisar.setEnabled(false);
        }
    }//GEN-LAST:event_RConsultarClienteActionPerformed

    private void BtnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPesquisarActionPerformed

        AluguelDAO aluguel = new AluguelDAO();
        //Verificar o tipo de consulta
        if (!RConsultarCliente.isSelected() || RConsultarID.isSelected()) {
            String Idcliente = txtCampos.getText();
            //Iniciar consultar por id
            try {
                int IdDoCliente = Integer.parseInt(Idcliente);
                aluguel.ConsultarVeiculo(IdDoCliente);
                
            } catch (Exception e) {
                e.printStackTrace();
               JOptionPane.showMessageDialog(null, "Falhar na operação de consultar");
            }

        } else if (RConsultarCliente.isSelected() || !RConsultarID.isSelected()) {

            try {
                String nome = txtCampos.getText();
                aluguel.ConsultarVeiculo(nome);

            } catch (Exception ex) {
                ex.printStackTrace();

            }
        }
        
        //Verificar se foi encontrado aluguel
        if(ConsultarAluguel == true){
            txtStatus.setText("Aluguel encontrado.");
            txtCampos.setText("");
            BtnEditar.setEnabled(true);
            Btnexcluir.setEnabled(true);
        } else if(ConsultarAluguel == false ){
            txtStatus.setText("Aluguel não encontrado.");
            //Limpar campo caso não encontre
            txtCampos.setText("");
            txtCliente.setText("");
            txtVeiculos.setText("");
            txtID.setText("");
            txtDataAluguel.setText("");
            txtDataEntregar.setText("");
            txtObservacao.setText("");
            txtStatusEntregue.setSelected(false);
            txtStatusNaoEntregue.setSelected(false);
            txtValorPago.setText("");
            BtnEditar.setEnabled(false);
            Btnexcluir.setEnabled(false);
        }
        
        

      

      
    }//GEN-LAST:event_BtnPesquisarActionPerformed

    private void UpdateAluguel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UpdateAluguel

        int Resp = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja editar o aluguel?", "Deseja realmente excluir o aluguel?", JOptionPane.YES_NO_OPTION);
        if (Resp == JOptionPane.YES_OPTION) {
            //Inciar instancia data
            Date datahoje = new Date();
            Locale brasil = new Locale("pt", "BR");
            SimpleDateFormat dateFormat = new SimpleDateFormat("y-MM-dd", brasil);

            //Adicionar novos dados a uma variavel
            String Veiculo = txtVeiculos.toString();
            String Dataalugado = String.valueOf(txtDataAluguel);
            String DataEntregar = String.valueOf(txtDataEntregar);
            String ClienteName = txtCliente.getText();
            Boolean StatusAluguel = null;
            //Verificar o tipo de status
            if (txtStatusEntregue.isSelected() || !txtStatusNaoEntregue.isSelected()) {
                StatusAluguel = true;
            } else if (!txtStatusEntregue.isSelected() || txtStatusNaoEntregue.isSelected()) {
                StatusAluguel = false;
            } //Caso não selecione nenhum status
            else {
                txtStatus.setText("Você precisa selecionar um status para o aluguel.");
            }
            BigDecimal ValorReal = new BigDecimal(txtValorPago.getText());
            String observacao = txtObservacao.getText();
            //Inserir os dados
            try {
                AluguelBeans alugar = new AluguelBeans();
                AluguelDAO atualizaraluguel = new AluguelDAO();
                alugar.setVeiculo(txtVeiculos.getText());
                alugar.setCliente(txtCliente.getText());
                alugar.setEntregue(StatusAluguel);
                alugar.setObservacao(observacao);
                alugar.setValorPago(ValorReal);
                atualizaraluguel.AtualizarAluguel(alugar);
                
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Erro ao atualizar Aluguel");
                
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso.", "Operação cancelada",JOptionPane.INFORMATION_MESSAGE);
        }
        
        //Verificar se o usuario foi atualizado
        if(AluguelDAO.AluguelAtualizado = true){
           txtStatus.setText("Foi atualizado com sucesso");
        } else{
            txtStatus.setText("Falha ao atualizar o aluguel.");
        }
        

        


    }//GEN-LAST:event_UpdateAluguel

    private void txtStatusEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusEntregueActionPerformed
        if(txtStatusEntregue.isSelected()){
            txtStatusNaoEntregue.setSelected(false);
 
        } 
    }//GEN-LAST:event_txtStatusEntregueActionPerformed

    private void ExcluirAluguel(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExcluirAluguel
     AluguelBeans Aluguel = new  AluguelBeans();
     AluguelDAO DelAluguel = new AluguelDAO();
     String id = txtID.getText();
  int resp = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir este aluguel?","Confirmar operação",JOptionPane.YES_NO_OPTION);
  if(resp == JOptionPane.YES_OPTION){
          try {
            int NewID = Integer.parseInt(id);
            Aluguel.setIdaluguel(NewID);
             DelAluguel.DeletarAluguel(Aluguel);
             
        } catch (Exception e) {
            
           JOptionPane.showMessageDialog(null, "Erro ao Pesquisar Aluguel");
        }
  } else{
      JOptionPane.showMessageDialog(null, "Operação concluida com Cancelada!","Operação Cancelada!",JOptionPane.INFORMATION_MESSAGE);
  }
  
  //Verificar se o aluguel foi excluido
  if (AluguelDAO.AluguelDeletado == true) {
       txtStatus.setText("Foi Apagado com sucesso");
      txtCampos.setText("");
      txtCliente.setText("");
      txtVeiculos.setText("");
      txtID.setText("");
      txtDataAluguel.setText("");
      txtDataEntregar.setText("");
      txtObservacao.setText("");
      txtStatusEntregue.setSelected(false);
      txtStatusNaoEntregue.setSelected(false);
      txtValorPago.setText("");
        } else {
            txtStatus.setText("Falhar ao apagar Aluguel");
        }
        


     
        
        
    }//GEN-LAST:event_ExcluirAluguel

    private void txtStatusNaoEntregueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtStatusNaoEntregueActionPerformed
        if (txtStatusNaoEntregue.isSelected() || !txtStatusEntregue.isSelected()) {
            txtStatusEntregue.setSelected(false);
        }
    }//GEN-LAST:event_txtStatusNaoEntregueActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnEditar;
    private javax.swing.JButton BtnPesquisar;
    private javax.swing.JButton Btnexcluir;
    private javax.swing.JRadioButton RConsultarCliente;
    private javax.swing.JRadioButton RConsultarID;
    private javax.swing.JLabel SqlID;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    public static javax.swing.JTextField txtCampos;
    public static javax.swing.JTextField txtCliente;
    public static javax.swing.JTextField txtDataAluguel;
    public static javax.swing.JTextField txtDataEntregar;
    public static javax.swing.JLabel txtID;
    public static javax.swing.JTextPane txtObservacao;
    public static javax.swing.JLabel txtStatus;
    public static javax.swing.JRadioButton txtStatusEntregue;
    public static javax.swing.JRadioButton txtStatusNaoEntregue;
    public static javax.swing.JTextField txtValorPago;
    public static javax.swing.JLabel txtVeiculo;
    public static javax.swing.JTextField txtVeiculos;
    // End of variables declaration//GEN-END:variables
}