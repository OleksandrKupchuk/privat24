package setup;

import drivermanager.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import wait.WaitHelper;

public class Page {
    protected WebDriver driver = DriverManager.getInstance().getDriver();
    protected WaitHelper waitHelper = new WaitHelper();

    protected void sendCharacterByCharacter(String value, WebElement element){
        for (Character input : value.toCharArray()) {
            element.sendKeys(input.toString());
        }
    }

    public String getWindowName(){
        return driver.getTitle();
    }
}
