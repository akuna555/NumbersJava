package Practice;

import java.util.Arrays;
import java.util.Scanner;

public class CountWrds {
    public static void main(String[] args) {

       Scanner scan = new Scanner(System.in);
        System.out.println("Please, enter sentence to be analyzed: ");
        String str = scan.nextLine();
        countWrds(str);

    }
    public static void countWrds(String str){
        String[] split = str.split(" ");
        String splitArr =Arrays.toString(split);
        System.out.println("The value of the split is as followed-> " + splitArr);
        int numberOfWrds= split.length;
        System.out.println("The number of words in this sentence: "+ numberOfWrds);

    }
}
