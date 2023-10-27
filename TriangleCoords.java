import java.util.Scanner;

public class TriangleCoords{
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int x1 = 100;
        int y1 = 100;
        int x2 = 100;
        int y2 = 200;
        int x3 = 200;
        int y3 = 100;
        //Triangle area equation
        //((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2)/2.0));

        //Predefined point
        System.out.println("Enter the value of p(x)");
        String inputx = input.nextLine();
        System.out.println("Enter the value of p(y)");
        String inputy = input.nextLine();
        int px = Integer.parseInt(inputx);
        int py = Integer.parseInt(inputy);

        //triangle areas
        double abc = Math.abs((x1*(y2-y3)+x2*(y3-y1)+x3*(y1-y2))/2.0);
        double pbc = Math.abs((px*(y2-y3)+x2*(y3-py)+x3*(py-y2))/2.0);
        double pac = Math.abs((px*(y1-y3)+x1*(y3-py)+x3*(py-y1))/2.0);
        double pab = Math.abs((px*(y1-y2)+x1*(y2-py)+x2*(py-y1))/2.0);

        if(abc == (pbc + pac + pab)){
            System.out.println("The coordinates of p(x,y) are within the triangle.");
        } else {
            System.out.println("The coordinates of p(x,y) are not within the triangle. Please use different coordinates and try again.");
        }
    }
}