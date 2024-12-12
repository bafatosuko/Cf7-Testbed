package gr.aueb.cf.ch1;

/**
 * Calculate of two intigers and prints the results!
 */
public class AddApp {
    public static void main(String[] args) {
        // δηλωση και αρχικοποιηση  Μεταβλητών!
        int num1 = 5;
        int num2 = 12;
        int result = 0;

        // 2) Εντολές
        result = num1 + num2 ;

        // Εκτύπωση του αποτελέσματος
        System.out.println("Το αποτελεσμα ειναι " + result);
        System.out.printf("Το αθροισμα %d, %d ειναι ισο με: %d", num1, num2,result);

    }
}
