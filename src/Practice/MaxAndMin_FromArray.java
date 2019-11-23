package Practice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class MaxAndMin_FromArray {
    public static void main(String[] args) {
        int[] number= {3,4,567,76,2789,};
        Arrays.sort(number);
        System.out.println("Min number -> " + number[0]);
        System.out.println("Max number -> "+ number[number.length-1]);
    }
}
