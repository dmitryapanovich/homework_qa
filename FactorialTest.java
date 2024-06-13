import org.testng.Assert;
import org.testng.annotations.Test;

public class FactorialTest {

    @Test
    public void testFactorialForZero() {
        Assert.assertEquals(Factorial.calculateFactorial(0), 1);
    }

    @Test
    public void testFactorialForPositiveNumber() {
        Assert.assertEquals(Factorial.calculateFactorial(1), 1);
        Assert.assertEquals(Factorial.calculateFactorial(2), 2);
        Assert.assertEquals(Factorial.calculateFactorial(3), 6);
        Assert.assertEquals(Factorial.calculateFactorial(4), 24);
        Assert.assertEquals(Factorial.calculateFactorial(5), 120);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
        public void testFactorialForNegativeNumber() {
        Factorial.calculateFactorial(-1);
    }
}