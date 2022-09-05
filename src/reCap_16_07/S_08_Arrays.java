package reCap_16_07;

import java.util.Scanner;

public class S_08_Arrays {
    /*
        Kullanicidan aldigimiz 8 elemanli arrayin icinde
        kac tane 3 e bolunebilen sayi vardir ?(negatif sayilar da dahil olsun)
       */
    public static void main(String[] args) {
        int[] arr = new int[4];
        Scanner oku = new Scanner(System.in);
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i + ".indexdeki sayiyi giriniz :");
            arr[i] = oku.nextInt();
            System.out.println(arr[i]);

            if (arr[i]%3 == 0 && arr[i]!=0) {
                count++;
            }
        }
        System.out.println("3 e bolunebilen sayi adedi:" + count);
    }
}
