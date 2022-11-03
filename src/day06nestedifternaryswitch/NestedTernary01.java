package day06nestedifternaryswitch;

public class NestedTernary01 {
/*
to check if a year is a leap year or not by using nested ternary.
If the year is divisible by 100 then it must be divisible by 400.
If a year is not divisible by 100 then it must be divisible by 4.
 */

    public static void main(String[] args) {

        //condition ? (Ternary 1) :(Ternary 2) ;

        int year = 1800;
        String isLeap = (year%100==0) ? ( year%400==0 ? "Leap year" : "Not leap year"  ) : ( year%4==0 ? "leap year" :"not leap year");


        System.out.println(isLeap);


    }

}

