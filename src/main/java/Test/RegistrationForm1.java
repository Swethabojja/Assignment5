package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		
driver.findElement(By.linkText("Book a Free Demo")).click();
		
		//driver.findElement(By.name("FullName")).sendKeys("TestUser2");
		driver.findElement(By.id("Form_getForm_FullName")).sendKeys("TestUser1");
		
		
		driver.findElement(By.id("Form_getForm_Email")).sendKeys("Test@test.com");
		driver.findElement(By.id("Form_getForm_Contact")).sendKeys("9988888888");
		
		
WebElement Country = driver.findElement(By.id("Form_getForm_Country"));
		
		Select dropDwonCountry = new Select(Country);
		//dropDwonCountry.selectByIndex(1);
		//dropDwonCountry.selectVisibleText("China");
		dropDwonCountry.selectByValue("India");
WebElement NoOfEmployees = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		
		Select dropDwonCountry1 = new Select(NoOfEmployees);
		//dropDwonCountry.selectByIndex(1);
		//dropDwonCountry.selectVisibleText("15-20");
		dropDwonCountry1.selectByValue("30-50");

	}

}
