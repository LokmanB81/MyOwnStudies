package denemelerim;

public class TernaryPostIncrement {
    public static void main(String[] args) {
         int y=1; int z=1;
         int a=y<10 ? y++ : z++;
        System.out.println(y + " " + a + " " + z);
    }
}
