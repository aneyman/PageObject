import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

/**
 * Created by Tester on 13.04.2015.
 */
public class ResultPage {

    private WebDriver driver;

    public ResultPage(WebDriver driver){
        this.driver = driver;
    }

    public String getFirstLink() {
            return driver.findElement(By.xpath(".//*[@id='resultStats']")).getText();
        }
}
