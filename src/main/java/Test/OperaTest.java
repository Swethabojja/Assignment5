package Test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class OperaTest {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ChromeOptions options = new ChromeOptions();
		options.setBinary("/path/to/opera/browser");
		WebDriver driver = new ChromeDriver();
		driver.get("https://google.com");
	
		driver.getTitle();
driver.manage().timeouts().implicitlyWait(100,TimeUnit.SECONDS);
		WebElement SearchBox = driver.findElement(By.name("q"));
		WebElement SearchButton = driver.findElement(By.name("btnk"));
		
		SearchBox.sendKeys("Selenium");
		SearchButton.clear();
		
		SearchBox = driver.findElement(By.name("q"));
		SearchBox.getAttribute("value");
		
		driver.quit();
	}

}
