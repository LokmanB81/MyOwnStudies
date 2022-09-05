package soru_Cozumleri;

import java.util.Scanner;

public class Method_Creation_Soru3 {
    public static void main(String[] args) {

        mailKontrol();

    }

    public static void mailKontrol() {
        Scanner scanner=new Scanner(System.in);
        System.out.println("mail adresinizi giriniz");
        String mail= scanner.nextLine();

            if(!(mail.contains("@"))){
                System.out.println("gecersiz mail");
            }
            else if(!(mail.contains("@gmail.com"))){
                System.out.println("gmail adresinizi gir");
            }
            else if(!(mail.endsWith("@gmail.com"))){
                System.out.println("yazim hatali, kontrol ediniz");
            }
    }


}
