package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.Page;

public class YoutubeMainPage extends Page {
    private By searchInput = By.cssSelector("input[id='search']");
    private String searchDropDown = "ul[role='listbox'] li:nth-child(%s)";

    public YoutubeMainPage open(){
        driver.get("https://www.youtube.com/");
        return this;
    }

    public YoutubeMainPage enterSearch(String value){
        WebElement input = waitHelper.waitOnElementToBeClickable(searchInput);
        sendCharacterByCharacter(value, input);
        return this;
    }

    public YoutubeMainPage selectValueInSearchDropdown(int numberOfElement){
        By locator = By.cssSelector(String.format(searchDropDown, numberOfElement));
        waitHelper.waitOnElementToBeClickable(locator).click();
        return this;
    }
}
