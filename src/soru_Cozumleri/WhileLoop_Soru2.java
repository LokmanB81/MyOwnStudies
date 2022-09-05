package soru_Cozumleri;

public class WhileLoop_Soru2 {
    public static void main(String[] args) {
        // 3 basamakli sayilardan 15 20 ve 90 a tam bolunebilen sayilari yazdiran
        int i = 100;
        while (i < 1000) {
            if ((i % 15 == 0) && (i % 20 == 0) && (i % 90 == 0)) {
                System.out.print(i + " ");
                i++;
            }
            i++;
        }

        System.out.println();
        for (int j = 100; j < 1000; j++) {
            if ((j % 15 == 0) && (j % 20 == 0) && (j % 90 == 0)) {
                System.out.print(j + " ");
            }
        }
    }
}