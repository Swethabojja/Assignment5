package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OptionTestCase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radioButton1 = driver.findElement(By.cssSelector("input[id='vfb-7-1']"));
		radioButton1.click();
	}

}
