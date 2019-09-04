package co.pragra.selboot.testframework.testcases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class ZoomInfo {

    private WebDriver driver;

    @BeforeSuite
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/Users/atinsingh/Downloads/chromedriver");
        System.setProperty("webdriver.gecko.driver", "/Users/atinsingh/Downloads/geckodriver");
        driver = new ChromeDriver();
    }

    @BeforeTest
    public void openUrl() {
        driver.get("https://zoom.us");
        System.out.println(driver.getTitle());
        List<WebElement> elements = driver.findElements(By.className("top-sales"));
        System.out.println(elements.size());

        //

    }

    @Test
    public void testOpen() {
    }
}
