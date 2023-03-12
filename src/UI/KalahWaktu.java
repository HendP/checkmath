/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;

/**
 *
 * @author Aditia Farhan
 */
public class KalahWaktu extends javax.swing.JDialog {

    /**
     * Creates new form KalahWaktu
     */
    private String nama;
    private int skor;
    private String kunci;
    private String level;
    public KalahWaktu(java.awt.Frame parent, boolean modal,String nama,int Skor,String kunci,String level) {
        super(parent, modal);
        this.skor=Skor;
        this.kunci=kunci;
        this.nama=nama;
        this.level=level;
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

        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnMainMenu = new javax.swing.JButton();
        btnTryAgain = new javax.swing.JButton();
        jskor = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jnama = new javax.swing.JLabel();
        jkey = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setLocation(new java.awt.Point(450, 130));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Bernard MT Condensed", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(83, 37, 19));
        jLabel2.setText("GAME OVER");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 40, 300, 60));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/test.png"))); // NOI18N
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, 40));

        jLabel4.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(226, 149, 74));
        jLabel4.setText("YOU'RE RUNNING OUT");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 280, 270, -1));

        jLabel5.setFont(new java.awt.Font("Bernard MT Condensed", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(226, 149, 74));
        jLabel5.setText("OF TIME");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 310, 120, 40));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/waktu.png"))); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 110, 90, 150));

        btnMainMenu.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/mainmenu3.png"))); // NOI18N
        btnMainMenu.setBorderPainted(false);
        btnMainMenu.setContentAreaFilled(false);
        btnMainMenu.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnMainMenuMouseClicked(evt);
            }
        });
        btnMainMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMainMenuActionPerformed(evt);
            }
        });
        getContentPane().add(btnMainMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 470, 120, 40));

        btnTryAgain.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/continue3.png"))); // NOI18N
        btnTryAgain.setBorderPainted(false);
        btnTryAgain.setContentAreaFilled(false);
        btnTryAgain.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnTryAgainMouseClicked(evt);
            }
        });
        getContentPane().add(btnTryAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, 120, 40));

        jskor.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        jskor.setForeground(new java.awt.Color(83, 37, 19));
        jskor.setText("XXX");
        getContentPane().add(jskor, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 420, 60, -1));

        jLabel13.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(83, 37, 19));
        jLabel13.setText("SCORE                  :");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 420, 170, -1));

        jLabel12.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(83, 37, 19));
        jLabel12.setText("NAME                    :");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 390, 160, -1));

        jnama.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        jnama.setForeground(new java.awt.Color(83, 37, 19));
        jnama.setText("Lorem Ipsum Dolor");
        getContentPane().add(jnama, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 390, -1, -1));

        jkey.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        jkey.setForeground(new java.awt.Color(83, 37, 19));
        jkey.setText("Lorem Ipsum Dolor");
        getContentPane().add(jkey, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 350, 190, 30));

        jLabel11.setFont(new java.awt.Font("Bernard MT Condensed", 1, 18)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(83, 37, 19));
        jLabel11.setText("THE ANSWER IS  :");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 350, 160, 30));

        jLabel1.setForeground(new java.awt.Color(83, 37, 19));
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/milimeterblock.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 480, 520));
        Sound.SoundLose();
        jkey.setText(kunci);
        jnama.setText(nama);
        jskor.setText(String.valueOf(skor));

        setSize(new java.awt.Dimension(501, 593));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnMainMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMainMenuActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnMainMenuActionPerformed

    private void btnMainMenuMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMainMenuMouseClicked
        // TODO add your handling code here:
        Sound.SoundButton();
        dispose();
        MainMenu mn = new MainMenu();
        mn.setVisible(true);
    }//GEN-LAST:event_btnMainMenuMouseClicked

    private void btnTryAgainMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnTryAgainMouseClicked
        Sound.SoundButton();
        dispose();
        Ui_soal_sd soal1;
        Ui_soal_smp soal2;
        Ui_soal_sma soal3;
        if(level.equalsIgnoreCase("SD")){                        
            try {
                soal1 = new Ui_soal_sd();
                soal1.setVisible(true);
            } catch (InterruptedException ex) {
                Logger.getLogger(KalahWaktu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else if(level.equalsIgnoreCase("SMP")){
            try {
                soal2 = new Ui_soal_smp();
                soal2.setVisible(true);
            } catch (InterruptedException ex) {
                Logger.getLogger(KalahWaktu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }else{
            try {
                soal3 = new Ui_soal_sma();
                soal3.setVisible(true);
            } catch (InterruptedException ex) {
                Logger.getLogger(KalahWaktu.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_btnTryAgainMouseClicked

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
//        Sound.SoundLose();
//        jkey.setText(kunci);
//        jnama.setText(nama);
//        jskor.setText(String.valueOf(skor));
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(KalahWaktu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(KalahWaktu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(KalahWaktu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(KalahWaktu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                KalahWaktu dialog = new KalahWaktu(new javax.swing.JFrame(), true,"234",5,"344","SD");
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
    private javax.swing.JButton btnMainMenu;
    private javax.swing.JButton btnTryAgain;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jkey;
    private javax.swing.JLabel jnama;
    private javax.swing.JLabel jskor;
    // End of variables declaration//GEN-END:variables
}