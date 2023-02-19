package stepdefinitions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TablesPage;
import utilities.ConfigReader;
import utilities.Driver;
import java.util.ArrayList;
import java.util.List;
public class HomeWork3 {
    TablesPage tablesPage=new TablesPage();
    @Test
    public void test01(){
        Driver.getDriver().get(ConfigReader.getProperty("herokup6"));
        Driver.waitBasic(1);

        List<Double> stunDort = new ArrayList<>();
        for (int a=1;a<=4;a++){
            String sDeger=tablesPage.tabloReturn(1,a,4).replace("$","");
            Double dDeger = Double.parseDouble(sDeger);
            stunDort.add(dDeger);
        }
        System.out.println("stunDort = " + stunDort);
        List<Double> buyukElli = new ArrayList<>();
        for (Double eleman:stunDort) {
            if(eleman>50){
                buyukElli.add(eleman);}
        }
        System.out.println("buyukElli = " + buyukElli);

        Assert.assertTrue(buyukElli.toString().contains("100.0"));
    }

    @Test
    public void test02(){
        Driver.getDriver().get(ConfigReader.getProperty("herokup6"));
        Driver.waitBasic(1);

        List<WebElement> ikinciTablo = Driver.getDriver().findElements(By.xpath("//table[2]//tbody//tr//td[4]"));

        List<Double> dListe = new ArrayList<>();
        for (WebElement eleman:ikinciTablo) {
            String sListe=eleman.getText().replace("$","");
            dListe.add(Double.parseDouble(sListe));
        }
        System.out.println("dListe = " + dListe);

        List<Double> buyukElli = new ArrayList<>();
        for (Double eleman:dListe) {
            if(eleman>50){
                buyukElli.add(eleman);}
        }
        System.out.println("buyukElli = " + buyukElli);

        Assert.assertTrue(buyukElli.toString().contains("100.0"));
    }
}
