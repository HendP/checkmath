/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.Color;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;
import javax.swing.border.Border;
import javax.swing.border.LineBorder;

/**
 *
 * @author Lorem Ipsum Dolor
 */
public class Ui_soal_sd extends javax.swing.JFrame{

    /**
     * Creates new form ui_soal
     */
    int Sec=1800;
    int score;
    String nama;
    Soalll baru;
    KumpulanSoalll set;
    Player pemain = new Player(3);
    Waktu waktu = new Waktu(this,true);
    True tru = new True(this,true);
    False fal = new False(this,true);
    int i=2;
    int j=3;
    Thread time;
    public Ui_soal_sd() throws InterruptedException {
        initComponents();
        timer();
        Image i = new ImageIcon(ClassLoader.getSystemResource("img/icon.png")).getImage();
        ImageIcon img = new ImageIcon(getClass().getResource("/img/life3.png"));
        Life.setIcon(img);
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

        jScrollPane1 = new javax.swing.JScrollPane();
        pemain.set_skor(5);
        txtSoal = new javax.swing.JTextArea();
        btnA = new javax.swing.JButton();
        btnC = new javax.swing.JButton();
        btnB = new javax.swing.JButton();
        btnD = new javax.swing.JButton();
        btnSurrender = new javax.swing.JButton();
        lblLife = new javax.swing.JLabel();
        Life = new javax.swing.JLabel();
        lblTower = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        Timer1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Level SD");
        setLocation(new java.awt.Point(350, 100));
        setPreferredSize(new java.awt.Dimension(640, 565));
        setResizable(false);
        setSize(new java.awt.Dimension(640, 565));
        getContentPane().setLayout(null);

        txtSoal.setColumns(20);
        txtSoal.setFont(new java.awt.Font("Cambria Math", 1, 14)); // NOI18N
        txtSoal.setRows(5);
        inputsoal SD = new inputsoal();
        SD.SD();
        set = SD.get_SD();
        baru = set.GetSoal();
        txtSoal.setText(baru.Get_Soal());
        txtSoal.setLineWrap(true);
        txtSoal.setWrapStyleWord(true);
        txtSoal.setEditable(false);
        System.out.println(baru.get_pilihan(0));
        System.out.println(baru.get_pilihan(1));
        System.out.println(baru.get_pilihan(2));
        System.out.println(baru.get_pilihan(3));
        jScrollPane1.setViewportView(txtSoal);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(10, 126, 380, 256);

        btnA.setBackground(Color.WHITE);
        btnA.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        switch(baru.get_jawaban()){
            case 0 : btnA.setText(baru.get_pilihan(0));break;
            case 1 : btnA.setText(baru.get_pilihan(1));break;
            case 2 : btnA.setText(baru.get_pilihan(2));break;
            case 3 : btnA.setText(baru.get_pilihan(3));break;
        }
        btnA.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 188, 212), 5));
        btnA.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAMouseExited(evt);
            }
        });
        btnA.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAActionPerformed(evt);
            }
        });
        getContentPane().add(btnA);
        btnA.setBounds(10, 400, 177, 55);

        btnC.setBackground(Color.WHITE);
        btnC.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        switch(baru.get_jawaban()){
            case 0 : btnC.setText(baru.get_pilihan(2));break;
            case 1 : btnC.setText(baru.get_pilihan(3));break;
            case 2 : btnC.setText(baru.get_pilihan(0));break;
            case 3 : btnC.setText(baru.get_pilihan(1));break;
        }
        btnC.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 188, 212), 5));
        btnC.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCMouseExited(evt);
            }
        });
        btnC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCActionPerformed(evt);
            }
        });
        getContentPane().add(btnC);
        btnC.setBounds(210, 400, 177, 55);

        btnB.setBackground(new java.awt.Color(255, 255, 255));
        btnB.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        switch(baru.get_jawaban()){
            case 0 : btnB.setText(baru.get_pilihan(1));break;
            case 1 : btnB.setText(baru.get_pilihan(0));break;
            case 2 : btnB.setText(baru.get_pilihan(3));break;
            case 3 : btnB.setText(baru.get_pilihan(2));break;
        }
        btnB.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 188, 212), 5));
        btnB.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBMouseExited(evt);
            }
        });
        btnB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBActionPerformed(evt);
            }
        });
        getContentPane().add(btnB);
        btnB.setBounds(10, 470, 177, 52);

        btnD.setBackground(Color.WHITE);
        btnD.setFont(new java.awt.Font("Cambria Math", 1, 12)); // NOI18N
        switch(baru.get_jawaban()){
            case 0 : btnD.setText(baru.get_pilihan(3));break;
            case 1 : btnD.setText(baru.get_pilihan(2));break;
            case 2 : btnD.setText(baru.get_pilihan(1));break;
            case 3 : btnD.setText(baru.get_pilihan(0));break;
        }
        btnD.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 188, 212), 5, true));
        btnD.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDMouseExited(evt);
            }
        });
        btnD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDActionPerformed(evt);
            }
        });
        getContentPane().add(btnD);
        btnD.setBounds(210, 470, 177, 52);

        btnSurrender.setBackground(new java.awt.Color(224, 224, 224));
        btnSurrender.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/surrender.png"))); // NOI18N
        btnSurrender.setBorder(null);
        btnSurrender.setBorderPainted(false);
        btnSurrender.setContentAreaFilled(false);
        btnSurrender.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                btnSurrenderMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btnSurrenderMouseReleased(evt);
            }
        });
        btnSurrender.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSurrenderActionPerformed(evt);
            }
        });
        getContentPane().add(btnSurrender);
        btnSurrender.setBounds(540, 10, 85, 39);

        lblLife.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        lblLife.setForeground(new java.awt.Color(255, 255, 255));
        lblLife.setText("Life          :");
        getContentPane().add(lblLife);
        lblLife.setBounds(270, 10, 120, 20);
        getContentPane().add(Life);
        Life.setBounds(370, 0, 100, 40);

        lblTower.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/stage1.png"))); // NOI18N
        lblTower.setPreferredSize(new java.awt.Dimension(35, 15));
        getContentPane().add(lblTower);
        lblTower.setBounds(408, 50, 221, 479);

        jLabel2.setFont(new java.awt.Font("Kristen ITC", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Level SD");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(70, 70, 258, 40);

        Timer1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        Timer1.setForeground(new java.awt.Color(255, 255, 255));
        Timer1.setText("Timer");
        getContentPane().add(Timer1);
        Timer1.setBounds(140, 10, 70, 20);

        jLabel1.setFont(new java.awt.Font("Kristen ITC", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Time Left :");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(10, 10, 120, 20);

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/italy.jpg"))); // NOI18N
        getContentPane().add(jLabel3);
        jLabel3.setBounds(0, -30, 690, 590);

        setSize(new java.awt.Dimension(655, 560));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMouseEntered
        // TODO add your handling code here:
        btnA.setBackground(new Color(0,188,212));
        btnA.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnAMouseEntered

    private void btnAMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAMouseExited
        // TODO add your handling code here:
        btnA.setBackground(Color.WHITE);
        btnA.setForeground(Color.black);
    }//GEN-LAST:event_btnAMouseExited

    private void btnBMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBMouseEntered
        // TODO add your handling code here:
        btnB.setBackground(new Color(0,188,212));
        btnB.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnBMouseEntered

    private void btnBMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBMouseExited
        // TODO add your handling code here:
        btnB.setBackground(Color.WHITE);
        btnB.setForeground(Color.black);
    }//GEN-LAST:event_btnBMouseExited

    private void btnCMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCMouseEntered
        // TODO add your handling code here:
        btnC.setBackground(new Color(0,188,212));
        btnC.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnCMouseEntered

    private void btnCMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCMouseExited
        // TODO add your handling code here:
        btnC.setBackground(Color.WHITE);
        btnC.setForeground(Color.black);
    }//GEN-LAST:event_btnCMouseExited

    private void btnDMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMouseEntered
        // TODO add your handling code here:
        btnD.setBackground(new Color(0,188,212));
        btnD.setForeground(Color.WHITE);
    }//GEN-LAST:event_btnDMouseEntered

    private void btnDMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDMouseExited
        // TODO add your handling code here:
        btnD.setBackground(Color.WHITE);
        btnD.setForeground(Color.black);
    }//GEN-LAST:event_btnDMouseExited

    private void btnAActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAActionPerformed
        if(btnA.getText().equals(baru.get_pilihan(0))){
            //JOptionPane.showMessageDialog(null, "JAWABAN ANDA BENAR", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            Sound.SoundTrue();
            tru.setVisible(true);
            Next();
        }else{                                 
            Sound.SoundFalse();
            pemain.setLife(pemain.getLife()-1);
            if(pemain.getLife()>0){
                wronganswer();
            }else{
                gameover();
            }
        }
    }//GEN-LAST:event_btnAActionPerformed

    private void wronganswer(){        
        fal.setVisible(true);
        j = j-1;
            if(j == 2){
                ImageIcon img = new ImageIcon(getClass().getResource("/img/life2.png"));
                Life.setIcon(img);
            }else{
                ImageIcon img = new ImageIcon(getClass().getResource("/img/life1.png"));
                Life.setIcon(img);
            }
    }
    
    private void gameover(){
        //JOptionPane.showMessageDialog(null, "JAWABAN ANDA SALAH\nJAWABAN YANG BENAR :\n"+baru.get_pilihan(0), "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
        time.suspend();
        pemain.setTime(Sec);        
        dispose();
//        GameOver1 GO1 = new GameOver1(this, true,baru.get_pilihan(0),pemain.get_skor());
        KalahNyawa kn = new KalahNyawa(this,true,pemain.get_nama(),pemain.get_skor(),baru.get_pilihan(0),"SD");
        kn.setVisible(true);
        dispose();
        pemain.set_skor(pemain.get_skor()+(Sec*2));
        save_highscore();
        //pemain.resetskor();
    }
    
    private void Next() {
            pemain.set_skor(pemain.get_skor()+5);
            baru=set.GetSoal();
            if(baru!=null){
            ImageIcon II = new ImageIcon(getClass().getResource("/img/stage"+i+".png"));
            lblTower.setIcon(II);
            txtSoal.setText(baru.Get_Soal());
            switch(baru.get_jawaban()){
            case 0 : 
            btnA.setText(baru.get_pilihan(0));
            btnB.setText(baru.get_pilihan(1));
            btnC.setText(baru.get_pilihan(2));
            btnD.setText(baru.get_pilihan(3));
            break;
            case 1 : 
            btnA.setText(baru.get_pilihan(3));
            btnB.setText(baru.get_pilihan(0));
            btnC.setText(baru.get_pilihan(1));
            btnD.setText(baru.get_pilihan(2));
            break;
            case 2 : 
            btnA.setText(baru.get_pilihan(1));
            btnB.setText(baru.get_pilihan(2));
            btnC.setText(baru.get_pilihan(0));
            btnD.setText(baru.get_pilihan(3));
            break;
            case 3 : 
            btnA.setText(baru.get_pilihan(3));
            btnB.setText(baru.get_pilihan(2));
            btnC.setText(baru.get_pilihan(1));
            btnD.setText(baru.get_pilihan(0));
            break;
            }
            System.out.println(baru.get_pilihan(0));
            i++;
            }else{
            //JOptionPane.showMessageDialog(null, "SELAMAT ANDA TELAH MENYELESAIKAN\nLEVEL SD", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            dispose();
            save_highscore();
            NotifMenang nm  = new NotifMenang(this,true,pemain.get_nama(),pemain.get_skor());
            nm.setVisible(true);
            //Ui_soal_smp smp = new Ui_soal_smp();
            //dispose();
            //smp.setVisible(true);
            }
    }
    
    public void kalah_waktu(){
        KalahWaktu kw = new KalahWaktu(this,true,pemain.get_nama(),pemain.get_skor(),baru.get_pilihan(0),"SD");
        kw.setVisible(true);
    }
    
    public void timer() throws InterruptedException{
        
        //KalahWaktu kw = new KalahWaktu(this,true,pemain.get_nama(),pemain.get_skor(),baru.get_pilihan(0),"SD");
        time = new Thread(){
            public void run(){
                while(Sec>=0){
                    Timer1.setText(String.valueOf(Sec));
                    if(Sec==0){
//                        JOptionPane.showMessageDialog(null, "Waktu Bermain Anda Habis", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
                        dispose();                        
                        save_highscore();
                        kalah_waktu();
                    }
                    if(Sec==300){
                        //JOptionPane.showMessageDialog(null, "Waktu Anda Tinggal 5 Menit (300 detik)", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
                        waktu.setVisible(true);
                    }
                    Sec=Sec-1;
                    try{
                        sleep(1000);
                    }catch(InterruptedException ex){
                        Logger.getLogger(Ui_soal_sd.class.getName()).log(Level.SEVERE,null,ex);
                    }
                }
            }
        }; 
        time.start();
    }
    
    private void save_highscore(){
        dispose();
        KumpulanHighScore score = new KumpulanHighScore();
        score.TambahHighScoreSD(pemain);
        score.Simpan();
        pemain.set_nama();
        //MainMenu mm = new MainMenu();
        //mm.setVisible(true);
    }
    
    private void btnBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBActionPerformed
        if(btnB.getText().equals(baru.get_pilihan(0))){
            //JOptionPane.showMessageDialog(null, "JAWABAN ANDA BENAR", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            Sound.SoundTrue();
            tru.setVisible(true);
            Next();
        }else{                 
            Sound.SoundFalse();
            pemain.setLife(pemain.getLife()-1);
            if(pemain.getLife()>0){
                wronganswer();               
            }else{
                gameover();
            }
        }
    }//GEN-LAST:event_btnBActionPerformed

    private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
        if(btnC.getText().equals(baru.get_pilihan(0))){
            //JOptionPane.showMessageDialog(null, "JAWABAN ANDA BENAR", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            Sound.SoundTrue();
            tru.setVisible(true);
            Next();
        }else{                             
            Sound.SoundFalse();
            pemain.setLife(pemain.getLife()-1);
            if(pemain.getLife()>0){
                wronganswer();               
            }else{
                gameover();
            }
        }
    }//GEN-LAST:event_btnCActionPerformed
        
    private void btnDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDActionPerformed
        if(btnD.getText().equals(baru.get_pilihan(0))){
            //JOptionPane.showMessageDialog(null, "JAWABAN ANDA BENAR", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            Sound.SoundTrue();
            tru.setVisible(true);
            Next();
        }else{                           
            Sound.SoundFalse();
            pemain.setLife(pemain.getLife()-1);
            if(pemain.getLife()>0){
                wronganswer();
            }
            else{
                gameover();
            }
        }
    }//GEN-LAST:event_btnDActionPerformed

    private void btnSurrenderMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSurrenderMousePressed
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/surrender-hover.png"));
        btnSurrender.setIcon(II);
    }//GEN-LAST:event_btnSurrenderMousePressed

    private void btnSurrenderMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSurrenderMouseReleased
        // TODO add your handling code here:
        ImageIcon II = new ImageIcon(getClass().getResource("/img/surrender.png"));
        btnSurrender.setIcon(II);
    }//GEN-LAST:event_btnSurrenderMouseReleased

    private void btnSurrenderActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSurrenderActionPerformed
        // TODO add your handling code here:
        Sound.SoundButton();
        time.suspend();
        MenyerahSD mm = new MenyerahSD(this,true,time,this);
        mm.setVisible(true);
    }//GEN-LAST:event_btnSurrenderActionPerformed
       /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://downloabaru.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ui_soal_sd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ui_soal_sd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ui_soal_sd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ui_soal_sd.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new Ui_soal_sd().setVisible(true);
                } catch (InterruptedException ex) {
                    Logger.getLogger(Ui_soal_sd.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Life;
    private javax.swing.JLabel Timer1;
    private javax.swing.JButton btnA;
    private javax.swing.JButton btnB;
    private javax.swing.JButton btnC;
    private javax.swing.JButton btnD;
    private javax.swing.JButton btnSurrender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblLife;
    private javax.swing.JLabel lblTower;
    private javax.swing.JTextArea txtSoal;
    // End of variables declaration//GEN-END:variables
}
