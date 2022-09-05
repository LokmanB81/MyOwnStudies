package replit;

import java.util.Scanner;

public class Replit_For_1_Tekrar_Sayisi {
    public static void main(String[] args) {


    /*Ask user to enter a name and a character,
    then check how many times the character is repeated in the name using loops in the name
e.g: char ch1= 'a' ;
    String name =“John came late"
    Expected Output: Number of a = 2

     */
        Scanner scan = new Scanner(System.in);
        System.out.println("kelime ( veya cumle )  giriniz");
        String kelime= scan.nextLine();
        System.out.println("bir karakter giriniz");
        char ch= scan.next().charAt(0);
        int ch_Adedi=0;



        for (int i = 0; i < kelime.length(); i++) {



            if (ch==kelime.charAt(i)){
                ch_Adedi+=1;
            }

        }
        System.out.println("karakter cumlede "+ch_Adedi+" adet kullanilmis");
        }

    }

