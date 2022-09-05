package reCap_06_28;

import java.util.Scanner;

public class ReCap_Soru_2 {
    public static void main(String[] args) {
      /*  Problem Tanımı
        Bir işçinin işi bitirme süresini ve toplam işçi sayısını alarak, işin bitme süresini
        hesaplayan kodu yazınız.
                Örneğin, Bir işçi bir işi 10 günde yapabilmektedir.
        Buna göre 2 işçi aynı işi kaç günde yapar?

        Örnek Ekran Çıktısı
        Bir işçi işi kaç günde bitirmektedir? 10
        Toplam kaç işçi çalışacak? 2
        İşin bitme süresi 5 gündür.
                */
        Scanner scan=new Scanner(System.in);
        System.out.println("bir isci isi kac gunde bitrmektedir?");
        double birisci= scan.nextDouble();
        System.out.println("toplam  kac isci calısiyor?");
        double isciSayisi= scan.nextDouble();

        double isBitirrmeSuresi=birisci /isciSayisi;

        System.out.println("isin bitme suresi= "+ isBitirrmeSuresi);

    }
}
