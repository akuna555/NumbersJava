package Practice;

import java.util.Scanner;

public class LoginMathod {
    public static void main (String[] args){
        login("oksanaJava","1223456");

    }
    public  static void login(String givenId, String givenPassword){
        String expectedId= "oksanaJava";
        String expectedPassword = "123456";
        System.out.println("You have pressed login button");
        System.out.println("Please enter user name: ");
        Scanner scan = new Scanner(System.in);
        givenId = scan.nextLine();
        System.out.println("Please enter your password");
        givenPassword = scan.nextLine();

        if(expectedId.equals(givenId) && expectedPassword.equals(givenPassword)){
            System.out.println("Login Successful!!!");
        }else{
            System.out.println("Either the Id or password incorect.");
        }

    }
}
