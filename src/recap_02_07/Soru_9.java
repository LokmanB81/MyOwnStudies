package recap_02_07;

import java.util.Scanner;

public class Soru_9 {
    // Kullanicidan isim ve soyismini girmesini isteyin ve
// hangisinin daha uzun oldugunu yazdirin.
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("isim ve soyisim giriniz:\nisim");
        String isim= scan.next();
        System.out.println("soyisim");
        String soyisim=scan.next();

        if (isim.length()> soyisim.length()){
            System.out.println("isminiz soyisminizden uzundur");
        }
        else if(isim.length()==soyisim.length()){
            System.out.println("isminiz soyisminizle aynı uzunlukta");
        } else System.out.println("soyisminiz uzundur");
    }
}
