package pages;

import org.openqa.selenium.By;
import setup.Page;

public class ChannelPage extends Page {
    private String subscribeButton = "button[aria-label='%s']";

    public ChannelPage clickOnSubscribeButton(String name){
        By locator = By.cssSelector(String.format(subscribeButton, name));
        waitHelper.waitOnElementToBeClickable(locator).click();
        return this;
    }
}
