
import java.util.Scanner;

public class MainProgram {

    public static void main(String[] args) {

        /*
        Two classes, Person and Pet, are included in the exercise template. Each person has one pet.
        Modify the public String toString method of the Person class so that the string it returns tells
        the pet's name and breed in addition to the person's own name.

        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);
        Sample output
        Leo, has a friend called Lucy (golden retriever)
        */

        Pet lucy = new Pet("Lucy", "golden retriever");
        Person leo = new Person("Leo", lucy);

        System.out.println(leo);
    }
}
