package Practice;

public class GoogleResultCount {
    public static void main(String[] args) {
        String result ="About 691,000,0000 result (0.78 seconds)";
        System.out.println(ressultCount(result));
    }
    public static String ressultCount(String str){
        String [] split = str.split(" ");
        String resultCount = split[3];
        String resultwothoutComa = resultCount.replaceAll(",","");
        return resultwothoutComa;
    }
}
