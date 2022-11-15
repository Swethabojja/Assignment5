package OctAss2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Email {

	@SuppressWarnings("null")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/login.html");
		
		driver.findElement(By.id("email")).sendKeys("Usertest@test.com");
		driver.findElement(By.id("passwd")).sendKeys("Usertest@12");
		
	}

}
