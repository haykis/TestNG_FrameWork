package stepdefinitions;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

public class Action extends TestBase {
    @Test
    public void rightClickTest() throws InterruptedException {

        Driver.getDriver().get("https://the-internet.herokuapp.com/context_menu");

        WebElement element = Driver.getDriver().findElement(By.id("hot-spot"));

        actions.contextClick(element).perform();

        Driver.getDriver().switchTo().alert().accept();


    }

    @Test
    public void keyUpDown() throws InterruptedException {

        Driver.getDriver().get("https://www.ebay.de/");


        WebElement searchBox = Driver.getDriver().findElement(By.id("gh-ac"));
        actions.keyDown(searchBox, Keys.SHIFT).  // Burada SHIFT tuşuna basılı tutmak için keyDown kullanıyoruz.
                sendKeys("iphone x").            // Burada SHIFT tuşuna basılı iken iphone x yazısını küçük harf ile gönderiyoruz. Ancak searchBox içine büyük harf olarak giriş yapıyor driver.
                keyUp(searchBox, Keys.SHIFT).    // Burada SHIFT tuşuna basmayı bırakıyoruz.
                perform();


    }

    @Test
    public void scrollUpDown() throws InterruptedException {

        Driver.getDriver().get("https://www.ebay.de/");


        WebElement searchBox = Driver.getDriver().findElement(By.id("gh-ac"));
        actions.sendKeys(Keys.PAGE_DOWN).perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();

        actions.sendKeys(Keys.ARROW_DOWN).perform();

        actions.sendKeys(Keys.ARROW_UP).perform();

        actions.sendKeys(Keys.ARROW_UP).perform();

        actions.sendKeys(Keys.END).perform();

        actions.sendKeys(Keys.HOME).perform();

        actions.sendKeys(Keys.END).perform();

        actions.sendKeys(Keys.HOME).perform();

        actions.sendKeys(Keys.DOWN).perform();

    }

    @Test
    public void doubleClick() throws InterruptedException {

        Driver.getDriver().get("https://www.ebay.de/");

        WebElement searchBox = Driver.getDriver().findElement(By.id("gh-ac"));
        searchBox.sendKeys("iphone");

        actions.doubleClick(searchBox).perform();


    }

    @Test
    public void howerover() throws InterruptedException {

        Driver.getDriver().get("https://www.amazon.com/");


        WebElement accountMenu = Driver.getDriver().findElement(By.id("nav-link-accountList-nav-line-1"));
        actions.moveToElement(accountMenu).perform();

        WebElement accountLink = Driver.getDriver().findElement(By.xpath("(//span[contains(text(),'Account')])[2]"));
        accountLink.click();


        WebElement accountHeading = Driver.getDriver().findElement(By.tagName("h1"));
        String actualAccountHeadingText = accountHeading.getText();
        String expectedAccountHeading = "Your Account";

        Assert.assertEquals(actualAccountHeadingText, expectedAccountHeading);

    }
}
