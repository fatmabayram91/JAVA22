package day06nestedifternaryswitch;

import java.util.Scanner;

public class NestedStatement01 {




    /* Ask user to enter a password
    If the initial of the password is uppercaase then check if it is 'A' or not.
    If it is 'A' the output will be "Valid Password2
    otherwise the output will be "Invalid Password"
     for example: Ali==>valid      ali==>invalid    Mark==> invalid

     If the initial of the password is lowercase then check if it is 'z' or not.
     If is 'z' the output will be " valid password"
     if it is not the output will be "invalid password"
     for examp;e: zoe==>valid   Zoe==> invalid       john==>invalid

     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);


        System.out.println("Enter a password..");
        String pwd = scan.nextLine();

        // how to get first character from  a String
        // index of characters start from 0
        // the order number of characters start from 1

        System.out.println(pwd.charAt(0));

        if (pwd.charAt(0) >= 'A' && pwd.charAt(0) <= 'Z') {
            if (pwd.charAt(0) == 'A') {
                System.out.println("Valid Password");
            } else {
                System.out.println("Invalid Password");

            }

        }


    }
}

