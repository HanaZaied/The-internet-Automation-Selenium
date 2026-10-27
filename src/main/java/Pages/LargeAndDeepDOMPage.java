package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LargeAndDeepDOMPage {
    private WebDriver driver;
    private By table = By.id("large-table");

    public LargeAndDeepDOMPage(WebDriver driver){
        this.driver=driver;
    }

    //momken n7otha fel util
    public void scrollTable(){
        var js = (JavascriptExecutor)driver;
        WebElement tableElement = driver.findElement(table);
        String script = "arguments[0].scrollIntoView();";
        js.executeScript(script,tableElement);
    }
}
