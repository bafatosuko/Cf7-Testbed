package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Υπαρχει ενα Secret που ειναι integer και ο χρηστης προσπαθει να τον βρει
 * με μια μονο προσπαθεια.
 */
public class SecretFinder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = 0;
        final int SECRET = 12;

        System.out.println("Insert a num to guess the secret");
        num = scanner.nextInt();

        if (num == SECRET) {
            System.out.println("You guess the correct number");
        } else {
            System.out.println("Failed !!");
        }
    }
}
