package sept17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RegisterUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/");
		WebElement inputEmail = driver.findElement(By.xpath("//input[@id='myText']"));
	
		inputEmail.sendKeys("priyatest542@gmail.com");
	
		WebElement buttonTryFree = driver.findElement(By.xpath("//button[@id='linkadd']"));
		buttonTryFree.click();
	

	}

}
