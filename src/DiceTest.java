import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    int numberOfTwos = 0;
    int numberOfThrees = 0;
    int numberOfFours = 0;
    int numberOfFives = 0;
    int numberOfSixes = 0;
    int numberOfSevens = 0;
    int numberOfEights = 0;
    int numberOfNines = 0;
    int numberOfTens = 0;
    int numberOfElevens = 0;
    int numberOfTwelves = 0;
    @Test
    public void ProbabilityDistribution() {
        for (int i = 0; i < 100000; i++) {
            Dice testDice = new Dice();
            int answer = testDice.rollDice(2, 6);
            if (answer == 2) {
                numberOfTwos++;
            } else if (answer == 3) {
                numberOfThrees++;
            } else if (answer == 4) {
                numberOfFours++;
            } else if (answer == 5) {
                numberOfFives++;
            } else if (answer == 6) {
                numberOfSixes++;
            }else if (answer == 7) {
                numberOfSevens++;
            } else if (answer == 8) {
                numberOfEights++;
            } else if (answer == 9) {
                numberOfNines++;
            } else if (answer == 10) {
                numberOfTens++;
            } else if (answer == 11) {
                numberOfElevens++;
            } else if (answer == 12) {
                numberOfTwelves++;
            }
        }
        Assert.assertTrue(2 <= numberOfTwos/1000 && numberOfTwos/1000 <= 4);
        Assert.assertTrue(5 <= numberOfThrees/1000&& numberOfThrees/1000<= 6);
        Assert.assertTrue(7 <= numberOfFours/1000 && numberOfFours/1000 <= 9);
        Assert.assertTrue(10 <= numberOfFives/1000 && numberOfFives/1000 <= 12);
        Assert.assertTrue(13 <= numberOfSixes/1000 && numberOfSixes/1000 <= 15);
        Assert.assertTrue(16 <= numberOfSevens/1000 && numberOfSevens/1000 <= 17);
        Assert.assertTrue(13 <= numberOfEights/1000 && numberOfEights/1000 <= 15);
        Assert.assertTrue(10 <= numberOfNines/1000 && numberOfNines/1000<= 12);
        Assert.assertTrue(7 <= numberOfTens/1000 && numberOfTens/1000 <= 9);
        Assert.assertTrue(5 <= numberOfElevens/1000 && numberOfElevens/1000 <= 6);
        Assert.assertTrue(2 <= numberOfTwelves/1000 && numberOfTwelves/1000 <= 4);
    }
}