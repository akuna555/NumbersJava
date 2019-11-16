package interview;

public class MostFrequent {
    public static void main(String[] args) {
        String str="aaaccfgbbl";
        int lenght = str.length();
        char ch=0;
        int count =0;
        int max =0;
        for(int i=0; i< lenght; i++){
            count =0;
            for(int j=0; j<lenght;j++){
                if(str.charAt(i)== str.charAt(j)){
                    count++;
                }
                if(count > max){
                    max=count;
                    ch=str.charAt(i);
                }
            }
        }
        System.out.println("Charecter is "+ ch + "\nCount is "+ max);
    }
}
