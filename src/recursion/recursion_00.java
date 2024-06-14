package recursion;

public class recursion_00 {

    // print function
    public static void print() {
        System.out.println("hello");

        // recursive function
        // calls line number 6
        print();
    }

    // program start from here
    public static void main(String[] args) {
        // calls line number 6
        print();
    }
}
