package gr.aueb.cf.ch2;

import java.util.Scanner;

public class EurpUsdConverter {
    public static void main(String[] args) {

        int eur = 0;
        int dolars = 0;
        int cents = 0;
        final int p = 99;

        Scanner in = new Scanner(System.in);
        // Entoles
        System.out.println("Please put euro to convert it to dolars and cents");
        eur = in.nextInt();
        dolars = (eur * p) / 100;
        cents = (eur * p) % 100;

        // Ektypwsh
        System.out.printf("Τα %d ευρω σας: εγιναν %d dolars και %d cents", eur, dolars, cents);



    }
}
