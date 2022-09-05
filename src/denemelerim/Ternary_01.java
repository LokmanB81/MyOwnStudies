package denemelerim;

import java.util.Scanner;

public class Ternary_01 {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi= scan.nextInt();

        String sonuc = (sayi %2==0) ? "cift sayi": " tek sayi";
        System.out.println(sonuc);
    }
}
