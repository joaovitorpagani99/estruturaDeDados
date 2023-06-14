/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package estruturadedados.view;

import estruturadedados.ListaAluno;
import estruturadedados.No;
import java.awt.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import model.Aluno;

/**
 *
 * @author joaov
 */
public class telaAluno extends javax.swing.JFrame {

    ListaAluno lista = new ListaAluno();
    DefaultTableModel dado;

    public ListaAluno getLista() {
        return lista;
    }

    public void setLista(ListaAluno lista) {
        this.lista = lista;
    }

    public telaAluno() {
        initComponents();
        this.dado = (DefaultTableModel) table.getModel();

    }

    public void carregarTabela() {
        dado.setNumRows(0);
        No atual = lista.getInicio();
        while (atual != null) {
            Aluno aluno = atual.getAluno();
            dado.addRow(new Object[]{
                aluno.getNome(),
                aluno.getIdade(),
                aluno.getMatricula()
            });
            atual = atual.getProximo();
        }
    }

        

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        btnInserir = new javax.swing.JButton();
        txtNomeAluno = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtIdade = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        table = new javax.swing.JTable();
        btnDeletar = new javax.swing.JButton();
        btnAtualizar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMAtricula = new javax.swing.JTextField();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });

        btnInserir.setText("Inserir");
        btnInserir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInserirActionPerformed(evt);
            }
        });

        jLabel2.setText("Nome do Aluno:");

        jLabel1.setText("Idade  do Aluno :");

        table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "Idade", "Matricula"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        table.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableMouseClicked(evt);
            }
        });
        table.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tableKeyPressed(evt);
            }
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tableKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(table);
        table.getAccessibleContext().setAccessibleName("");

        btnDeletar.setText("Deletar");
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnAtualizar.setText("Atualizar");
        btnAtualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAtualizarActionPerformed(evt);
            }
        });

        jLabel3.setText("Matricula");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                        .addComponent(txtMAtricula, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(86, 86, 86)
                        .addComponent(btnAtualizar)
                        .addGap(227, 227, 227))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(86, 86, 86)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnDeletar)
                                    .addComponent(btnInserir, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 339, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNomeAluno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btnInserir))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtIdade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnDeletar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMAtricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnAtualizar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnInserirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInserirActionPerformed

        String nome = txtNomeAluno.getText();
        int idade = Integer.parseInt(txtIdade.getText());
        String matricula = txtMAtricula.getText();
        try {

            Aluno aluno = new Aluno();
            aluno.setNome(nome);
            aluno.setIdade(idade);
            aluno.setMatricula(matricula);

            lista.inserirInicio(aluno);

            txtNomeAluno.setText("");
            txtIdade.setText("");
            txtMAtricula.setText("");

            lista.exibirLista();

            dado.addRow(new Object[]{
                aluno.getNome(),
                aluno.getIdade(),
                aluno.getMatricula()
            });
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "idade invalida");
        } 
    }//GEN-LAST:event_btnInserirActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated

    }//GEN-LAST:event_formWindowActivated

    private void tableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tableMouseClicked
        if (table.getSelectedRow() != -1) {
            txtNomeAluno.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
            txtIdade.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
            txtMAtricula.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tableMouseClicked

    private void tableKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyPressed
        // TODO add your handling code here:
    }//GEN-LAST:event_tableKeyPressed

    private void tableKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tableKeyReleased
        if (table.getSelectedRow() != -1) {
            txtNomeAluno.setText(table.getValueAt(table.getSelectedRow(), 0).toString());
            txtIdade.setText(table.getValueAt(table.getSelectedRow(), 1).toString());
            txtMAtricula.setText(table.getValueAt(table.getSelectedRow(), 2).toString());
        }
    }//GEN-LAST:event_tableKeyReleased

    private void btnAtualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAtualizarActionPerformed
//        int linha = table.getSelectedRow();
//        int coluna = table.getSelectedColumn();
//        if (table.getSelectedRow() != -1) {
//            Aluno aluno = new Aluno();
//            aluno.setNome(txtNomeAluno.getText());
//            aluno.setIdade(Integer.parseInt(txtIdade.getText()));
//            table.setValueAt(aluno, linha, coluna);
//            lista.alterar(aluno);
//        }
        lista.buscar(txtMAtricula.getText()).setIdade(Integer.parseInt(txtIdade.getText()));
        lista.buscar(txtMAtricula.getText()).setNome(txtNomeAluno.getText());
        lista.exibirLista();
        txtMAtricula.setEditable(true);
        carregarTabela();
    }//GEN-LAST:event_btnAtualizarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        int linha = table.getSelectedRow();
        lista.retirarMeio(linha);
        if (linha != -1) {
            lista.retirarMeio(linha);
            DefaultTableModel val = (DefaultTableModel) table.getModel();
            val.removeRow(linha);
        }
           lista.exibirLista();
    }//GEN-LAST:event_btnDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(telaAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(telaAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(telaAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);

        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(telaAluno.class
                    .getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new telaAluno().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAtualizar;
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnInserir;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTable table;
    private javax.swing.JTextField txtIdade;
    private javax.swing.JTextField txtMAtricula;
    private javax.swing.JTextField txtNomeAluno;
    // End of variables declaration//GEN-END:variables
}
