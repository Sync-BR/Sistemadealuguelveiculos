/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import persistencia.VeiculoListaDAO;
import static telas.VeiculosAtrasado.jTable1;

/**
 *
 * @author Eduar
 */
public class ListadeAluguel extends javax.swing.JInternalFrame {

    /**
     * Creates new form ListadeAluguel
     */
    public ListadeAluguel() {
        initComponents();
    }

      private static ListadeAluguel instancia = null;

    public static ListadeAluguel getInstancia() {
        if (instancia == null) {
            instancia = new ListadeAluguel();
        }

        return instancia;
    }
    @SuppressWarnings("unchecked")
     // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
     private void initComponents() {

          jPanel1 = new javax.swing.JPanel();
          jScrollPane1 = new javax.swing.JScrollPane();
          TableAlugueis = new javax.swing.JTable();
          jButton1 = new javax.swing.JButton();

          setClosable(true);
          setTitle("AutoLinkUp");

          jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Lista de Veículos Alugados"));

          TableAlugueis.setModel(new javax.swing.table.DefaultTableModel(
               new Object [][] {

               },
               new String [] {
                    "ID", "Veículo", "Cliente", "Data do Aluguel", "Data de Entregar"
               }
          ) {
               Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
               };
               boolean[] canEdit = new boolean [] {
                    true, false, false, false, false
               };

               public Class getColumnClass(int columnIndex) {
                    return types [columnIndex];
               }

               public boolean isCellEditable(int rowIndex, int columnIndex) {
                    return canEdit [columnIndex];
               }
          });
          jScrollPane1.setViewportView(TableAlugueis);

          jButton1.setText("Atualziar Lista");
          jButton1.addActionListener(new java.awt.event.ActionListener() {
               public void actionPerformed(java.awt.event.ActionEvent evt) {
                    AtualizarListadeAlugueis(evt);
               }
          });

          javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
          jPanel1.setLayout(jPanel1Layout);
          jPanel1Layout.setHorizontalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 610, Short.MAX_VALUE)
                    .addContainerGap())
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
          );
          jPanel1Layout.setVerticalGroup(
               jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(jPanel1Layout.createSequentialGroup()
                    .addContainerGap()
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 218, Short.MAX_VALUE)
                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
          );

          javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
          getContentPane().setLayout(layout);
          layout.setHorizontalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(layout.createSequentialGroup()
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addContainerGap())
          );
          layout.setVerticalGroup(
               layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
               .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
          );

          pack();
     }// </editor-fold>//GEN-END:initComponents

    private void AtualizarListadeAlugueis(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AtualizarListadeAlugueis
        VeiculoListaDAO lista = new VeiculoListaDAO();

         //Limpar tabela sempre que consultar um novo veiculo
        DefaultTableModel model = (DefaultTableModel) TableAlugueis.getModel();
        model.setRowCount(0);
        try {
            lista.ListarAlugueis();
        } catch (Exception ex) {
            Logger.getLogger(ListadeAluguel.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_AtualizarListadeAlugueis


     // Variables declaration - do not modify//GEN-BEGIN:variables
     public static javax.swing.JTable TableAlugueis;
     private javax.swing.JButton jButton1;
     private javax.swing.JPanel jPanel1;
     private javax.swing.JScrollPane jScrollPane1;
     // End of variables declaration//GEN-END:variables
}
