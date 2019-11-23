package Practice;

import java.util.Arrays;

public class GroceryList {
    public static void main(String[] args) {
        String [] groceryList= {"apple","carrot","orange","cherry","strawbery"};
        Arrays.sort(groceryList);
        System.out.println("Index number of apple is : "+ Arrays.binarySearch(groceryList,"apple"));
        System.out.println("Index number of apple is : "+ Arrays.binarySearch(groceryList,"strawbery"));
    }
}
