package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Ex2Page {
    private WebDriver driver;
    private By startButton = By.cssSelector("#start > button");
    private By loadedMessage = By.cssSelector("#finish > h4");

    public Ex2Page(WebDriver driver){
        this.driver=driver;
    }

    public void clickOnStart(){
        driver.findElement(startButton).click();
    }
    public String getLOadedMessage(){
        //WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//        wait.until(ExpectedConditions.presenceOfElementLocated(loadedMessage));
//        wait.until(ExpectedConditions.visibilityOf(driver.findElement(loadedMessage)));

        FluentWait<WebDriver> wait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10))
                .pollingEvery(Duration.ofSeconds(2)).ignoring(NoSuchElementException.class);
        //wait.until(ExpectedConditions.visibilityOfElementLocated(loadedMessage));
        wait.until(driver -> {
            System.out.println("Checking for the element ");
            return driver.findElement(loadedMessage).isDisplayed();
        });
        return driver.findElement(loadedMessage).getText();
    }
}
