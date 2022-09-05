package denemelerim;

public class Method_Creation_ {
    public static  long square(int x)
    {
        long y=x* (long)x;
        x=-1;
        //System.out.println(y);
        return y;
    }

    public static void main(String[] args) {
    int value=9; long y=0;
    long result=square(value);
        System.out.println(value);
         y=square(value);
        System.out.println(y);
    }
}
