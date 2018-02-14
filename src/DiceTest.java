import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class DiceTest {
    private int[] numberFromDice = new int[11];
    private int[] lowerDiceRange = {2,5,7,10,13,16,13,10,7,5,2};
    private int[] upperDiceRange = {4,6,9,12,15,17,15,12,9,6,4};
    private int[] possibleRolls = {2,3,4,5,6,7,8,9,10,11,12};
    @After
    public void setUp() {
        for(int x=0;x<11;x++){
            numberFromDice[x]=0;
        }
    }
    @Test
    public void ProbabilityDistributionNormalDice() {
        for (int i = 0; i < 100000; i++) {
            Dice testDice = new Dice();
            int answer = testDice.rollDice(2, 6);
            for(int y=0;y<11;y++){
                if(answer==possibleRolls[y]){
                    numberFromDice[y]++;
                }
            }
        }
        for(int x=0;x<11;x++){
            Assert.assertTrue(lowerDiceRange[x] <= numberFromDice[x]/1000 && numberFromDice[x]/1000 <= upperDiceRange[x]);
        }
    }
    @Test
    public void ProbabilityDistributionEqualDice() {
        for (int i = 0; i < 100000; i++) {
            EquallyLikelyDice testDice1 = new EquallyLikelyDice();
            int answer = testDice1.rollDice(2, 6);
            for(int y=0;y<11;y++){
                if(answer==possibleRolls[y]){
                    numberFromDice[y]++;
                }
            }
        }
        for(int x=0;x<11;x++){
            Assert.assertTrue(8 <= numberFromDice[x]/1000 && numberFromDice[x]/1000 <= 10);
        }
    }
}