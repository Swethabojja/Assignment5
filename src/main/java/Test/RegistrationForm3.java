package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		
driver.findElement(By.linkText("Contact Sales")).click();
		
		//driver.findElement(By.name("FullName")).sendKeys("TestUser2");
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("UserName");
		
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("987654321");
		
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("Test@test.com");
		
		
		
WebElement Country = driver.findElement(By.id("Form_getForm_Country"));
		
		Select dropDwonCountry = new Select(Country);
	
		dropDwonCountry.selectByIndex(1);
		
WebElement NoOfEmployees = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		
		
		Select dropDwonNoOfEmployese = new Select(NoOfEmployees);
		dropDwonNoOfEmployese.selectByValue("11-15");
	}

}
