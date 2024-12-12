package gr.aueb.cf.ch5;

import java.util.Scanner;

public class AddApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a = 0;
        int b = 0 ;
        int sum = 0;
        int sub = 0;

        System.out.println("Please enete two integers");
        a = scanner.nextInt();
        b = scanner.nextInt();

        sum = add(a, b);
        sub =  sub(a,b);

        System.out.println(sum);
        System.out.println(sub);


    }

    /**
     * Adds two integers.
     *
     * @param a the first integer
     * @param b the second integer
     * @return the sum of the two integers
     */
    public static int add (int a, int b){
        return a + b;
    }

    /**
     * Substract two integers
     * @param a the first integer to substract from
     * @param b the second integer tha is substracted
     * @return the sub of the two integers
     */
    public static int sub(int a, int b){
        return a- b;
    }
}
