
import java.util.Scanner;

public class GiftTax {

    public static void main(String[] args) {

        /*
        When a gift is given by a close relative or a family member, the amount of gift tax is determined by the following table (source vero.fi):

        Value of gift	Tax at the lower limit	Tax rate(%) for exceeding part
        5 000 — 25 000	100	8
        25 000 — 55 000	1 700	10
        55 000 — 200 000	4 700	12
        200 000 — 1 000 000	22 100	15
        1 000 000 —	142 100	17
        For example 6000€ gift implies 180€ of gift tax (100 + (6000-5000) * 0.08), and 75000€ gift implies 7100€ of gift tax (4700 + (75000-55000) * 0.12).

        Write a program that calculates the gift tax for a gift from a close relative or a family member. This is how the program should work:

        Sample output
        Value of the gift?
        3500
        No tax!

        Sample output
        Value of the gift?
        5000
        Tax: 100.0

        Sample output
        Value of the gift?
        27500
        Tax: 1950.0
        */
        Scanner scan = new Scanner(System.in);
        System.out.println("Value of the gift?");
        double tax = 0;
        int giftValue = Integer.valueOf(scan.nextLine());
        if (giftValue >= 1000000){
            tax = 142100 +((giftValue - 1000000) * 0.17);
            System.out.println("Tax " + tax);
        } else if (giftValue >= 200000 && giftValue < 1000000){
            tax = 22100 +((giftValue - 200000) * 0.15);
            System.out.println("Tax " + tax);
        } else if (giftValue >= 55000 && giftValue < 200000){
            tax = 4700 +((giftValue - 55000) * 0.12);
            System.out.println("Tax " + tax);
        } else if (giftValue >= 25000 && giftValue < 55000){
            tax = 1700 +((giftValue - 25000) * 0.10);
            System.out.println("Tax " + tax);
        } else if (giftValue >= 5000 && giftValue <25000){
            tax = 100 +((giftValue - 5000) * 0.08);
            System.out.println("Tax " + tax);
        } else {
            System.out.println("No tax!");
        }
    }
}
