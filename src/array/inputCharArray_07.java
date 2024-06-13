package basicdatastructures.array;

import java.util.Scanner;

public class inputCharArray_07 {
    public static void main(String[] args) {
        int size = 5;
        char[] chars = new char[size];

        Scanner scanner = new Scanner(System.in);

        // INPUT CHARACTERS INTO ARRAY
        for (int i = 0; i < 5; i++) {
            System.out.print("Character " + i + " : ");
            chars[i] = scanner.next().charAt(0);
        }

        // PRINT CHARACTERS ARRAY
        System.out.print("[");
        for (int i = 0; i < size; i++) {
            if (i < size - 1)
                System.out.print(chars[i] + ", ");
            else
                System.out.print(chars[i]);
        }
        System.out.println("]");

        scanner.close();
    }
}
