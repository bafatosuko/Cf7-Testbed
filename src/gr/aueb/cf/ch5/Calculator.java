package gr.aueb.cf.ch5;

import java.util.Scanner;

/**
 * Εμφανιζει ενα μενου επιλογων (1.προσθεση, 2.αφαιρεση, ...)
 * ο χρηστης επιλεγει.
 * Αναλογα με την επιλογη εκτελειται η αντιστοιχη πραξη
 * και εκτυπωνει το αποτελεσμα
 * Εκτελειται επαναληπτικα μεχρι ο χρηστης να επιλεξει
 * 'Εξοδος'
 */
public class Calculator {

    static  Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        int result;

        while (true){
            printMenu();
            choice = getOneInt();

            if (!isChoiceValid(choice)){
                System.out.println("Error. Choice must between 1- 6. Try again!");
                continue;
            }

            if(choice == 6){
                System.out.println("Εξοδοσ...");
                break;
            }

            result = getResultOnChoice(choice);
            System.out.println("Result: " + result);
        }
    }

    public static  void printMenu(){
        System.out.println("Επιλεξτε ενα απο τα παρακατω:");
        System.out.println("1. Προσθεση");
        System.out.println("2. Αφαιρεση");
        System.out.println("3. Πολαπλασιασμος");
        System.out.println("4. Διαεραιση");
        System.out.println("5. Υπολοιπο διαεραισης");
        System.out.println("6. Εξοδος");
    }

    public static int getOneInt(){
        return scanner.nextInt();
    }

    public  static boolean isChoiceValid(int choice){
        return  choice >= 1 && choice <= 6 ;
    }

    public static int getResultOnChoice(int choice){
        int num1 = 0;
        int num2 = 0;
        int result = 0;
        System.out.println("Παρακαλω εισαγετε δυο ακεραιους");
        num1 = getOneInt();
        num2  = getOneInt();


        switch (choice){
            case 1:
                result = add(num1, num2);
                break;
            case 2:
                result = sub(num1, num2);
                break;
            case 3:
                result = mul(num1, num2);
                break;
            case 4:
                result = div(num1, num2);
                break;
            case 5:
                result = mod(num1, num2);
                break;
            default:
                System.out.println("Error on choice");
                break;
        }
        return result;
    }

    static public  int add(int a, int b){
        return a + b;
    }

    static public  int sub(int a, int b){
        return a - b;
    }

    static public  int mul(int a, int b){
        return a * b;
    }

    static public  int div(int a, int b){
        if(b == 0) return 0;
        return a / b;
    }

    static public  int mod(int a, int b){
        if(b == 0) return 0;
        return a % b;
    }
}
