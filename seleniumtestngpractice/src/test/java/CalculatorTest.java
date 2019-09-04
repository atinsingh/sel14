import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeSuite
    public void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testSum() {
        Assert.assertEquals(calculator.sum(4, 5),10);
    }

    @Test
    public void testMultiplication() {
        Assert.assertEquals(18,calculator.multiplication(9,2));
    }
}
