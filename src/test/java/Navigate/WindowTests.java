package Navigate;

import Base.BaseTests;
import Pages.NewWindowPage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WindowTests extends BaseTests {
    @Test
    public void testSwitchToTab(){
       var newWindowPage = homePage.clickOnMultipleWindows().clickLink();
       getWindowManager().switchToTab("New Window");
       String headerText = newWindowPage.getHeaderText();
       assertEquals(headerText,"New Window",
               "You are in the wrong context");
    }
}
