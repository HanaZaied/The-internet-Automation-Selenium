package JS;

import Base.BaseTests;
import org.testng.annotations.Test;

public class JsExecuterTests extends BaseTests {
    @Test
    public void testScrollToTable(){
        homePage.clickOnLargeAndDeepDom().scrollTable();
    }

    @Test
    public void testScrollToParagraph(){
        homePage.clickOnInfiniteScroll().scrollIntoParagraph(5);
    }
}
