package Assignment3;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNGAss3 {
       WebDriver driver = null;
       @BeforeMethod()
       public void InitializeBrowser() {
               WebDriverManager.chromedriver().setup();
               this.driver = new ChromeDriver();
               driver.manage().window().maximize();
               driver.get("https://demoqa.com/");
               driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
       @Test(groups="smoke",priority=1)
       public void clickOperation();
       {
       driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div/div[2]")).click();
       driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[2]/div")).click();
       }
       @Test(groups="regression",priority=2)
       public void fillTheForm();
       {
       driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div/div[2]")).click();
       driver.findElement(By.xpath("//*[@id=\'app\']/div/div/div[2]/div[1]/div/div/div[2]/div")).click();
             driver.findElement(By.id("firstName")).sendKeys("Swetha");
             driver.findElement(By.id("lastName")).sendKeys("Bojja");
       driver.findElement(By.xpath("//*[@id=\'userEmail\']")).sendKeys("swetha.212.sweety@gmail.com");
       driver.findElement(By.xpath("//*[@id=\'genterWrapper\']/div[2]/div[2]/label")).click();
       driver.findElement(By.xpath("//*[@id=\'userNumber\']")).sendKeys("9709169052");
             driver.findElement(By.id("dateOfBirthInput")).sendKeys("08 Nov 2022");
             driver.findElement(By.id("subjectsInput")).sendKeys("Selenium CoreJava"); 
       driver.findElement(By.xpath("//*[@id=\'hobbiesWrapper\']/div[2]/div[3]/label")).click();
              driver.findElement(By.id("uploadPicture")).sendKeys("D:\\Swetha\\documents.jpg");
       driver.findElement(By.xpath("//*[@id=\'currentAddress\']")).sendKeys("34-15-39,cyril street,Gnanapuram,Visakhapatnam");
             Select dropDownState = new Select(driver.findElement(By.xpath("//*[@id=\'state\']")));
             dropDownState.selectByVisibleText("Andra Pradesh");
             Select dropDownCity = new Select(driver.findElement(By.xpath("//*[@id=\'city\']")));
             dropDownCity.selectByVisibleText("Visakhapatnam");
             driver.findElement(By.xpath("//*[@id=\'submit\']")).click();
       }
        @AfterMethod
         public void QuitDriver() throws InterruptedException {
               Thread.sleep(3000);
              driver.close();
         }
}
	private void fillTheForm() {
		// TODO Auto-generated method stub
		
	}
	private void clickOperation() {
		// TODO Auto-generated method stub
		
	}


}
