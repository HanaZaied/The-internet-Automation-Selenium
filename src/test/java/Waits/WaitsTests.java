package Waits;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class WaitsTests extends BaseTests {
    @Test
    public void testWaits(){
        var ex1Page = homePage.clickOnDynamicLoad().clickEx1Link();
        ex1Page.clickOnStart();
        assertEquals(ex1Page.getLOadedMessage(),"Hello World!",
                "The text is not loaded yet");
    }
    @Test
    public void testWaits2(){
        var ex2Page = homePage.clickOnDynamicLoad().clickEx2Link();
        ex2Page.clickOnStart();
        assertEquals(ex2Page.getLOadedMessage(),"Hello World!",
                "The text is not loaded yet");
    }

}
