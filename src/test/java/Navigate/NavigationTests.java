package Navigate;

import Base.BaseTests;
import org.testng.annotations.Test;
import utils.WindowManager;

public class NavigationTests extends BaseTests {
    @Test
    public void testNavigation(){
        homePage.clickOnDynamicLoad().clickEx1Link();
        getWindowManager().goBack();
        getWindowManager().goForward();
        getWindowManager().refresh();
        getWindowManager().goTo("https://www.google.com/");
    }
}
