package day07stringmanipulations;

import java.util.Scanner;

public class Sm01 {


    public static void main(String[] args) {

        // print the firs and last character of the given String on the console. "Java is easy" ==>Jy

        Scanner scan = new Scanner(System.in);

        System.out.println("Enter a String");
        String str = scan.nextLine();

        // to get characters from a string one by one we have 2 ways;
        // 1.way : using charAt();

        char firstChar = str.charAt(0);

        System.out.println(firstChar);


        char lastChar = str.charAt(str.length() - 1);
        System.out.println(lastChar);
//Note:if you use '0' inside the charAt() method you will get last character in a string

        //2.Way: using substring()
        //Note: to get first character by using substring method use str.substring(0,1);

        String firstCharacter = str.substring(0, 1);
        System.out.println(firstCharacter);

        String lastCharacter = str.substring(str.length() - 1, str.length());
        System.out.println(lastCharacter);


        //2.example: Type code to get initials of the first name and the last name of a given name.
        // Ali Can ==>AC,      MARY STAR ==>MS


        String initialOfFirstName = str.substring(0, 1);

        //how to find index of initial of last name
        int indexOfInitialOfLastName = str.indexOf(" ") + 1;

        String initialOfLastName = str.substring(indexOfInitialOfLastName, indexOfInitialOfLastName + 1);

        System.out.println(initialOfFirstName + initialOfLastName);


//3.Example : Check if any character exists in a string or not
        String characterToCheck = "Can";
        int result = str.indexOf("characterToCheck");
        if (result == -1) {
            System.out.println("The character does not exist");

        } else {
            System.out.println("The character exist");
        }


    }
}
