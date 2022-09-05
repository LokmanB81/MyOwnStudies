package soru_Cozumleri;

import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
         /*
  Kullanicidan alinan bir tamsayi kadar(47 den kucuk) FIBONACCI dizisi olusturun.
     0-1-1-2-3-5-8-13-21-34....
  */

        fibonaci();

    }

    public static void fibonaci() {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
        int sonuc=0; int ilkDeger=1;
        //System.out.print(ilkDeger+" ");

        for (int i = 1; i <= sayi; i++) {

            int toplam=sonuc+ilkDeger;
            System.out.print(toplam+" ");
            ilkDeger=sonuc;sonuc=toplam;

        }

    }

}
