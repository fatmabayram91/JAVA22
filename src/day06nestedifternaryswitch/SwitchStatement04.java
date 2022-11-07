package day06nestedifternaryswitch;

import java.util.Scanner;

public class SwitchStatement04 {
    public static void main(String[] args) {

      /*
      Ask user to enter country name among " America,England,Germany,Turkey,India,Peru,Spain,Bulgaria,France"
      Type the code to print abbreviation of the countries "US,UK,DE,TR,PE,ES,BG,FR"
       */

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the country name among America,England,Germany,Turkey,India,Peru,Spain,Bulgaria,France ");
        String country = scan.next().toLowerCase();

      //Note: if you want the switch statement work with cas-insensitive
       // a) use toLowercase()
        //b make cases in switch lowercase



        switch (country){
            case "america":
                System.out.println("US");
                break;
            case "england":
                System.out.println("UK");
            break;
            case "turkey":
                System.out.println("TR");
                break;
            case "germany":
                System.out.println("DE");
                break;

            case "india":
                System.out.println("IN");
                break;
            case "peru":
                System.out.println("PE");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("We don't know the abbreviation of the given country");
                break;





        }










    }
}
