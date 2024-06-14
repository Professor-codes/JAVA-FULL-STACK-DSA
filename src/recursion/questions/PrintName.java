package recursion.questions;

import java.util.Scanner;

// PRINT NAME N TIMES USING RECURSION
public class PrintName {

    public static void print(int i, int n) {

        // System.out.println("i : " + i + " | " + "n : " + n);

        if (i > n)
            return;
        else {
            System.out.println("hello");
            print(i + 1, n);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Value of n : ");
        int n = sc.nextInt();

        int i = 1;

        print(i, n);
    }
}
