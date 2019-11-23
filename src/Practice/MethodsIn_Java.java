package Practice;

import java.util.Arrays;

public class MethodsIn_Java {
    public static void main(String[] args) {
        System.out.println("Program starting");
        sayHi();
        sayBy();
        //invoke the method or call the method
      //  int [][] muNUmbers= {{23,45,34,67,89},{657,7789,90,800},{1,2,3,4,5,6}};
      //  printDoubleArray(muNUmbers);
        int[] nums={22,23,45,34,546,34,2};
        meToString(nums);

    }
    public static void sayHi(){
        System.out.println("I am telling you Hi");
    }
    public static void sayBy(){
        System.out.println("Good bye");
    }
    public static void printDoubleArray(int [][] numbers){
        for(int i=0; i< numbers.length;i++){
            System.out.println(Arrays.toString(numbers[i]));
        }
    }
    public static void meToString(int [] nums){
        String result ="[";
        for(int i=0;i<nums.length;i++){
            if(i==nums.length-1){
              result+=nums[i]+"]";
          }else{
              result+=nums[i]+", ";
          }
        }
        System.out.println(result);
    }
}
