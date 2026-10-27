package Keys;

import Base.BaseTests;
import Pages.KeyPressesPage;
import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class KeysTest extends BaseTests {
    @Test
    public void testKeys(){
        var keyPressesPage = homePage.clickOnKeyPresses();
        //keyPressesPage.setText("a"+ Keys.BACK_SPACE);
        // kda das 3ala 7gten m3 b3d fa ktb a capital
        keyPressesPage.setText(Keys.chord(Keys.SHIFT,"a"));
        assertEquals(keyPressesPage.getResultMessage(),"You entered: A",
                "Message is incorrect");
    }
}
