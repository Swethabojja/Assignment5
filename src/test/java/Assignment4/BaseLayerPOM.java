package Assignment4;
import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;
 
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
 
import io.github.bonigarcia.wdm.WebDriverManager;
 
public class BaseLayerPOM {
              
               public static void main(String[] args) throws Exception {
                              // TODO Auto-generated method stub
                             
 WebDriverManager.chromedriver().setup();
             WebDriver driver = new ChromeDriver();
         driver.manage().window().maximize();
          driver.get("https://itechnotion.com/what-will-be-the-cost-of-an-app-like-justdial-its-indias-no-1-local-business-directory/");
              driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));
           
       RetrieveHeadersPage RetrieveHeadersPageObject = new RetrieveHeadersPage();
        RetrieveHeadersPageObject.findAllH3Headers();
      RetrieveHeadersPageObject.findAllH4Headers();
     RetrieveHeadersPageObject.findAllH5Headers();
       RetrieveHeadersPageObject.findAllH6Headers();
                             
            SelectVdoctorPage SelectVdoctorPageObject = new SelectVdoctorPage(driver);
         Actions action = new Actions(driver);
           action.moveToElement(SelectVdoctorPageObject.products).perform();
      WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
     wait.until(ExpectedConditions.visibilityOfElementLocated(By.linkText("vDoctor")));
         SelectVdoctorPageObject.vDoctor.click();
 
           FeaturesPage FeaturesPageObject = new FeaturesPage(driver);
                FeaturesPageObject.featuresMenu.click();
              FeaturesPageObject.getAllFeatures();
                             
        TechnologyPage TechnologyPageObject = new TechnologyPage(driver);
          TechnologyPageObject.technologyMenu.click();
        TechnologyPageObject.getAllTechnologies();
                             
       SubmitPage SubmitPageObject = new SubmitPage(driver);
            SubmitPageObject.getQuote.click();
              
          driver.switchTo().frame(SubmitPageObject.popUp);
         File src = new File("D:\\Shilpa\\Selenium_Testing\\Assignments-ExcelR\\ReadExcel-SubmitApplicationToGetQuote.xlsx");
         FileInputStream fis = new FileInputStream(src);   
           XSSFWorkbook wb = new XSSFWorkbook(fis);                    
            XSSFSheet Sheet1 = wb.getSheetAt(0);
             String FullName = Sheet1.getRow(1).getCell(0).getStringCellValue();
           SubmitPageObject.fullName.sendKeys(FullName);
            String Email = Sheet1.getRow(1).getCell(1).getStringCellValue();
            SubmitPageObject.eMail.sendKeys(Email);
             String Country = Sheet1.getRow(1).getCell(2).getStringCellValue();
             SubmitPageObject.country.sendKeys(Country);
             String Message = Sheet1.getRow(1).getCell(3).getStringCellValue();
             SubmitPageObject.message.sendKeys(Message);
             SubmitPageObject.interestCheckbox.click();
             SubmitPageObject.Submit.click();
                             
                wb.close();
                             
}
}
 

