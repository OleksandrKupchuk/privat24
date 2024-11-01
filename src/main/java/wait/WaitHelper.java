package wait;

import drivermanager.DriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class WaitHelper {
    private WebDriver driver = DriverManager.getInstance().getDriver();
    private WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

    public WebElement waitOnElementToBeClickable(By locator){
        return wait.until(ExpectedConditions.elementToBeClickable(locator));
    }
}
