package Modal;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ModalTests extends BaseTests {
    @Test
    public void testModal(){
       var model= homePage.clickOnEntryAd();
       try {
           Thread.sleep(3000);
       }catch (InterruptedException e){
           e.printStackTrace();
       }
       model.clickClose();

       assertEquals(model.getHeaderText(),"Entry Ad",
               "The header is incorrect");
       model.clickRestartLink();
    }
}
