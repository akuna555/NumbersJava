package Practice;

import java.util.Arrays;

public class IsAnagram {
    public static void main(String[] args) {
        String first= "charm";
        String second = "march";
        System.out.println( isAnagram(first,second));
    }
    public static boolean isAnagram (String str1, String str2){
        if(str1.length()!= str2.length()){
            return false;
        }
        char[] firstArr = str1.toCharArray();
        char[] secondArr = str2.toCharArray();
        Arrays.sort(firstArr);
        Arrays.sort(secondArr);
        for(int i=0; i<firstArr.length;i++){
            if(firstArr[i]!= secondArr[i]){
                return false;
            }
        }
      return true;
    }
}
