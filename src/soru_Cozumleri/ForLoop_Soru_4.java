package soru_Cozumleri;

import java.util.Scanner;

public class ForLoop_Soru_4 {
    public static void main(String[] args) {
        // 100 den kucuk bir tam sayi girdirip
        // 1 den girilen sayiya kadar 3 un katları olan sayilari yazdirin

        Scanner scan=new Scanner(System.in);
        System.out.println("100 den kucuk bir tam sayi giriniz");
        int sayi = scan.nextInt();

        for (int i = 1; i <= sayi ; i++) {

            if (i%3==0){
                System.out.print(i+" ");
            }

        }
    }
}
