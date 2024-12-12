package gr.aueb.cf.ch3;

import java.util.Scanner;

public class GradesApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumGrades = 0;
        int numOfClasses = 0;
        int average = 0;

        System.out.println("Please insert total marks");
        sumGrades = scanner.nextInt();
        if(sumGrades <= 0){
            System.out.println("Total marks must not be 0");
            System.exit(1);
        }
        System.out.println("Please insert  num of classes");
        if(numOfClasses <= 0){
            System.out.println("Classes can not be zero");
            System.exit(1);
        }

        average = sumGrades / numOfClasses;

        if(average > 10){
            System.out.println("Error. The average is not valid is greater than 10");
            System.exit(1);
        }

        if(average >= 9){
            System.out.println("Your grades are awesome");
        }else if(average >= 7 ){
            System.out.println("Your grades are good");
        }else if(average >= 5){
            System.out.println("You need to try better ");
        }else {
            System.out.println("You didnt pass the test");
        }
    }
}
