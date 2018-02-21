import org.junit.After;
import org.junit.Assert;
import org.junit.Test;

public class TestSetTax {
    @Test
    public void runTest(){
        SetTax testTax = new SetTax(400);
        Assert.assertTrue(testTax.getTaxType() == "Set");
        Assert.assertTrue(testTax.getTax() == 400);
    }
}
