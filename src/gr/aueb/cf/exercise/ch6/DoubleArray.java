package gr.aueb.cf.exercise.ch6;

import java.util.Arrays;

public class DoubleArray {

    public static void main(String[] args) {
        int[][] arr = {{1012, 1136}, {1317, 1417} , {1015, 1020}};
        int result = maxCars(arr);
        System.out.println(result);
    }


    public static int maxCars(int[][] parkingTimes) {
        // Δημιουργία πίνακα για όλες τις ώρες (άφιξη ή αναχώρηση)
        int n = parkingTimes.length;
        int[] times = new int[n * 2]; // Θα αποθηκεύσουμε 2 φορές τον αριθμό των αυτοκινήτων

        // Γεμίζουμε τον πίνακα με ώρες άφιξης και αναχώρησης
        for (int i = 0; i < n; i++) {
            times[i * 2] = parkingTimes[i][0];     // Άφιξη
            times[i * 2 + 1] = parkingTimes[i][1]; // Αναχώρηση
        }

        // Ταξινόμηση των ωρών
        Arrays.sort(times);

        int maxCars = 0;
        int currentCars = 0;

        // Για κάθε ώρα, υπολογίζουμε πόσα αυτοκίνητα είναι παρόντα
        for (int time : times) {
            // Για κάθε αυτοκίνητο που αφίχθη πριν από την τρέχουσα ώρα (ή την ίδια ώρα),
            // αυξάνουμε τον μετρητή
            for (int i = 0; i < n; i++) {
                if (parkingTimes[i][0] == time) {
                    currentCars++;
                } else if (parkingTimes[i][1] == time) {
                    currentCars--;
                }
            }
            // Ενημέρωση του μέγιστου αριθμού αυτοκινήτων
            maxCars = Math.max(maxCars, currentCars);
        }

        return maxCars;
    }




}
