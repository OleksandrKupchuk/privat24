package drivermanager;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverManager {
    private ThreadLocal<WebDriver> driver = new ThreadLocal<>();
    private static DriverManager instance = new DriverManager();
    public static DriverManager getInstance(){return instance;}

    private DriverManager(){}

    public void createDriver(){
        WebDriverManager.chromedriver().setup();
        driver.set(new ChromeDriver());
        driver.get().manage().window().maximize();
    }

    public WebDriver getDriver(){
        return driver.get();
    }

    public void closeDriver(){
        driver.get().quit();
        driver.remove();
    }
}
