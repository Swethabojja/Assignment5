package sept17;

import java.util.Iterator;
import java.util.Set;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandleDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.spicejet.com/");
		String parentWindow = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//div[contains(text(),'Gift Card')]")).click();
		
		Set<String> ids = driver.getWindowHandles();
		Iterator<String> I1 = ids.iterator();
		
		while(I1.hasNext())
		{
			String child_window = I1.next();
			if(!parentWindow.equals(child_window))
			{
				driver.switchTo().window(child_window);
				String title = driver.getTitle();
				System.out.println(title);
				driver.close();
			}

			
		}
		
		driver.switchTo().window(parentWindow);

	}

}
