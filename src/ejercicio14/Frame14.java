/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio14;

import javax.swing.JOptionPane;

/**
 *
 * @author pared
 */
public class Frame14 extends javax.swing.JFrame {

    /**
     * Creates new form Frame14
     */
    public Frame14() {
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
        jLabel2 = new javax.swing.JLabel();
        txtNumeroPers = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDiasEstad = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtMontPag = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setText("Hotel 5 Estrellas.");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 20, -1, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Numero de Personas:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 70, -1, -1));

        txtNumeroPers.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNumeroPersKeyTyped(evt);
            }
        });
        jPanel1.add(txtNumeroPers, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 70, 120, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setText("Dias de Estadia:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 120, -1, -1));

        txtDiasEstad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtDiasEstadKeyTyped(evt);
            }
        });
        jPanel1.add(txtDiasEstad, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 120, 120, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setText("Monto a Pagar:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 180, -1, -1));

        txtMontPag.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtMontPagKeyTyped(evt);
            }
        });
        jPanel1.add(txtMontPag, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 180, 120, -1));

        jButton1.setText("Ejecutar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 230, -1, -1));

        jButton2.setText("Borrar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        jPanel1.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 230, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setText("1 DIA= $100000 - DIAS SIGUIENTES= $200000");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 310, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 430));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        long numper, diasest, montpag, op1, op2, op3, diasest1=100000, diasest2= 200000, op4;
        String res1, res2;
        
        if (txtNumeroPers.getText().trim().isEmpty())
        {
            JOptionPane.showMessageDialog(this, "Ingrese Numero de Personas", "ERROR", JOptionPane.ERROR_MESSAGE);
            txtNumeroPers.requestFocusInWindow();
        }
        else if (txtDiasEstad.getText().trim().isEmpty())
        {
          JOptionPane.showMessageDialog(this, "Ingrese Numero de Dias", "ERROR", JOptionPane.ERROR_MESSAGE);
          txtDiasEstad.requestFocusInWindow();
        }
        else {
        numper= Long.parseLong(txtNumeroPers.getText());
        diasest = Long.parseLong(txtDiasEstad.getText());
        
        if (diasest==1)
        {
            op1= numper*diasest*diasest1;
            res1= String.valueOf(op1);
            txtMontPag.setText(res1);
        }
        if (diasest>1)
        {
            op2=diasest2*diasest;
            op3= op2 - 100000;
            op4= op3*numper;
            res2= String.valueOf(op4);
            txtMontPag.setText(res2);
        }
        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtNumeroPersKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNumeroPersKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
         
    }//GEN-LAST:event_txtNumeroPersKeyTyped

    private void txtDiasEstadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtDiasEstadKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
          
    }//GEN-LAST:event_txtDiasEstadKeyTyped

    private void txtMontPagKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtMontPagKeyTyped
        // TODO add your handling code here:
          char c=evt.getKeyChar(); 
          if(!Character.isDigit(c)) 
          { 
              getToolkit().beep(); 
              evt.consume();      
          }
         
          if(!Character.isLetter(c)) 
          { 
              getToolkit().beep(); 
              evt.consume(); 
          }
    }//GEN-LAST:event_txtMontPagKeyTyped

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        txtDiasEstad.setText("");
        txtMontPag.setText("");
        txtNumeroPers.setText("");
        
        txtNumeroPers.requestFocusInWindow();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(Frame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frame14.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frame14().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtDiasEstad;
    private javax.swing.JTextField txtMontPag;
    private javax.swing.JTextField txtNumeroPers;
    // End of variables declaration//GEN-END:variables
}
