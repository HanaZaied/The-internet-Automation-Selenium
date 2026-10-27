package Base;

import Pages.HomePage;
import com.google.common.io.Files;
import listeners.MyListener;
import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringDecorator;
import org.openqa.selenium.support.events.WebDriverListener;
import org.testng.ITestResult;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import utils.WindowManager;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BaseTests {
    private WebDriver driver;
    protected HomePage homePage;

    @BeforeClass
    public void setUp(){
        driver = new ChromeDriver();

//        driver.manage().window().maximize();
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }
    @BeforeMethod
    public void goHome(){
        WebDriverListener listener = new MyListener();
        WebDriver decorated = new EventFiringDecorator<>(listener).decorate(driver);
        driver.get("https://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
    }
    @AfterMethod
    public void recordFailure(ITestResult result){
        if(ITestResult.FAILURE == result.getStatus()){
            var camera = (TakesScreenshot)driver;
            File screenShot = camera.getScreenshotAs(OutputType.FILE);
            try {
                Files.move(screenShot,new File("resources/screenShots/"+result.getName()+".png"));
            } catch (IOException e) {
                e.getStackTrace();
            }
        }
    }
    @AfterClass
    public void tearDown(){
        driver.quit();
    }

    public WindowManager getWindowManager(){
        return new WindowManager(driver);
    }
    private ChromeOptions getChromeOptions(){
        ChromeOptions chromeOptions = new ChromeOptions();
        chromeOptions.addArguments("--start-maximized");
        chromeOptions.addArguments("--incognito");
        chromeOptions.addArguments("--disable-notifications");
        return chromeOptions;
    }
//    private void setCookie(){
//        Cookie cookie = new Cookie("Route","123");
//        driver.manage().addCookie(cookie);
//    }
}
//public class BaseTests {
//    //awel step bft7 el browser
//    private WebDriver driver;
//
//    private By linkesLocator = By.tagName("a");
//    private By inputLink = By.linkText("Inputs");
//    public void setUp(){
//        driver = new ChromeDriver(); // bft7 chrome
//        // hro7 3ala url mo3yn get()
//
//        driver.get("https://the-internet.herokuapp.com/"); // el get btstna el page content y load bshkl kaml abl ma td5ol 3ala el next line
//
//        //at2kd eny ro7t el url el sa7 3n try2 eny agyb el tittle
//        System.out.println(driver.getTitle());
//
//        /**
//         * manage btrg3 object men no3 options
//         * class options da 3ndo methods 22dr ast8dmha
//         * el window de btrg3li object men no3 window
//         */
//        driver.manage().window().maximize();
//        //driver.manage().window().setSize(new Dimension(430,932)); // el setsize bta5od object men nos dimention wel dimention el constructor bta3o bya5od el width wel height
//
//        List<WebElement> linkes = driver.findElements(linkesLocator);
//        System.out.println("The number of links is"+linkes.size());
//
//        driver.findElement(inputLink).click();
//
//        //b3d ma a5ls h2fl el browser we da 3ndy tr2ten
//        driver.close(); // ht2fl el tap eli el driver focus 3liha fa law 3ndy multiple taps el session mesh htt2fl
//        driver.quit(); // hy2fl el browser kolo
//    }
//}


