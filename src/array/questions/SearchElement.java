package array.questions;

import java.util.Scanner;

public class SearchElement {
    static boolean flag = false;

    public static boolean searchElement(int[] numbers, int n) {
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == n) {
                flag = true;
            }
        }

        return flag;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("Enter number : ");
        int n = sc.nextInt();

        searchElement(numbers, n);

        if (flag == true) {
            System.out.printf("%d found in array", n);
        } else {
            System.out.printf("%d not found in array", n);
        }

    }
}
