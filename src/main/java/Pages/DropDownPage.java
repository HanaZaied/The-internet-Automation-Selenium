package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

//el dropDown btb2a options w7na bnselect mnha mesh bn click
//el dropdown no3 el element esmo select fa 3ndna class f selenium esmo select class
//gwah kol el methods eli momken n7tagha 3lshan nhndl el dropdown

public class DropDownPage {
    private WebDriver driver;
    private By dropdownloc = By.id("dropdown");

    public DropDownPage(WebDriver d){
        this.driver=d;
    }

    public void selectFromDropDown(String option){
        //Select dropdown = new Select(driver.findElement(dropdownloc));
        //dropdown.selectByVisibleText(option);
        getDropDown().selectByVisibleText(option);
    }
    public List<String> getSelectedOptions(){
        List<WebElement> selectedElement = getDropDown().getAllSelectedOptions();
        List<String> selectedOptions = new ArrayList<>();
        for(WebElement element:selectedElement){
            selectedOptions.add(element.getText());
        }
        return selectedOptions;
    }

    public Select getDropDown(){
        return new Select(driver.findElement(dropdownloc));
    }
}
