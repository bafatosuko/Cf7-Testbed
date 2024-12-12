package gr.aueb.cf.exercise.ch7;

import java.util.Scanner;

public class firstExercise {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Εισάγετε το κείμενο προς κρυπτογράφηση: ");
        String textToEncrypt = scanner.nextLine();

        String encryptedText = encrypt(textToEncrypt);
        System.out.println("Κρυπτογραφημένο κείμενο: " + encryptedText);

//        System.out.print("Εισάγετε το κείμενο προς αποκρυπτογράφηση: ");

        String decryptedText = decrypt(encryptedText);
        System.out.println("Αποκρυπτογραφημένο κείμενο: " + decryptedText);

        scanner.close();

    }


        public static String encrypt(String input) {
            StringBuilder encrypted = new StringBuilder();

            for (char c : input.toCharArray()) {
                encrypted.append((char) (c + 1)); // Μετατόπιση του χαρακτήρα κατά 1
            }

            return encrypted.toString();
        }



        public static String decrypt(String input) {
            StringBuilder decrypted = new StringBuilder();

            for (char c : input.toCharArray()) {
                decrypted.append((char) (c - 1)); // Μετατόπιση του χαρακτήρα κατά -1
            }

            return decrypted.toString();
        }
}
