package interview;

public class UniqueChar {
    public static void main(String[] args) {
        String str ="gaaaasoooopkkkl";
        String unique= "";
        for(int i=0; i<str.length();i++){
            if(!unique.contains(str.charAt(i)+ "")){
                unique+=str.charAt(i);

            }
        }
        System.out.println(unique);
    }
}
