package pages;

import org.openqa.selenium.By;
import setup.Page;

public class WatchPage extends Page {
    private By channelIcon = By.xpath("//a[@class='yt-simple-endpoint style-scope ytd-video-owner-renderer']//img[@id='img']");

    public WatchPage clickOnChannelIcon(){
        waitHelper.waitOnElementToBeClickable(channelIcon).click();
        return this;
    }
}
