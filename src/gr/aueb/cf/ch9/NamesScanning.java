package gr.aueb.cf.ch9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;

/**
 * Διαβαζει απο ενα αρχειο δεδομενα
 */
public class NamesScanning {

//    public static void main(String[] args) {
//        String inFilePath = "C:/Users/thomas/Desktop/tmp/file8.txt";
//        String OutFilePath = "C:/Users/thomas/Desktop/tmp/file8-out.txt";
//        String line;
//        String[] tokens;
//
//
//        try (BufferedReader reader = new BufferedReader(new FileReader(inFilePath));
//             PrintStream ps = new PrintStream(OutFilePath, StandardCharsets.UTF_8)){
//
//            while ((line = reader.readLine()) != null) {
//                tokens = line.split(",+\\s*");
//
////                ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }", tokens[0], tokens[1], tokens[2] );
//                printFormatted(ps, tokens);
//                printFormatted(System.out, tokens)
//            }
//
//
//        } catch (IOException e) {
//            System.err.println(e.getMessage());
//
//        }
//
//
//    }
//
//    public static void printFormatted(String ps){
//        ps.printf("{ \"Firstname\": \"%s\", \"Lastname\": \"%s\", \"City\": \"%s\" }", tokens[0], tokens[1], tokens[2] )
//
//    }
}
