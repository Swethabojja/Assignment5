package OctAss2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();

        WebDriver driver = new ChromeDriver();
        driver.get("https://demo.guru99.com/test/guru99home/");
        driver.switchTo().frame("a077aa5e");

        driver.findElement(By.xpath("/html/body/a/img")).click();
	}

}
