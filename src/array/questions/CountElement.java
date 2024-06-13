package array.questions;

import java.util.Scanner;

public class CountElement {
    static int count = 0;

    public static int countElement(String[] names, String n, int count) {
        for (int i = 0; i < names.length; i++) {
            if (names[i].equals(n)) {
                count++;
            }
        }
        if (count > 0) {
            System.out.println(n + " (" + count + ")");
        }
        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] names = {"c", "c++", "java", "java", "java", "html", "css", "python", "javascript"};

        System.out.print("Enter name : ");
        String n = sc.next();

        countElement(names, n, count);

    }
}
