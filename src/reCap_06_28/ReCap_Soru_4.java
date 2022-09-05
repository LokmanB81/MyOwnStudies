package reCap_06_28;

import java.util.Scanner;

public class ReCap_Soru_4 {
    public static void main(String[] args) {
      /*
Problem tanimi :
Kullanicidan  yasini ve kilosunu alaliniz
18 yasindan kucuk ise kan bagisi yapamaz
18 yasindann buyuk ve 50 kilo dan hafif ise kan bagisi yapamaz.
18 yasindan buyuk ve 50 kilodan agir ise kan bagisi yapabilir.
 */
        Scanner scan=new Scanner(System.in);
        System.out.println("yasinizi giriniz");
        double yas= scan.nextDouble();
        System.out.println("kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble();

        if (yas>0 && yas <18 ){
            System.out.println("kan bagisi yapamazsiniz");
        }
        else if (yas>=18){
            if (kilo<50){
                System.out.println("kilonuz 50 den kucuk oldugu icin bagis yapamaazsiniz");
            }
            else if (kilo>=50) {
                System.out.println("kan bagisi yapabilirsiniz");
            }
            }else {System.out.println("yanlis deger girdiniz");}



    }
}
