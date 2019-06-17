/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import code.Estado;
import code.TuringMachine;
import java.util.List;

/**
 *
 * @author Vinicios
 */
public class CreateState extends javax.swing.JDialog {

    private List<String> listaEstados;
    private MainScreen telaPai;
    private TuringMachine maquina;
    private List<Estado> listaEstadosTotal;

    /**
     * Creates new form CreateState
     */
    public CreateState(MainScreen telaPai, java.awt.Frame parent, boolean modal, List<String> listaEstadosNome, TuringMachine maquina, List<Estado> listaEstadosTotal) {
        super(parent, modal);
        this.telaPai = telaPai;
        this.maquina = maquina;
        this.listaEstados = listaEstadosNome;
        this.listaEstadosTotal = listaEstadosTotal;
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
        jLabel11 = new javax.swing.JLabel();
        jtfNomeEstado = new javax.swing.JTextField();
        jrbEstadoAceitacao = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        jbCriarEstado = new javax.swing.JButton();
        jrbEstadoInicial = new javax.swing.JRadioButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Estado");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel11.setText("Inserir Estado");

        jrbEstadoAceitacao.setText("Estado de Aceitação");
        jrbEstadoAceitacao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoAceitacaoActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setText("Criar Estado");

        jbCriarEstado.setText("Criar");
        jbCriarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarEstadoActionPerformed(evt);
            }
        });

        jrbEstadoInicial.setText("Estado Inicial");
        jrbEstadoInicial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbEstadoInicialActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel7)
                    .addComponent(jLabel11)
                    .addComponent(jtfNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jrbEstadoAceitacao)
                    .addComponent(jbCriarEstado)
                    .addComponent(jrbEstadoInicial))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfNomeEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrbEstadoInicial)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jrbEstadoAceitacao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCriarEstado)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbCriarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarEstadoActionPerformed
        if (!jtfNomeEstado.getText().trim().isEmpty()) {
            listaEstados.add(jtfNomeEstado.getText());
            if (jrbEstadoInicial.isSelected() && TuringMachine.getEstadoInicial().equals("")) {
                TuringMachine.setEstadoInicial(jtfNomeEstado.getText());
                TuringMachine.setEstadoAtual(jtfNomeEstado.getText());
                Estado temp_estado = new Estado(jtfNomeEstado.getText(), false);
                System.out.println("Inicio");
                listaEstadosTotal.add(temp_estado);
            } else if (jrbEstadoAceitacao.isSelected()) {
                System.out.println("Aceitacao");
                Estado temp_estado = new Estado(jtfNomeEstado.getText(), true);
                listaEstadosTotal.add(temp_estado);
            } else {
                System.out.println("Normal");
                Estado temp_estado = new Estado(jtfNomeEstado.getText(), false);
                listaEstadosTotal.add(temp_estado);
            }
            telaPai.atualizarEstados();
            this.dispose();
        }
    }//GEN-LAST:event_jbCriarEstadoActionPerformed

    private void jrbEstadoInicialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoInicialActionPerformed
        jrbEstadoAceitacao.setSelected(false);
    }//GEN-LAST:event_jrbEstadoInicialActionPerformed

    private void jrbEstadoAceitacaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbEstadoAceitacaoActionPerformed
        jrbEstadoInicial.setSelected(false);
    }//GEN-LAST:event_jrbEstadoAceitacaoActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CreateState.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateState.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateState.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateState.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbCriarEstado;
    private javax.swing.JRadioButton jrbEstadoAceitacao;
    private javax.swing.JRadioButton jrbEstadoInicial;
    private javax.swing.JTextField jtfNomeEstado;
    // End of variables declaration//GEN-END:variables
}
