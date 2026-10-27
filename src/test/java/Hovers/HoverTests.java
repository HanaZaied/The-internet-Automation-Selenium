package Hovers;

import Base.BaseTests;
import Pages.HomePage;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class HoverTests extends BaseTests {
    @Test
    public void hoverTest(){
        int index = 1;
        var hoverPage = homePage.clickOnHovers();
        var figureCaption =hoverPage.hoverFigure(index);
        assertTrue(figureCaption.isCaptionDisplayed(),
                "The caption is not displayed");
        assertEquals(figureCaption.getName(),"name: user"+index,
                "The name is not correct");
        assertEquals(figureCaption.getLinkText(),"View profile",
                "The link text is not correct");
        assertTrue(figureCaption.getLinkURL().contains("/users/"+index),
                "The link URL is not correct");
    }

}
