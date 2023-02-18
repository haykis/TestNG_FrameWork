package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class DragDrop extends TestBase {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("guru"));
        Driver.waitBasic(1);
        Driver.getDriver().switchTo().frame("gdpr-consent-notice"); //id ile gittim
       // Driver.getDriver().switchTo().frame(Driver.getDriver().findElement(By.xpath("(//iframe)[7]")));
        Driver.waitBasic(1);
        Driver.getDriver().findElement(By.xpath("(//span[.='Tümünü Kabul Et'])[1]")).click();
        Driver.waitBasic(1);

        WebElement BesBin = Driver.getDriver().findElement(By.xpath("(//li[@id='fourth'])[2]"));
        WebElement gotur=Driver.getDriver().findElement(By.xpath("(//li[@class='placeholder'])[4]"));
        //actions.dragAndDrop(BesBin,gotur).perform();
        actions.clickAndHold(BesBin).moveToElement(gotur).release().perform();


    }
}
