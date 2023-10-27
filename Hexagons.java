import java.util.Scanner;
public class Hexagons {
    public static void main (String[] args){
        Scanner side = new Scanner(System.in);
        System.out.println("Geometry of a Hexagon");
        System.out.println("Enter the length of one side of the Hexagon: ");
        String s = side.nextLine();
        double length = Double.parseDouble(s);
        double totalLength = (6 * (Math.pow(length, 2)));
        double area = (totalLength / (4 * (Math.tan(Math.PI / 6))));
        System.out.println("The area of the given hexagon is " + area);
    }
}
