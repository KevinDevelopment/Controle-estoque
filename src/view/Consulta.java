/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import DAO.CadastroDAO;
import DAO.JoinDAO;
import classes.Cadastro;
import classes.ClasseJoin;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author win
 */
public class Consulta extends javax.swing.JFrame {

    /**
     * Creates new form Consulta
     */
    public Consulta() {
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
        cbxJoin = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        btnPesquisar = new javax.swing.JButton();
        btnVoltar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblInner = new javax.swing.JTable();
        btnLimpar = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenuItem3 = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        jPanel1.setLayout(null);

        jLabel1.setText("Categoria:");
        jPanel1.add(jLabel1);
        jLabel1.setBounds(40, 70, 60, 14);

        cbxJoin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Placa mãe", "Placa de video", "Processador", "Memoria ram", "Fonte", "Gabinete", "Mouse", "Teclado", "Monitor" }));
        jPanel1.add(cbxJoin);
        cbxJoin.setBounds(100, 67, 180, 40);

        jLabel2.setFont(new java.awt.Font("Arial", 0, 24)); // NOI18N
        jLabel2.setText("             Consultar estoque");
        jPanel1.add(jLabel2);
        jLabel2.setBounds(98, 21, 310, 40);

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });
        jPanel1.add(btnPesquisar);
        btnPesquisar.setBounds(40, 280, 140, 50);

        btnVoltar.setText("Voltar");
        btnVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVoltarActionPerformed(evt);
            }
        });
        jPanel1.add(btnVoltar);
        btnVoltar.setBounds(40, 210, 140, 50);

        tblInner.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fornecedor", "Numero de Série", "Preço"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tblInner);

        jPanel1.add(jScrollPane1);
        jScrollPane1.setBounds(320, 70, 370, 300);

        btnLimpar.setText("Limpar");
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });
        jPanel1.add(btnLimpar);
        btnLimpar.setBounds(43, 140, 140, 50);

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 710, 420);

        jMenu1.setText("Ferramentas");

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_P, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setText("Pesquisa");
        jMenu1.add(jMenuItem1);

        jMenuItem2.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_V, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem2.setText("Volta");
        jMenu1.add(jMenuItem2);

        jMenuBar1.add(jMenu1);

        jMenu2.setText("Opções");
        jMenu2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });

        jMenuItem3.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem3.setText("Sair");
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu2.add(jMenuItem3);

        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        setSize(new java.awt.Dimension(724, 457));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        this.dispose();
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void jMenu2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed

    }//GEN-LAST:event_jMenu2ActionPerformed

    private void btnVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVoltarActionPerformed
        this.dispose();       // TODO add your handling code here:
    }//GEN-LAST:event_btnVoltarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        switch (cbxJoin.getSelectedIndex()) {

            case 0:
                if (cbxJoin.getSelectedItem().equals("Placa mãe")) {
                    ArrayList<ClasseJoin> lista = new JoinDAO().listaInner();
                    DefaultTableModel modelo = (DefaultTableModel) tblInner.getModel();
                    for (int i = 0; i < lista.size(); i++) {
                        modelo.addRow(new String[]{lista.get(i).getCD_frc(),
                            lista.get(i).getCD_Serie(), lista.get(i).getPeca_preco()});
                    }
                }

                break;
            case 1:
                if (cbxJoin.getSelectedItem().equals("Placa de video")) {
                    ArrayList<ClasseJoin> lista = new JoinDAO().listaVideo();
                    DefaultTableModel modelo = (DefaultTableModel) tblInner.getModel();
                    for (int i = 0; i < lista.size(); i++) {
                        modelo.addRow(new String[]{lista.get(i).getCD_frc(),
                            lista.get(i).getCD_Serie(), lista.get(i).getPeca_preco()});
                    }
                }

                break;

            case 2:

                if (cbxJoin.getSelectedItem().equals("Processador")) {
                    ArrayList<ClasseJoin> lista = new JoinDAO().listaProcessador();
                    DefaultTableModel modelo = (DefaultTableModel) tblInner.getModel();
                    for (int i = 0; i < lista.size(); i++) {
                        modelo.addRow(new String[]{lista.get(i).getCD_frc(),
                            lista.get(i).getCD_Serie(), lista.get(i).getPeca_preco()});
                    }
                }

                break;

            case 3:

                if (cbxJoin.getSelectedItem().equals("Memoria ram")) {
                    ArrayList<ClasseJoin> lista = new JoinDAO().listaMemoria();
                    DefaultTableModel modelo = (DefaultTableModel) tblInner.getModel();
                    for (int i = 0; i < lista.size(); i++) {
                        modelo.addRow(new String[]{lista.get(i).getCD_frc(),
                            lista.get(i).getCD_Serie(), lista.get(i).getPeca_preco()});
                    }
                }

                break;
            case 4:

                if (cbxJoin.getSelectedItem().equals("Fonte")) {
                    ArrayList<ClasseJoin> lista = new JoinDAO().listaFonte();
                    DefaultTableModel modelo = (DefaultTableModel) tblInner.getModel();
                    for (int i = 0; i < lista.size(); i++) {
                        modelo.addRow(new String[]{lista.get(i).getCD_frc(),
                            lista.get(i).getCD_Serie(), lista.get(i).getPeca_preco()});
                    }
                }

                break;
            case 5:

                if (cbxJoin.getSelectedItem().equals("Gabinete")) {
                    ArrayList<ClasseJoin> lista = new JoinDAO().listaGabinete();
                    DefaultTableModel modelo = (DefaultTableModel) tblInner.getModel();
                    for (int i = 0; i < lista.size(); i++) {
                        modelo.addRow(new String[]{lista.get(i).getCD_frc(),
                            lista.get(i).getCD_Serie(), lista.get(i).getPeca_preco()});
                    }
                }

                break;
            case 6:

                if (cbxJoin.getSelectedItem().equals("Mouse")) {
                    ArrayList<ClasseJoin> lista = new JoinDAO().listaMouse();
                    DefaultTableModel modelo = (DefaultTableModel) tblInner.getModel();
                    for (int i = 0; i < lista.size(); i++) {
                        modelo.addRow(new String[]{lista.get(i).getCD_frc(),
                            lista.get(i).getCD_Serie(), lista.get(i).getPeca_preco()});
                    }
                }

                break;
            case 7:

                if (cbxJoin.getSelectedItem().equals("Teclado")) {
                    ArrayList<ClasseJoin> lista = new JoinDAO().listaTeclado();
                    DefaultTableModel modelo = (DefaultTableModel) tblInner.getModel();
                    for (int i = 0; i < lista.size(); i++) {
                        modelo.addRow(new String[]{lista.get(i).getCD_frc(),
                            lista.get(i).getCD_Serie(), lista.get(i).getPeca_preco()});
                    }
                }

                break;
            case 8:

                if (cbxJoin.getSelectedItem().equals("Monitor")) {
                    ArrayList<ClasseJoin> lista = new JoinDAO().listaMonitor();
                    DefaultTableModel modelo = (DefaultTableModel) tblInner.getModel();
                    for (int i = 0; i < lista.size(); i++) {
                        modelo.addRow(new String[]{lista.get(i).getCD_frc(),
                            lista.get(i).getCD_Serie(), lista.get(i).getPeca_preco()});
                    }
                }

                break;
            case 9:

                break;
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        String titulos[] = {"FORNECEDOR", "NUMERO DE SERIE", "PREÇO"};
        Object dados[][] = {
            {}};

        DefaultTableModel modelo
                = new DefaultTableModel(dados, titulos);
        tblInner.setModel(modelo);

        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

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
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Consulta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Consulta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JButton btnVoltar;
    private javax.swing.JComboBox cbxJoin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblInner;
    // End of variables declaration//GEN-END:variables
}