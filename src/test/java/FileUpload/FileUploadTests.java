package FileUpload;

import Base.BaseTests;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class FileUploadTests extends BaseTests {
    @Test
    public void testFileUpload(){
        String absolutePath = "D:\\2- Hana\\Software Testing\\Eng.IslamElQersh\\StudingWithEngIslam\\resources\\";
        String filename = "aaa.text";
        var fileUploadPage = homePage.clickOnFileUpload();
        fileUploadPage.uploadFile(absolutePath+filename);
        assertEquals(fileUploadPage.getUploadedFileName(),filename,
                "The file name is incorrect");

    }
}
