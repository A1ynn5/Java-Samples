import java.util.Scanner;
public class StringProperties {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter some text");
        String input = s.nextLine();
        input = input.trim();
        int length = input.length();
        char a = input.charAt(0);
        System.out.println("The String you gave has " + length + " characters, and the first character is " + a + ".");
    }
}
