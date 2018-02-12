import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    @Test
    public void main(){
        EquallyLikelyDiceTest myFirstTest = new EquallyLikelyDiceTest();
        myFirstTest.ProbabilityDistribution();
        DiceTest mySecondTest = new DiceTest();
        mySecondTest.ProbabilityDistribution();
    }
}
