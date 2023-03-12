/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

/**
 *
 * @author My PC
 */
public class Bantuan {
    
    static float pembulatan(float bil){
        float round;
        round = (float) Math.round(bil * 100) / 100;
        return round;
    }
    
    static float random_float(int min,int max){
        float round;
        round =(float) (Math.random() *(max-min))+min;
        return round;
    }
    
    static int validator (int bil){
        if(bil==0){
            return 1;
        }
        else return bil;
    }
    
    static String positifnegatif1(int bil){
           if(bil>0){
               if(bil==1){
                   return ("+");
               }else{
                    return("+"+bil);
               }
             }else if(bil<0){
                 if(bil==-1){
                    return("");
                    }else{
                    return (""+bil);
                    }
                }else return "";
        }
       
    static String positifnegatif2(int bil){       
           if(bil>0){
                   return("+"+bil);
             }
           else if(bil<0){
               return(""+bil);
           }else {
               return("");
           }
       }

    static int Random(int min , int maxtambah1 ) {
        int random;
        random=(int) (Math.random() *(maxtambah1-min))+min;
        return random;
    }    
    
    static String positifnegatiffloat(float bil){
           if(bil>0){
               return("+"+bil);    
             }
           else if(bil<0){
               return(""+bil);
           }else return "";
    }
    
    static int FPB(int bil1, int bil2){
            if(bil1==0 || bil2==0){
                return bil1+bil2;
            } else{
                return FPB(bil2,bil1%bil2);
            }
    }
    
    static int KPK(int bil1, int bil2){
        int nilai;
        if(FPB(bil1,bil2) == 1){
            nilai=bil1*bil2;
        } else nilai=(bil1*bil2)/FPB(bil1,bil2);
        
        return nilai;
    }
    
    static int hitungModus(int data[]){
         int count=0, maxCount=0, maxValue=0;
         
         for (int y = 0; y < data.length; y++) {
            for (int z = 0; z < data.length; z++) {
                if (data[z] == data[y]){
                    count++;}
            }
            if (count > maxCount) {
                maxCount = count;
                maxValue = data[y];
            }
            count = 0;
        }
         return maxValue;
    }
    
    static String persen(int a,int b){
        String per=null;
        switch (a){
            case 1 : per= "\u2071 / ";break;
            case 2 : per= "\u00b2 / ";break;
            case 3 : per= "\u00b3 / ";break;
            case 4 : per= "\u2074 / ";break;
            case 5 : per= "\u2075 / ";break;
            case 6 : per= "\u2076 / ";break;
            case 7 : per= "\u2077 / ";break;
            case 8 : per= "\u2078 / ";break;
            case 9 : per= "\u2079 / ";break;
        }
        switch (b){
            case 2 : per= per+"\u2082 ";break;
            case 3 : per= per+"\u2083";break;
            case 4 : per= per+"\u2084 ";break;
            case 5 : per= per+"\u2085 ";break;
            case 6 : per= per+"\u2086 ";break;
            case 7 : per= per+"\u2087 ";break;
            case 8 : per= per+"\u2088 ";break;
            case 9 : per= per+"\u2089 ";break;
        }
        
        return per;
    }
}