/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.CardLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

/**
 *
 * @author Lorem IpsumDolor
 */
public class HowToPlay extends javax.swing.JFrame {
    private CardLayout cardLayout;
    /**
     * Creates new form HowToPlay
     */
    void initImage(){
        String[] filesName={"welcome.png","hw1.png","hw2.png","hw3.png","hw4.png","hw5.png","hw6.png","end.png"};
        for (String s : filesName){
            Icon icon = new ImageIcon("src/img/"+s);
            JLabel label = new JLabel(icon);
            Mainframe.add(label);
        }
        cardLayout = new CardLayout();
        Mainframe.setLayout(cardLayout);
    }
    public HowToPlay() {
        initComponents();
        initImage();
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
        Mainframe = new javax.swing.JPanel();
        BtnNext = new javax.swing.JButton();
        BtnPrev = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("How To Play");
        setLocation(new java.awt.Point(450, 200));
        setPreferredSize(new java.awt.Dimension(465, 390));
        setResizable(false);
        setSize(new java.awt.Dimension(465, 390));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

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
        getContentPane().add(btnMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 309, -1, 50));

        Mainframe.setBackground(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout MainframeLayout = new javax.swing.GroupLayout(Mainframe);
        Mainframe.setLayout(MainframeLayout);
        MainframeLayout.setHorizontalGroup(
            MainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 460, Short.MAX_VALUE)
        );
        MainframeLayout.setVerticalGroup(
            MainframeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 293, Short.MAX_VALUE)
        );

        getContentPane().add(Mainframe, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 460, -1));

        BtnNext.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kanan.png"))); // NOI18N
        BtnNext.setBorderPainted(false);
        BtnNext.setContentAreaFilled(false);
        BtnNext.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnNextMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnNextMouseReleased(evt);
            }
        });
        BtnNext.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnNextActionPerformed(evt);
            }
        });
        getContentPane().add(BtnNext, new org.netbeans.lib.awtextra.AbsoluteConstraints(360, 310, 90, -1));

        BtnPrev.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/kiri.png"))); // NOI18N
        BtnPrev.setBorderPainted(false);
        BtnPrev.setContentAreaFilled(false);
        BtnPrev.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                BtnPrevMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                BtnPrevMouseReleased(evt);
            }
        });
        BtnPrev.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnPrevActionPerformed(evt);
            }
        });
        getContentPane().add(BtnPrev, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 310, 100, -1));

        setSize(new java.awt.Dimension(464, 400));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void BtnNextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnNextActionPerformed
        // TODO add your handling code here:
        Sound.SoundButton();
        cardLayout.next(Mainframe);
    }//GEN-LAST:event_BtnNextActionPerformed

    private void BtnPrevActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnPrevActionPerformed
        // TODO add your handling code here:
        Sound.SoundButton();
        cardLayout.previous(Mainframe);
    }//GEN-LAST:event_BtnPrevActionPerformed

    private void BtnNextMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/kanan-hover.png"));
        BtnNext.setIcon(II);
    }//GEN-LAST:event_BtnNextMousePressed

    private void BtnPrevMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrevMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/kiri-hover.png"));
        BtnPrev.setIcon(II);
    }//GEN-LAST:event_BtnPrevMousePressed

    private void BtnNextMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnNextMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/kanan.png"));
        BtnNext.setIcon(II);
    }//GEN-LAST:event_BtnNextMouseReleased

    private void BtnPrevMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_BtnPrevMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/kiri.png"));
        BtnPrev.setIcon(II);
    }//GEN-LAST:event_BtnPrevMouseReleased

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
            java.util.logging.Logger.getLogger(HowToPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HowToPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HowToPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HowToPlay.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HowToPlay().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnNext;
    private javax.swing.JButton BtnPrev;
    private javax.swing.JPanel Mainframe;
    private javax.swing.JButton btnMenu;
    // End of variables declaration//GEN-END:variables
}
