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
        }
}
