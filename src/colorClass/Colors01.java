package colorClass;

public class Colors01 {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_SIYAH = "\u001B[30m";
    public static final String ANSI_KIRMIZI = "\u001B[31m";
    public static final String ANSI_YEŞİL = "\u001B[32m";
    public static final String ANSI_SARI = "\u001B[33m";
    public static final String ANSI_MAVI = "\u001B[34m";
    public static final String ANSI_MOR = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_BEYAZ = "\u001B[37m";
    public static void main(String[] args) {


        System.out.println(ANSI_KIRMIZI+"Kırmızı yazı");
        System.out.println(ANSI_CYAN+"Turkuaz yazı");
        System.out.println(ANSI_MAVI+"Mavi yazı");
        System.out.println(ANSI_YEŞİL+"Yesil yazı");
        System.out.println(ANSI_SARI+"Sarı yazi");
    }
}
