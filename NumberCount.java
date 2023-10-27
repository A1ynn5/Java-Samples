import java.util.Scanner;

public class NumberCount {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);

        int positive=0, negative=0, post=0, negt=0, large=0, small=0, closest=0, total=0, count=0; 
        float avg;

        System.out.println("Enter a number, the count ends when 0 is entered");
        int number = input.nextInt();
        do {
            ++count;
            total += number;
            if(number > large){
                large = number;
            } else if(number < small){
                small = number;
            }
            if(number > 0){
                positive++;
                post += number;
            } else if(number < 0){
                negative++;
                negt += number;
            }
            if(closest == 0){
                closest = Math.abs(number);
            }else if(Math.abs(number) < closest){
                closest = Math.abs(number);
            }
            number = input.nextInt();
        } while(number != 0);
        avg = (total / count); 

        System.out.println("the number of numbers entered is " + count);
        System.out.println("The number of positives is " + positive);
        System.out.println("The number of negatives is " + negative);
        System.out.println("The sum of the positive numbers is " + post);
        System.out.println("The sum of the negative numbers is " + negt);
        System.out.println("The number closest to 0 is " + closest);
        System.out.println("The largest number  is " + large);
        System.out.println("The smallest number is " + small);
        System.out.println("The total is " + total);
        System.out.println("The average is " + avg);
    }
}
