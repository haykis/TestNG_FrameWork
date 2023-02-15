package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestBase;

public class DownloadPage extends TestBase {

    public DownloadPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (partialLinkText = "sunset.jfif")
    public WebElement yukleme;
}
