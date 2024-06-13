package array;

public class DemoArray_00 {
    public static void main(String[] args) {
        // SYNTAX
        // data_type[] variable_name = new data_type[size];

        // int[] arr1 = new int[5];
        // int arr2[] = new int[5];

        int[] arr;  // DECLARATION OF ARRAY • arr IS DEFINED IN THE STACK
        arr = new int[5];   // INITIALIZATION OF ARRAY • OBJECT IS BEING CREATED IN THE HEAP

        int[] marks = new int[5];
        System.out.println(marks[0]);   // 0

        String[] names = new String[1];
        System.out.println(names[0]);   // null

    }
}
