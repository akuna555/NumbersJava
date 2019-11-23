package Practice;

public class Over {
    public static void main(String[] args) {
        String str ="oksana";
        for(int i=0; i<str.length();i++){
            for(int j=0; j< str.length();j++){
                if(str.charAt(i) ==  str.charAt(j)){
                    System.out.print(str.charAt(j)+ "");
                }
            }
        }

    }
}
