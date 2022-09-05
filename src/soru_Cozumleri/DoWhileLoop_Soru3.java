package soru_Cozumleri;

import java.util.Scanner;

public class DoWhileLoop_Soru3 {
    public static void main(String[] args) {
        /*
        kullanicidan toplamak icin pozitif tam sayilar alalim
        kullanici 0 girdiginde sayilarin toplamini ve kac sayi girdigini yazdirin
         */

        int sayi=0;
        int sayilarToplami=0;
        int girilenSayiAdedi=0;

        do{
            Scanner scan=new Scanner(System.in);
            System.out.println("pozitif tam sayilar giriniz- (islemi bitirmek icin '0' a basiniz ");
            sayi= scan.nextInt();
           if (sayi>0){ sayilarToplami+=sayi;
            girilenSayiAdedi++;
           }

        }while(sayi!=0);

        System.out.println(girilenSayiAdedi+" adet sayi girdiniz.Toplamlari= "+sayilarToplami);

    }
}
