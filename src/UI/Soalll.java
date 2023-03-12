/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;
/**
 *
 * @author Master
 */
public class Soalll{
    private String soal;
    private String pilihan[];
    private int jawaban_benar;
    private boolean status;
    
    public Soalll(String soal, int jawaban_benar,String[] pilihan,boolean status){
        this.soal=soal;
        this.jawaban_benar=jawaban_benar;
        this.pilihan = pilihan;
        this.status = status;
    }
    public Soalll(){};
    
    public void set_status(boolean status){
        this.status=status;
    }
    
    public boolean get_status(){
        return this.status;
    }
    
    public String get_pilihan(int bilangan){
       return this.pilihan[bilangan];
   }
    
    public String Get_Soal(){
        return this.soal;
    }
    
    public int get_jawaban(){
        return this.jawaban_benar;
    }
}