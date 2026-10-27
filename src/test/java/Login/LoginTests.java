package Login;

import Base.BaseTests;
import Pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class LoginTests extends BaseTests {
    @Test
    public void testSuccessfulLogin(){
        LoginPage loginPage = homePage.clickOnFormAuthentication();
        loginPage.setUserNameField("tomsmith"); // aw momken n3mlhom dataprovider
        loginPage.setUsernameField("SuperSecretPassword!");
        var secureAreaPage = loginPage.clickLoginButton();
        String message = secureAreaPage.getMessage();
        assertTrue(message.contains("You logged into a secure area!")
                ,"You didnt login");
    }
}
