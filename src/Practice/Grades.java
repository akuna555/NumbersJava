package Practice;

public class Grades {
    public static void main(String[] args) {
        int [] grades = {55,23,24,1,500,441,233,122,333,999,1};
        int minGrade=grades[0];
        int maxGrade = grades[0];
        for(int i=0; i< grades.length;i++){
            if(maxGrade<grades[i]){
                maxGrade=grades[i];
            }else if(minGrade>grades[i]){
                minGrade=grades[i];
            }
        }
        System.out.println("Max grade --> " + maxGrade);
        System.out.println("Min grade --> "+ minGrade);
    }
}
