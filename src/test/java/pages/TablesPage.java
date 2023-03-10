package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;
import utilities.TestBase;

public class TablesPage extends TestBase {

    public TablesPage (){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy (xpath = "(//table)[1]")
    public WebElement table1;

    @FindBy (xpath = "(//table)[2]")
    public WebElement table2;

    @FindBy (xpath = "//table[1]//tbody//tr[1]//td[1]")
    public WebElement t1Row1Blok1;

    public void tablo(int table, int row, int blok){
        WebElement result=Driver.getDriver().findElement(By.xpath("//table["+table+"]//tbody//tr["+row+"]//td["+blok+"]"));
        System.out.println("Secilen tablo= "+table+" , Secilen satir= "+row+" , Secilen stun ise= "+blok+" dir. Sonuc= "
                +result.getText());
    }
    public String tabloReturn(int table, int row, int blok){
        WebElement result=Driver.getDriver().findElement(By.xpath("//table["+table+"]//tbody//tr["+row+"]//td["+blok+"]"));
      return result.getText();
    }
//    public WebElement tabloStun(int tabloNo, int satirNo, int stunNo){
//        WebElement element = Driver.getDriver().findElement(By.xpath("//table["+tabloNo+"]//tbody//tr["+satirNo+"]//td["+stunNo+"]"));
//        return element;
//    }
}
