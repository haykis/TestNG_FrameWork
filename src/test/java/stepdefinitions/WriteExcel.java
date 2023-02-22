package stepdefinitions;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.testng.annotations.Test;
import utilities.TestBase;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class WriteExcel extends TestBase {

    @Test
    public void test01() throws Exception {
        FileInputStream fileInputStream = new FileInputStream("src/test/resources/Capitals.xlsx");
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        workbook.getSheetAt(0).getRow(0).createCell(4).setCellValue("New Blok");


        //alttakiler olmadan yazmaz
        FileOutputStream fileOutputStream=new FileOutputStream("src/test/resources/Capitals.xlsx");
        workbook.write(fileOutputStream); //kaydediyorum
        fileOutputStream.close();
        fileInputStream.close();
        workbook.close();
    }
}
