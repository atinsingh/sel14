import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ZoomInfoTest {

    @BeforeTest
    public void beforeSuite(){
        System.out.println("Before test");
    }

    @BeforeMethod
    public void beforemethod(){
        System.out.println("Before method");
    }

    @Test(expectedExceptions = ArithmeticException.class)
    public void tc1(){
        System.out.println(2/0);
        System.out.println("TC1");
    }
    @Test
    public void tc2(){
        System.out.println("TC2");
    }
}
