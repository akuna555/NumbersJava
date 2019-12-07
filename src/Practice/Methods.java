package Practice;

import java.util.*;

public class Methods {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("James");
        list.add("Adam");
        list.add("Elize");
        list.add("Alan");
        list.add("Oksana");
        list.add("Vitalik");
        list.add("Baba");
        System.out.println(list);
        System.out.println("===============================");
        remove(list, 4);

    }

    public static void remove(List<String> myList, int size) {

        for (int i = 0; i < myList.size(); i++) {
            if (myList.get(i).length() == size) {
                myList.remove(i);
            }
        }
        System.out.println(myList);
    }
}