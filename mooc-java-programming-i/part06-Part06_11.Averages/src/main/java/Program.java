
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        GradeRegister register = new GradeRegister();

        UserInterface ui = new UserInterface(register, scanner);
        ui.start();
        //GradeRegister register = new GradeRegister();
        //register.addGradeBasedOnPoints(93);
        //register.addGradeBasedOnPoints(91);
        //register.addGradeBasedOnPoints(92);
        //egister.addGradeBasedOnPoints(88);

        //System.out.println(register.averageOfGrades());

        //GradeRegister examPoints = new GradeRegister();
        //examPoints.addGradeBasedOnPoints(93);
        //examPoints.addGradeBasedOnPoints(91);
        //examPoints.addGradeBasedOnPoints(92);

        //System.out.println(examPoints.averageOfPoints());
    }
}