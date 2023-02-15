package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.TablesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.util.List;

public class Tables extends TestBase {
    TablesPage tablesPage=new TablesPage();

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("herokup6"));
        Driver.waitBasic(1);
        tablesPage.tablo(2,2,2);

        List<WebElement> tablo1Row=Driver.getDriver().findElements(By.xpath("//table[1]//tbody//tr"));
        for (WebElement eleman: tablo1Row) {
            System.out.println("eleman.getText() = " + eleman.getText());
        }


    }
}
