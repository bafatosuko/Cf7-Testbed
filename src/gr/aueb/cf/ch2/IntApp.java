package gr.aueb.cf.ch2;

/**
 * Εμφανιζει τους τυπους δεδομενων ακεραιων
 * int, byte, short, long μαζι με το μεγεθος τους
 */
public class IntApp {
    public static void main(String[] args) {
        System.out.printf("int: Size: %d, Min: %d, Max: %d", Integer.BYTES * 8, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }
}
