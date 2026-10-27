package DropDown;

import Base.BaseTests;
import org.testng.annotations.Test;

import java.util.List;

import static org.testng.Assert.*;

public class DropDownTests extends BaseTests {
    @Test
    public void testDropDown(){
        var dropDownPage = homePage.clickOnDropDown();
        String option = "Option 1";
        dropDownPage.selectFromDropDown(option);
        List<String> selectedOptions = dropDownPage.getSelectedOptions();
        assertEquals(selectedOptions.size(),1,
                "The number of elements is not 1 ");
        assertTrue(selectedOptions.contains(option),
                "The option was not selected");
    }
}
