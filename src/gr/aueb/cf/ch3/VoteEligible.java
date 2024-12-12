package gr.aueb.cf.ch3;

import java.util.Scanner;

/**
 * δικαιωμα ψηφου  σε ηληκιες > 18
 */
public class VoteEligible {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        final  int VOTING_AGE  = 18; // Παντα κεφαλαια
        int age = 0;
        boolean isVoteEligible = false;

        System.out.println("What is your age?");
        age = in.nextInt();
        isVoteEligible = age > VOTING_AGE;

        System.out.printf("You are age: %d is eligible to vote : %b", age,isVoteEligible );

    }

}
