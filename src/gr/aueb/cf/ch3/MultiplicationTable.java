package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 *  δινει ως output τον πολλαπλασιασμο ενος ακεραιου
 *  που δινει ο χρηστης με ολους τους ακεραιους απο 1 εως 10
 */
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;
        int i = 1;
//        int sum = 0;

        System.out.println("enter an integer");
        inputNum = scanner.nextInt();

        while(i <= 10){


            System.out.printf("%d * %d = %2d", inputNum, i ,inputNum * i);
            i++;
        }


    }
}
