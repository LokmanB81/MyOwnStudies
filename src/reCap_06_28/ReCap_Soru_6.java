package reCap_06_28;

public class ReCap_Soru_6 {
    public static void main(String[] args) {
    /*
    gunleri gösterebilen bir program yazın
    gun Pazartesi veya Sali ise:
    Java dersi gunleri

    gun Persembe veya Cuma ise:
    Selenyum dersi gunleri

    gun carsamba veya cumartesi ise:
    SQL dersi gunleri

    aksi halde: izin gunu
    (if deyimini KULLANMAYIN)
*/

        String gun="carsamba";

        switch (gun){
            case "pazartesi":
            case "sali":
                System.out.println("java dersi gunleri");
                break;
            case "carsamba":
            case "cumartesi":
                System.out.println("SQL dersi gunleri");
                break;
            case "persembe":
            case "cuma":
                System.out.println("selenyum dersi gunleri");
                break;
            default :
                System.out.println("izin gun");
        }

    }
}
