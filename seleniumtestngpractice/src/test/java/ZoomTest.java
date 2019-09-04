import org.testng.Assert;
import org.testng.annotations.*;

public class ZoomTest {

    static int  count = 0;
    @BeforeSuite
    public void setUpAtSuiteLevel(){
        System.out.println("Running at suite level");
    }

    @BeforeClass
    public void setUpatClassLevel(){
        System.out.println("Running before class");
    }

    @BeforeMethod(enabled = false)
    public void beforeMethod(){
        System.out.println("Running before method");
    }

    @BeforeTest()
    public void beforeTest(){
        System.out.println("Runnning Before Test");
    }
    @Test
    public void simpletest(){
        System.out.println("Simple Test");
    }

    @Test(groups = {"smoke", "regression"})
    public void simpletest3(){
        System.out.println("Simple Test3");
       // Assert.fail();
    }

    @Test(timeOut = 200, invocationCount = 5, successPercentage = 80)
    public void simpletest4(){
        try {
            Thread.sleep(100);
            count++;
            if(count==3){
                Assert.fail();
            }
        }catch (InterruptedException ex){

        }
        System.out.println("Simple Test4");
    }
    @Test()
    public void simpletest5(){
        System.out.println("Simple Test5");
    }
    @Test(groups = {"integration"}, dependsOnGroups = "smoke")
    public void simpletest6() {
        System.out.println("Simple Test6");
    }
    @Test(enabled = false)
    public void simpletest7(){
        System.out.println("Simple Test7");
    }

}
