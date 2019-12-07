package Practice;

public class ExtractDigitsFromString {
    public static void main(String[] args) {
        String str="abd8539-jfkdl";
        str=str.replaceAll("\\D","");
        System.out.println(str);
    }
}
