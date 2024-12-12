package gr.aueb.cf.ch6;

public class ArraysAsCollections {

    public static void main(String[] args) {
        int[] arr = {1, 5, 7, 9 };
        int[] doubleArr = mapToDouble(arr);
        for (int el: doubleArr){
            System.out.print(el + " ");
        }

    }

    // Filltering
    public static int[] getEvens(int[] arr) {
        int count = 0;

        for (int el: arr) {
            if (el % 2 == 0) count++;
        }
        int[] evens = new int[count];


        int pivot = 0;
        for (int el: arr) {
            if (el % 2 == 0 ) {
                evens[pivot++] = el;
            }
        }
        return evens;
    }

    // Mapping
    public static int[] mapToDouble(int[] arr){
        int[] doubleArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++){
            doubleArr[i] = arr[i] * 2;
        }
        return doubleArr;
    }

    //reducing
    public static int sum(int[] arr) {
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            count +=arr[i];
        }
        return count;
    }

    //Average
    public static double average(int[] arr){
//        double average = 0;
//        average =  (double) sum(arr) / arr.length;
//        return average;

        return sum(arr) / (double) arr.length;
    }


    public static boolean anyEven (int[] arr){
        boolean isAnyEven = false;
        for (int i = 0 ; i < arr.length; i++){
            if(arr[i] % 2 == 0){
                isAnyEven = true;
                break;
            }

        }
        return isAnyEven;
    }

    public static boolean moreThanTwoEvens (int[] arr){
        int count = 0 ;
        boolean moreThanTwoEvens = false;

        for (int i = 0; i < arr.length; i++){
            if (arr[i] % 2 == 0){
                count++;
            }
        }
        if (count > 2) moreThanTwoEvens = true;
        return moreThanTwoEvens;
    }

    public static boolean moreThanTwoConsecutive (int[] arr){
         int count = 0;
        for (int i = 0; i < arr.length -2 ; i++){
            if (arr[i] == arr[i] - 1 && arr[i] == arr[i+2] -2  ){
                count++;
                break;
            }
        }
        return count > 0;
    }

    public static boolean moreThanTwoWithSameEnding(int[] arr){
//        int count = 0;
//        for (int i = 0; i < arr.length; i++){
//            if(arr[i] % 10 == arr[i+1] % 10 && arr[i] % 10 == arr[i+2] % 10)
//            {
//                count++;
//            }
//        }
//        return count > 0;


        int[] ending = new int[10];
        boolean isSameEnding = false;

        for ( int num: arr) {
            ending[num % 10]++;
        }

        for (int count: ending) {
            if (count >= 3) {
                isSameEnding = true;
                break;
            }
        }
        return  isSameEnding;

    }

    public static boolean AllAreEven (int[] arr){
//        return getEvens(arr).length == arr.length;

        boolean allEven = false;
        int count = 0;

        for (int el: arr) {
            if (el % 2 == 0) count++;
        }

        return count == arr.length;

    }
}
