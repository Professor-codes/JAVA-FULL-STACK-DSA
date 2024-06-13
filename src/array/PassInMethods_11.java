package basicdatastructures.array;

import java.util.Arrays;

public class PassInMethods_11 {

    public static void addElement(int[] arr) {
        arr[5] = 6;
        arr[6] = 7;
        arr[7] = 8;
        arr[8] = 9;
        arr[9] = 10;
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 0, 0, 0, 0, 0};
        System.out.println(Arrays.toString(arr));

        addElement(arr);
        System.out.println(Arrays.toString(arr));
    }
}
