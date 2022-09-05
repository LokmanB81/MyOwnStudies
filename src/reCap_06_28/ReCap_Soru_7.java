package reCap_06_28;

import java.util.Scanner;

public class ReCap_Soru_7 {
    public static void main(String[] args) {
        // Girilen uc haneli bir sayının okunusnu yazı ile yazdırınız.

        // int sayi=150;
        Scanner scan = new Scanner(System.in);
        System.out.println("3 basamaklı sayi giriniz");
        int sayi = scan.nextInt();
        int birler = sayi % 10;
        int onlar = (sayi / 10) % 10;
        int yuzler = sayi / 100;

        if (sayi > 99 && sayi < 1000) {
            switch (yuzler) {
                case 0: System.out.println("");;break;
                case 1: System.out.print("yuz\t");break;
                case 2: System.out.println("ikiyuz\t");break;
                case 3: System.out.println("ucyuz");break;
                case 4: System.out.println("dortyuz");;break;
                case 5: System.out.println("besyuz");break;
                case 6: System.out.println("altiyuz");break;
                case 7: System.out.println("yediyuz");break;
                case 8: System.out.println("sekizyuz");break;
                case 9: System.out.println("dokuzyuz");break;

            }

            switch (onlar) {
                case 0: System.out.println("");;break;
                case 1: System.out.print("on\t");break;
                case 2: System.out.println("yirmi");break;
                case 3: System.out.println("otuz");break;
                case 4: System.out.println("kirk");;break;
                case 5: System.out.println("elli");break;
                case 6: System.out.println("altmis");break;
                case 7: System.out.println("yetmis");break;
                case 8: System.out.println("seksen");break;
                case 9: System.out.println("doksan");break;
            }

            switch (birler) {
                case 0: System.out.println("");;break;
                case 1: System.out.print("bir\t");break;
                case 2: System.out.println("iki");break;
                case 3: System.out.println("uc");break;
                case 4: System.out.println("dort");break;
                case 5: System.out.println("bes");break;
                case 6: System.out.println("alti");break;
                case 7: System.out.println("yedi");break;
                case 8: System.out.println("sekiz");break;
                case 9: System.out.println("dokuz");break;
            }

        } else {
            System.out.println("3 basamakli bir sayi giriniz");
        }
    }
}