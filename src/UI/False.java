/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.ImageIcon;

/**
 *
 * @author Lorem IpsumDolor
 */
public class False extends javax.swing.JDialog {

    /**
     * Creates new form Waktu
     */
    public False(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        btnOkay = new javax.swing.JButton();
        lblTrue = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setLocation(new java.awt.Point(550, 300));
        setPreferredSize(new java.awt.Dimension(260, 150));
        setResizable(false);
        setSize(new java.awt.Dimension(260, 150));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnOkay.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/okay.png"))); // NOI18N
        btnOkay.setBorder(null);
        btnOkay.setBorderPainted(false);
        btnOkay.setContentAreaFilled(false);
        btnOkay.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnOkayMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnOkayMouseReleased(evt);
            }
        });
        btnOkay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkayActionPerformed(evt);
            }
        });
        getContentPane().add(btnOkay, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 80, -1, -1));

        lblTrue.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/X.png"))); // NOI18N
        getContentPane().add(lblTrue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 100, 100));

        jLabel2.setFont(new java.awt.Font("Ubuntu-Title", 0, 24)); // NOI18N
        jLabel2.setText("Jawaban Salah");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 30, -1, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/milimeterblock.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 370, 130));

        setSize(new java.awt.Dimension(288, 157));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkayMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkayMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/okay-hover.png"));
        btnOkay.setIcon(II);
    }//GEN-LAST:event_btnOkayMousePressed

    private void btnOkayMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnOkayMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/okay.png"));
        btnOkay.setIcon(II);
    }//GEN-LAST:event_btnOkayMouseReleased

    private void btnOkayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkayActionPerformed
        //Sound.SoundButton();
        dispose();
    }//GEN-LAST:event_btnOkayActionPerformed

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
            java.util.logging.Logger.getLogger(False.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(False.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(False.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(False.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                False dialog = new False(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkay;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblTrue;
    // End of variables declaration//GEN-END:variables
}
