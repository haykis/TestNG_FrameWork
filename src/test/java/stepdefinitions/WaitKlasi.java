package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.time.Duration;

public class WaitKlasi extends TestBase {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("herokup3"));
        Driver.getDriver().findElement(By.xpath("//*[.='Remove']")).click();


        String expectedText = "It's gone!";

        WebDriverWait waitObje1 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));//explicitly wait
        String actualText = waitObje1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[@id='message']"))).getText();

        Assert.assertEquals(actualText, expectedText);
    }
}
