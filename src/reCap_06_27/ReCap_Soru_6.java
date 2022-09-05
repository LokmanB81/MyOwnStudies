package reCap_06_27;

import java.util.Scanner;

public class ReCap_Soru_6 {
    public static void main(String[] args) {
        /*
         *  Kullanicidanalacaginiz 5 basamakli sayinin ilk 2 ve son iki basamagindaki rakamlari toplamini bulunuz
         *
         *   Ex :
         *   input  : 12345
         *   output : 12
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("5 basmaklı tamsayi giriniz");
        int sayi=scan.nextInt();

        int sayi1=sayi / 1000;
        int sayi2=sayi % 100;
        int sayi3=((sayi1 / 10) + (sayi1 % 10)) ;
        int sayi4=((sayi2 / 10) + (sayi2 % 10)) ;
        System.out.println("toplam= " + ( sayi3 + sayi4 ));
    }
}
