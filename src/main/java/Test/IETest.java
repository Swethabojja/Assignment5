package Test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class IETest
{

	public static void main(String[] args) {
		// TODO Auto-generated method stu

				WebDriverManager.edgedriver().setup();
				WebDriver driver = new EdgeDriver();
				driver.get("https://www.google.com");
			
	}

}
