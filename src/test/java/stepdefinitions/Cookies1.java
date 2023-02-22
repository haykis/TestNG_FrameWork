package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

public class Cookies1 extends TestBase {
    @Test
    public void test01(){
        Cookie cook = new Cookie("DisplayInfo1", "PADI=842919&DateFormat=%25A%2C+%25B+%25%23d%2C+%25Y&DisplayName=Testing+Selenium");
        Cookie cook2 = new Cookie("UserInfo1", "UserId=45LCWNBH");
        Driver.getDriver().get(ConfigReader.getProperty("cookies"));
        Driver.waitBasic(1);
        Driver.getDriver().manage().addCookie(cook);  //cookies leri bu sekilde kodla girip ekliyoruz
        Driver.getDriver().manage().addCookie(cook2); //daha sonra tekrar syfaya gidersek bir daha sormuyor
        Driver.waitBasic(1);

        Driver.getDriver().get(ConfigReader.getProperty("cookies"));
        Driver.waitBasic(1);
        WebElement testReminder=waitObje1.until(ExpectedConditions.visibilityOfElementLocated(By.partialLinkText("TEST REMINDER")));
        Assert.assertTrue(testReminder.isDisplayed());
        Driver.waitBasic(1);

        Driver.getDriver().manage().deleteCookie(cook);
        Driver.getDriver().manage().deleteCookie(cook2);
        //Driver.getDriver().manage().deleteAllCookies();
        Driver.getDriver().navigate().refresh();



    }
}
