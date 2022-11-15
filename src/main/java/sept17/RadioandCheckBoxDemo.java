package sept17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RadioandCheckBoxDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/radio.html");
		
		WebElement radioButton1 = driver.findElement(By.cssSelector("input[id='vfb-7-1']"));
		radioButton1.click();
		WebElement radioButton2 = driver.findElement(By.cssSelector("input[id='vfb-7-2']"));
		radioButton2.click();
		WebElement radioButton3 = driver.findElement(By.cssSelector("input[id='vfb-7-3']"));
		radioButton3.click();

		WebElement checkbox1 = driver.findElement(By.cssSelector("input[id='vfb-6-0']"));
		checkbox1.click();
		WebElement checkbox2 = driver.findElement(By.cssSelector("input[id='vfb-6-1']"));
		checkbox2.click();
		WebElement checkbox3 = driver.findElement(By.cssSelector("input[id='vfb-6-2']"));
		checkbox3.click();

	}

}
