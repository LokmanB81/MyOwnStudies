package soru_Cozumleri;

import java.util.Scanner;

public class WhileLoop_Soru5 {
    public static void main(String[] args) {
        // kullacidan sayi alip bu sayiya gore carpıim tablosu
        int i=1;
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();


         while(i<=10){
             System.out.print(sayi+"*"+i+"="+sayi*i+" ");
             i++;

         }
    }
}