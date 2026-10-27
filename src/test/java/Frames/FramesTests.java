package Frames;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FramesTests extends BaseTests {
    @Test
    public void testFrame(){
        var nestedFramesPage = homePage.clickOnFrames().clickOnNestedFrames();
        assertTrue(nestedFramesPage.getLeftFrameText().contains("LEFT"),
                "The left text is incorrect");
        assertTrue(nestedFramesPage.getBottomFrame().contains("BOTTOM"),
                "The bottom text is incorrect ");
    }
}
