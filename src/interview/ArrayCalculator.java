package interview;

public class ArrayCalculator {
    public static void main(String[] args) {
        int[] array = {1,2,76,43,99,98,54};
        calculate(array);
    }
    public static void calculate(int[] arr){
        for(int i=0;i <arr.length;i++){
            for(int j= i+1; j< arr.length;j++){
                int sum = arr[i]+arr[j];
                if(sum==100){
                    System.out.println(arr[i]+ "+"+ arr[j]+ "="+ sum);
                }else{

                }

            }
        }
    }
}
