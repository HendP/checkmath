/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package UI;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * @author Master
 */
public class KumpulanSoalll {
    private List<Soalll> list_soal;
    
    KumpulanSoalll(){
        this.list_soal= new ArrayList<Soalll>();
    }
    public void TambahSoal(Soalll tsoal){
        this.list_soal.add(tsoal);

    }
    public Soalll GetSoal(){
        int rand=Bantuan.Random(0,list_soal.size());
        int i=0;
        while(!list_soal.get(rand).get_status()&&i<21){
            rand=Bantuan.Random(0,list_soal.size());
            i++;
        }
        list_soal.get(rand).set_status(false);
        if(i!=21){
        return list_soal.get(rand);
        }else{
            return null;
        }
    }       
}