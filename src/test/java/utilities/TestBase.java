package utilities;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.asserts.SoftAssert;
import pages.DownloadPage;
import pages.GuruDragPage;

import java.time.Duration;

public class TestBase {
    protected Actions actions = new Actions(Driver.getDriver());
    public WebDriverWait waitObje1 = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));//explicitly wait
    public GuruDragPage guruDragPage=new GuruDragPage();
    public SoftAssert softAssert=new SoftAssert();

    @BeforeMethod
    public void setup(){
        // Proje nin asıl linki Configurations.properties dosyasına eklenir ve her testten önce proje sayfası açılması için bu metod içine eklenir.
        // Ancak yaptığımız örnek testlerden dolayı birçok farklı link ile çalışıyoruz. Sabit bir proje linkimiz olmadığı için aşağıdaki kod satırı yoruma alınmıştır.
        // Driver.getDriver().get(ConfigReader.getProperty("projectUrl"));
    }
    @AfterMethod
    public void tearDown(){

       // Driver.closeDriver();
    }
}

