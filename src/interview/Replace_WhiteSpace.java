package interview;

public class Replace_WhiteSpace {
    public static void main(String[] args) {
        String str ="   I love   to study    and I love   learn Java ve ry     much";
        System.out.println(str);
        System.out.println("=======================");
        System.out.println(str.replaceAll("\\s",""));
    }
}
