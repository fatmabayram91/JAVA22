package day06nestedifternaryswitch;

public class ReviewTernary01 {
    public static void main(String[] args) {

    // if an integer is positive print " the integer is positive" otherwise print "the integer is not positive"

//1.Way: solve by using if-else statement

        int num = 10;
                if(num>0){
                    System.out.println("the integer is positive");}
                else{
                    System.out.println("The integer is not positive");}

//2.Way: ternary
        //condition   ?   ternary 1   :  ternary 2

        String result = num>0   ? "The integer is positive" : "The integer is not positive";

                System.out.println(result);
//Write a program to print the minimum of 2 integers on the console . use ternary..

        int a = 100;
        int b = 100;
       int min = a<b ? a:b;
        System.out.println(min);


    }
}
