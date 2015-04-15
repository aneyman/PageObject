
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

import static org.testng.Assert.assertTrue;

/**
 * Created by Tester on 13.04.2015.
 */
public class GoogleTestPage {
    private FirefoxDriver driver;

    @BeforeTest
    public void setUp(){
    driver  = new FirefoxDriver();
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.get("http://google.com");
    }

    @Test
    public void testSearch(){
        HomePage home = new HomePage(driver);
       ResultPage result = home.search("automated testing info");
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @AfterTest
    public void tearDown(){
        driver.quit();
    }
}
