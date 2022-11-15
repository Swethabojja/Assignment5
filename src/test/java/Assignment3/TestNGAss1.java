package Assignment3;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import io.github.bonigarcia.wdm.WebDriverManager;

	public class TestNGAss1 {

	  WebDriver driver = null;

	@Test
	public void LoginPage() {   

	     driver.findElement(By.xpath("//*[@id=\'email\']")).sendKeys("Testuser@gmail.com");

	     driver.findElement(By.id("passwd")).sendKeys("12345@");            
	  }

	@BeforeMethod()

	public void InitializeBrowser() {

	WebDriverManager.chromedriver().setup();
	    this.driver = new ChromeDriver();

	    driver.manage().window().maximize();
	   driver.get("https://demo.guru99.com/test/login.html");

	   driver.manage().timeouts().implicitlyWait(Duration.ofMillis(100));

	}
	  @AfterMethod

	  public void QuitDriver() {

	   driver.close();
	  }
	}
	
