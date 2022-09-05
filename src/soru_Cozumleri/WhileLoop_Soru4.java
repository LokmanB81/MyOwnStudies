package soru_Cozumleri;

import java.util.Scanner;

public class WhileLoop_Soru4 {
    public static void main(String[] args) {
        // baslangic ve bitis harfi girdirip
        // baslangic ve bitis arasindaki harfleri buyuk olarak  yazdiran
        Scanner scan=new Scanner(System.in);
        System.out.println("bir baslangiz harfi giriniz");
        char bas= scan.next().charAt(0);
        System.out.println("bir bitis harfi giriniz");
         char son= scan.next().charAt(0);

         while(bas<=son){
             String buyuk=bas+""; // buyuk harfe dondurebilmek icin char ifadeyi
                                    // string ifadeye donusturduk
             System.out.print(buyuk.toUpperCase()+" ");
             bas+=1;
         }
    }
}