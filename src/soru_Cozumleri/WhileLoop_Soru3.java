package soru_Cozumleri;

import java.util.Scanner;

public class WhileLoop_Soru3 {
    public static void main(String[] args) {
        // baslangic ve bitis degerleri girdirip
        // baslangic ve bitis arasindaki cift sayilari yazdiran
        Scanner scan=new Scanner(System.in);
        System.out.println("bir baslangiz degeri giriniz");
        int bas= scan.nextInt();
        System.out.println("bir bitis degeri giriniz");
        int son= scan.nextInt();

         while(bas<=son){
             if(bas%2==0){
                 System.out.print(bas+" ");
                 bas++;
             }
             bas++;
         }
    }
}