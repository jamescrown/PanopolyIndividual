import org.junit.Assert;
import org.junit.Test;
public class EquallyLikelyDiceTest {
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
            EquallyLikelyDice testDice1 = new EquallyLikelyDice();
            int answer = testDice1.rollDice(2, 6);
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
        Assert.assertTrue(8 <= numberOfTwos/1000 && numberOfTwos/1000 <= 10);
        Assert.assertTrue(8 <= numberOfThrees/1000&& numberOfThrees/1000<= 10);
        Assert.assertTrue(8 <= numberOfFours/1000 && numberOfFours/1000 <= 10);
        Assert.assertTrue(8 <= numberOfFives/1000 && numberOfFives/1000 <= 10);
        Assert.assertTrue(8 <= numberOfSixes/1000 && numberOfSixes/1000 <= 10);
        Assert.assertTrue(8 <= numberOfSevens/1000 && numberOfSevens/1000 <= 10);
        Assert.assertTrue(8 <= numberOfEights/1000 && numberOfEights/1000 <= 10);
        Assert.assertTrue(8 <= numberOfNines/1000 && numberOfNines/1000<= 10);
        Assert.assertTrue(8 <= numberOfTens/1000 && numberOfTens/1000 <= 10);
        Assert.assertTrue(8 <= numberOfElevens/1000 && numberOfElevens/1000 <= 10);
        Assert.assertTrue(8 <= numberOfTwelves/1000 && numberOfTwelves/1000 <= 10);
    }
}