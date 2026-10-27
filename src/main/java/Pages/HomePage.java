package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage {
    private WebDriver driver;
    //private By formAuthLinkLoc = By.linkText("Form Authentication");

    public HomePage(WebDriver driver){
        this.driver=driver;
    }

    //el method de wdtny l page tanya fa mesh htrg3 void hya htrg3 (handele to the next page)
    //ya3ny object men el page eli b3dha
    // wel object da ya5od el driver 3lshan ykml bih
    //fa mesh hyrg3 void htrg3 loginpage
    public LoginPage clickOnFormAuthentication(){
        //driver.findElement(formAuthLinkLoc).click();
        clickLink("Form Authentication");
        return new LoginPage(driver);
    }
    public DropDownPage clickOnDropDown(){
        clickLink("DropDown");
        return new DropDownPage(driver);
    }
    public HoversPage clickOnHovers(){
        clickLink("Hovers");
        return new HoversPage(driver);
    }
    public KeyPressesPage clickOnKeyPresses(){
        clickLink("Key Presses");
        return new KeyPressesPage(driver);
    }
    public JavaScriptAlertsPage clickOnJavaScriptsAlerts(){
        clickLink("JavaScript Alerts");
        return new JavaScriptAlertsPage(driver);
    }
    public FileUploadPage clickOnFileUpload(){
        clickLink("File Upload");
        return new FileUploadPage(driver);
    }
    public EntryAdPage clickOnEntryAd(){
        clickLink("Entry Ad");
        return new EntryAdPage(driver);
    }
    public FramesPage clickOnFrames(){
        clickLink("Frames");
        return new FramesPage(driver);
    }
    public DynamicLoadingPage clickOnDynamicLoad(){
        clickLink("Dynamic Loading");
        return new DynamicLoadingPage(driver);
    }
    public LargeAndDeepDOMPage clickOnLargeAndDeepDom(){
        clickLink("Large & Deep DOM");
        return new LargeAndDeepDOMPage(driver);
    }
    public InfiniteScrollPage clickOnInfiniteScroll(){
        clickLink("Infinite Scroll");
        return new InfiniteScrollPage(driver);
    }
    public MultipleWindowsPages clickOnMultipleWindows(){
        clickLink("Multiple Windows");
        return new MultipleWindowsPages(driver);
    }

    //de method h7ot fiha kol el links eli fel page el home
    public void clickLink(String linkText){
        driver.findElement(By.linkText(linkText)).click();
    }
    //note:
    /*
    * kda el baseTest b3ta el driver lel homepage wel homepage b3tah lel loginpage
    * */
}
