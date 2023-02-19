package stepdefinitions;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class HomeWork2 extends TestBase {

    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("guru"));
        Driver.waitBasic(1);
        try{
            Driver.getDriver().switchTo().frame("gdpr-consent-notice"); //id ile gittim
            Driver.getDriver().findElement(By.xpath("(//span[.='Tümünü Kabul Et'])[1]")).click();
        }catch (Exception e){
            System.out.println("cookies cikmadi");
        }
        Driver.waitBasic(1);
        actions.clickAndHold(guruDragPage.textBank).moveToElement(guruDragPage.debitAccount).release().perform();
        actions.clickAndHold(guruDragPage.textSales).moveToElement(guruDragPage.creditAccount).release().perform();
        actions.dragAndDrop(guruDragPage.obj5000left,guruDragPage.debitAmount).perform();
        actions.dragAndDrop(guruDragPage.obj5000right,guruDragPage.creditAmount).perform();
        Driver.waitBasic(1);
        //**************************
        softAssert.assertEquals("5000",guruDragPage.debitMovement.getText(), "Debit Movement is wrong");
        softAssert.assertEquals("5000",guruDragPage.creditMovement.getText(), "Credit Movement is wrong");
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//div[.='5000']")).isDisplayed()); //ikinci yol
        //************
        Assert.assertTrue(Driver.getDriver().findElement(By.xpath("//a[.='Perfect!']")).isDisplayed());
        Assert.assertEquals("Perfect!",guruDragPage.perfect.getText());

        softAssert.assertAll();
    }
}
