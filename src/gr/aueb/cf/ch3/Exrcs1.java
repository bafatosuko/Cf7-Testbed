package gr.aueb.cf.ch3;

import java.util.Scanner;

public class Exrcs1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputYear = 0;

        System.out.println("Write a year !");
        inputYear = scanner.nextInt();

        if( (inputYear % 4 == 0 && inputYear % 100 != 0) || inputYear % 400 != 0 ){
            System.out.println("Year " + inputYear + " is bisection");
        }else {
            System.out.println("Year " + inputYear + " is not bisection");
        }
    }
}
