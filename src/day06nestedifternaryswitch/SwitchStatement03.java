package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement03 {
    public static void main(String[] args) {

        //create a simple calculator which does addition,subtraction,multiplication, division, percentage calculation

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number...");
        double firstNumber = scan.nextDouble();

        System.out.println("Enter second number");
        double secondNumber = scan.nextDouble();

//if you want to work all numbers change it into double

        System.out.println("Select operation +, *, /, %");
        //note: to get a single character from user we type ==> scan.next().charAt(0);
        char operation = scan.next().charAt(0);

        switch (operation) {

            case '+':
                System.out.println(firstNumber + secondNumber);
                break;
            case '-' :
                System.out.println(firstNumber - secondNumber);
                break;
            case'*':
                System.out.println(firstNumber * secondNumber);

            case'/':
                System.out.println(firstNumber / secondNumber);
                break;
            case'%':
                System.out.println(firstNumber * secondNumber /100);
                break;
            default:
                System.out.println("invalid operation for that calculator");


        }
    }
}