/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import javax.swing.ImageIcon;

/**
 *
 * @author Lorem Ipsum Dolor
 */
public class how extends javax.swing.JFrame{

    /**
     * Creates new form how
     */
    public how() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        rd1 = new javax.swing.JRadioButton();
        lblImage = new javax.swing.JLabel();
        rd2 = new javax.swing.JRadioButton();
        rd3 = new javax.swing.JRadioButton();
        rd4 = new javax.swing.JRadioButton();
        btnMenu = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setIconImages(null);
        setLocation(new java.awt.Point(450, 200));
        setPreferredSize(new java.awt.Dimension(500, 400));
        setResizable(false);

        buttonGroup1.add(rd1);
        rd1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd1ActionPerformed(evt);
            }
        });

        lblImage.setIcon(new javax.swing.ImageIcon(getClass().getResource("/slide/1.png"))); // NOI18N
        lblImage.setPreferredSize(new java.awt.Dimension(85, 100));

        buttonGroup1.add(rd2);
        rd2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd3);
        rd3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd3ActionPerformed(evt);
            }
        });

        buttonGroup1.add(rd4);
        rd4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                rd4ActionPerformed(evt);
            }
        });

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 507, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(211, 211, 211)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnMenu)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(rd1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rd4)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(lblImage, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(rd3)
                    .addComponent(rd4)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(rd1)
                        .addComponent(rd2)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btnMenu)
                .addContainerGap())
        );

        rd1.setSelected(true);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void rd4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd4ActionPerformed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/slide/4.png"));
        lblImage.setIcon(II);
    }//GEN-LAST:event_rd4ActionPerformed

    private void rd1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd1ActionPerformed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/slide/1.png"));
        lblImage.setIcon(II);
        rd1.isSelected();
    }//GEN-LAST:event_rd1ActionPerformed

    private void rd2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd2ActionPerformed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/slide/2.png"));
        lblImage.setIcon(II);
    }//GEN-LAST:event_rd2ActionPerformed

    private void rd3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_rd3ActionPerformed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/slide/3.png"));
        lblImage.setIcon(II);
    }//GEN-LAST:event_rd3ActionPerformed

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
            java.util.logging.Logger.getLogger(how.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(how.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(how.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(how.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new how().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnMenu;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblImage;
    private javax.swing.JRadioButton rd1;
    private javax.swing.JRadioButton rd2;
    private javax.swing.JRadioButton rd3;
    private javax.swing.JRadioButton rd4;
    // End of variables declaration//GEN-END:variables
}