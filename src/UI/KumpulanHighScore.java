/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

/**
 *
 * @author My PC
 */
public class KumpulanHighScore{
        private ArrayList<Player> kumpulanSD=new ArrayList<>();
        private ArrayList<Player> kumpulanSMP=new ArrayList<>();
        private ArrayList<Player> kumpulanSMA=new ArrayList<>();
        
    public void TambahHighScoreSD(Player tskor){
        BacaHighScore();        
        this.kumpulanSD.add(tskor);    
        Simpan();
    }   
    public void TambahHighScoreSMP(Player tskor){
        BacaHighScore();
        this.kumpulanSMP.add(tskor);   
        Simpan();
    }   
    public void TambahHighScoreSMA(Player tskor){
        BacaHighScore();
        this.kumpulanSMA.add(tskor);    
        Simpan();
    }   
    void BacaHighScore(){     
        String line=null;
        Player a;
        try{           
            BufferedReader reader = new BufferedReader(new FileReader(new File("SD.txt")));
            kumpulanSD.clear();
            while((line=reader.readLine())!=null){
                String r[]=line.split(" ");                
                a=new Player(r[0],Integer.parseInt(r[1]),Integer.parseInt(r[2]));                
                kumpulanSD.add(a);
            }                            
            reader.close();
        }catch(Exception ex){
            ex.printStackTrace();        
        }
        try{           
            BufferedReader reader = new BufferedReader(new FileReader(new File("SMP.txt")));
            kumpulanSMP.clear();
            while((line=reader.readLine())!=null){
                String r[]=line.split(" ");
                a=new Player(r[0],Integer.parseInt(r[1]),Integer.parseInt(r[2]));                
                kumpulanSMP.add(a);
            }                            
            reader.close();
        }catch(Exception ex){
            ex.printStackTrace();        
        }
        try{                     
            BufferedReader reader = new BufferedReader(new FileReader(new File("SMA.txt")));
            kumpulanSMA.clear();
            while((line=reader.readLine())!=null){
                String r[]=line.split(" ");
                a=new Player(r[0],Integer.parseInt(r[1]),Integer.parseInt(r[2]));                
                kumpulanSMA.add(a);
            }                            
            reader.close();
        }catch(Exception ex){
            ex.printStackTrace();        
        }
    }
    
     ChartFrame TampilHighScore(JTable jTable1,String kelas){
            DefaultTableModel hoho=(DefaultTableModel) jTable1.getModel();
            DefaultCategoryDataset dataBar = new DefaultCategoryDataset();
            
            hoho.setRowCount(0);
            BacaHighScore();
            int i,j;
            String nama;
            /*SD*/
            if(kelas.equals("SD")){
            if(kumpulanSD.isEmpty()){
              //  JOptionPane.showMessageDialog(null, "TABEL HIGHSCORE MASIH KOSONG", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            }else{            
            i=1;
            for(Player nilai : kumpulanSD){
                j=0;
                nama=nilai.get_nama();
                while(j<i){
                    nama=nama+' ';
                    j++;
                }
                //nilai.set_skor(nilai.get_skor()+(nilai.getTime()*2));
                hoho.addRow(new Object[]{i,nilai.get_nama(),nilai.get_skor()+" pts",nilai.getTime()+" detik"});
                if(i<6){
                dataBar.setValue(nilai.get_skor(),nama,"Nama");
                }
                i++;              
                }
            }
            }
            else if(kelas.equals("SMP")){
            /*SMP*/
              if(kumpulanSMP.isEmpty()){
                //JOptionPane.showMessageDialog(null, "TABEL HIGHSCORE MASIH KOSONG", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);           
            }else{
            i=1;
            for(Player nilai : kumpulanSMP){
                j=0;
                nama=nilai.get_nama();
                while(j<i){
                    nama=nama+' ';
                    j++;
                }
                //nilai.set_skor(nilai.get_skor()+(nilai.getTime()*3));
                hoho.addRow(new Object[]{i,nilai.get_nama(),nilai.get_skor()+" pts",nilai.getTime()+" detik"});
                if(i<6){
                dataBar.setValue(nilai.get_skor(),nama,"Nama");
                }
                i++;
                }
            }
            }else{
            /*SMA*/
              if(kumpulanSMA.isEmpty()){
                //JOptionPane.showMessageDialog(null, "TABEL HIGHSCORE MASIH KOSONG", "INFORMASI", JOptionPane.INFORMATION_MESSAGE);
            }else{
            if(kumpulanSMA.size()<5){
            i=1;
            for(Player nilai : kumpulanSMA){
                j=0;
                nama=nilai.get_nama();
                while(j<i){
                    nama=nama+' ';
                    j++;
                }
                //nilai.set_skor(nilai.get_skor()+(nilai.getTime()*4));
                hoho.addRow(new Object[]{i,nilai.get_nama(),nilai.get_skor()+" pts",nilai.getTime()+" detik"});
                if(i<6){
                dataBar.setValue(nilai.get_skor(),nama,"Nama");
                }
                i++;
                }
            }
            }
           }
            /*Chart*/
            JFreeChart chart = ChartFactory.createBarChart("GRAFIK HIGH SCORE","","",dataBar,PlotOrientation.VERTICAL,true,true,false);
            ChartFrame framechart = new ChartFrame("HIGH SCORE",chart);                        
            framechart.setLocation(810,195);
            framechart.setSize(476,460);  
            framechart.setVisible(true);            
            return framechart;
     }
        
