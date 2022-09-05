package recap_02_07;

import java.util.Scanner;

public class Soru_2 {
    public static void main(String[] args) {
       // /Scanner kullanarak iki ayri deger giriniz ve bu iki kelimeyi String manipulation
        // method kullanarak birlestiriniz.
        //yukardaki ornekte verilen ilk ve ikinci degiskenlerinin ilk harflerini atip birlestiriniz.

        Scanner scan=new Scanner(System.in);
        System.out.println("1. kelime giriniz");
        String str1= scan.nextLine();
        System.out.println("2. kelime giriniz");
        String str2= scan.nextLine();

        System.out.println("1. yontem"+str1+" "+ str2);
        System.out.println("2. yontem"+str1.concat(" "+str2));


        str1=str1.substring(1);
        str2=str2.substring(1);
        System.out.println("1. yontem: "+str1+" "+str2);

    }
}
