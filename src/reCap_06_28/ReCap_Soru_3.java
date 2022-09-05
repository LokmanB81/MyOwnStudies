package reCap_06_28;

import java.util.Scanner;

public class ReCap_Soru_3 {
    public static void main(String[] args) {
      /*
 *  Kullanicidan boyunu  CM  ve kilosunu kg alarak  BMI (VKE) hesaplayiniz
 *
BMI = kilo(kg) /(boy*boy)(cm) boy m olmalı
BMI <=20 oldukca zayifsiniz
20<BMI<=25 Normal sinirlardasiniz
25<BMI<=30 Sisman kategorisindesiniz
30<BMI ==> Obez grubundasiniz.

 */
        Scanner scan=new Scanner(System.in);
        System.out.println("boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble()/100;
        System.out.println("kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble();

        double bmi=kilo/ (boy*boy);

        if (bmi<=20){
            System.out.println("kitle endeksiniz = "+bmi);
            System.out.println("oldukca zayıfsiniz");
        }


        else if( bmi<=25){
            System.out.println("kitle endeksiniz = "+bmi);
            System.out.println("normal degerdesiniz");
        }
        else if(bmi<=30){
            System.out.println("kitle endeksiniz = "+bmi);
            System.out.println("sisman kategoridesiniz");
        }
        else {
            System.out.println("kitle endeksiniz = "+bmi);
            System.out.println("obez kategoridesiniz");
        }

    }
}
