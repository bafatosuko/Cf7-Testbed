package gr.aueb.cf.ch5;

public class PowerAppRecursive {

    public static void main(String[] args) {

    }

    public static int power(int a, int n){
        return (n == 0) ? 1 : a * power(a, n-1);
    }
}
