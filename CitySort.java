import java.util.Scanner;

public class CitySort {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        String initials = "";
        String cityName;
        System.out.println("City Listing");
        System.out.println("This tool will take cities that you give it, and return the first letters of said cities.");
        System.out.println("Please begin entering cities, and enter END when done");
        do {
            cityName = input.nextLine();
            initials += cityName.charAt(0) + "\n";
        } while (!cityName.equalsIgnoreCase("END"));

        initials = initials.substring(0, initials.length() - 2);

        System.out.println("The first letters of your cities are...");
        System.out.println(initials);
    }
}
