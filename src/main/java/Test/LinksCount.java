package Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinksCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		
		List<WebElement> allLinks =  driver.findElements(By.tagName("a"));
		
		int count= allLinks.size();
		System.out.println(count);
		
		for(WebElement i : allLinks)
		{
			System.out.println(i.getText());
		}
		
		

	}

}
