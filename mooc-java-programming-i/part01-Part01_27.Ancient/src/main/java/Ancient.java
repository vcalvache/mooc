
import java.util.Scanner;

import javax.xml.transform.Source;

public class Ancient {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        // Write your program here
        System.out.println("Give a year:");
        int givenNumber = Integer.valueOf(scan.nextLine());
        if (givenNumber < 2015){
            System.out.println("Ancient history!");
        }
    }
}