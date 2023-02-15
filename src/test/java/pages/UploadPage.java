package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestBase;

public class UploadPage extends TestBase {

    public UploadPage (){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy (xpath = "//input[@id='file-upload']")
    public WebElement dosyaSec;

    @FindBy (xpath = "//input[@id='file-submit']")
    public WebElement upload;

    @FindBy (xpath = "//div[@id='uploaded-files']")
    public WebElement yuklendi;


}

