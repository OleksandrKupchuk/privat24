package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import setup.Page;

public class SearchResultPage extends Page {
    private String videoTitle = "(//div[@id='primary']//div[@id='contents']/ytd-video-renderer)[%s]//a[@id='video-title']";

    public SearchResultPage selectVideo(int numberOfVideo){
        By locator = By.xpath(String.format(videoTitle, numberOfVideo));
        WebElement title = waitHelper.waitOnElementToBeClickable(locator);
        title.click();
        return this;
    }
}
