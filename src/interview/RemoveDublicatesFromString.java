package interview;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDublicatesFromString {
    public static void main(String[] args) {
        String str="ookksannnnaaaa";
        StringBuilder build = new StringBuilder(str);
        Set<Character> set = new LinkedHashSet<>();
        for(int i=0; i< str.length();i++){
            set.add(str.charAt(i));
        }
        for(Character c: set){
            build.append(c);
        }
        System.out.println(set);
    }
}
