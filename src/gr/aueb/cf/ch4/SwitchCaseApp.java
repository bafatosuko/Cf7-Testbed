package gr.aueb.cf.ch4;

import java.util.Scanner;

public class SwitchCaseApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("Επιλεξτε ενα απο τα παρακατω");
            System.out.println("1, One-playergame");
            System.out.println("2. Two-player game");
            System.out.println("3. Team game");
            System.out.println("4, quit");

            choice = scanner .nextInt();
            if(choice < 1 || choice > 4){
                System.out.println("Choise must be between 1-4");
                System.out.println("try again");
                continue;
            }


//            if(choice == 1){
//                System.out.println("one-player game stardet.");
//            }else if(choice == 2){
//                System.out.println("Two-player game started");
//            }else if (choice == 3){
//                System.out.println("Team game started");
//            }else {
//                System.out.println("Quitiing...");
//            }

            switch (choice){
                case 1:
                    System.out.println("one-player game stardet.");
                    break;
                case 2:
                    System.out.println("Two-player game started");
                    break;
                case 3:
                    System.out.println("Team game started");
                    break;
                case 4:
                    System.out.println("Quitiing...");
                    break;



            }



        }while (choice != 4);
    }
}
