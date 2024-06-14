package recursion;

public class recursion_01 {

    static int count = 1;

    // print function
    public static void print() {
        System.out.println("count " + count);
        count++;

        // if count value is 11 then stop
        if (count == 11)
            return;
        // else continue to print
        else
            print();
    }

    // program start from here
    public static void main(String[] args) {
        //calls line number
        print();
    }
}
