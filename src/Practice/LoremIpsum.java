package Practice;

public class LoremIpsum {
    public static void main(String[] args) {
        String str="Lorem ipsum dolor sit amet, consecteur adipiscing elit, sed do eiusom tempor."
              +  " incididut ut labore."
                      +"Cursus turnip massa tincidunt dui ut"+"Get me along.";
        System.out.println(doesContain(str));


    }
    public static boolean doesContain(String str){
        String [] split = str.split("\\.");
        String thirdSentence = split[2];
        if(thirdSentence.contains("massa")){
            return true;
        }else{
            return false;
        }
    }
}
