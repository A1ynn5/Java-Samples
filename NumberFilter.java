import java.util.*;

public class NumberFilter {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        int[] randos = new int[10000];
        String confirm;
        int count = 0;
        do {
            System.out.println("Enter a number to filter the array");
            int filter = input.nextInt();
            randomFillArray(randos);
            sortArray(randos);
            for (int i = 0; i < randos.length; i++) {
                if (randos[i] == filter) {
                    count++;
                }
            }
            
            System.out.println(filter + " was found in the array " + count + " times.");
            System.out.println("Would you like to filter the array again? y/n: ");
            confirm = input.next();
        } while (confirm.equals("y"));
    }

    public static void randomFillArray(int[] array) {
        Random minMax = new Random();
        int min=1, max=500;
        for (int i = 1; i < array.length; i++){
            array[i] = minMax.nextInt(max-min) + min;
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