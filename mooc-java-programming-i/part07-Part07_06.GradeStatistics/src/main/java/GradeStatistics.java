import java.lang.reflect.Array;
import java.util.ArrayList;

public class GradeStatistics {
    
    public static void pointAverageAll(int sumAverage, int countGrades){
        System.out.println("Point average (all): " + ((double) sumAverage / countGrades));
    }

    public static void pointAveragePassing(int sumPassedGrade, int passedGradeCount){
        if (passedGradeCount > 0){
            System.out.println("Point average (passing): " + ((double) sumPassedGrade / passedGradeCount));
        } else {
            System.out.println("Point average (passing): -");
        }
    }

    public static void passPercentage(ArrayList<Integer> grades){
        double participants = grades.size();
        double passingParticipants = 0;

        for (int i = 0; i < grades.size(); i++){
            if (grades.get(i) >= 50){
                passingParticipants++;
            }
        }
        System.out.println("Pass percentage: " + ((100 * passingParticipants) / participants));
    }

    public static void gradeDistribution(ArrayList<Integer> grades){
        int gradeFailed = 0;
        int gradeOne = 0;
        int gradeTwo = 0;
        int gradeThree = 0;
        int gradeFour = 0;
        int gradeFive = 0;

        for (int grade: grades){
            if (grade < 50){
                gradeFailed++;
            } else if (grade <60){
                gradeOne++;
            } else if (grade <70){
                gradeTwo++;
            } else if (grade <80 ){
                gradeThree++;
            } else if (grade < 90){
                gradeFour++;
            } else if (grade >= 90){
                gradeFive++;
            }
        }
       ArrayList<Integer> gradeDistribution = new ArrayList<>();
       gradeDistribution.add(gradeFailed);
       gradeDistribution.add(gradeOne);
       gradeDistribution.add(gradeTwo);
       gradeDistribution.add(gradeThree);
       gradeDistribution.add(gradeFour);
       gradeDistribution.add(gradeFive);

       for (int i = 5; i >= 0; i--){
            System.out.println(i +": " + printStars(gradeDistribution.get(i)));
       }
    }

    public static String printStars(int num){
        String stars = "";
        for (int i = 0; i < num; i++){
            stars +="*";
        }
        return stars;
    }
}
