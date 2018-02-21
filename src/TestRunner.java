import junit.framework.TestCase;
import org.junit.Test;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class TestRunner {
    @Test
    public void main()	{
        Result	result	= JUnitCore.runClasses(DiceTest.class);
        for (Failure failure: result.getFailures())
            System.out.println(failure.toString());

        Result	playerTest	= JUnitCore.runClasses(PlayerTest.class);
        for (Failure failure: playerTest.getFailures())
            System.out.println(failure.toString());

        Result	testSetTax	= JUnitCore.runClasses(TestSetTax.class);
        for (Failure failure: testSetTax.getFailures())
            System.out.println(failure.toString());

        Result	testPercentageTax	= JUnitCore.runClasses(TestPercentageTax.class);
        for (Failure failure: testPercentageTax.getFailures())
            System.out.println(failure.toString());

        Result	testBuilding	= JUnitCore.runClasses(TestBuilding.class);
        for (Failure failure: testBuilding.getFailures())
            System.out.println(failure.toString());

        Result	testTrain	= JUnitCore.runClasses(TestTrains.class);
        for (Failure failure: testTrain.getFailures())
            System.out.println(failure.toString());

        Result	testUtility	= JUnitCore.runClasses(UtilityTest.class);
        for (Failure failure: testUtility.getFailures())
            System.out.println(failure.toString());
    }
}
