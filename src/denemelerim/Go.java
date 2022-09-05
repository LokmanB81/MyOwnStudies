package denemelerim;

public class Go {
    public static void main(String[] args) {
        new Go().Go(1,"hello");
        new Go().Go(2,"hello","hi");

    }

    private void Go(int x, String... y) {
        System.out.println(y.length);
        System.out.println(y[y.length-x]+" ");
    }
}
