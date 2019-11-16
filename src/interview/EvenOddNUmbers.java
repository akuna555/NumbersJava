package interview;

import java.util.Scanner;

public class EvenOddNUmbers {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your number ->");
        int number = scan.nextInt();
        if(number % 2 ==0){
            System.out.println(number + " is even");
        }else{
            System.out.println(number+ " is Odd");
        }
    }
}
