package gr.aueb.cf.ch3;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Exrcs2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int inputNum = 0;

        System.out.println("Write an integer thats between 0 - 5");
        inputNum = scanner.nextInt();


        while(true){
            if (inputNum < 0 || inputNum > 5) {
                System.out.println("Wrong Number !\n Write an integer thats between 0 - 5");
                inputNum = scanner.nextInt();
                continue;
            }else  if(inputNum == 1){
                System.out.println("Επιλεξατε εισαγωγη");
                inputNum = scanner.nextInt();
                continue;
            }else if (inputNum == 2){
                System.out.println("Επιλεξατε Διαγραφη");
                inputNum = scanner.nextInt();
                continue;
            }else if (inputNum == 3){
                System.out.println("Επιλεξατε Ενημερωση");
                inputNum = scanner.nextInt();
                continue;
            }else if (inputNum == 4){
                System.out.println("Επιλεξατε αναζητηση");
                inputNum = scanner.nextInt();
                continue;
            }else {
                System.out.println("επιλεξατε εξοδος ");
                break;
            }
        }



    }
}




