package recap_02_07;

import java.util.Scanner;

public class Soru_5 {
    public static void main(String[] args) {
        /*
         * Kullanicidan 4 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
         *
         * Ornek : Inputs : cesaret, insana, sinirlarini, ogretir
         *         Output : Cesaret insana sinirlarini ogretir.
         *
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("1. kelime ? "); String str1=scan.nextLine();
        System.out.println("2. kelime ? "); String str2=scan.nextLine();
        System.out.println("3. kelime ? "); String str3=scan.nextLine();
        System.out.println("4. kelime ? "); String str4=scan.nextLine();

        str1=str1.substring(0,1).toUpperCase()+str1.substring(1);

        System.out.println("cumle : "+str1+" "+str2+" "+str3+" "+str4+".");
    }
}

