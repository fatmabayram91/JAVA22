package day07stringmanipulations;

public class Sn02 {

    public static void main(String[] args) {


  String str = "Ali Can";
  String newStr = str.concat("!...").concat("Wow"); //you can do concatenation by "+" sign but using concat() is better
        System.out.println("newStr");
        boolean isLast = str.endsWith("n");
        System.out.println(isLast);
  boolean isFirst = str.startsWith("M");
        System.out.println(isFirst);


//str.startsWith("C",4) means skip first 4 characters then check if the remaining String is starting with  "C"
       boolean isTheForth = str.startsWith("C", 4);
        System.out.println(isTheForth); //true








    }
}
