import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestBuilding {
    @Test
    public void runTest(){
        Building testSite = new Building("Leinster House", 300, "blue", 200 , 100);
        Assert.assertTrue(testSite.getIdentifier() == "Leinster House");
        Assert.assertTrue(testSite.getRentalAmount() == 300);
        Assert.assertTrue(testSite.getColour() == "blue");
        Assert.assertTrue(testSite.getPrice() == 200);
        Assert.assertTrue(testSite.getMortgageAmount() == 100);

    }
}
