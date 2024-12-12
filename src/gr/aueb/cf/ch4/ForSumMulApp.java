package gr.aueb.cf.ch4;

/**
 * Calculates sum and nul of the 10 first intigers
 */
public class ForSumMulApp {
    public static void main(String[] args) {
        int sum = 0;
        int nul = 1;

        for(int i = 1; i <= 10; i++){
            sum += i;
            nul *= i;
        }

        System.out.println("Sum: " + sum);
        System.out.println("Nul: " + nul);

    }
}
