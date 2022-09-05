package denemelerim;

import java.util.Scanner;

public class QQQQ {
    public static void main(String[] args) {
       /*
        TASK :
        kullanıcıdan bir e-posta adresi girmesini isteyin, ardından "hotmail" içeriyorsa, "gmail" ile değiştirin,
        örneğin: johnbrown@hotmail.com ==> johnbrown@gmail.com
        */

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir email giriniz");

        String str=scan.nextLine();


        if (!str.contains("@")){
            System.out.println("gecerli bir email giriniz");
        }else {
            if (str.endsWith("@gmail.com")){
                System.out.println("email onaylandi");

            }else if (!str.endsWith("@gmail.com")){
                System.out.println(str.replaceAll(str.substring(str.indexOf("@") + 1, str.indexOf(".")), "gmail"));


            }


        }

    }
}
