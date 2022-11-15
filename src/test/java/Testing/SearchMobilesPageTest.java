package Testing;

import org.testng.annotations.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;


import io.github.bonigarcia.wdm.WebDriverManager;

public class SearchMobilesPageTest {
	
	WebDriver driver;
  @Test
  public void searchMobilesBelowPrice() {
	  driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("Mobiles Under 30000");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  
	  
  }
  @BeforeClass
  public void launchUrl()
  {
	    WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		driver.close();
		 
  }
  
  @AfterClass
  public void closeBrowser() {
	 
	  driver.close();
	 		 

  }
}
