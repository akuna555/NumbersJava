package interview;

public class SwapNumber {
    public static void main(String[] args) {
        int a = 10;
        int b = 5;
        System.out.println("Before swap--> a = "+ a);
        System.out.println("Before swap--> b = "+ b);
        System.out.println("=======================");
        b=a+b;
        a=b-a;
        b=b-a;
        System.out.println("After swap--> a = "+ a);
        System.out.println("After swap--> b = "+ b);


    }
}
