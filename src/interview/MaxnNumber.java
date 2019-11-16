package interview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class MaxnNumber {
    public static void main(String[] args) {
        int[] intArr = {74,8,12,25,56};
        Arrays.sort(intArr);
        System.out.println("min of array: "+ intArr[0]);
        System.out.println("Max of array: "+ intArr[intArr.length-1]);

        //TODO:the other way
        List<Integer> list = Arrays.asList(74,8,12,3,456,65);
        Collections.sort(list);
        System.out.println("m->"+ list.get(0));
        System.out.println("Max-> "+ list.get(list.size()-1));
    }
}
