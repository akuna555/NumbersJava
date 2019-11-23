package Practice;

public class GooleResultTime {
    public static void main(String[] args) {
        String results = "About 1,060,000,000 results (0.74 seconds)";
        System.out.println(resultTime(results));
    }
    public static String resultTime (String str){
        String [] split = str.split("\\(");
        String secondPrt = split[1];
        String without = secondPrt.replaceAll("\\)","");
        return  without;
    }
}
