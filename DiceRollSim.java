import java.util.*;

public class DiceRollSim {
    public static void main(String[] args) {
        Scanner init = new Scanner(System.in);
        System.out.println("Enter the amount of dice to roll: ");
        int numDice = init.nextInt();
        int result = roll(numDice);
        System.out.println("You rolled a total of " + result);
    }

    public static int roll(int numDice) {
        int min=1,max=6;
        Random rollRandom = new Random();
        int scoreTotal = 0;
        for (int i = 1; i <= numDice; i++) {
            int roll = rollRandom.nextInt(min, max + 1);
            scoreTotal += roll;
        }
        return scoreTotal;
    }
}
