package reCap_06_27;

import java.util.Scanner;

public class ReCap_Soru_2 {
    public static void main(String[] args) {
        /*
         * Kullanicidan Y/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Y veya N olarak ifadenizi giriniz");
        char input=scan.next().charAt(0);


        if (input=='Y' || input=='y' ){
            System.out.println("YES");

        } else if((input=='N' || input=='n' )){
            System.out.println("NO");
        }else{
            System.out.println("gecerli bir deger giriniz");
        }


    }
}
