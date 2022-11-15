package Assignment4;

import java.io.File;
import java.io.FileInputStream;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class ApachePOIDataDriven {
 
       public static void main(String[] args) throws Exception {
             // TODO Auto-generated method stub
            
             WebDriverManager.chromedriver().setup();
             WebDriver driver = new ChromeDriver();
             driver.manage().window().maximize();
             driver.get("http://demo.guru99.com/V4/");
             File file = new File("https://d.docs.live.net/408810ace63990e7/Documents//assignment.xlsx");
             FileInputStream fis = new FileInputStream(file);
             XSSFWorkbook wb = new XSSFWorkbook(fis);
             XSSFSheet Sheet1 = wb.getSheetAt(0);
             String username = Sheet1.getRow(0).getCell(0).getStringCellValue();
             
             driver.findElement(By.name("uid")).sendKeys(username);
             
             String password = Sheet1.getRow(0).getCell(1).getStringCellValue();
             driver.findElement(By.name("password")).sendKeys(password);
             
             driver.findElement(By.name("btnLogin")).click();
              
             Alert notValid = driver.switchTo().alert();
             notValid.accept();
             
             wb.close();
             
 
       }
 
}

