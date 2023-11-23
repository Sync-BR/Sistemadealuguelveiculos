/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JInternalFrame.java to edit this template
 */
package telas;

import beans.VeiculoBeans;
import javax.swing.JOptionPane;
import persistencia.VeiculoListaDAO;
import persistencia.VeiculosDAO;
import static persistencia.VeiculosDAO.VeiculoDeletado;
import static telas.PesquisarCliente.txtStatus;

/**
 *
 * @author Eduar
 */
public class PesquisarVeiculo extends javax.swing.JInternalFrame {
    private static PesquisarVeiculo instancia = null;

    public static PesquisarVeiculo getInstancia() {
        if (instancia == null) {
            instancia = new PesquisarVeiculo();
        }

        return instancia;
    }
    public PesquisarVeiculo() {
        initComponents();

    }
       public void IniciarLista() throws Exception{
      VeiculoListaDAO veicuLista = new VeiculoListaDAO();
       veicuLista.ListarAcessoriosVeiculos();

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
        txtveiculos = new javax.swing.JTextField();
        consnumero = new javax.swing.JRadioButton();
        consulplaca = new javax.swing.JRadioButton();
        btnconsveiculo = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        dadosnumero = new javax.swing.JLabel();
        dadosplaca = new javax.swing.JLabel();
        dadosfabrica = new javax.swing.JLabel();
        dadosmodelo = new javax.swing.JLabel();
        dadosano = new javax.swing.JLabel();
        dadosportas = new javax.swing.JLabel();
        dadosacessorio = new javax.swing.JLabel();
        TxtNumero = new javax.swing.JTextField();
        TxtPlaca = new javax.swing.JTextField();
        txtFabricante = new javax.swing.JTextField();
        txtAnodoModelo = new javax.swing.JTextField();
        txtPortas = new javax.swing.JComboBox<>();
        txtAcessorios = new javax.swing.JComboBox<>();
        BtnEdite = new javax.swing.JButton();
        BtnDelete = new javax.swing.JButton();
        txtModelo = new javax.swing.JTextField();
        txtStatus = new javax.swing.JLabel();

        setClosable(true);
        setTitle("AutoLinkUp");
        setToolTipText("");

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder("Pesquisar Veiculo"));

        jLabel1.setText("Pesquisar Veiculo");

