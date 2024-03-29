import java.util.Random;

public class Dice implements Rollable {
    private final static Random RND = new Random();
    static int sum = 0;
    public int rollDice(int numDice, int numSides) {
        int sum =0;
        for (int i = 0; i <numDice; i++) {
            sum += RND.nextInt(numSides) + 1;
        }
        return sum;
    }
    public static int getCurrentRoll(){
        return sum;
    }
}
