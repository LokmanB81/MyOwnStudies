package soru_Cozumleri;

import java.util.Scanner;

public class Method_Creation_Soru4 {
    public static void main(String[] args) {

       String isim=""; String soyad="";
    String isim_Soyisim=isimAl(isim,soyad);

       String no="";
       String kart_No= kartNoAl(no);

        System.out.println(isim_Soyisim);
        System.out.println(kart_No);



    }

    public static String kartNoAl(String no) {
        Scanner scan=new Scanner(System.in);
        System.out.println("kart no yu 16 hane olarak gir");
        no= scan.nextLine();

        if (no.length()<16 || no.length()>16 ){
            System.out.println("kart no 16 hane olmali");
            return no="";
        } else

        no=no.substring(0,4)+" "+no.substring(4,8)+" "+no.substring(8,12)+" "+no.substring(12,16);
        return no;
    }

    public static String isimAl(String isim,String soyad){

        Scanner scan=new Scanner(System.in);
        System.out.println("isminizi giriniz ");
        isim = scan.nextLine();

         if (isim.contains(" ")) {
             int i = isim.indexOf(" ");
             isim = isim.substring(0, 1).toUpperCase() + isim.substring(1, i)
                     + " " + isim.substring(i + 1, i + 2).toUpperCase() + isim.substring(i + 2).toLowerCase();
         }else
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();

        System.out.println("soyisminizi giriniz");
        soyad=scan.nextLine();

         if (soyad.contains(" ")){
             int i=soyad.indexOf(" ");
            // String soyad1=soyad.substring(0,i);
             soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1,i).toLowerCase()+ " "
                     +soyad.substring(i+1,i+2).toUpperCase()+soyad.substring(i+2).toLowerCase();

            /* String soyad_2=soyad.substring((i+1));
             System.out.println(soyad_2);
             soyad=soyad+" "+soyad_2.substring(0,1).toUpperCase()+soyad_2.substring(1).toLowerCase();
*/
         } else
             soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toLowerCase();
        //System.out.println(isim+" "+soyad);

        return isim+" "+soyad;


    }



}
