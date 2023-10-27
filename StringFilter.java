import java.util.Scanner;

public class StringFilter {
    public static String getPartOfString(int size, int start, String inWord) {
        String stringPart = "";

        if(size > inWord.length()){
            System.out.println("ERROR 1 --- REQUESTED SIZE OVERFLOWS STRING");
            System.exit(0);
        } else if (start + size - 1 > inWord.length()){
            System.out.println("ERROR 2 --- REQUESTED SIZE OUTSIDE SCOPE OF STRING");
            System.exit(0);
        }

        for (int i = start - 1; i < start + size - 1; i++){
            stringPart += inWord.charAt(i);
        }
        return stringPart;
    }
    public static void main(String[] args){

        Scanner input = new Scanner(System.in);

        System.out.println("Enter a string");
        String userString = input.nextLine();
        
        System.out.println("Enter the amount of characters to display");
        int size = input.nextInt();

        System.out.println("Enter the starting location");
        int start = input.nextInt();

        String newWord = getPartOfString(size, start, userString);

        System.out.println("The " + size + " Letters starting at  position " + start + " are " + newWord);
    }
}
