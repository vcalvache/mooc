
import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Write your program here -- consider breaking the program into 
        // multiple classes.
        int countGrades = 0;
        int sumAverage = 0;
        int sumPassedGrade = 0;
        int passedGradeCount = 0;
        ArrayList<Integer> grades = new ArrayList<>();

        System.out.println("Enter point totals, -1 stops:");
        while (true){
            int givenNumber = Integer.valueOf(scanner.nextLine());

            if (givenNumber == -1){
                break;
            }
            
            if (givenNumber >= 0 && givenNumber <=100){
                sumAverage += givenNumber;
                countGrades++;
                grades.add(givenNumber);
                if (givenNumber >= 50){
                    sumPassedGrade += givenNumber;
                    passedGradeCount++;
                }
            }
        }
        GradeStatistics.pointAverageAll(sumAverage, countGrades);
        GradeStatistics.pointAveragePassing(sumPassedGrade, passedGradeCount);
        GradeStatistics.passPercentage(grades);
        GradeStatistics.gradeDistribution(grades);
    }
}
