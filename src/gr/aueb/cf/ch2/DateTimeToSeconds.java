package gr.aueb.cf.ch2;

import java.util.Scanner;

public class DateTimeToSeconds {
    public static void main(String[] args) {

        int dates = 0;
        int hours = 0;
        int minutes = 0;
        int seconds = 0;
        int totalHoursToSecs;
        int totalDateToSecs;
        int totalMinutesToSecs;
        int totalSecs = 0;



        // Entoles
        Scanner in = new Scanner(System.in);
        System.out.println("Γραψτες Μερεσ: Ωρες: Λεπτα: και Δευτερολεπτα:");
        dates = in.nextInt();
        hours = in.nextInt();
        minutes = in.nextInt();
        seconds = in.nextInt();
        totalDateToSecs = dates * 24 * 60 * 60;
        totalHoursToSecs = hours * 60 * 60;
        totalMinutesToSecs = minutes * 60 ;
        totalSecs = totalDateToSecs + totalHoursToSecs + totalMinutesToSecs + seconds ;

        System.out.printf("Ειναι τοσα δευτερολεπτα %d" , totalSecs);






    }
}
