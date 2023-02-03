package denemelerim;

public class AlfabeYazdir {
    public static void main(String[] args) {
        int count = 0;
        for (int ch = 'a'; ch <= 'z'; ch++) {
            System.out.printf(" %1$4c%1$4x", ch);
            if (++count % 6 == 0) {
                System.out.printf("%n");
            }
            System.out.printf(" %1$4c%<4x", ch);
        }
    }

}
