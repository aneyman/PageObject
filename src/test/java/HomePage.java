import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Tester on 13.04.2015.
 */
public class HomePage {
    private WebDriver driver;

    public HomePage( FirefoxDriver driver){
        this.driver = driver;
    }
    public ResultPage search(String text) {
        driver.findElement(By.id("sb_ifc0")).sendKeys(text);
        //не вставляется текст
        return new ResultPage(driver);

    }
}
