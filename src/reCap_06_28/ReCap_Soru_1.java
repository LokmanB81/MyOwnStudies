package reCap_06_28;

import java.util.Scanner;

public class ReCap_Soru_1 {
    public static void main(String[] args) {
      /*  Problem Tanımı
    Kullanıcıdan a,b ve c sayılarını okuyarak aşağıdaki işlemi yapan kodu yazınız
    a'nın karesinden b'nin karesini cikarip c nin 3 katina bolunuz

    Örnek Ekran Çıktısı
    a sayısını giriniz: 5
    b sayısını giriniz: 3
    c sayısını giriniz: 1
    sonuç : 5.333333333333333
    */
        Scanner scan=new Scanner(System.in);
        double sayi1; double sayi2; double sayi3;
        System.out.println("1. sayiyi giriniz");
        sayi1= scan.nextDouble();
        System.out.println("2. sayiyi giriniz");
        sayi2= scan.nextDouble();
        System.out.println("3. sayiyi giriniz");
        sayi3= scan.nextDouble();

        double sonuc= ((sayi1*sayi1) - (sayi2*sayi2)) / (sayi3*3);

        System.out.println("sonuc= "+ sonuc);

    }
}
