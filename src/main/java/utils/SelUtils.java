package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

public class SelUtils {
    private WebDriver driver;
    public SelUtils(WebDriver driver){
        this.driver=driver;
    }

    //hydini 7gten el locator bt3ha wel option eli h5taro
    public void selectFromDropDown(By dropdownloc, String option){
        Select dropdown = new Select(driver.findElement(dropdownloc));
        dropdown.selectByVisibleText(option);

    }
}
