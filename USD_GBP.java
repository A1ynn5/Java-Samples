import java.text.DecimalFormat; // Import Decimal Format
import java.util.Scanner; // Import Scanner
public class USD_GBP {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // New Scanner class
        DecimalFormat df = new DecimalFormat("##########.##"); // New DecimalFormat template
        
        System.out.println("USD to GBP Converter");
        System.out.println("Enter the amount in USD to convert");
        String USD = input.nextLine();
        double usd = Double.parseDouble(USD);
        System.out.println("The current exchange rate for GBP is 1.38");
        double gbp = usd * 1.38;
        System.out.println("$" + df.format(usd) + " is £" + df.format(gbp));
    }
}
