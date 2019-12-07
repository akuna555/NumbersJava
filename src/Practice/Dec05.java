package Practice;

public class Dec05 {
    public static void main(String[] args) {
        int [] arr1 = {8,9,7,5,6,1,4,2};
        System.out.println("MIssing number from array arr1 --> " + missingNumber(arr1));

    }
    public static int missingNumber(int[] arr){
        int n = arr.length +1;
        int sum = n * ( n+ 1) / 2;
        int resultSum =0;
        for(int i=0; i< arr.length;i++){
            resultSum+=arr[i];
        }
        int missimgNumber = sum - resultSum;
        return missimgNumber;
    }
}
