/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 *
 * @author My PC
 */
     class inputsoal{
        private String[] pilihan;
        private String soal;
        private int jawab;
        private Soalll set_soal;
        private KumpulanSoalll set_SMA =  new KumpulanSoalll();
        private KumpulanSoalll set_SMP =  new KumpulanSoalll();
        private KumpulanSoalll set_SD =  new KumpulanSoalll();
                
          public void SMA(){
            float x,y,z;
            int a,b,c,d,e,f,i,j,k,l,m,n;
            String g,h;
            /*soal 1*/
            b=Bantuan.validator(Bantuan.Random(-10,10));
            g=Bantuan.positifnegatif2(Bantuan.validator(Bantuan.Random(-30, 30)));
            h=Bantuan.positifnegatif2(Bantuan.validator(Bantuan.Random(-30, 30)));
   
            soal="Titik Puncak dari sebuah parabola yang memiliki persamaan "+b+"x\u00b2"+g+"x"+h+" adalah....";
            x=Bantuan.pembulatan((float)-Integer.parseInt(g)/(2*b));
            y=Bantuan.pembulatan((float)-(Integer.parseInt(g)*Integer.parseInt(g)-4*b*Integer.parseInt(h))/(4*b));
          
            pilihan = set_pilihan("("+x+" , "+y+")", "("+-x+" , "+y+")","("+-x+" , "+-y+")","("+x+" , "+-y+")");
            addsoalSMA(set_SMA,soal,pilihan);
                        
            
            /*Soal 2*/
            x =Bantuan.pembulatan(Bantuan.random_float(-5,5));
            y =Bantuan.pembulatan(Bantuan.random_float(-5,5));
            soal="Jika diketahui sin(A+B) = "+x+" dan nilai dari sin A cos B = "+y+", maka nilai dari sin B cos A adalah....";
      
            pilihan = set_pilihan(""+Bantuan.pembulatan(x-y)+"",""+Bantuan.pembulatan(y-x)+"",""+Bantuan.pembulatan(-x-y)+"",""+Bantuan.pembulatan(x+y)+"");
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*soal3*/
            a=Bantuan.Random(1,10);
            b=Bantuan.Random(-10,10);
            c=Bantuan.Random(-10,10);
            d=Bantuan.Random(-10,10);
            e=Bantuan.Random(-10,30);
            soal="Jika diketahui panjang jari-jari sebuah lingkaran adalah "+a+" dengan pusat di ("+b+","+c+"), maka persamaan garis singgung lingkaran yang melalui melewati titik ("+d+","+e+") adalah....";
            d=d-b;
            e=e-c;
            a=a*a;
            a=a+(d*b)+(c*e);
            
            pilihan = set_pilihan(""+d+"x"+Bantuan.positifnegatif2(e)+"y = "+a,""+-d+"x"+Bantuan.positifnegatif2(e)+"y = "+-a,""+d+"x"+Bantuan.positifnegatif2(-e)+"y = "+a,""+-d+"x"+Bantuan.positifnegatif2(-e)+"y = "+-a);
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*Soal 4*/
            a=Bantuan.validator(Bantuan.Random(-20,20));
            b=Bantuan.validator(Bantuan.Random(-20,20));
            c=Bantuan.validator(Bantuan.Random(-20,20));
            d=Bantuan.validator(Bantuan.Random(-20,20));
            soal="Invers fungsi dari "+a+"x"+Bantuan.positifnegatif2(b)+"/"+c+"x"+Bantuan.positifnegatif2(d)+" adalah....";
            
            pilihan = set_pilihan(""+-d+"x"+Bantuan.positifnegatif2(b)+"/"+c+"x"+Bantuan.positifnegatif2(-a),""+-a+"x"+Bantuan.positifnegatif2(b)+"/"+c+"x"+Bantuan.positifnegatif2(-d),""+d+"x"+Bantuan.positifnegatif2(b)+"/"+c+"x"+Bantuan.positifnegatif2(a),""+-d+"x"+Bantuan.positifnegatif2(-b)+"/"+c+"x"+Bantuan.positifnegatif2(-a));
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*soal 5*/
            a=Bantuan.validator(Bantuan.Random(-20,20));
            b=Bantuan.validator(Bantuan.Random(-20,20));
            c=Bantuan.validator(Bantuan.Random(-20,20));
            d=Bantuan.validator(Bantuan.Random(-10,10));
            soal="Diketahui f(x)= "+a+"x\u00b2"+Bantuan.positifnegatif2(b)+"x"+c+". Jika f(x) dibagi oleh x"+Bantuan.positifnegatif2(d)+", maka sisa baginya adalah....";
            d=-d;
            e=(a*d*d)+(b*d)+c;
            
            pilihan = set_pilihan(""+e+"",""+(e-c-b)+"",""+(e+c)+"",""+(e-c)+"");
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*soal 6*/
            String[] turunan={"sin","cos","-sin","-cos"};
            a=Bantuan.validator(Bantuan.Random(3,20));
            b=Bantuan.Random(0,4);
            c=Bantuan.validator(Bantuan.Random(-10,10));
            d=Bantuan.validator(Bantuan.Random(-20,20));
            soal="Diketahui f(x) = "+turunan[b]+"^"+a+"("+c+"x"+Bantuan.positifnegatif2(d)+"), maka f'(x) adalah....";
           
            pilihan = set_pilihan(c*a+" "+turunan[b]+"^"+(a-1)+"("+c+"x"+Bantuan.positifnegatif2(d)+")"+turunan[(b+1)%4]+"("+c+"x"+Bantuan.positifnegatif2(d)+")",c*a+" "+turunan[b]+"^"+a+"("+c+"x"+Bantuan.positifnegatif2(d)+")"+turunan[(b+1)%4]+"("+c+"x"+Bantuan.positifnegatif2(d)+")",c*a+" "+turunan[b]+"^"+(a+1)+"("+c+"x"+Bantuan.positifnegatif2(d)+")"+turunan[(b+1)%4]+"("+c+"x"+Bantuan.positifnegatif2(d)+")",c*a+" "+turunan[b]+"^"+(a-1)+"("+c+"x"+Bantuan.positifnegatif2(d)+")"+turunan[b]+"("+c+"x"+Bantuan.positifnegatif2(d)+")");
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*soal 7*/
            a=Bantuan.validator(Bantuan.Random(-10,10));
            b=Bantuan.validator(Bantuan.Random(-10,10));
            c=Bantuan.validator(Bantuan.Random(-10,10));
            d=Bantuan.validator(Bantuan.Random(-10,10));
            e=Bantuan.validator(Bantuan.Random(1,10));
            soal="Persamaan garis singgung lingkaran yang memiliki titik pusat ("+a+","+b+") dengan jari-jari "+e+" yang sejajar dengan garis y = "+c+"x"+Bantuan.positifnegatif2(d)+" adalah....";
            d=-(c*a);
            d=d+b;
            
            pilihan = set_pilihan("y = "+c+"x"+Bantuan.positifnegatif2(d)+" \u00b1 "+e+"\uu221A"+(1+c*c),"y = "+-c+"x"+Bantuan.positifnegatif2(d)+" \u00b1 "+e+"\uu221A"+(1+c*c),"y = "+c+"x"+Bantuan.positifnegatif2(-d)+" \u00b1 "+e+"\uu221A"+(1+c*c),"y = "+-c+"x"+Bantuan.positifnegatif2(-d)+" \u00b1 "+-e+"\uu221A"+(1+c*c));
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*soal 8*/
            float [] sudut={0.5f,0.7f,0.8f,1f,0.8f};
            int [] sisi={12,8,6,4,3};
            a=Bantuan.Random(0,5);
            b=Bantuan.Random(1,15);            
            soal="Luas segi "+sisi[a]+" beraturan dengan panjang jari-jari lingkaran luar "+b+" cm adalah.....";
            x=(float)((sisi[a]*b*b*sudut[a])/2);
            x=Bantuan.pembulatan(x);
            
            pilihan = set_pilihan(""+x+"",""+x*2+"",""+Bantuan.pembulatan((float)x/2)+"",""+Bantuan.pembulatan((float)x/b)+"");
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*Soal 9*/
            a=Bantuan.Random(-20,20);
            b=Bantuan.Random(-20,20);
            c=Bantuan.Random(-20,20);
            d=Bantuan.Random(-20,20);
            soal="Persamaan grafik fungsi kuadrat yang melalui titik ("+a+","+b+") dengan puncak ("+c+","+d+") adalah....";
            e=(a-c)*(a-c);
            f=b-d;
            x=(float)a/b;
            x=Bantuan.pembulatan(x);
            y=x*c*c+d;
            y=Bantuan.pembulatan(y);
            z=-(2*x*c);
            z=Bantuan.pembulatan(z);
                        
            pilihan = set_pilihan(x+"x\u00b2"+Bantuan.positifnegatiffloat(Bantuan.pembulatan(z))+"x"+Bantuan.positifnegatiffloat(y),
                                  x+"x\u00b2"+Bantuan.positifnegatiffloat(Bantuan.pembulatan(-z))+"x"+Bantuan.positifnegatiffloat(y),
                                  x+"x\u00b2"+Bantuan.positifnegatiffloat(Bantuan.pembulatan(-z))+"x"+Bantuan.positifnegatiffloat(-y),
                                  x+"x\u00b2"+Bantuan.positifnegatiffloat(Bantuan.pembulatan(z))+"x"+Bantuan.positifnegatiffloat(-y));
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*Soal 10*/
            a=Bantuan.Random(16,20);
            b=Bantuan.Random(10,14);
            c=25-b;
            d=a-b;
            e=c-d;
              soal="Dalam ujian PNS, Farhan diwajibkan mengerjakan "+a+" soal dari 25 soal, namun no 1-"+b+" wajib dikerjakan. Berapa banyak cara untuk mengerjakan soal tersebut?";
            b=1;
            for(int v=c;v>e;v--){
                b=b*v;
            }
            a=1;
            for(int v=d;v>1;v--){
                a=a*v;
            }
            
            pilihan = set_pilihan(""+(long)b/a,""+(long)b/a/2,""+(long)b/a*2,""+(long)b/a+5);
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*Soal 11*///ulang kembali..............................contoh soal e
            a=Bantuan.validator(Bantuan.Random(-20,20));
            b=Bantuan.validator(Bantuan.Random(-10,10));
            c=Bantuan.validator(Bantuan.Random(-10,10));
            d=Bantuan.validator(Bantuan.Random(-10,10));
            e=Bantuan.validator(Bantuan.Random(-10,10));
            i=Bantuan.validator(Bantuan.Random(-10,10));
            f=(c*i*i)+(d*i)+e;
            soal="Diketahui f(x)= ax"+Bantuan.positifnegatif2(b)+" dan g(x) = "+c+"x\u00b2"+Bantuan.positifnegatif2(d)+"x"+Bantuan.positifnegatif2(e)+". Jika fog("+i+")= "+a+", maka nilai a adalah....";
            
            pilihan = set_pilihan(""+Bantuan.pembulatan((float)(a-b)/f),""+(Bantuan.pembulatan((float)(a-b)/f)+2),""+(Bantuan.pembulatan((float)(a-b)/-f)+3),""+(Bantuan.pembulatan((float)(a-b)/-f)+1));
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*Soal 12*/
            String[]buah ={"apel","jeruk","stroberi","mangga","pepaya","semangka","anggur","melon"};
            long harga1,harga2;
            a=Bantuan.Random(1, 10);
            b=Bantuan.Random(1,7);
            g=buah[b];
            c=Bantuan.Random(1, 10);
            d=Bantuan.Random(1,7);
            h=buah[d];
            e=Bantuan.Random(5,30)*1000;
            f=Bantuan.Random(5,30)*1000;
            i=Bantuan.Random(1,10);
            j=Bantuan.Random(1,10);
            k=Bantuan.Random(1,10);
            l=Bantuan.Random(1,10);
            harga1=e*a+f*c;
            harga2=e*i+f*j;
            soal="Farhan membeli "+a+" kg "+g+" dan "+c+" kg "+h+" dengan harga Rp."+harga1+" dan Faqih membeli "+i+" kg "+g+" dan "+j+ " kg "+h+" dengan harga Rp. "+harga2+". Jika Hendra membeli "+k+" kg "+g+" dan "+l+" kg "+h+", Berapa yang harus dibayar ?";
            
            pilihan = set_pilihan(""+(k*e+l*f),""+((k-1)*e+(l-1)*f),""+((k+1)*e+(l+1)*f),""+((k+1)*e+l*f));
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*Soal 13*/
            a=Bantuan.Random(100,1000);
            b=Bantuan.Random(2,10);
            c=Bantuan.Random(1,4);
            soal="Jumlah konsumsi gula pasir oleh penduduk suatu kelurahan pada tahun 2010 sebesar "+a+" kg " + " dan selalu meningkat "+b+" kali lipat setiap tahun. Total konsumsi gula penduduk tersebut pada tahun 2010 sampai dengan tahun "+(2010+c)+" adalah...";
            for(int v=0;v<c;v++){
                a=a*b;
            }
            
            pilihan = set_pilihan(""+a,""+(a-b),""+(a+b),""+(a-c));
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*Soal 14*/
            a=Bantuan.Random(2,10);
            b=Bantuan.Random(5,10);
            c=Bantuan.Random(2,5);
            soal=a+" tahun yang lalu umur Hilman "+b+" kali umur Hendra. "+a+" tahun yang akan datang umur Hilman "+c+" kali umur Hendra. Umur Hendra sekarang adalah...";
            d=-b*a+a;
            e=c*a-a;
            d=d-e;
            e=-b+c;
            
            pilihan = set_pilihan(""+Bantuan.pembulatan((float)d/e),""+Bantuan.pembulatan((float)d/(e+1)),""+Bantuan.pembulatan((float)d/e)+1,""+Bantuan.pembulatan((float)d/e)+2);
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*Soal 15*/
            do{
            a=Bantuan.Random(-5,0);
            b=Bantuan.Random(-5,0);
            c=Bantuan.Random(1,5);
            d=Bantuan.Random(1,5);
            e=Bantuan.Random(-5,0);
            f=Bantuan.Random(-5,0);
            i=Bantuan.Random(-5,0);
            j=Bantuan.Random(1,5);
            k=Bantuan.Random(1,5);
            l=Bantuan.Random(1,5);
            m=Bantuan.Random(-5,0);
            n=Bantuan.Random(1,5);
            x=(float)(k-(a*e)-(b*c))/e;
            y=(float)(n-(c*f)-(d*j))/d;
            }while(x==0||y==0);
            soal="Diketahui persamaan matriks : \n |a"+Bantuan.positifnegatif2(a)+"   "+b+"| |"+e+"     "+f+"| = |"+k+"        "+l+"|\n |"+c+"        "+d+"| |"+i+"  b"+Bantuan.positifnegatif2(j)+"| = |"+m+"      "+n+"|\n Perbandingan nilai dari a dan b adalah....";
            x=Bantuan.pembulatan(x);
            y=Bantuan.pembulatan(y);
            
            pilihan = set_pilihan(x+" : "+y,y+" : "+x,-x+" : "+-y,-y+" : "+-x);
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*soal 16*/
            int[] bsudut = {90,180,270,360};
            int[] besar={1,0,-1,0,0,-1,0,1};
            do{
            a=Bantuan.Random(-5,5);
            b=Bantuan.Random(-5,5);
            }while(a==b);
            c=Bantuan.Random(1,4);
            l=Bantuan.Random(1,4);
            d=bsudut[l];
            soal="Koordinat A("+a+","+b+") dipetakan oleh dilatasi dengan pusat O dan faktor skala "+c+", dilanjutkan rotasi dengan pusat O sebesar "+d+" derajat. Koordinat titik hasil peta adalah...";
            e=besar[l+4];
            f=-besar[l];
            i=-f;
            j=(e*c*a)+(f*c*b);
            k=(i*c*a)+(e*c*b);
            
            pilihan = set_pilihan(j+" : "+k,k+" : "+j,-j+" : "+-k,-k+" : "+-j);
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*soal 17*/
            a=Bantuan.validator(Bantuan.Random(-5,5));
            b=Bantuan.validator(Bantuan.Random(-5,5));
            c=Bantuan.validator(Bantuan.Random(-50,50));
            soal="Dua bilangan bulat m dan n memenuhi hubungan "+a+"m + "+b+"n = "+c+". Nilai minimum dari p = m\u00b2 + n\u00b2 adalah ";
            d=(2*a*b*c)/(2*a*a*b+a);
            
            pilihan = set_pilihan(""+d*a,""+(a+2+d),""+(d+a),""+c);
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*soal 18*/
            a=Bantuan.Random(3,20);
            b=Bantuan.Random(2,7);
            c=Bantuan.Random(8,15);
            soal="Jika bola dijatuhkan dari ketinggian "+a+" dan memantul dengan tinggi pantulan "+b+"/"+c+". Jumlah seluruh lintasan yang dilalui bola dari awal hingga berhenti adalah....";
            
            pilihan = set_pilihan(""+Bantuan.pembulatan((float)a*(c+b)/(c-b)),""+Bantuan.pembulatan((float)a*(c+b+2)/(c+b)),""+Bantuan.pembulatan((float)a*(c+b+1)/(c-b)),""+Bantuan.pembulatan((float)a*(c+b-1)/(c-b)));
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*soal 19*/
            int[] array={1,4,9,16,25,36,49,64,81,100};
            a=Bantuan.Random(-20,20);
            b=Bantuan.Random(-20,20);
            c=Bantuan.Random(0,9);
            d=Bantuan.Random(-20,20);
            e=(int)Math.sqrt(array[c]);
            soal="limit tak hingga dari \u221A("+array[c]+"x\u00b2"+Bantuan.positifnegatif1(a)+"x"+Bantuan.positifnegatif1(b)+") - "+e+"x"+Bantuan.positifnegatif2(d)+" adalah....";
            d=2*d*e;
            
            pilihan = set_pilihan(""+(a-d)+"/"+(2*e),""+(a-d)+"/"+(e),""+(a+d)+"/"+(2*e),""+(a+d)+"/"+(e));
            addsoalSMA(set_SMA,soal,pilihan);
            
            /*soal 20*/
            a=Bantuan.Random(1, 100);
            soal="Diketahui kubus ABCD.EFGH memiliki panjang rusuk "+a+" cm. Jarak titik G ke diagonal BE adalah.... ";
            x=(float)(a*a*2)-((a*a*2)/4);
            
            pilihan = set_pilihan(""+x,""+x*4,""+x*2,""+(x+((a*a*2)/4)));
            addsoalSMA(set_SMA,soal,pilihan);
            
        }
        
           void SMP(){
            int a,b,c,d,e,f,g,h,i,j;
            float x,y,z;
            
            /*soal 1*/
            a=Bantuan.Random(20,100);
            b=Bantuan.Random(20,80);
            soal="Sebuah kapal berlayar sejauh "+a+" KM ke arah barat, kemudian berbelok ke arah selatan sejauh "+b+" KM. Jarak terpendek kapal tersebut dari titik keberangkatan adalah ....";
            x=Bantuan.pembulatan((float) Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2)));
                     
            pilihan = set_pilihan(""+x,""+Bantuan.pembulatan((x+(a+b))),""+Bantuan.pembulatan((x+(a-b))),""+Bantuan.pembulatan((float)(a*2+b*2)/2));
                        
            addsoalSMP(set_SMP,soal,pilihan);
            
            /*soal 2*/
            do{
                a=Bantuan.Random(20,40);
                b=Bantuan.Random(20,40);
            }while(a==b);
            soal="Operasi \u25B2 berarti kalikan bilangan pertama dengan bilangan kedua, kemudian tambahkan dengan bilangan kedua. Hasil dari "+a+"\u25B2"+b+" adalah ....";
            c=(a*b)+b;
          
            pilihan = set_pilihan(""+c,""+(c-b),""+(c+b),""+((a*(b-1))+b+2)); 
            addsoalSMP(set_SMP,soal,pilihan);
            
           /*soal3*/
           a=Bantuan.Random(3,9);
           b=Bantuan.Random(5,30);
           c=Bantuan.Random(3,10);
           c=c*2;
           soal="Diketahui suatu barisan berupa :\n"+
                " "+b+" , "+(b+a)+" , "+(b+2*a)+" , "+(b+3*a)+" , "+(b+4*a)+" , "+(b+5*a)+" , "+(b+6*a)+" , "+
                " ...\n Jumlah "+c+" baris pertama adalah....";
                   
           jawab=(c/2)*(2*b+((c-1)*a));
           pilihan=set_pilihan(""+jawab,""+(jawab-10),""+(jawab-30),""+(+20));
           addsoalSMP(set_SMP,soal,pilihan);
           
           /*soal4*/
           a=Bantuan.Random(5, 80);
           b=Bantuan.Random(1, 20);
           c=Bantuan.Random(1, 20);
           soal="Diketahui sebuah kardus dengan panjang "+a+" cm lalu tinggi "+b+" cm dan lebar  "+c+" cm. Berapakah volume kardu tersebut?";
           d=a*b*c;

           pilihan = set_pilihan(""+d,""+(d+10),""+(d+30),""+(d-20)); 
           addsoalSMP(set_SMP,soal,pilihan);
        
        /*soal5*/           
           a=Bantuan.Random(60,100);
           b=Bantuan.Random(60,100);
           c=Bantuan.Random(60,100);
           d=Bantuan.Random(60,100);
           e=Bantuan.Random(60,100);
           f=Bantuan.Random(10,20);
           g=Bantuan.Random(10,20);
           h=Bantuan.Random(10,20);
           i=Bantuan.Random(10,20);
           j=Bantuan.Random(10,20);
           soal="Seorang siswa dikatakan lulus jika nilai ujiannya lebih dari nilai rata-rata. Berapa nilai rata-rata dari tabel nilai di bawah ini ? \n"+
                "| Nilai Ujian | "+a+" | "+b+" | "+c+" | "+d+" | "+e+" | \n"+
                "| Frekuensi   | "+f+" | "+g+" | "+h+" | "+i+" | "+j+" | \n";
           x=(float) ( (a*f) + (b*g) + (c*h) +(d*i) + (e*j)) / (f+g+h+i+j);
           x=Bantuan.pembulatan(x);
          
           pilihan = set_pilihan(""+x,""+(x+5),""+Math.abs(x-5),""+(x+15)); 
           addsoalSMP(set_SMP,soal,pilihan);
                   
        /*soal6*/
        a=Bantuan.Random(10,20);
        b=Bantuan.Random(1,10);
        c=Bantuan.Random(20,30);
        soal="Diketahui 2 lingkaran berjari-jari masing-masing "+a+" cm dan "+b+" cm. Jika panjang garis singgung persekutuan luarnya "+c+" cm, maka jarak titik pusat kedua lingkaran adalah ....";
        x=(float)Math.sqrt((c*c)+((a-b)*(a-b)));
        x=Bantuan.pembulatan(x);
        
          pilihan = set_pilihan(""+x,""+Bantuan.pembulatan(x-a),""+Bantuan.pembulatan(x-b),""+Bantuan.pembulatan(x+c));  
           addsoalSMP(set_SMP,soal,pilihan);
           
        /*soal7*/
        int[] sudut={30,45,60,90,120,135,150};
        float[] sisi={0.5f,0.7f,0.8f};
        a=Bantuan.Random(0,7);
        b=Bantuan.Random(1,10);
        soal="Besar sudut pusat AOB pada sebuah lingkaran adalah "+sudut[a]+" derajat. Jika panjang jari-jari lingkaran "+b+" cm, maka panjang busur AB adalah ....";
        x=(float)((((2*3.14*(2*b))*sudut[a])/360));
        x=Bantuan.pembulatan(x);
        
        pilihan = set_pilihan(""+x,""+Bantuan.pembulatan(x+2),""+Bantuan.pembulatan(x-2),""+Bantuan.pembulatan((float)x/2));  
           addsoalSMP(set_SMP,soal,pilihan);
           
        /*soal8*/
        a=Bantuan.Random(100,200);
        b=Bantuan.Random(0,3);
        c=sudut[b];
        soal=" Para insinyur berencana untuk membangun tenaga pendukung menggunakan angin"
             + " untuk kapal-kapal di laut. Ide adalah dengan memasang layar berupa layang-layang untuk menarik kapal."
             + " Dari hal tersebut, berapa kira-kira panjang tali layar dari layang-layang agar layar tersebut menarik kapal pada"
             + " sudut "+c+" derajat dan berada pada ketinggian vertikal "+a+" m ?";
        x=(float)Math.sqrt(Math.pow(a,2)+Math.pow(a,2));
        x=(float)a/sisi[b];
        x=Bantuan.pembulatan(x);
        
         pilihan = set_pilihan(""+x,""+(x+2),""+(x-2),""+Bantuan.pembulatan((x/2)));  
           addsoalSMP(set_SMP,soal,pilihan);
        
        /*soal9*/
        a=Bantuan.Random(15,30);
        b=Bantuan.Random(10,30);
        c=Bantuan.Random(20,30);
        d=Bantuan.Random(9,30);
        e=Bantuan.Random(1,4);
        jawab=b+c+d-a;
        String[] penelitian1 = {"menyukai basket","sarapan nasi","minum susu","membaca koran"};
        String[] penelitian2 = {"menyukai sepak bola","sarapan bubur","minum kopi","membaca majalah"};
        soal="Dalam suatu penelitian yang dilakukan pada "+jawab+" orang, diperoleh data "+b+" orang "+penelitian1[e]+", "+c+" orang "+penelitian2[e]+", dan "+d+" orang tidak "+penelitian1[e]+" dan tidak "+penelitian2[e]+
        ". Tentukanlah jumlah orang yang "+penelitian1[e]+" dan "+penelitian2[e]+" !";

        pilihan = set_pilihan(""+a,""+(int)a/2,""+Math.abs(a-7),""+(a+5));  
        addsoalSMP(set_SMP,soal,pilihan);
           
        /*soal10*/
        a=Bantuan.Random(50,100);
        a=a*1000;
        b=Bantuan.Random(15,40);
        soal="Kakak membeli buku paket di toko buku seharga Rp."+a+", kebetulan sedang ada diskon toko sebesar "+b+"%. Berapa uang yang harus dibayarkan oleh kakak ?";
        c=(int)(a-(a/100*b));
  
        pilihan = set_pilihan(""+c,""+(c-2000),""+(c-1000),""+(c+5000));  
           addsoalSMP(set_SMP,soal,pilihan);
  
        /*soal11*/
        a=Bantuan.Random(2,10);
        b=Bantuan.Random(3,10);
        c=Bantuan.Random(50,100);
        soal="Perbandingan panjang dan lebar persegi panjang "+a+" : "+b+". Jika kelilingnya "+c+" cm, luasnya adalah ....";
        x=(float)c/((a*2)+(b*2));
        z=Bantuan.pembulatan(x*a*x*b);
        
        pilihan = set_pilihan(""+z,""+(z+10),""+Bantuan.pembulatan((float)Math.pow(((float)c/((a)+(b))),2)*a*b),""+(z*2));  
           addsoalSMP(set_SMP,soal,pilihan);
           
        /*soal 12*/
        a=Bantuan.Random(2,8);
        b=Bantuan.Random(40,100);
        soal="Diketahui ukuran panjang suatu bujur sangkar adalah "+a+" kali ukuran lebarnya. Jika keliling persegi panjang "+b+", lebar persegi panjang adalah ....";
        x=(float)b/(a+1);
        x=Bantuan.pembulatan((float)x/2);
        
        pilihan = set_pilihan(""+x,""+(x+1),""+(x-1),""+(x+2));  
           addsoalSMP(set_SMP,soal,pilihan);
           
        /*soal13*/
        a=Bantuan.Random(40,100);
        b=Bantuan.Random(40,100);
        c=Bantuan.Random(40,100);
        d=Bantuan.Random(40,100);
        e=Bantuan.Random(40,100);
        f=Bantuan.Random(40,100);
        x=a+b+c+d+e+f;
        y=Bantuan.pembulatan((float)x/6);
        soal="Salah satu nilai hasil ulangan Matematika Faqih hilang, sehingga nilai yang ada adalah "+a+", "+b+", "+c+", "+d+" dan "+e+". Jika rata-rata nilai Matematika Faqih seluruhnya adalah "+y+", nilai Matematika Faqih yang hilang adalah ....";
      
         pilihan = set_pilihan(""+f,""+(f+1),""+(f-1),""+(f+2));  
           addsoalSMP(set_SMP,soal,pilihan);
        
        /*soal14*/
        a=Bantuan.Random(50,200);
        b=Bantuan.Random(20,40);
        soal="Dari "+a+" orang undangan yang hadir dalam suatu acara disediakan "+b+" hadiah untuk doorprize. Peluang undangan untuk mendapatkan hadiah doorprize adalah ....%";
        x=Bantuan.pembulatan((float)b/a);
        x=x*100;
        
         pilihan = set_pilihan(""+x,""+Bantuan.pembulatan((x+0.5f)),""+Bantuan.pembulatan(Math.abs(x-0.5f)),""+Bantuan.pembulatan((x/2)));  
           addsoalSMP(set_SMP,soal,pilihan);
        
        /*soal15*/
        a=Bantuan.Random(5000,10000);
        a=a*100;
        b=Bantuan.Random(1,12);
        c=Bantuan.Random(5,30);
        x=(float)b/12;
        x=x*((float)c/100);
        x=a+(x*a);
        soal="Zahra menabung pada sebuah bank sebesar Rp. "+a+",00. Setelah "+b+" bulan uangnya menjadi Rp. "+x+",00. Besar bunga tunggal pertahun adalah .... % ";
        
         pilihan = set_pilihan(""+c,""+(c-1),""+(c-2),""+(c+1));  
           addsoalSMP(set_SMP,soal,pilihan);
           
        /*soal16*/
        a=Bantuan.Random(20,80);
        b=Bantuan.Random(10,20);
        soal="Alas limas berbentuk persegi kelilingnya "+a+" cm. Jika tinggi limas "+b+" cm, luas sebuah permukaan limas adalah ....";
        x=(float)a/4;
        x=Bantuan.pembulatan(x);
        y=(float)(x*x)+((float)(a*b)/2);
        y=Bantuan.pembulatan(y);
        
        pilihan = set_pilihan(""+y,""+(y-1),""+(float)(y/2),""+(y+1));  
           addsoalSMP(set_SMP,soal,pilihan);
           
        /*soal17*/
        a=Bantuan.Random(15,20);
        b=Bantuan.Random(80,90);
        c=Bantuan.Random(4,8);
        d=Bantuan.Random(75,80);
        soal="Rata-rata nilai "+a+" orang anggota tim panahan adalah "+b+". Setelah "+c+" orang ikut susulan, rata-rata nilainya menjadi "+d+". Rata-rata nilai ke-"+c+" anggota yang ikut susulan adalah ....";
        x=(float)(((a+c)*d)-(a*b))/c;
        x=Bantuan.pembulatan(x);
        pilihan = new String[4];
        pilihan[0] =""+x;
    
         pilihan = set_pilihan(""+x,""+(x-1),""+(x-2),""+(x+1));  
           addsoalSMP(set_SMP,soal,pilihan);
           
        /*soal18*/
        a=Bantuan.Random(10,30);
        b=Bantuan.Random(10,30);
        c=Bantuan.Random(10,30);
        soal="Dalam suatu kantong berisi "+a+" kelereng putih, "+b+" kelereng biru dan "+c+" kelereng jingga. Jika dari dalam kantong diambil satu kelereng secara acak, peluang terambil kelereng biru adalah ....%";
        d=a+b+c;
        x=Bantuan.pembulatan((float)b/d);
        x=x*100;
        
        pilihan = set_pilihan(""+x,""+Bantuan.pembulatan(Math.abs(x-0.5f)),""+Bantuan.pembulatan(((float)x/2)),""+Bantuan.pembulatan((x+0.5f)));  
           addsoalSMP(set_SMP,soal,pilihan);
        
        /*soal19*/
        a=Bantuan.Random(30,100);
        b=Bantuan.Random(23,31);
        c=Bantuan.Random(10,20);
        soal="Pak Abdul mempunyai persediaan bahan makanan untuk "+a+" ekor ayamnya selama "+b+" hari. Jika ia menjual ayamnya "+c+" ekor, bahan makanan ayam tersebut akan habis dalam waktu ....";
        x=(a*b)/(a-c);
        y=Bantuan.pembulatan(x);

        pilihan = set_pilihan(""+y,""+(y-1),""+(y+1),""+(y+3));  
           addsoalSMP(set_SMP,soal,pilihan);
        
        /*soal20*/
        a=Bantuan.Random(-10,0);
        b=Bantuan.Random(2,6);
        c=Bantuan.Random(2,8);
        d=Bantuan.Random(1,4);
        soal="Suhu didalam kulkas "+a+" \u00b0 C. Pada saat mati lampu, suhu di dalam kulkas naik menjadi "+b+"\u00b0 C setiap "+c+" menit. Setelah lampu mati selama "+c*d+" menit, suhu didalam ruangan kulkas adalah ?";
        e=a+(b*c);
        
        pilihan = set_pilihan(""+e,""+(e-b),""+(e+b),""+(e-(b/2)));  
        addsoalSMP(set_SMP,soal,pilihan);
        }
         
        public void SD(){
            int a,b,c,d,e,f,g,h,i,k,ansI;
            long j,ansL;
            float ansF,p,q,r,s,t;
            char x,y,z;
        
            /*soal1*/
            a=Bantuan.Random(-10,20);
            b=Bantuan.Random(-10,20);
            c=Bantuan.Random(-10,20);
            
            soal="" +a+" "+Bantuan.positifnegatif2(b)+" "+Bantuan.positifnegatif2(c);
            ansI = a+b+c;
            
            pilihan = set_pilihan(""+ansI , ""+(ansI-1) , ""+(ansI+2) , ""+(ansI+1));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal2*/
            a=Bantuan.Random(50,70);
            b=Bantuan.Random(5,15);
            c=Bantuan.Random(10,20);
            j = c*1000;
        
            soal = "Pada pesta ulang tahun Rita, ia mengundang "+a+" orang temannya. Ternyata ada "+b+" orang yang tidak dapat hadir. Jika biaya makan dan minum setiap anak adalah "+j+", maka biaya keseluruhan untuk makan dan minum anak yang hadir adalah...";
            ansL = (a-b)*c*1000;
            
            pilihan = set_pilihan(""+ansL , ""+(ansL+3000) , ""+(ansL+2000) , ""+(ansL-2000));
            
            addsoalSD(set_SD,soal,pilihan);
           
            /*soal3*/
            a=Bantuan.validator(Bantuan.Random(-100,20)); //kenapa yg ini -100 yang lain -10?
            b=Bantuan.validator(Bantuan.Random(-10,20));
            c=Bantuan.validator(Bantuan.Random(-10,20));
            d=Bantuan.validator(Bantuan.Random(-10,20));
            
            
            soal =""+a+" "+Bantuan.positifnegatif2(b)+" : "+c+" x "+d+"";   
            ansF=Bantuan.pembulatan((float)b/c);     
            ansF=(float)ansF*d;
            ansF=a+ansF;
            ansF=Bantuan.pembulatan(ansF);
            
            pilihan = set_pilihan(""+ansF , ""+(ansF-10) , ""+(ansF+10) , ""+(ansF-8));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal4*/
            p=Bantuan.Random(10,40);
            q=Bantuan.Random(10,40);
            r=Bantuan.Random(10,30);
        
            while(r>(p+q)){
                r=Bantuan.Random(10,25);
            }
            ansF = p+q-r;
            
            soal = "Bibi memiliki beras "+p+" kg. Kemudian, ia membeli lagi sebanyak "+q+" kg. Beras tersebut dimasak "+r+" kg. Sisa beras bibi sekarang adalah...";
                        
            pilihan = set_pilihan(""+ansF , ""+(ansF-2) , ""+(ansF+1) , ""+(ansF-3));
            
            addsoalSD(set_SD,soal,pilihan);            
            
            /*soal5*/
            int[]persen = {25,50,75,125,150,175,225,250,275};
            a=Bantuan.Random(1,21);
            b=Bantuan.Random(1,9);
            c=Bantuan.Random(2,9);
            d=Bantuan.Random(0,9);
            p=Bantuan.random_float(0, 10);
                
            
            soal = ""+a+"  "+Bantuan.persen(b,c)+" : "+persen[d]+"% x "+(Bantuan.pembulatan(0.1f*p))+"";
            
            ansF=(float)((a*c)+b)/c;
            ansF=(float) ansF/((float)persen[d]/100);
            ansF = (float)(ansF*(0.1*p));
            ansF=Bantuan.pembulatan(ansF);
            
            pilihan = set_pilihan(""+ansF , ""+Bantuan.pembulatan((float)ansF/p) , ""+Bantuan.pembulatan((ansF-0.2f)) , ""+Bantuan.pembulatan((ansF+0.2f)));
            
            addsoalSD(set_SD,soal,pilihan);
            
            
            /*soal6*/
            a=Bantuan.Random(3,10);
            b=Bantuan.Random(10,50);
            j=b*100000;
        
            ansI = (a*b);
            
            soal="Jarak pada peta kota Surabaya dan kota Kediri adalah "+a+" cm. Jika skala peta itu 1:"+j+", maka jarak sebenarnya antara kota Surabaya dan Kediri adalah... km";
                        
            pilihan = set_pilihan(""+ansI , ""+(ansI-2) , ""+(ansI+1) , ""+(ansI+3));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal7*/
            do{
            a=Bantuan.Random(-10, 10);
            b=Bantuan.Random(-10, 10);
            }while(a==0&&b==0&&a==b);
            soal="Jika titik ("+a+","+b+") dicerminkan terhadap sumbu-Y, maka koordinat titik tersebut adalah....";
            
            pilihan = set_pilihan("("+-a+","+b+")" ,"("+b+","+a+")", "("+-b+","+a+")" , "("+a+","+b+")");
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal8*/
            do{
            a=Bantuan.Random(10,70);
            b=Bantuan.Random(10,70);
        
            ansI=Bantuan.FPB(a,b);
            } while (ansI==1 || ansI==2 || ansI==3 || a==b);
            
            soal = "Faktor Persekutuan Terbesar (FPB) dari "+a+" dan "+b+" adalah...";
                        
            pilihan = set_pilihan(""+ansI, ""+(ansI+4) , ""+(ansI-3) ,""+(ansI+5));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal9*/
            do{
            a=Bantuan.Random(5,20);
            b=Bantuan.Random(5,20);
            c=Bantuan.Random(5,20);
            }while (a==b || a==c || b==c);
        
            ansI = Bantuan.KPK(a,b);
            ansI = Bantuan.KPK(ansI,c);
        
            soal = "Kelipatan Persekutuan Terkecil (KPK) dari "+a+", "+b+", dan "+c+" adalah...";
                               
            pilihan = set_pilihan(""+ansI, ""+(ansI+2) , ""+(ansI-1) ,""+(ansI+3));
            
            addsoalSD(set_SD,soal,pilihan);
            
            
            /*soal10*/
            a=Bantuan.Random(5,10);
            b=Bantuan.Random(10,15);
            c=Bantuan.Random(15,20);
            
            ansI = Bantuan.KPK(a,b);
            ansI = Bantuan.KPK(ansI,c);
            
            soal = "Sebuah perusahaan berlangganan koran A, koran B, dan koran C. Koran A dikirim setiap "+a+" hari sekali, koran B dikirim setiap "+b+" hari sekali, koran C dikirim setiap "+c+" hari sekali. Pada hari pertama, ketiga koran dikirim bersamaan. Ketiga koran tersebut akan dikirim bersamaan lagi setelah hari ke-...";
                                    
            pilihan = set_pilihan(""+ansI, ""+(ansI+2) , ""+(ansI-2) ,""+(ansI+3));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal11*/
            String[] segi={"segitiga","segiempat"};
            String subsoal;
            c=Bantuan.Random(0,2);
            a=Bantuan.Random(3,10);
            d=Bantuan.Random(5,12);
            if(c==0){
                b=Bantuan.Random(3,10);
                subsoal=" dengan alas berukuran "+a+" cm dan tinggi "+b+" cm ";
                ansF=(float)(a*b*d)/2;
            }else{
                subsoal=" dengan berukuran "+a+" cm";
                ansF=a*a*d;
            }                                   
            soal ="Volume prisma yang memiliki alas berbentuk "+segi[c]+subsoal+" dan tinggi berukuran "+d+" cm adalah ....";
            pilihan = set_pilihan(String.valueOf(ansF),String.valueOf(ansF+5),String.valueOf(ansF-10),String.valueOf(ansF+15));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal12*/
            do{
            a=Bantuan.Random(6,26);
            b=Bantuan.Random(7,21);
            }while(b==a);
            
            ansI=(a*a)-(b*b);
            
            soal="Hasil dari "+a+"\u00b2 - "+b+"\u00b2 adalah...";
            
            pilihan = set_pilihan(""+ansI, ""+(ansI+b) , ""+(ansI-b) ,""+(ansI+a));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal13*/
            a=Bantuan.Random(11,51);
            soal="Hasil dari \u221b"+(a*a*a)+" adalah...";
                                    
            pilihan = set_pilihan(""+a, ""+(a+2) , ""+(a-1) ,""+(a+1));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal14*/
            a=Bantuan.Random(15,30);
            b=a*a*a;
            
            soal = "Sebuah bak mandi berbentuk kubus mempunyai volume "+b+" liter. Panjang rusuk bak mandi tersebut adalah...";
            
            pilihan = set_pilihan(""+a, ""+(a+2) , ""+(a-1) ,""+(a+1));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal15*/
            a=Bantuan.Random(125,255);
            a=a*10;
            b=Bantuan.Random(10,25);
            c=Bantuan.Random(5,20);
            p=(float)(c*0.1);
        
            ansI = (int)(a + (b*100)-(p*1000));
            
            soal = "Di gudang koperasi, terdapat persediaan gula "+a+" kg. Seorang distributor mengirim gula ke koperasi sebanyak "+b+" kuintal. Dalam watu yang sama, terjual gula sebanyak "+p+" ton. Persediaan gula di koperasi tersebut sekarang adalah... kg";
                      
            pilihan = set_pilihan(""+ansI, ""+(ansI+200) , ""+(ansI-100) ,""+(ansI+100));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal16*/
            a = Bantuan.Random(10,25);
            b = Bantuan.Random(5,15);
            c = Bantuan.Random(10,25);
            ansI = (2*a*b) + (2*a*c) + (2*c*b);
            soal = "Berapakah luas permukaan balok jika diketahui panjangnya "+a+" cm, lebar "+b+" cm, dan tinggi "+c+" cm?";
                        
            pilihan = set_pilihan(""+ansI, ""+(ansI+10) , ""+(ansI-20) ,""+(ansI+30));
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal17*/
            do {
            a=Bantuan.Random(130,170);
            b=Bantuan.Random(130,170);
            c=Bantuan.Random(130,170);
            d=Bantuan.Random(130,170);
            e=Bantuan.Random(130,170);
            f=Bantuan.Random(130,170);
            g=Bantuan.Random(130,170);
            h=Bantuan.Random(130,170);
            i=Bantuan.Random(130,170);
            k=Bantuan.Random(130,170);
            }while (a!=b || a!=c);
         
            int[] data={a,b,c,d,e,f,g,h,i,k};
            ansI = Bantuan.hitungModus(data);
            
            soal = "Data tinggi dari 10 orang siswa : "+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+" "+i+" "+k+". Modus dari data tersebut adalah...";
            int l=data[0],m=data[0];
            pilihan = new String[4];
            pilihan[0] =""+ansI+"";
            for(int tr=0;tr<data.length;tr++){
               if(data[tr]!=ansI){
                pilihan[1] =""+data[tr]+"";
                l=data[tr];
               }
            }
            for(int tr=0;tr<data.length;tr++){
               if(data[tr]!=ansI&&data[tr]!=l){
                pilihan[2] =""+data[tr]+"";
                m=data[tr];
               }
            }
            for(int tr=0;tr<data.length;tr++){
               if(data[tr]!=ansI&&data[tr]!=m&&data[tr]!=l){
               pilihan[3] =""+data[tr]+"";
               }
            }            
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal18*/
            a=Bantuan.Random(11,20);
            b=Bantuan.Random(1,10);
            c=Bantuan.Random(1,10);
            d=Bantuan.Random(1,10);
            e=Bantuan.Random(1,10);
            
            do{
            f=Bantuan.Random(140,160);
            g=Bantuan.Random(140,160);
            h=Bantuan.Random(140,160);
            i=Bantuan.Random(140,160);
            k=Bantuan.Random(140,160);
            }while(f==g&&g==h&&h==i&&i==k);
         
            ansI = Collections.max(Arrays.asList(a,b,c,d,e));
         
            soal = "Data tinggi lompatan cabang lompat tinggi dalam acara PORSENI sebagai berikut : "+System.lineSeparator() +a+" peserta mencapai "+f+ System.lineSeparator()+
                    +b+" peserta mencapai "+g+ System.lineSeparator() +c+" peserta mencapai "+h+ System.lineSeparator() +d+" peserta mencapai "+i+ System.lineSeparator()+
                    +e+" peserta mencapai "+k+ System.lineSeparator() +"Modus dari data tersebut adalah...";                        
            
            pilihan = set_pilihan(""+f, ""+k , ""+g ,""+h);
            
            addsoalSD(set_SD,soal,pilihan);
            
            /*soal19*/ /*CEK LAGIII!*/
            a=Bantuan.Random(10,20);
            b=Bantuan.Random(10,20);
            c=Bantuan.Random(10,20);
            d=Bantuan.Random(10,20);
            e=Bantuan.Random(10,20);
            f=Bantuan.Random(10,20);
            g=Bantuan.Random(10,20);
            h=Bantuan.Random(10,20);
            
            soal = "Data umur dari 8 orang anak adalah sebagai berikut : "+a+" "+b+" "+c+" "+d+" "+e+" "+f+" "+g+" "+h+". Median dari data tersebut adalah...";
        
            int[] data1 = {a,b,c,d,e,f,g,h};
            Arrays.sort(data1);            
            ansF =(float) (data1[data1.length/2-1] + data1[(data1.length/2)])/2;
            
            pilihan = set_pilihan(""+ansF, ""+(ansF+0.5) , ""+(ansF-0.5) ,""+(ansF-1));
            
            addsoalSD(set_SD,soal,pilihan);
            
            
            /*soal20*/
            a=Bantuan.Random(8,20);
            b=Bantuan.Random(8,20);
            c=Bantuan.Random(8,20);
            d=Bantuan.Random(8,20);
            e=Bantuan.Random(8,20);
            f=Bantuan.Random(8,20);
            g=Bantuan.Random(8,20);
            h=Bantuan.Random(8,20);            
            
            soal = "Harga beras per kg di 8 stand sebuah pasar adalah sebagai berikut : "+a*1000+"  "+b*1000+"  "+c*1000+"  "+d*1000+"  "+e*1000+"  "+f*1000+"  "+g*1000+"  "+h*1000+". Rata – rata harga beras tersebut adalah...";
            ansI=1000*(a+b+c+d+e+f+g+h)/8;
            
            pilihan = set_pilihan(""+ansI, ""+(ansI+100) , ""+(ansI-100) ,""+(ansI+200));
                        
            addsoalSD(set_SD,soal,pilihan);
        }
        
        KumpulanSoalll get_SD(){
            return set_SD;
        }
        
        KumpulanSoalll get_SMP(){
            return set_SMP;
        }
        
        KumpulanSoalll get_SMA(){
            return set_SMA;
        }
        
        void addsoalSMA(KumpulanSoalll set_SMA,String soal,String[] pilihan){
            int jawab=Bantuan.Random(0,4);
            set_SMA.TambahSoal(new Soalll(soal,jawab,pilihan,true));
        }
        
        void addsoalSMP(KumpulanSoalll set_SMP,String soal,String[] pilihan){
            int jawab=Bantuan.Random(0,4);
            set_SMP.TambahSoal(new Soalll(soal,jawab,pilihan,true));
        }
        
        void addsoalSD(KumpulanSoalll set_SD,String soal,String[] pilihan){
            int jawab=Bantuan.Random(0,4);
            set_SD.TambahSoal(new Soalll(soal,jawab,pilihan,true));
        }
        
        String[] set_pilihan(String a,String b, String c,String d){
            String[] pilihan ={a,b,c,d};
                    return pilihan;
        }
}                           

