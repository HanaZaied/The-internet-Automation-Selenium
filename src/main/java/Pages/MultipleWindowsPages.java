package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class MultipleWindowsPages {
    private WebDriver driver;

    private By link = By.linkText("Click Here");

    public MultipleWindowsPages(WebDriver driver){
        this.driver=driver;
    }

    public NewWindowPage clickLink(){
        driver.findElement(link).click();
        return new NewWindowPage(driver);
    }
}
