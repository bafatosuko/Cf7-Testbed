package gr.aueb.cf.ch2;

import java.util.Scanner;

/**
 * Calculates the price with Vat
 */
public class PriceWithVat {
    public static void main(String[] args) {
        final double VAT = 0.24;
        Scanner sc = new Scanner(System.in);
        double price = 0.0;
        double priceWithVat = 0.0;
        double vat = 0.0;

        System.out.println("Please insert a price ");
       price = sc.nextDouble();
       vat = price * VAT ;
       priceWithVat = price + vat;


        System.out.printf("The price is %.2f and with vat is: %.2f", price , priceWithVat );
    }
}
