import java.util.Scanner;
public class Substrings {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter some text");
        String s1 = s.nextLine();
        System.out.println("Again.");
        String s2 = s.nextLine();
        if(s1.contains(s2)){
            System.out.println(s2 + " is a substring of " + s1);
        } else {
            System.out.println(s2 + " is not a substring of " + s1);
        }

    }
}
