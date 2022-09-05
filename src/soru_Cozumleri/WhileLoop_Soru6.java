package soru_Cozumleri;

import java.util.Scanner;

public class WhileLoop_Soru6 {
    public static void main(String[] args) {
        // kullacidan sayi alip bu sayiyi tam bolen sayilari ve
        // kac tane olduklarini yazdiran
        int i=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();
        int bolenSayiAdedi=0;


         while(i<sayi){
             if (sayi%i==0){
                 System.out.print(i+ " ");
                 bolenSayiAdedi++;

             }i++;

         }
        System.out.println("");
        System.out.println(sayi+" sayisinin "+bolenSayiAdedi+" tane tam boleni vardir");
    }
}