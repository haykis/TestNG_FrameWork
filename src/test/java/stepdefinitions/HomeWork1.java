package stepdefinitions;
import org.openqa.selenium.*;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;
import java.util.ArrayList;
import java.util.List;
public class HomeWork1 extends TestBase {
    @Test
    public void amazon(){
        Driver.getDriver().get(ConfigReader.getProperty("amazon"));
        Driver.waitBasic(20);

          WebElement signMenu = Driver.getDriver().findElement(By.xpath("//a[@id='nav-link-accountList']"));
          actions.moveToElement(signMenu).perform();

        Driver.waitBasic(20);
        Driver.getDriver().findElement(By.xpath("//a/span[.='Find a List or Registry']")).click();
        Driver.waitBasic(20);
        String textGift = Driver.getDriver().findElement(By.xpath("//div[@class='gr-hero__title']")).getText();

        System.out.println("textGift = " + textGift);
        Driver.waitBasic(10);

        //***EBAY***
        ((JavascriptExecutor) Driver.getDriver()).executeScript("window.open('"+ConfigReader.getProperty("ebay")+"', '_blank');");

        Driver.waitBasic(10);

        List<String> handles = new ArrayList<>();

        handles.addAll(Driver.getDriver().getWindowHandles());

        Driver.getDriver().switchTo().window(handles.get(1));


        for (String eleman:handles) {
            System.out.println("eleman = " + eleman);
         }

        Driver.waitBasic(20);

        Driver.getDriver().findElement(By.xpath("//div/input[@class='gh-tb ui-autocomplete-input']")).sendKeys(textGift+ Keys.ENTER);
        Driver.waitBasic(20);

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div/span[.='$9.00']")).isDisplayed());

        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div/span[.='$9.00']")).getText().contains("$9.00"));
        System.out.println("Fiyat= " + Driver.getDriver().findElement(By.xpath("//div/span[.='$9.00']")).getText());


    }
}
