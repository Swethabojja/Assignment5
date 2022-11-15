package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Navigator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		
           driver.navigate().to("http://www.snapdeal.com/");
           driver.navigate().back();
           driver.navigate().forward();
           driver.navigate().refresh();
           
           driver.quit();
   	
	}

}
