package reCap_06_27;

import java.util.Scanner;

public class ReCap_Soru_1 {
    public static void main(String[] args) {
        // kullaniciya ad, memleket,su anki konum, yas, boy soran bir program olusturun,
// ve yasadiklari yeri seviyorlarsa
// bu bilgiyi yazdirin

// next() only can read the first word
// nextLine() can read the whole line
        Scanner scan=new Scanner(System.in);
        System.out.println("ad giriniz");
        String ad=scan.nextLine();
        System.out.println("memleket giriniz");
        String memleket=scan.nextLine();
        System.out.println("su anki konumu giriniz");
        String konum=scan.nextLine();
        System.out.println("yas giriniz");
        int yas=scan.nextInt();
        System.out.println("boyunuzu giriniz");
        double boy=scan.nextDouble();


        System.out.println("yasadiginiz "+ konum+ " u seviyor musunuz? true/false");
        boolean seviyorMu= scan.nextBoolean();

        System.out.println("ad = " + ad);
        System.out.println("memleket = " + memleket);
        System.out.println("konum = " + konum);
        System.out.println("yas = " + yas);
        System.out.println("boy = " + boy);
        System.out.println("seviyorMu = " + seviyorMu);

    }
}
