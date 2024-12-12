package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * Turn lights on, if it is raining
 * AND car is running (>100) OR is dark
 */
public class LightsOn {
    public static void main(String[] args) {
        boolean isLightsOn = false;
        boolean isRaining = false;
        boolean isDark = false;
        int running = 0;

        Scanner in = new Scanner(System.in);

        System.out.println("Is it raining?");
        isRaining = in.nextBoolean();
        System.out.println("IS dark");
        isDark = in.nextBoolean();
        System.out.println("How much is the car running");
        running = in.nextInt();

        isLightsOn = isRaining && (isDark || running > 100); 

        System.out.printf("The lights are on : %b", isLightsOn);
    }
}
