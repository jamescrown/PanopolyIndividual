import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestTrains{
    @Test
    public void runTest(){
        TrainStation testSite = new TrainStation("Heuston", 300, 200, 100);
        Assert.assertTrue(testSite.getIdentifier() == "Heuston");
        Assert.assertTrue(testSite.getRentalAmount() == 300);
        Assert.assertTrue(testSite.getPrice() == 200);
        Assert.assertTrue(testSite.getMortgageAmount() == 100);

    }
}
