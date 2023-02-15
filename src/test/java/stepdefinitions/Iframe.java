package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Iframe extends TestBase {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("herokup2"));

        WebElement frame1 = Driver.getDriver().findElement(By.xpath("//iframe"));

//        actions.moveToElement(frame1).click().doubleClick().perform();

        Driver.getDriver().switchTo().frame(frame1);
        Driver.getDriver().switchTo().frame(0);
        Driver.getDriver().switchTo().defaultContent(); //en disa gider en uste, framin disina
        Driver.getDriver().switchTo().parentFrame();  //bir ustteki frame gecer
        //Driver.getDriver().switchTo().frame("id degeri");





    }
}
