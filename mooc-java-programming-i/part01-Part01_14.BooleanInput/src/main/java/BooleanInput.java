
import java.util.Scanner;

import javax.sound.midi.Soundbank;

public class BooleanInput {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // write your program here
        System.out.println("Write something:");
        boolean text = Boolean.valueOf(input.nextLine());
        System.out.println("True or false? " + text);

    }
}