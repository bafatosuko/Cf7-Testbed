package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * λαμβανει μια θερμοκρασια απο τον χρηστη και εμφανιζει
 * καταλληλο μηνυμα.
 */

public class TempApp {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int temp = 0 ;
        boolean isTEmpBelowZero;

        System.out.println("Plase inserte the curretn tempreture");
        temp = in.nextInt();
        

        isTEmpBelowZero = temp < 0;

        System.out.println("Temprature is below zero: " + isTEmpBelowZero);
    }
}
