package stepdefinitions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.UploadPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Upload extends TestBase {
    UploadPage uploadPage=new UploadPage();

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("herokup4"));
        Driver.waitBasic(10);
        String path="C:\\Users\\Guest\\Downloads\\dog.jpg";
        uploadPage.dosyaSec.sendKeys(path);
        Driver.waitBasic(20);
        uploadPage.upload.click();
        Driver.waitBasic(20);
        Assert.assertTrue(uploadPage.yuklendi.isDisplayed());
        System.out.println("uploadPage.yuklendi.getText() = " + uploadPage.yuklendi.getText());
        Assert.assertTrue(uploadPage.yuklendi.getText().contains("dog"));



    }
}
