/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import code.AlfabetoTotal;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultListModel;

/**
 *
 * @author Vinicios
 */
public class AddAuxiliaryAlphabets extends javax.swing.JDialog {

    private DefaultListModel mlist_auxiliares;
    private MainScreen telaPai;

    private AlfabetoTotal alfabetos;
    private List<String> temp_auxAlfabetos;

    /**
     * Creates new form AddAuxiliaryAlphabets
     */
    public AddAuxiliaryAlphabets(MainScreen telaPai,java.awt.Frame parent, boolean modal, AlfabetoTotal alfabetos) {
        super(parent, modal);
        initComponents();
        

        // Iniciando models
        mlist_auxiliares = new DefaultListModel();

        // Setando models para jLists
        jlAuxiliares.setModel(mlist_auxiliares);

        this.telaPai = telaPai;
        this.alfabetos = alfabetos;
        this.temp_auxAlfabetos = alfabetos.getAuxiliares();
        setarCaixasTexto();
        atualizarLista();
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
        jLabel2 = new javax.swing.JLabel();
        jtfLetraInicio = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfLetraVazio = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlAuxiliares = new javax.swing.JList<>();
        jbAdicionarAuxiliar = new javax.swing.JButton();
        jbRemoverAuxiliar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Alfabetos Auxiliares");

        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel1.setText("Alfabetos Auxiliares");

        jLabel2.setText("Inicio");

        jLabel3.setText("Vazio");

        jLabel5.setText("Letras Auxiliares");

        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jlAuxiliares);

        jbAdicionarAuxiliar.setText("Adicionar");
        jbAdicionarAuxiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarAuxiliarActionPerformed(evt);
            }
        });

        jbRemoverAuxiliar.setText("Remover");
        jbRemoverAuxiliar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverAuxiliarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jtfLetraInicio)
                    .addComponent(jLabel3)
                    .addComponent(jtfLetraVazio)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jbAdicionarAuxiliar)
                        .addGap(0, 0, 0)
                        .addComponent(jbRemoverAuxiliar))
                    .addComponent(jbSalvar))
                .addGap(16, 16, 16))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfLetraInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfLetraVazio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbAdicionarAuxiliar)
                    .addComponent(jbRemoverAuxiliar))
                .addGap(18, 18, Short.MAX_VALUE)
                .addComponent(jbSalvar)
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

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        alfabetos.setInicio(jtfLetraInicio.getText());
        alfabetos.setVazio(jtfLetraVazio.getText());
        alfabetos.setAuxiliares(temp_auxAlfabetos);
        telaPai.atualizarAuxiliares();        
        this.dispose();
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbAdicionarAuxiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarAuxiliarActionPerformed
        AddAux telaAddAux = new AddAux(this, null, rootPaneCheckingEnabled, temp_auxAlfabetos);
        telaAddAux.setVisible(rootPaneCheckingEnabled);
    }//GEN-LAST:event_jbAdicionarAuxiliarActionPerformed

    private void jbRemoverAuxiliarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverAuxiliarActionPerformed
        temp_auxAlfabetos.remove(jlAuxiliares.getSelectedIndex());
        atualizarLista();
    }//GEN-LAST:event_jbRemoverAuxiliarActionPerformed

    private void setarCaixasTexto(){
        jtfLetraInicio.setText(alfabetos.getInicio());
        jtfLetraVazio.setText(alfabetos.getVazio());
    }
    
    public void atualizarLista() {
        mlist_auxiliares.clear();
        for (int count = 0; count < temp_auxAlfabetos.size(); count++) {
            mlist_auxiliares.addElement(temp_auxAlfabetos.get(count));
        }
    }
 

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
            java.util.logging.Logger.getLogger(AddAuxiliaryAlphabets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AddAuxiliaryAlphabets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AddAuxiliaryAlphabets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AddAuxiliaryAlphabets.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbAdicionarAuxiliar;
    private javax.swing.JButton jbRemoverAuxiliar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JList<String> jlAuxiliares;
    private javax.swing.JTextField jtfLetraInicio;
    private javax.swing.JTextField jtfLetraVazio;
    // End of variables declaration//GEN-END:variables
}
