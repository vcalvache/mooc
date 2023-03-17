
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int grade = 0;
        System.out.println("Give points [0-100]");
        int givenPoints = Integer.valueOf(scan.nextLine());
        if (givenPoints > 100){
            System.out.println("incredible!");
        } else if (givenPoints > 89){
            grade = 5;
            System.out.println("Grade: " + grade);
        } else if (givenPoints > 79){
            grade = 4;
            System.out.println("Grade: " + grade);
        } else if (givenPoints > 69){
            grade = 3;
            System.out.println("Grade: " + grade);
        } else if(givenPoints > 59){
            grade = 2;
            System.out.println("Grade: " + grade);
        } else if (givenPoints >= 50){
            grade = 1;
            System.out.println("Grade: " + grade);
        } else if (givenPoints >= 0){
            System.out.println("Grade: failed");
        } else if (givenPoints < 0){
            System.out.println("Grade: imposible!");
        }
    }
}