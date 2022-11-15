package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindCountry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://demo.guru99.com/test/radio.html");
		
		driver.findElement(By.id("vfd-7-1")).click();
		driver.findElement(By.id("vfd-6-1")).click();
		driver.findElement(By.id("vfd-6-2")).click();

		driver.navigate().to("https://demo.guru99.com/test/newtours/register.php");
		
		
WebElement Country = driver.findElement(By.name("Country"));
		
		Select dropDwonCountry = new Select(Country);
				dropDwonCountry.selectByValue("KUWAIT");

	}

}
