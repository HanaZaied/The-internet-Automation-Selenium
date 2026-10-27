package utils;

import org.openqa.selenium.WebDriver;

import java.util.Set;

public class WindowManager {
    private WebDriver driver;

    public WindowManager(WebDriver driver){
        this.driver=driver;
    }

    public void goBack(){
        driver.navigate().back();
    }
    public void goForward(){
        driver.navigate().forward();
    }
    public void refresh(){
        driver.navigate().refresh();
    }
    public void goTo(String url){
        driver.navigate().to(url);
    }

    public void switchToTab(String tabTitle){
        Set<String> windowHandles= driver.getWindowHandles();
        System.out.println("The number of opened tabs is "+ windowHandles.size());
        for(String windowHandel : windowHandles){
            System.out.println("The current windowHandel is "+windowHandel);
            driver.switchTo().window(windowHandel);
            if(driver.getTitle().equals(tabTitle)){
                break;
            }
        }
    }
    public void switchToTabByURL(String tabURL){
        Set<String> windowHandles= driver.getWindowHandles();
        System.out.println("The number of opened tabs is "+ windowHandles.size());
        for(String windowHandel : windowHandles){
            System.out.println("The current windowHandel is "+windowHandel);
            driver.switchTo().window(windowHandel);
            if(driver.getCurrentUrl().contains(tabURL)){
                break;
            }
        }
    }
}
