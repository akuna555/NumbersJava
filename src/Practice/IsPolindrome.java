package Practice;

public class IsPolindrome {
    public static void main(String[] args) {
        String str= "civic";
        System.out.println(isPolindrome(str));

    }
    public static boolean isPolindrome(String name){
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
            reverse+=name.charAt(i);
        }
        if(reverse.equalsIgnoreCase(name)){
            return true;

        }else{
            return false;
        }
    }
}
