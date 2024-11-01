package component;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.Page;

public class DialogWindow extends Page {
    private By loginButton = By.xpath("//div[@id='contentWrapper']//*[@id='button']//span");
    public WebElement getLoginButton(){
        return driver.findElement(loginButton);
    }
}
