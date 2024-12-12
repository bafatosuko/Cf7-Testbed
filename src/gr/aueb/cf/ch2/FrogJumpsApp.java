package gr.aueb.cf.ch2;

/**
 * X = 10
 * Y = 85
 * D = 30
 *
 * Jumps 3
 * 10 + 30 = 40
 * 40 + 30 = 70
 *
 */
public class FrogJumpsApp {
    public static void main(String[] args) {
        int target = 85;
        int start = 10;
        int jumpDistance = 30;
        int jumps = 0;

        // Calculates jumps
//        int smth =   (target - start) % jumpDistance;
//        if( smth == 0) {
//            jumps = (target - start) / jumpDistance;
//        } else {
//            jumps = (target - start) / jumpDistance  + 1;
//        }

        jumps = (int) Math.ceil((double) (target - start) /  jumpDistance);

        System.out.printf("Jumps: " + jumps);
    }
}