        consnumero.setText("Consultar por Numero");
        consnumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consnumeroActionPerformed(evt);
            }
        });

        consulplaca.setText("Consultar por placa");
        consulplaca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                consulplacaActionPerformed(evt);
            }
        });

        btnconsveiculo.setText("Consultar");
        btnconsveiculo.setEnabled(false);
        btnconsveiculo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconsveiculoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(consnumero)
                        .addGap(18, 18, 18)
                        .addComponent(consulplaca)
                        .addGap(18, 18, 18)
                        .addComponent(btnconsveiculo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtveiculos, javax.swing.GroupLayout.PREFERRED_SIZE, 400, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 22, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtveiculos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(consnumero)
                    .addComponent(consulplaca)
                    .addComponent(btnconsveiculo))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Dados"));

        dadosnumero.setText("Número: ");

        dadosplaca.setText("Placa: ");

        dadosfabrica.setText("Fabrica: ");

        dadosmodelo.setText("Modelo:");

        dadosano.setText("Ano do Modelo:");

        dadosportas.setText("Número de Portas:");

        dadosacessorio.setText("Acessorio:");

        BtnEdite.setText("Editar Veículo");
        BtnEdite.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnEditeActionPerformed(evt);
            }
        });

        BtnDelete.setText("Deletar Veículo");
        BtnDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(BtnDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(BtnEdite, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addComponent(dadosacessorio)
                        .addGap(18, 18, 18)
                        .addComponent(txtAcessorios, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(dadosnumero)
                                    .addComponent(dadosplaca))
                                .addGap(67, 67, 67)
                                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(TxtPlaca, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)
                                    .addComponent(TxtNumero)))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(dadosportas)
                                .addGap(18, 18, 18)
                                .addComponent(txtPortas, 0, 125, Short.MAX_VALUE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(dadosfabrica)
                            .addComponent(dadosmodelo)
                            .addComponent(dadosano))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtFabricante, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                            .addComponent(txtAnodoModelo)
                            .addComponent(txtModelo))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadosnumero)
                    .addComponent(TxtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadosfabrica)
                    .addComponent(txtFabricante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadosplaca)
                    .addComponent(TxtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadosmodelo)
                    .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadosano)
                    .addComponent(txtAnodoModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(dadosportas)
                    .addComponent(txtPortas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dadosacessorio)
                    .addComponent(txtAcessorios, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BtnEdite)
                    .addComponent(BtnDelete))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        txtStatus.setText("Status");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addComponent(txtStatus))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtStatus)
                .addContainerGap(12, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void consnumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consnumeroActionPerformed
           if(consnumero.isSelected()){
                btnconsveiculo.setEnabled(true);
                consulplaca.setSelected(false);
           } else if(!consnumero.isSelected() || !consulplaca.isSelected()){
               btnconsveiculo.setEnabled(false);
               txtStatus.setText("Você precisa escolher um tipo de consulta.");
           }
    }//GEN-LAST:event_consnumeroActionPerformed

    private void btnconsveiculoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconsveiculoActionPerformed
        //Limpar campo que pode conter algum item esquecido
        txtPortas.removeAllItems();
        txtAcessorios.removeAllItems();
        txtPortas.removeAllItems();
        VeiculoBeans cbv = new VeiculoBeans();
        VeiculosDAO PesquisarVeiculo = new VeiculosDAO();
        //Se o checkbox estiver marcado como consultar por numero
        if (consnumero.isSelected() || !consulplaca.isSelected()) {
            String NumeroVeiculo = txtveiculos.getText();
            //Converter numero em int
            try {
                int numberVeiculo = Integer.parseInt(NumeroVeiculo);
            } catch (ArithmeticException e) {
                txtStatus.setText("Falha ao converter o número do veículo.");
            }
            //Iniciar operação de consultar
            try {
                cbv.setNumero(NumeroVeiculo);
                PesquisarVeiculo.consultarNumero(cbv);

            } catch (Exception ex) {
                JOptionPane.showMessageDialog(null, ex+"", "Erro ao consultar veículo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else if (consulplaca.isSelected() || !consnumero.isSelected()) {
            try {
                String NumeroPlaca = txtveiculos.getText();
                cbv.setPlaca(NumeroPlaca);
                PesquisarVeiculo.consultarPlaca(cbv);
            } catch (Exception ex) {
               JOptionPane.showMessageDialog(null, ex+"", "Erro ao consultar veículo", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        //Iniciar lista de acessorios
        try {
            IniciarLista();

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
            e.printStackTrace();
        }
        
        //Caso não encontre veiculo consultado
        if(VeiculosDAO.VeiculoEncontrado == false){
            TxtNumero.setText("");
            TxtPlaca.setText("");
            txtAcessorios.setSelectedItem(0);
            txtAnodoModelo.setText("");
            txtFabricante.setText("");
            txtModelo.setText("");
            txtPortas.setSelectedItem(0);
            txtveiculos.setText("");
            txtStatus.setText(" Veículo não foi encontrado");
            BtnEdite.setEnabled(false);
            BtnDelete.setEnabled(false);
        } else{
            BtnEdite.setEnabled(true);
            BtnDelete.setEnabled(true);
            txtStatus.setText(" Veículo encontrado");
        }
        
    }//GEN-LAST:event_btnconsveiculoActionPerformed

    private void consulplacaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_consulplacaActionPerformed
                if(consulplaca.isSelected() ){
                    btnconsveiculo.setEnabled(true);
                      consnumero.setSelected(false);
                 } else{
               btnconsveiculo.setEnabled(false);
               txtStatus.setText("Você precisa escolher um tipo de consulta.");
           }
    }//GEN-LAST:event_consulplacaActionPerformed

    private void BtnEditeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnEditeActionPerformed
        String Numero = TxtNumero.getText();
        String Placa = TxtPlaca.getText();
        String Portas = txtPortas.getSelectedItem().toString();
        String AnodoVeiculo = txtAnodoModelo.getText();
        String Acessorio = txtAcessorios.getSelectedItem().toString();
        String Fabricacao = txtFabricante.getText();
        String Modelo = txtModelo.getText();
        int Portaconvertida = 0;
        int Anoconvertido = 0;
        
        //Converter para int
        try {
            Portaconvertida = Integer.parseInt(Portas);
            Anoconvertido = Integer.parseInt(AnodoVeiculo);
        } catch (ArithmeticException e) {
            txtStatus.setText("Falhar ao converter as informações");
        }
        //Verificar se o usuario tem certeza da operação
        int BtnEdite = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja editar este veículo?", "Aviso!", JOptionPane.YES_NO_OPTION);
   
        if (BtnEdite == JOptionPane.YES_OPTION) {
            //Iniciar operação
            try {
                VeiculoBeans veiculolist = new VeiculoBeans();
                VeiculosDAO updateveiculo = new VeiculosDAO();
                veiculolist.setNumero(Numero);
                veiculolist.setPlaca(Placa);
                veiculolist.setQtdPortas(Portaconvertida);
                veiculolist.setAnoModelo(Anoconvertido);
                veiculolist.setAcessorios(Acessorio);
                veiculolist.setFabrica(Fabricacao);
                veiculolist.setModelo(Modelo);
                updateveiculo.AtualizarVeiculo(veiculolist);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, e + "", "Erro ao atualizar veículo", JOptionPane.INFORMATION_MESSAGE);
            }
        } else {
            JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso");

        }
        if(VeiculosDAO.Veiculoatualizado == true){
            JOptionPane.showMessageDialog(null, "Operação concluída com sucesso!");
            txtStatus.setText("Operação Concluida com sucesso!");
        } else{
            txtStatus.setText("Operação Falhou!");
            JOptionPane.showMessageDialog(null, "Operação Falhou!");
        }
        
    }//GEN-LAST:event_BtnEditeActionPerformed

     private void BtnDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnDeleteActionPerformed
VeiculoBeans veiculos = new VeiculoBeans();
 int Delpanel = JOptionPane.showConfirmDialog(null, "Tem certeza de que deseja excluir este veículo?", "Excluir Veículo", JOptionPane.YES_NO_OPTION);
    if(Delpanel == JOptionPane.YES_OPTION){
        //Iniciar operação
        try {

             VeiculosDAO exveiculos = new VeiculosDAO();
             String numero = TxtNumero.getText();
             veiculos.setNumero(numero);
             exveiculos.excluir(veiculos);
         } catch (Exception e) {
             txtStatus.setText("Falhar ao apagar veículo ");
         }
    } else{
        JOptionPane.showMessageDialog(null, "Operação cancelada com sucesso!");
    }
    if(VeiculoDeletado == true){
        
        txtStatus.setText(txtModelo.getText()+ "  Foi Deletado do banco de dados");
    } else{
        txtStatus.setText(txtModelo.getText() + "  Falhou ao deletado veículo do banco de dados");
    }
    
 
        

     }//GEN-LAST:event_BtnDeleteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnDelete;
    private javax.swing.JButton BtnEdite;
    public static javax.swing.JTextField TxtNumero;
    public static javax.swing.JTextField TxtPlaca;
    public static javax.swing.JButton btnconsveiculo;
    private javax.swing.JRadioButton consnumero;
    private javax.swing.JRadioButton consulplaca;
    public static javax.swing.JLabel dadosacessorio;
    public static javax.swing.JLabel dadosano;
    public static javax.swing.JLabel dadosfabrica;
    public static javax.swing.JLabel dadosmodelo;
    public static javax.swing.JLabel dadosnumero;
    public static javax.swing.JLabel dadosplaca;
    public static javax.swing.JLabel dadosportas;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    public static javax.swing.JComboBox<String> txtAcessorios;
    public static javax.swing.JTextField txtAnodoModelo;
    public static javax.swing.JTextField txtFabricante;
    public static javax.swing.JTextField txtModelo;
    public static javax.swing.JComboBox<String> txtPortas;
    public static javax.swing.JLabel txtStatus;
    public static javax.swing.JTextField txtveiculos;
    // End of variables declaration//GEN-END:variables
}