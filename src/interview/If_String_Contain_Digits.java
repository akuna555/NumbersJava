package interview;

public class If_String_Contain_Digits {
    public static void main(String[] args) {
        String str ="12345";
        String str2 ="245klu";
        System.out.println( containsOnlyNumbers(str));
        System.out.println( containsOnlyNumbers(str2));
}
    public static boolean containsOnlyNumbers(String str){
        for(int i=0; i < str.length();i++){
            if(!Character.isDigit(str.charAt(i))){
                return false;
            }
        }
        return true;
    }
}
