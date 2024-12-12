package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Αντιστρεφει εναν ακεραιο πχ 123 σε 321
 */
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int inputNum = 0;
        int reversed = 0;
        int tempnum = 0;
        int rightDigit = 0;


        System.out.println("Enter a positive number");
      inputNum = sc.nextInt();

      tempnum = inputNum;
      // todo
        while (tempnum > 0){
            rightDigit = tempnum % 10;

            reversed = reversed * 10 + rightDigit;

            tempnum /= 10;
        }
        System.out.printf("The reversed number is %d" ,reversed);
    }
}
