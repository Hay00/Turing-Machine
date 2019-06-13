/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import code.AlfabetoTotal;
import java.util.List;
import code.Funcao;
import javax.swing.DefaultListModel;

/**
 *
 * @author Vinicios
 */
public class CreateFunction extends javax.swing.JDialog {

    // Objetos repassados
    private List<Funcao> listaFuncoes;
    private List<String> listaEstados;
    private List<String> listaAlfabetos;
    private List<String> listaAuxiliares;

    // Models para Jlists
    private DefaultListModel mlist_estadosAtuais;
    private DefaultListModel mlist_estadosProximo;
    private DefaultListModel mlist_funcoes;
    private DefaultListModel mlist_alfabetos;
    private DefaultListModel mlist_alfabetosAuxiliares;

    // Váriaveis temporarias
    private String estadoAtual;
    private String estadoProx;
    private String direcao;
    private String leitura;
    private String escrita;
    private MainScreen telaPai;

    /**
     * Creates new form CreateFunction
     */
    public CreateFunction(MainScreen telaPai,java.awt.Frame parent, boolean modal, List<Funcao> listaFuncoes, List<String> listaEstados, AlfabetoTotal alfabetos) {
        super(parent, modal);
        this.telaPai = telaPai;
        initComponents();
        
        // Iniciando os models
        mlist_estadosAtuais = new DefaultListModel();
        mlist_estadosProximo = new DefaultListModel();
        mlist_funcoes = new DefaultListModel();
        mlist_alfabetos = new DefaultListModel();
        mlist_alfabetosAuxiliares = new DefaultListModel();
        
        // Setando objetos repassados
        this.listaFuncoes = listaFuncoes;
        this.listaEstados = listaEstados;
        this.listaAlfabetos = alfabetos.getAlfabetos();
        this.listaAuxiliares = alfabetos.getAuxiliares();

        // Setando models para Jlists
        jlSelecEstadoAtual.setModel(mlist_estadosAtuais);
        jlSelecProxEstado.setModel(mlist_estadosProximo);
        jlLeitura.setModel(mlist_alfabetos);
        jlEscrita.setModel(mlist_alfabetosAuxiliares);

        // Setando váriaveis locais temporárias
        this.estadoAtual = null;
        this.estadoProx = null;
        this.direcao = null;
        this.leitura = null;
        this.escrita = null;
        
        
        mostrarItens();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpFunc = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlSelecEstadoAtual = new javax.swing.JList<>();
        jScrollPane6 = new javax.swing.JScrollPane();
        jlSelecProxEstado = new javax.swing.JList<>();
        jbSelecProxEstado = new javax.swing.JButton();
        jbSelecEstadoAtual = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtfResultadoFuncao = new javax.swing.JTextField();
        jbCriarFuncao = new javax.swing.JButton();
        jbGerarFuncao = new javax.swing.JButton();
        jbSelecLeitura = new javax.swing.JButton();
        jbSelecEscrita = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlEscrita = new javax.swing.JList<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        jlLeitura = new javax.swing.JList<>();
        jcDirecao = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Criar Função");

        jpFunc.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel10.setText("Realiza a escrita de");

        jLabel9.setText("Realiza a leitura de");

        jLabel4.setText("Direção");

        jScrollPane3.setViewportView(jlSelecEstadoAtual);

        jScrollPane6.setViewportView(jlSelecProxEstado);

        jbSelecProxEstado.setText("Selecionar");
        jbSelecProxEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecProxEstadoActionPerformed(evt);
            }
        });

        jbSelecEstadoAtual.setText("Selecionar");
        jbSelecEstadoAtual.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecEstadoAtualActionPerformed(evt);
            }
        });

        jLabel6.setText("Estado atual");

        jLabel12.setText("Proximo Estado");

        jLabel13.setText("Resultado");

        jLabel7.setFont(new java.awt.Font("Dialog", 1, 20)); // NOI18N
        jLabel7.setText("Criar Função");

        jtfResultadoFuncao.setEditable(false);

        jbCriarFuncao.setText("Salvar Função");
        jbCriarFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCriarFuncaoActionPerformed(evt);
            }
        });

        jbGerarFuncao.setText("Gerar Função");
        jbGerarFuncao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbGerarFuncaoActionPerformed(evt);
            }
        });

        jbSelecLeitura.setText("Selecionar");
        jbSelecLeitura.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecLeituraActionPerformed(evt);
            }
        });

        jbSelecEscrita.setText("Selecionar");
        jbSelecEscrita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSelecEscritaActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jlEscrita);

        jScrollPane1.setViewportView(jlLeitura);

        jcDirecao.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Direita", "Esquerda" }));

        javax.swing.GroupLayout jpFuncLayout = new javax.swing.GroupLayout(jpFunc);
        jpFunc.setLayout(jpFuncLayout);
        jpFuncLayout.setHorizontalGroup(
            jpFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpFuncLayout.createSequentialGroup()
                .addContainerGap(16, Short.MAX_VALUE)
                .addGroup(jpFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel9)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSelecLeitura)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSelecEstadoAtual, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(97, 97, 97)
                .addGroup(jpFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSelecProxEstado)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbSelecEscrita)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
            .addGroup(jpFuncLayout.createSequentialGroup()
                .addGap(93, 93, 93)
                .addGroup(jpFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jbGerarFuncao)
                    .addComponent(jLabel13)
                    .addComponent(jtfResultadoFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 202, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCriarFuncao))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFuncLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jpFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addComponent(jLabel4)
                    .addComponent(jcDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(164, 164, 164))
            .addGroup(jpFuncLayout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpFuncLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane3, jScrollPane6});

        jpFuncLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        jpFuncLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbSelecEstadoAtual, jbSelecProxEstado});

        jpFuncLayout.linkSize(javax.swing.SwingConstants.HORIZONTAL, new java.awt.Component[] {jbSelecEscrita, jbSelecLeitura});

        jpFuncLayout.setVerticalGroup(
            jpFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpFuncLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel7)
                .addGap(12, 12, 12)
                .addGroup(jpFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane6, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                    .addComponent(jScrollPane3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jpFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSelecEstadoAtual)
                    .addComponent(jbSelecProxEstado))
                .addGroup(jpFuncLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpFuncLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcDirecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel9)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSelecLeitura))
                    .addGroup(jpFuncLayout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(jLabel10)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jbSelecEscrita)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbGerarFuncao)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel13)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jtfResultadoFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jbCriarFuncao)
                .addContainerGap(16, Short.MAX_VALUE))
        );

        jpFuncLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbSelecEstadoAtual, jbSelecProxEstado});

        jpFuncLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jbSelecEscrita, jbSelecLeitura});

        jpFuncLayout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {jScrollPane1, jScrollPane2});

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jpFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpFunc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbGerarFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbGerarFuncaoActionPerformed
        jtfResultadoFuncao.setText(estadoAtual + ": (" + estadoProx + "," + escrita + "," + jcDirecao.getSelectedItem().toString() + ")");
        jbCriarFuncao.setEnabled(true);
    }//GEN-LAST:event_jbGerarFuncaoActionPerformed

    private void jbSelecEstadoAtualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecEstadoAtualActionPerformed
        this.estadoAtual = jlSelecEstadoAtual.getSelectedValue();
    }//GEN-LAST:event_jbSelecEstadoAtualActionPerformed

    private void jbSelecProxEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecProxEstadoActionPerformed
        this.estadoProx = jlSelecProxEstado.getSelectedValue();
    }//GEN-LAST:event_jbSelecProxEstadoActionPerformed

    private void jbSelecLeituraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecLeituraActionPerformed
        this.leitura = jlLeitura.getSelectedValue();
    }//GEN-LAST:event_jbSelecLeituraActionPerformed

    private void jbSelecEscritaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSelecEscritaActionPerformed
        this.escrita = jlEscrita.getSelectedValue();
    }//GEN-LAST:event_jbSelecEscritaActionPerformed

    private void jbCriarFuncaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCriarFuncaoActionPerformed
        this.direcao = jcDirecao.getSelectedItem().toString();
        Funcao funcTemp = new Funcao(leitura, escrita, estadoAtual, estadoProx, direcao);
        listaFuncoes.add(funcTemp);
        telaPai.atualizarFuncoes();
        this.dispose();
    }//GEN-LAST:event_jbCriarFuncaoActionPerformed
    
    private void mostrarItens() {
        for (int count = 0; count < listaEstados.size(); count++) {
            mlist_estadosAtuais.addElement(listaEstados.get(count));
            mlist_estadosProximo.addElement(listaEstados.get(count));            
        }
        
        for (int count = 0; count < listaAlfabetos.size(); count++) {
            mlist_alfabetos.addElement(listaAlfabetos.get(count));
        }
        
        for (int count = 0; count < listaAuxiliares.size(); count++) {
            mlist_alfabetosAuxiliares.addElement(listaAuxiliares.get(count));
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
            java.util.logging.Logger.getLogger(CreateFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CreateFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CreateFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CreateFunction.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane6;
    private javax.swing.JButton jbCriarFuncao;
    private javax.swing.JButton jbGerarFuncao;
    private javax.swing.JButton jbSelecEscrita;
    private javax.swing.JButton jbSelecEstadoAtual;
    private javax.swing.JButton jbSelecLeitura;
    private javax.swing.JButton jbSelecProxEstado;
    private javax.swing.JComboBox<String> jcDirecao;
    private javax.swing.JList<String> jlEscrita;
    private javax.swing.JList<String> jlLeitura;
    private javax.swing.JList<String> jlSelecEstadoAtual;
    private javax.swing.JList<String> jlSelecProxEstado;
    private javax.swing.JPanel jpFunc;
    private javax.swing.JTextField jtfResultadoFuncao;
    // End of variables declaration//GEN-END:variables
}
