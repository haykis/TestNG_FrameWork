package stepdefinitions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class Alert {
    @BeforeClass
    public static void setUp(){
        Driver.getDriver().get(ConfigReader.getProperty("website"));

    }
    @Test
    public void test1(){

    }
}
