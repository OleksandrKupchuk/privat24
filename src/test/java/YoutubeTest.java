import com.github.javafaker.Faker;
import component.DialogWindow;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.ChannelPage;
import pages.SearchResultPage;
import pages.WatchPage;
import pages.YoutubeMainPage;

public class YoutubeTest extends setup.Test {

    @Test
    public void subscribeAsUnauthorizedUser(){
        Faker faker = new Faker();
        int randomSearchValue = faker.number().numberBetween(10, 10000);
        int numberOfValueInSearchDropdown = 2;
        int numberOfVideo = 4;

        String windowName = new YoutubeMainPage()
                .open()
                .getWindowName();

        Assert.assertEquals(windowName, "YouTube");

        new YoutubeMainPage()
                .enterSearch(Integer.toString(randomSearchValue))
                .selectValueInSearchDropdown(numberOfValueInSearchDropdown);

        new SearchResultPage()
                .selectVideo(numberOfVideo);

        new WatchPage()
                .clickOnChannelIcon();

        new ChannelPage()
                .clickOnSubscribeButton("Підписатися");

        String buttonName = new DialogWindow()
                .getLoginButton()
                .getText();

        Assert.assertEquals(buttonName, "Увійти");
    }
}
