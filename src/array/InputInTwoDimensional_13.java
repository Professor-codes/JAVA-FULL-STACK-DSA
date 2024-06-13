package basicdatastructures.array;

import java.util.Scanner;

public class InputInTwoDimensional_13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        char[][] alphabet = new char[3][3];

        // ARRAY SIZE = ROW SIZE (3)
        for (int i = 0; i < alphabet.length; i++) {
            // ARRAY SIZE = ROW OF ARRAY SIZE
            for (int j = 0; j < alphabet[i].length; j++) {
                alphabet[i][j] = sc.next().charAt(0);
            }
        }

        // PRINT ARRAY
        System.out.println("[");
        for (int i = 0; i < alphabet.length; i++) {
            System.out.print("  [");
            for (int j = 0; j < alphabet[i].length; j++) {
                System.out.print(alphabet[i][j]);
                if (j < alphabet[i].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.print("]");
            if (i < alphabet.length - 1) {
                System.out.println(",");
            } else {
                System.out.println();
            }
        }
        System.out.println("]");
    }
}
