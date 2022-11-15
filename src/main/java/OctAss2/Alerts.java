package OctAss2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Alerts {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	     WebDriverManager.chromedriver().setup();

         WebDriver driver = new ChromeDriver();
         
         driver.get("https://demo.guru99.com/test/delete_customer.php");
         
         driver.findElement(By.xpath("/html/body/form/table/tbody/tr[2]/td[2]/input")).sendKeys("01234");
         driver.findElement(By.name("Submit")).click();
         
         driver.switchTo().alert().accept();

         driver.switchTo().alert().getText();

         driver.switchTo().alert().accept();

	}

}
