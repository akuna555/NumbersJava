package Practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Apple {
    public static void main(String[] args) {
        //Ask from user names 5 times and store theminto list
        Scanner scan = new Scanner(System.in);
        List<String> names = new ArrayList<>();
        for(int i=0; i<=5;i++){
            System.out.println("Please enter name -> " + (i)+ ":");
            String name =scan.nextLine();
            names.add(name);
        }

        System.out.println(names);

    }

}
