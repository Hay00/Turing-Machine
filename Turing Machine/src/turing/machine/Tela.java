/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turing.machine;

import java.util.ArrayList;
import javax.swing.DefaultListCellRenderer;
import javax.swing.DefaultListModel;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableModel;
import turing.messages.GUIMessage;

/**
 *
 * @author Vinicios
 */
public class Tela extends javax.swing.JFrame {

    private DefaultListModel list_fita;
    private DefaultListModel list_cabecote;
    static TuringMachine maquina = new TuringMachine();
    private DefaultListCellRenderer renderer;

    /**
     * Creates new form Tela
     */
    public Tela() {
        initComponents();

        list_fita = new DefaultListModel();
        list_cabecote = new DefaultListModel();

        jlFita.setModel(list_fita);
        jlCabecote.setModel(list_cabecote);

        renderer = (DefaultListCellRenderer) jlFita.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);
        renderer = (DefaultListCellRenderer) jlCabecote.getCellRenderer();
        renderer.setHorizontalAlignment(SwingConstants.CENTER);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jtfCaracteres = new javax.swing.JTextField();
        jbInserir = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jlFita = new javax.swing.JList<>();
        jScrollPane3 = new javax.swing.JScrollPane();
        jlCabecote = new javax.swing.JList<>();
        jScrollPane4 = new javax.swing.JScrollPane();
        jtTabela = new javax.swing.JTable();
        jbProximo = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Turing Machine");

        jbInserir.setText("Inserir");
        jbInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbInserirActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(jlFita);

        jScrollPane3.setViewportView(jlCabecote);

        jtTabela.setFont(new java.awt.Font("Dialog", 0, 14)); // NOI18N
        jtTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"q0", null, null, null, null, null, null},
                {"q1", null, null, null, null, null, null},
                {"q2", null, null, null, null, null, null},
                {"q3", null, null, null, null, null, null},
                {"q4", null, null, null, null, null, null}
            },
            new String [] {
                "Estado", "*", "a", "b", "A", "B", "β"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTabela.setRowSelectionAllowed(false);
        jtTabela.setShowHorizontalLines(false);
        jtTabela.setShowVerticalLines(false);
        jtTabela.getTableHeader().setResizingAllowed(false);
        jtTabela.getTableHeader().setReorderingAllowed(false);
        jScrollPane4.setViewportView(jtTabela);

        jbProximo.setText("Mover");
        jbProximo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbProximoActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
        jLabel1.setText("Turing Machine");

        jLabel2.setText("Sequencia de Caractéres:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jtfCaracteres))
                        .addGap(152, 152, 152)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(212, 212, 212))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jbInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jbProximo, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 516, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 35, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jtfCaracteres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jbInserir)
                            .addComponent(jbProximo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jScrollPane3)))
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 338, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(35, 35, 35))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbInserirActionPerformed
        maquina.Inicializar(jtfCaracteres.getText().toCharArray());
        jbInserir.setEnabled(false);
        jtfCaracteres.setEditable(false);
        start();
    }//GEN-LAST:event_jbInserirActionPerformed

    private void jbProximoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbProximoActionPerformed
        start();
    }//GEN-LAST:event_jbProximoActionPerformed

    public void start() {
        try {
            populateLists();
            populateTable();
            maquina.executarMaquina();
        } catch (RuntimeException e) {
            if (e.toString().equals("java.lang.RuntimeException: error")) {
                GUIMessage.error("Palavra rejeitada!");
                jbProximo.setEnabled(false);
            }
            if (e.toString().equals("java.lang.RuntimeException: inf")) {
                GUIMessage.inf("O Programa entrou em estado de aceitação!");
                jbProximo.setEnabled(false);
                for (int count = 0; count < maquina.tabela.size(); count++) {
                    System.out.println(count + " String " + maquina.tabela.get(count));
                }
            }
        }
    }

    public void populateLists() {
        list_cabecote.clear();
        list_fita.clear();
        char[] temp_fita = maquina.getFita();
        for (int count = 0; count < temp_fita.length; count++) {
            list_fita.addElement(temp_fita[count]);
            if (maquina.getCabecote() == count) {
                list_cabecote.addElement("<--  " + maquina.getEstado());
            } else {
                list_cabecote.addElement(" ");
            }
        }
    }

    public void populateTable() {
        DefaultTableModel model = (DefaultTableModel) jtTabela.getModel();
        model.setRowCount(0);
//model.addRow(new Object[]{});
        ArrayList temp_tabela = maquina.tabela;
        for (int i = 0; i < temp_tabela.size(); i++) {
            String a = maquina.tabela.get(i);
            System.out.println("q" + i);
            if (a.startsWith("q" + i) && a.contains("a")) {
                System.out.println(a);
            }

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
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Tela.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Tela().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JList<String> jList1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JButton jbInserir;
    private javax.swing.JButton jbProximo;
    private javax.swing.JList<String> jlCabecote;
    private javax.swing.JList<String> jlFita;
    private javax.swing.JTable jtTabela;
    private javax.swing.JTextField jtfCaracteres;
    // End of variables declaration//GEN-END:variables
}