package basicdatastructures.array;

public class ArrayUsingMethods_05 {

    // METHODS
    public static void printArray(String name[]){
        for(int i=0;i<name.length;i++){
            System.out.println("name " + i + " : " + name[i]);
        }
    }

    public static void main(String[] args) {
        String name[] = {"max", "zudio", "h&m"};

        // METHOD CALL
        printArray(name);
    }
}
