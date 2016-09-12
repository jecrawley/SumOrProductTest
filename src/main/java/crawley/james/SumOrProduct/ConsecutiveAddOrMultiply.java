package crawley.james.SumOrProduct;

import java.util.Scanner;

/**
 * Created by jamescrawley on 9/9/16.
 */
public class ConsecutiveAddOrMultiply {

    Scanner scan = new Scanner(System.in);
    int number;

    public ConsecutiveAddOrMultiply() {

    }

    public int consecutiveAdd(int n) {
        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public int consecutiveMultiply(int n) {
        int product = 1;

        for (int i = 2; i <= n; i++) {
            product *= i;
        }
        return product;
    }

    public void addOrMultiply(String addOrMult, int n) {

        if (addOrMult.equals("add")) {
            System.out.println("The added value is: " + consecutiveAdd(n));
        } else if (addOrMult.equals("multiply")) {
            System.out.println("The multiplied value is: " + consecutiveMultiply(n));
        }
        scan.close();
    }

    public void getValidNumberFromUser() {

        try {
            number = Integer.parseInt(scan.next());
        } catch (java.lang.NumberFormatException e) {
            System.out.println("Please input an integer.");
            getValidNumberFromUser();
        }
    }

    public void getValidStringFromUser(String addOrMult, int n) {
        String lowercaseAddOrMult = addOrMult.toLowerCase();

        if (lowercaseAddOrMult.equals("add") || lowercaseAddOrMult.equals("multiply")) {
            addOrMultiply(addOrMult, n);
        } else {
            System.out.println("Please input \"add\" or \"multiply\"");
            addOrMult = scan.next().toLowerCase();
            getValidStringFromUser(addOrMult, n);
        }

    }
}
