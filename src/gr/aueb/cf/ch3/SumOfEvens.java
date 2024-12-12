package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπολογιζει το αθροισμα των αρτιων απο το 2
 * μεχρι ενα οριο που δινει ο χρηστης
 */
public class SumOfEvens {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int limit = 0;
        int sum = 0;
        int i = 2;

        System.out.println("Insert  upper limit");
        limit = in.nextInt();

        // sum ??
        while ( i <= limit){
            sum += i;
            i += 2;
        }

        System.out.println("The num of even number up to " + sum);
    }
}
