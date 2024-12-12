package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * να λαμβανει ως ινπουτ απο τον χρηστη ενα διψηφιο ακεραιο και να
 * υπολογιζει και να εκτυπωνει το αθροισμα τον ψηφιων
 */



public class DigitsSum {
    public static void main(String[] args) {
        // 1)
        int input;
        int leftDigit;
        int rightDigit;
        int sum;

        Scanner in = new Scanner(System.in);

        System.out.println("Δωστε εναν διψηφιο ακεραιο:");
        input = in.nextInt();
        leftDigit = input / 10;
        rightDigit = input % 10;
        sum = leftDigit + rightDigit;

        System.out.printf("Ο Αριστερος αριθμος ειναι %d και ο δεξιος %d και το αθροισμα %d",leftDigit, rightDigit, sum);


    }
}
