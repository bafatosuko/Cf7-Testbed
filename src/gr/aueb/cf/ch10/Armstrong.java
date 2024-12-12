package gr.aueb.cf.ch10;

import java.util.Scanner;

/**
 * 153 => 1^3 + 5^3 + 3^3
 */
public class Armstrong {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num ;
//        int count = 0;
        int sum = 0;
        int numberOfDigits;
        int originalNum;
        int digit;

        System.out.println("Write a number to see if its Armstrong.");
        num = scanner.nextInt();
        numberOfDigits = String.valueOf(num).length(); // valueof transforms a primitive to a string
        originalNum = num;



        while ( num != 0) {
            digit = num % 10;
            sum += (int) Math.pow(digit, numberOfDigits);
            num  /= 10;
        }

        if (sum == originalNum) System.out.println("The number you type is armstrong");
        else System.out.println("The number you type is not armstrong");

    }
}
