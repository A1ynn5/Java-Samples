import java.util.Scanner;

public class Days {
    public static void main (String[] args){
        Scanner s = new Scanner(System.in);

        System.out.println("Enter today's date:");
        System.out.println("0 = Sunday, 1 = Monday, etc...");
        String current = s.nextLine();
        System.out.println("Enter the number of days elapsed since today:");
        String future = s.nextLine();
        int cd = Integer.parseInt(current);
        int fd = Integer.parseInt(future);
        fd = (cd + fd) % 7;
        switch (cd) {
            case 0:
            current = "Sunday";
            break;
            case 1:
            current = "Monday";
            break;
            case 2:
            current = "Tuesday";
            break;
            case 3:
            current = "Wednesday";
            break;
            case 4:
            current = "Thursday";
            break;
            case 5:
            current = "Friday";
            break;
            case 6:
            current = "Saturday";
            break;
        }
        switch (cd) {
            case 0:
            future = "Sunday";
            break;
            case 1:
            future = "Monday";
            break;
            case 2:
            future = "Tuesday";
            break;
            case 3:
            future = "Wednesday";
            break;
            case 4:
            future = "Thursday";
            break;
            case 5:
            future = "Friday";
            break;
            case 6:
            future = "Saturday";
            break;
        }
        System.out.println("Today is " + current + " and the specified future date is " + future + ".");
    }
}

