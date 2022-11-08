package day07stringmanipulations;

import java.util.Scanner;

public class Sm01 {


    public static void main(String[] args) {

      // print the firs and last character of the given String on the console. "Java is easy" ==>Jy

      Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.next();

        // to get characters from a string one by one we have 2 ways;
        // 1.way : using charAt();

        char firstChar = str.charAt(0);

        System.out.println(firstChar);

  str.charAt();



    }
}
