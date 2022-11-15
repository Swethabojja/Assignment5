package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FirefoxTest
{

	public static void main(String[] args) {
		// TODO Auto-generated method stu

				WebDriverManager.firefoxdriver().setup();
				WebDriver driver = new FirefoxDriver();
				driver.get("https://www.google.com");
			
	}

}
