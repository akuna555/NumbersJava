package Practice;

public class Miracle {
    public static void main(String[] args) {
   String [] names = {"James","Adam","Obama","Obama care","Oksana"};
   printWordWithSize(names,6);
   int [] nums ={5,6,7,8,90,76};
   printElements(nums);
    }
    public static void printWordWithSize(String [] words, int size){
        for(String word: words){
            if(word.length() ==  size){
                System.out.println(word);
                System.out.println("Hello");
            }
        }

    }
    public static void printElements(int [] nums){
        for(int n:nums){
            System.out.print(n+ ",");
        }
        System.out.println();

        }    }

