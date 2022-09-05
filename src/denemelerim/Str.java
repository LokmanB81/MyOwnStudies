package denemelerim;

public class Str {
    public static void main(String[] args) {
        StringBuilder sb=new StringBuilder(5+7+4+"a"+6);
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());

        sb.append("bugun hava cok guzel");
        System.out.println(sb);
        System.out.println(sb.length());
        System.out.println(sb.capacity());
    }
}
