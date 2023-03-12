/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Frame;
import java.awt.Image;
import java.awt.Window;
import java.awt.event.WindowListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Lorem Ipsum Dolor
 */
public class PilihLevel extends javax.swing.JFrame {

    /**
     * Creates new form PilihLevel
     */
    public PilihLevel() {
        initComponents();
        
        Image i = new ImageIcon(ClassLoader.getSystemResource("img/icon.png")).getImage();
        setIconImage(i);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnMenu = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btnSD = new javax.swing.JButton();
        btnSMP = new javax.swing.JButton();
        btnSMA = new javax.swing.JButton();
        btnMenu1 = new javax.swing.JButton();
        Background = new javax.swing.JLabel();

        btnMenu.setBackground(new java.awt.Color(224, 224, 224));
        btnMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        btnMenu.setBorder(null);
        btnMenu.setBorderPainted(false);
        btnMenu.setContentAreaFilled(false);
        btnMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenuMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMenuMouseReleased(evt);
            }
        });
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Select Level");
        setBackground(new java.awt.Color(224, 224, 224));
        setLocation(new java.awt.Point(450, 200));
        setPreferredSize(new java.awt.Dimension(350, 255));
        setResizable(false);
        setSize(new java.awt.Dimension(350, 255));
        setType(java.awt.Window.Type.POPUP);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Distant Galaxy", 1, 24)); // NOI18N
        jLabel1.setText("Select Level");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, -1, -1));

        btnSD.setBackground(new java.awt.Color(224, 224, 224));
        btnSD.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sd.png"))); // NOI18N
        btnSD.setBorder(null);
        btnSD.setBorderPainted(false);
        btnSD.setContentAreaFilled(false);
        btnSD.setFocusPainted(false);
        btnSD.setFocusTraversalPolicyProvider(true);
        btnSD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSDMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSDMouseReleased(evt);
            }
        });
        btnSD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDActionPerformed(evt);
            }
        });
        getContentPane().add(btnSD, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        btnSMP.setBackground(new java.awt.Color(224, 224, 224));
        btnSMP.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/smp.png"))); // NOI18N
        btnSMP.setBorder(null);
        btnSMP.setBorderPainted(false);
        btnSMP.setContentAreaFilled(false);
        btnSMP.setFocusPainted(false);
        btnSMP.setFocusTraversalPolicyProvider(true);
        btnSMP.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSMPMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSMPMouseReleased(evt);
            }
        });
        btnSMP.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMPActionPerformed(evt);
            }
        });
        getContentPane().add(btnSMP, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 80, -1, -1));

        btnSMA.setBackground(new java.awt.Color(224, 224, 224));
        btnSMA.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/sma.png"))); // NOI18N
        btnSMA.setBorder(null);
        btnSMA.setBorderPainted(false);
        btnSMA.setContentAreaFilled(false);
        btnSMA.setFocusPainted(false);
        btnSMA.setFocusTraversalPolicyProvider(true);
        btnSMA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSMAMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSMAMouseReleased(evt);
            }
        });
        btnSMA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSMAActionPerformed(evt);
            }
        });
        getContentPane().add(btnSMA, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 80, -1, -1));

        btnMenu1.setBackground(new java.awt.Color(224, 224, 224));
        btnMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/menu.png"))); // NOI18N
        btnMenu1.setBorder(null);
        btnMenu1.setBorderPainted(false);
        btnMenu1.setContentAreaFilled(false);
        btnMenu1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnMenu1MousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnMenu1MouseReleased(evt);
            }
        });
        btnMenu1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenu1ActionPerformed(evt);
            }
        });
        getContentPane().add(btnMenu1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 190, -1, -1));

        Background.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/milimeterblock.png"))); // NOI18N
        getContentPane().add(Background, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 510, 360));

        setSize(new java.awt.Dimension(389, 317));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnSDMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSDMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/sd-hover.png"));
        btnSD.setIcon(II);
    }//GEN-LAST:event_btnSDMousePressed

    private void btnSDMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSDMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/sd.png"));
        btnSD.setIcon(II);
    }//GEN-LAST:event_btnSDMouseReleased

    private void btnSMPMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSMPMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/smp-hover.png"));
        btnSMP.setIcon(II);
    }//GEN-LAST:event_btnSMPMousePressed

    private void btnSMPMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSMPMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/smp.png"));
        btnSMP.setIcon(II);
    }//GEN-LAST:event_btnSMPMouseReleased

    private void btnSMAMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSMAMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/sma-hover.png"));
        btnSMA.setIcon(II);
    }//GEN-LAST:event_btnSMAMousePressed

    private void btnSMAMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSMAMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/sma.png"));
        btnSMA.setIcon(II);
    }//GEN-LAST:event_btnSMAMouseReleased

    private void btnMenuMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/menu-hover.png"));
        btnMenu.setIcon(II);
    }//GEN-LAST:event_btnMenuMousePressed

    private void btnMenuMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenuMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/menu.png"));
        btnMenu.setIcon(II);
    }//GEN-LAST:event_btnMenuMouseReleased

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        // TODO add your handling code here:
        Sound.SoundButton();
        dispose();
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnMenu1MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenu1MousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/menu-hover.png"));
        btnMenu.setIcon(II);
    }//GEN-LAST:event_btnMenu1MousePressed

    private void btnMenu1MouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMenu1MouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/menu.png"));
        btnMenu.setIcon(II);
    }//GEN-LAST:event_btnMenu1MouseReleased

    private void btnMenu1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenu1ActionPerformed
        // TODO add your handling code here:
        Sound.SoundButton();
        dispose();
        MainMenu mm = new MainMenu();
        mm.setVisible(true);
    }//GEN-LAST:event_btnMenu1ActionPerformed

    private void btnSDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDActionPerformed
        Sound.SoundButton();
        dispose();
        Ui_soal_sd mulai=null;
        try {
            mulai = new Ui_soal_sd();
        } catch (InterruptedException ex) {
            Logger.getLogger(PilihLevel.class.getName()).log(Level.SEVERE, null, ex);
        }
        mulai.setVisible(true);
    }//GEN-LAST:event_btnSDActionPerformed

    private void btnSMPActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMPActionPerformed
        Sound.SoundButton();
        dispose();
        Ui_soal_smp start=null;
        try {
            start = new Ui_soal_smp();
        } catch (InterruptedException ex) {
            Logger.getLogger(PilihLevel.class.getName()).log(Level.SEVERE, null, ex);
        }
        start.setVisible(true);
    }//GEN-LAST:event_btnSMPActionPerformed

    private void btnSMAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSMAActionPerformed
        Sound.SoundButton();
        dispose();
        Ui_soal_sma start=null;
        try {
            start = new Ui_soal_sma();
        } catch (InterruptedException ex) {
            Logger.getLogger(PilihLevel.class.getName()).log(Level.SEVERE, null, ex);
        }
        start.setVisible(true);
    }//GEN-LAST:event_btnSMAActionPerformed

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
            java.util.logging.Logger.getLogger(PilihLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihLevel.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihLevel().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Background;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnMenu1;
    private javax.swing.JButton btnSD;
    private javax.swing.JButton btnSMA;
    private javax.swing.JButton btnSMP;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}