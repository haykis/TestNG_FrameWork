package stepdefinitions;

import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import utilities.Driver;
import utilities.TestBase;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class WindowHandle extends TestBase {
    @Test
    public void testWindowHandle() throws InterruptedException {

        Driver.getDriver().get("https://the-internet.herokuapp.com/windows");

        ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open('https://www.google.com', '_blank');");

        ((JavascriptExecutor)Driver.getDriver()).executeScript("window.open('https://www.amazon.com', '_blank');");

        Set<String> handles = Driver.getDriver().getWindowHandles();
        Driver.getDriver().switchTo().window(handles.toArray()[0].toString());


        for (int i = 0; i < handles.size(); i++) {

            Driver.getDriver().switchTo().window(handles.toArray()[i].toString());
            System.out.println(i + ". window ==> " + Driver.getDriver().getTitle());


        }
    }
}

