package stepdefinitions;

import org.apache.poi.ss.usermodel.*;
import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBase;

import java.io.FileInputStream;

public class Excel extends TestBase {
    @Test
    public void test01() throws Exception{
        //excel icin pom da apachi olmasi gerek
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/Capitals.xlsx");
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet sheet = workbook.getSheetAt(0);
        Row row = sheet.getRow(0);
        Cell cell = row.getCell(0);
        System.out.println("cell = " + cell);

        String deger=workbook.getSheetAt(0).getRow(1).getCell(1).getStringCellValue();
        System.out.println("deger = " + deger);

        System.out.println("workbook.getSheetAt(0).getRow(2).getCell(2) = " + workbook.getSheetAt(0).getRow(2).getCell(2));

        Driver.getDriver().get(ConfigReader.getProperty(workbook.getSheetAt(0).getRow(0).getCell(3).getStringCellValue()));

        System.out.println("workbook.getSheetAt(0).getPhysicalNumberOfRows() = " + workbook.getSheetAt(0).getPhysicalNumberOfRows());
        System.out.println("workbook.getSheetAt(0).getLastRowNum() = " + workbook.getSheetAt(0).getLastRowNum());

        for(int rowNum=1;rowNum<=workbook.getSheetAt(0).getLastRowNum();rowNum++){
            System.out.println("Birinci Stun = "+ workbook.getSheetAt(0).getRow(rowNum).getCell(0));
        }
        for(int rowNum=1;rowNum<=workbook.getSheetAt(0).getLastRowNum();rowNum++){
            System.out.println("Ikinci Stun = "+ workbook.getSheetAt(0).getRow(rowNum).getCell(1));
        }

        fileInputStream.close();
        workbook.close();


    }
}
