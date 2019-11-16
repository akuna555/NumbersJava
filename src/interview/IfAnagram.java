package interview;

import java.util.Arrays;

public class IfAnagram {
    public static void main(String[] args) {
        String str= "oksana";
        String str1 ="silent";
        char[] listenArray = str.toCharArray();
        char[] silentArray = str1.toCharArray();
        Arrays.sort(listenArray);
        Arrays.sort(silentArray);
        for(int i=0; i< silentArray.length;i++)
            if (silentArray[i] != listenArray[i]) {
                System.out.println("It is not an anagram");
                break;
            }  else {
                if((i == listenArray.length-1)&&(silentArray[i]== listenArray[i]));
                    System.out.println("Yes,it is anagram");
                    break;

        }
            }
}

