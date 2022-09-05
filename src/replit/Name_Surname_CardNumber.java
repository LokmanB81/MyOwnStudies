package replit;

import java.util.Scanner;

public class Name_Surname_CardNumber {
    public static void main(String[] args) {
        /*
        Ask user Name, Surname and credit card numbers than convert it to special form.
        (Initials for name and surname should be uppercase)
(Check credit card number, if there aren’t 16 digit print “Invalid credit card number”
Input :
John White 1234234534561478
Output :
Name : J*** W****
CCN : **** **** **** 1478
         */
        String name; String surName; String cardNumber;
        Scanner scan=new Scanner(System.in);
        System.out.println("Your name?");
        name=scan.nextLine();
        System.out.println("Your surname?");
        surName=scan.nextLine();
        System.out.println("Your card number? (as 16 digit) ");
        cardNumber=scan.nextLine();

       name=(name.toUpperCase().charAt(0) +
               (name.substring(1).replaceAll("\\w", "*")));

     surName=(surName.toUpperCase().charAt(0) +
             (surName.substring(1).replaceAll("\\w", "*")));
            if (cardNumber.length()==16){
        cardNumber=((cardNumber.substring(0,4).replaceAll("\\w","*"))+" "+
                (cardNumber.substring(4,8).replaceAll("\\w","*"))+" "+
                (cardNumber.substring(8,12).replaceAll("\\w","*")+" "+
                        (cardNumber.substring(12,16))));}
            else {
                cardNumber="Invalid Card Number";
            }

        System.out.println("Name : " +name+" "+surName);
        System.out.println("CCN : " +cardNumber);



    }
}

