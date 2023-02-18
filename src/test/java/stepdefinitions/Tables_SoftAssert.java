package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.TablesPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.util.List;

public class Tables_SoftAssert extends TestBase {
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

        String actual_1_1_4="$50.00";
        String actual_2_2_4="$51.00";

        softAssert.assertEquals(actual_1_1_4,tablesPage.tabloReturn(1,1,4),"Birinci kisim hatali");
        //hatali ise mesaj yazar diger testlere bakmaya devam eder, hata yoksa yazmaz
        softAssert.assertEquals(actual_2_2_4,tablesPage.tabloReturn(2,2,4),"Ikinci kisim hatali");
        softAssert.assertAll();//bu yazilmazsa test her zaman gecti gorunur hatayi bulamayiz



    }
}
