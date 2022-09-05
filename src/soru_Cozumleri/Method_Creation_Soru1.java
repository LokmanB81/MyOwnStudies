package soru_Cozumleri;

import java.util.Scanner;

public class Method_Creation_Soru1 {
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
        System.out.println("bir tamsayi giriniz");
        int sayi= scan.nextInt();
        tekCift(sayi);
        pozitifMi(sayi);
        yuzdenBuyukMu(sayi);

    }

    private static void yuzdenBuyukMu(int sayi) {
        if (sayi>=100){
            System.out.println((sayi/100)+ (sayi/10%10)+ (sayi%10));
        } else if(sayi<100) {
            System.out.println(sayi % 10);
        } else System.out.println("");
        }


    private static void pozitifMi(int sayi) {
        if (sayi<0){
            System.out.println("girilen "+sayi+" sayisi negatiftir");
        } else System.out.println("girilen "+sayi+" sayisi pozitiftir");

    }

    public static void tekCift(int sayi) {
        if (sayi%2==0){
           System.out.println("girilen "+sayi+" sayisi cift sayidir");
        } else System.out.println("girilen "+sayi+" sayisi tek sayidir");

    }
}
