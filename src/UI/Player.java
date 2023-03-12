/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Serializable;
import java.util.Scanner;

public class Player implements Serializable{
    private String Nama;
    private char jawab;
    private int skor;
    private int life;
    private int Time;

    public Player(String nama,int skor,int Time){
        this.Nama=nama;
        this.skor=skor;
        this.Time=Time;
    }
    public Player(){}
    
    public Player(int life){
        this.life=life;
    }

    public int getTime() {
        return Time;
    }

    public void setTime(int Time) {
        this.Time = Time;
    }       
    
    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }    
    
    void set_skor(int skor){
        this.skor=skor;
        simpan_skor();
        }
    
    void set_skor(){
        try{
            BufferedReader reader = new BufferedReader(new FileReader(new File("Skor.txt")));
                this.skor=Integer.parseInt(reader.readLine());
                reader.close();
        }catch(Exception ex){
            ex.printStackTrace();        
        }
    }
    
    void simpan_skor(){
        try{
        FileWriter writer = new FileWriter("Skor.txt");
        writer.write(this.skor);
            System.out.println(this.skor);
        writer.close();
    }catch(Exception ex){
        ex.printStackTrace();
    }
    }
    
    int get_skor(){
        return this.skor;
    }
    
    void set_nama(){
        try{           
            BufferedReader reader = new BufferedReader(new FileReader(new File("Pemain.txt")));
            String line = reader.readLine();
                this.Nama=line;
                reader.close();
        }catch(Exception ex){
            ex.printStackTrace();        
    }
    }
    
    void simpan_nama(String nama){
        this.Nama=nama;
        try{
        FileWriter writer = new FileWriter("Pemain.txt");
        writer.write(nama);
        writer.close();
    }catch(Exception ex){
        ex.printStackTrace();
    }
   }
    
   String get_nama(){
       if(this.Nama==null){
           set_nama();
       }
       return this.Nama;
   }
   
   
   
   void resetskor(){
       set_skor(5);
   }
}
