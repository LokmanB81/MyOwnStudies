package recap_02_07;

import java.util.Scanner;

public class Soru_6 {
    public static void main(String[] args) {
        /*
         * girilen String icinde "xyz" dizimi var ise true degilse
         * false return eden metod yaziniz
         *
         * input      output
         * axyzm  ==   true
         * xyz    ==   true
         * x.yz   ==   false
         * xyaz   ==   false
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("string bir ifade gir");
        String str=scan.nextLine().toLowerCase();

        kelimeKontrol(str);
        System.out.println(kelimeKontrol(str));

    }

    public static boolean kelimeKontrol(String str) {

       if (str.contains("xyz")){
            return true;
        } else return false;


    }

}
