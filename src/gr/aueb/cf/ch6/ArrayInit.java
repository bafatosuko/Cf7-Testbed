package gr.aueb.cf.ch6;

/**
 * δηλσωη και αρχιποιηση ενος πινακα
 * populate  ενα πινακα
 * new
 * unisized init
 * array initializer]
 * print τα στοιχεια ενος πινακα
 */

public class ArrayInit{

    public static void main(String[] args) {
        int[] arr = new int[3];            // declare and init
        int[] arr2 = {1, 2, 3, 4 , 5};         // unsized initialation
        int[] arr3 = new int[] {1, 2, 3 ,4 , 5};    // array initialization

        // populate
        arr[0] = 5;
        arr[1] = 10;
        arr[2] = 4;

        // traverse
        for (int i = 0;  i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        // Enhanced for
        for (int el: arr3){
            System.out.println(el + " ");
        }
    }
}
