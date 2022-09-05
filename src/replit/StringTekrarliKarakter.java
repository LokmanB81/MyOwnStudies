package replit;

import java.util.Scanner;

public class StringTekrarliKarakter {
    public static void main(String[] args) {
        /*
        Ask user to type a name,
the length of name should be 3.
Then check if the name has same characters.
If the String has same characters
Print “String has duplicate characters” Else
Print “String has unique characters”
Please use ternary.
Input :
ala
OutPut:
String has duplicate characters
         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter a name - as 3 characters");
        String name=scan.nextLine();
        String name1=name.substring(0,1);
        String name2=name.substring(1,2);
        String name3=name.substring(2,3);

        //System.out.println(name1+ " "+name2+" "+name3);

        System.out.println(name1.equals(name2) || name1.equals(name3) || name2.equals(name3) ?
                "Name has duplicate characters" : " Name has unique characters" );
    }
}
