package basicdatastructures.array;

public class TwoDimensionalArray_14 {
    public static void main(String[] args) {
        // ARRAY
        int[][] arr = {
                {1},
                {2, 3},
                {4, 5, 6}
        };

        // arr.length = ROW SIZE
//        for(int row=0;row<arr.length;row++){
//            // arr[row].length = ELEMENT OF ARRAY IN PARTICULAR ROW
//            for(int col=0; col<arr[row].length; col++){
//                System.out.print(arr[row][col] + " ");
//            }
//            System.out.println();
//        }

        // PRINT IN ARRAY FORMAT
        System.out.println("[");
        for (int row = 0; row < arr.length; row++) {
            System.out.print("\t[");
            for (int column = 0; column < arr[row].length; column++) {
                System.out.print(arr[row][column]);
                if (column < arr[row].length - 1) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }
        System.out.println("]");
    }
}
