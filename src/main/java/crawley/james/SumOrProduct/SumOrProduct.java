package crawley.james.SumOrProduct;

import java.util.Scanner;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class SumOrProduct {

    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        ConsecutiveAddOrMultiply operator = new ConsecutiveAddOrMultiply();
        String addOrMult;

        System.out.println("This program will consecutively add or multiply every integer from 1 until a value you choose.");
        System.out.println("Please choose an integer: ");
        operator.getValidNumberFromUser();

        System.out.println("Would you like to add or multiply?");
        addOrMult = scanner.next();
        operator.getValidStringFromUser(addOrMult, operator.number);
        scanner.close();
    }
}
