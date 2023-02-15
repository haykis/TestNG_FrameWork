package stepdefinitions;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.DownloadPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.nio.file.Files;
import java.nio.file.Paths;

public class Download extends TestBase {
    DownloadPage downloadPage=new DownloadPage();

    @Test
    public void test01(){
        String mainFolder= System.getProperty("user.dir"); //projenin kayitli oldugu yer
        String userFolder= System.getProperty("user.home");
        System.out.println("mainFolder = " + mainFolder);
        System.out.println("userFolder = " + userFolder);

        String path= userFolder+"\\Downloads\\sunset.jfif";  //saga tek slasi da kabul eder

        Driver.getDriver().get(ConfigReader.getProperty("herokup5"));
        Driver.waitBasic(1);
        downloadPage.yukleme.click();
        Driver.waitBasic(20);
        Assert.assertTrue(Files.exists(Paths.get(path)));

    }
}
