import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class UtilityTest {
    @Test
    public void runTest(){
        Utility testSite = new Utility("ESB", 300, 200);
        Assert.assertTrue(testSite.getIdentifier() == "ESB");
        Assert.assertTrue(testSite.getPrice() == 300);
        Assert.assertTrue(testSite.getMortgageAmount() == 200);

    }
}
