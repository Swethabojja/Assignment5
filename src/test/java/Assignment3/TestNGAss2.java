package Assignment3;
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;
public class TestNGAss2 {
WebDriver driver = null;
@DataProvider(name="LoginCredentials")
public static Object[][] UserPass()
{
       Object[][] obj = {
                    {"valid","Testuser@gmail.com","testuser1"}
       };
       return obj;
}
@Test(dataProvider="LoginCredentials")
  public void LoginPage(String type, String username, String password) {
         driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys(username);
         driver.findElement(By.id("passwd")).sendKeys(password);
  }
@BeforeMethod()
public void InitializeBrowser() {
        WebDriverManager.chromedriver().setup();
         this.driver = new ChromeDriver();
         driver.manage().window().maximize();
         driver.get("https://demo.guru99.com/test/login.html");
         driver.manage().timeouts().implicitlyWait(Duration.ofMillis(200));
}
  @AfterMethod
  public void QuitDriver() throws InterruptedException {
         Thread.sleep(3000);
         driver.close();
  }
}



