import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestPercentageTax{
    @Test
    public void runTest1(){
        PercentageTax testTax = new PercentageTax(10);
        Assert.assertTrue(testTax.getTaxType() == "Percentage");
        Assert.assertTrue(testTax.getTax() == 10);
    }
}
