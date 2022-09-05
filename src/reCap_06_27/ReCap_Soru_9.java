package reCap_06_27;

import java.util.Scanner;

public class ReCap_Soru_9 {
    public static void main(String[] args) {
        /*
         * Kullanicidan alacaginiz vize2 vize2 ve final notlarini
         * vize ortalamasinin %30'u final notunun %70 alarak gecme notunu hesaplayiniz
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("vize 1 notunu gir");
        double v1= scan.nextDouble();
        System.out.println("vize 2 notunu gir");
        double v2= scan.nextDouble();
        System.out.println("final notunu gir");
        double fnl= scan.nextDouble();

        double ort= (((v1+v2) / 2 * 0.3 ) + ( fnl * 0.7));
        System.out.println("ortalamaniz = "+ ort);
    }
}
