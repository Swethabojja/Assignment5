package testcase;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class AllLinksDemo {
	WebDriver driver;
	  @Test
	  public void allLink() {
		 
			List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
		
			int count= allLinks.size();
			System.out.println(count);
			
			for(WebElement i : allLinks)
			{
				System.out.println(i.getText());
			}
	  }
  @Test
  public void f() {
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		
}
  @AfterClass
  public void afterClass() {
	  driver.close();

  }

}
