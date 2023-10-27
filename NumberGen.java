import java.util.*;

public class NumberGen {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the desired length of the Array");
        int size = input.nextInt();
        int[] rand = new int[size];

        randomFillArray(rand);
        System.out.println("Displaying array in ascending order");
        System.out.println("Unsorted");
        printArray(rand);
        sortArray(rand);
        System.out.println("\nSorted");
        printArray(rand);
    }

    public static void randomFillArray(int[] array) {
        Random minMax = new Random();
        int min=1, max=2000;
        for (int i = 1; i < array.length; i++){
            array[i] = minMax.nextInt(max-min) + min;
        }
    }

    public static void printArray(int[] inArray) {
        for (int i = 0; i < inArray.length; i++) {
            System.out.println(inArray[i]);
        }
    }

    public static void sortArray(int[] inArray){
        for(int i = 0; i < inArray.length; i++) {
            for (int o = i+1; o < inArray.length; o++) {
                if(inArray[i] > inArray[o]){
                int temp = inArray[i];
                inArray[i] = inArray[o];
                inArray[o] = temp;
                }                
            }
        }
    }
}
