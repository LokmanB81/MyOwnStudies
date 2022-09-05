package soru_Cozumleri;

import java.util.Scanner;

public class Method_Creation_Soru2 {
    public static void main(String[] args) {
       //Scanner scan=new Scanner(System.in);
       sayilarToplami();


    }

    private static void sayilarToplami() {
        int toplam=0;

        Scanner scan=new Scanner(System.in);
        System.out.println("toplamak istediginiz sayi adedini giriniz");
        int sayiAdedi= scan.nextInt();

        if (sayiAdedi>1 && sayiAdedi< 5){

            for (int i = 1; i <=sayiAdedi ; i++) {
                System.out.println(i + ". sayiyi gir");
                int girilenSayi = scan.nextInt();
                 toplam+=girilenSayi;
            }

            System.out.println("girilen sayilarin toplami= "+toplam);
        } else if (sayiAdedi>4){
            System.out.println( "bu islem yapilamaz");
        } else System.out.println("2-4 arasi bir deger giriniz");

    }


}
