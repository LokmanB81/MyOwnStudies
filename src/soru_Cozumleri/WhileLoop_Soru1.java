package soru_Cozumleri;

public class WhileLoop_Soru1 {
    public static void main(String[] args) {
        // 3 ten 13 e kadar tek tamsayilari yazdiran
        int i=3;
        while (i<14){
            if (!(i%2==0)){
                System.out.print(i+", ");
                i++;
            }
            i++;

        }
    }
}
