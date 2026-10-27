package JS;

import Base.BaseTests;
import io.qameta.allure.*;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class AlertsTests extends BaseTests {
    @Test
    @Epic("JS")
    @Feature("Alerts")
    @Story("Alert")
    @Description("This method tests the alert")
    @Severity(SeverityLevel.BLOCKER)
    public void testAlert(){
        var javaScriptAlertPage = homePage.clickOnJavaScriptsAlerts();
        javaScriptAlertPage.clickJSAlert();
        assertEquals(javaScriptAlertPage.getAlertText(),"I am a JS Alert",
                "The alert Text is not correct");
        javaScriptAlertPage.acceptAlert();
        assertEquals(javaScriptAlertPage.getResultMessage(),"You successfully clicked an alert",
                "The result Text is not correct");
    }
    @Test
    @Epic("JS")
    @Feature("Alerts")
    @Story("Confirm")
    @Description("This method tests the confirm")
    public void testConfirm(){
        var javaScriptAlertPage = homePage.clickOnJavaScriptsAlerts();
        javaScriptAlertPage.clickJSConfirm();
        assertEquals(javaScriptAlertPage.getAlertText(),"I am a JS Confirm",
                "The confirm message is not correct");
        javaScriptAlertPage.acceptAlert();
        assertEquals(javaScriptAlertPage.getResultMessage(),"You clicked: Ok",
                "The result Text Is not correct");
    }
    @Test
    @Epic("JS")
    @Feature("Alerts")
    @Story("Prompt")
    @Description("This method tests the prompt")
    public void testPrompt(){
        var javaScriptAlertPage = homePage.clickOnJavaScriptsAlerts();
        Allure.step("Clicking prompt");
        javaScriptAlertPage.clickJSPrompt();
        assertEquals(javaScriptAlertPage.getAlertText(),"I am a JS prompt",
                "The confirm message is not correct");
        javaScriptAlertPage.setPromtText("Route");
        javaScriptAlertPage.acceptAlert();
        assertEquals(javaScriptAlertPage.getResultMessage(),"You entered: Route",
                "The result Text Is not correct");
    }
}
