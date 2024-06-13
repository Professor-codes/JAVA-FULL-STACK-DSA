package basicdatastructures.array;

import java.util.Scanner;

public class InputElementInArray_06 {
    static Scanner sc = new Scanner(System.in);

    // METHODS
    public static void inputElement(float values[], int size){
        for(int i=0;i<size;i++){
            System.out.print("Element " + i + " : ");
            values[i] = sc.nextFloat();
        }
    }

    public static void printElement(float values[], int size){
        System.out.print("[");
        for(int i=0;i<size;i++){
            if(i<size-1){
                System.out.print(values[i] + ", ");
            }else{
                System.out.println(values[i]);
            }
        }
        System.out.print("]");
    }

    public static void main(String[] args) {
        float values[] = new float[10];

        System.out.print("Array size : ");
        int size = sc.nextInt();

        // METHOD CALL
        inputElement(values, size);
        printElement(values, size);
    }
}
