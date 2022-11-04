package day06nestedifternaryswitch;

public class NestedTearnary02 {

    public static void main(String[] args) {

     /*
     Type code to check the password
     If it has more than 8 characters, initial should be 'i'
     If it has no more than 8 characters initial should be 'K'  and the last character should be '!'
     solve the task by using nested-ternary
      */
// length () method returns the number of characters in a string
        //for example: "Ali Can" . length() ==> 7

String pwd = "ia1b3c7xy";

//() ? () :() ;

 String isvalid= (pwd.length()>8) ?
                (pwd.charAt(0)=='i' ? "Valid password" : "Invalid password") :
                (pwd.charAt(0)=='K' ? "Valid Password"  : "Invalid password" );

        System.out.println(isvalid);






    }
}
