import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class PlayerTest {
    @Test
    public void runTest(){
        Player testPerson = new Player("testBoy", 50);
        Assert.assertTrue(testPerson.getIdentifier() == "testBoy");
        Assert.assertTrue(testPerson.getCash() == 50);
    }
}
