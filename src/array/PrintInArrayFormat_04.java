package basicdatastructures.array;

public class PrintInArrayFormat_04 {
    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};

        System.out.print("[");
        for (int i = 0; i < numbers.length; i++) {
            if (i < numbers.length-1) {
                System.out.print(numbers[i] + ", ");
            }else{
                System.out.print(numbers[i]);
            }
        }
        System.out.print("]");
    }
}
