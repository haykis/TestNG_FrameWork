package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.WeakHashMap;

public class GuruDragPage {

    public GuruDragPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy (xpath = "//li[@id='credit2']")
    public WebElement textBank;

    @FindBy (xpath = "//ol[@id='bank']")
    public WebElement debitAccount;

    @FindBy (xpath = "//li[@id='credit1']")
    public WebElement textSales;

    @FindBy (xpath = "//ol[@id='loan']")
    public WebElement creditAccount;

    @FindBy (xpath = "(//li[@id='fourth'])[1]")
    public WebElement obj5000left;

    @FindBy (xpath = "//ol[@id='amt7']")
    public WebElement debitAmount;

    @FindBy (xpath ="(//li[@id='fourth'])[2]")
    public WebElement obj5000right;

    @FindBy (xpath = "//ol[@id='amt8']")
    public WebElement creditAmount;

    @FindBy (xpath = "//div[@id='t7']")
    public WebElement debitMovement;

    @FindBy (xpath = "//div[@id='t8']")
    public  WebElement creditMovement;

    @FindBy (xpath = "(//div[@id='equal'])[1]")
    public WebElement perfect;

}