    void Simpan(){
        Collections.sort(kumpulanSD, (Player o1, Player o2)->((Integer)o1.get_skor()).compareTo(o2.get_skor()));
        Collections.reverse(kumpulanSD);   
        Collections.sort(kumpulanSMP, (Player o1, Player o2)->((Integer)o1.get_skor()).compareTo(o2.get_skor()));
        Collections.reverse(kumpulanSMP);   
        Collections.sort(kumpulanSMA, (Player o1, Player o2)->((Integer)o1.get_skor()).compareTo(o2.get_skor()));
        Collections.reverse(kumpulanSMA);   
        
        for(int i=0;i<kumpulanSD.size();i++){
            for(int j=i;j<kumpulanSD.size()-1;j++){
            if(kumpulanSD.get(j).get_skor()==kumpulanSD.get(j+1).get_skor()){
                if(kumpulanSD.get(j).getTime()<kumpulanSD.get(j+1).getTime()){
                    Collections.swap(kumpulanSD,j,j+1);
                    }
                }
            }
        }
        for(int i=0;i<kumpulanSMP.size();i++){
            for(int j=i;j<kumpulanSMP.size()-1;j++){
            if(kumpulanSMP.get(j).get_skor()==kumpulanSMP.get(j+1).get_skor()){
                if(kumpulanSMP.get(j).getTime()<kumpulanSMP.get(j+1).getTime()){
                    Collections.swap(kumpulanSMP,j,j+1);
                    }
                }
            }
        }
        for(int i=0;i<kumpulanSMA.size();i++){
            for(int j=i;j<kumpulanSMA.size()-1;j++){
            if(kumpulanSMA.get(j).get_skor()==kumpulanSMA.get(j+1).get_skor()){
                if(kumpulanSMA.get(j).getTime()<kumpulanSMA.get(j+1).getTime()){
                    Collections.swap(kumpulanSMA,j,j+1);
                    }
                }
            }
        }
                
        try{
        FileWriter writer = new FileWriter("SD.txt");
        for(int i=0;i<kumpulanSD.size();i++){
            writer.write(kumpulanSD.get(i).get_nama()+" "+String.valueOf(kumpulanSD.get(i).get_skor())+" "+kumpulanSD.get(i).getTime()+"\n");
        }    
        writer.close();
        }catch(Exception ex){
        ex.printStackTrace();
        }
        try{
        FileWriter writer = new FileWriter("SMP.txt");
        for(int i=0;i<kumpulanSMP.size();i++){
            writer.write(kumpulanSMP.get(i).get_nama()+" "+String.valueOf(kumpulanSMP.get(i).get_skor())+" "+kumpulanSMP.get(i).getTime()+"\n");
        }    
        writer.close();
        }catch(Exception ex){
        ex.printStackTrace();
        }
        try{
        FileWriter writer = new FileWriter("SMA.txt");
        for(int i=0;i<kumpulanSMA.size();i++){
            writer.write(kumpulanSMA.get(i).get_nama()+" "+String.valueOf(kumpulanSMA.get(i).get_skor())+" "+kumpulanSMA.get(i).getTime()+"\n");
        }    
        writer.close();
        }catch(Exception ex){
        ex.printStackTrace();
        }       
    }    
    
    void print(){
        BacaHighScore();
        System.out.println("AAAASDFG");
        System.out.println("\n\n\nSD");
            for(Player nilai : kumpulanSD){
                System.out.println(nilai.get_nama()+"   "+nilai.get_skor());
                }
            System.out.println("\n\n\nSMP");
            for(Player nilai : kumpulanSMP){
                System.out.println(nilai.get_nama()+"   "+nilai.get_skor());
                }
            System.out.println("\n\n\nSMA");
            for(Player nilai : kumpulanSMA){
                System.out.println(nilai.get_nama()+"   "+nilai.get_skor());
                }
            System.out.println("\n\n\n");
    }
}