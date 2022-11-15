package sept17;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class UploadFileDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

WebDriverManager.chromedriver().setup();
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://demo.guru99.com/test/upload/");
	
		WebElement fileUpload = driver.findElement(By.id("uploadfile_0"));
	
		fileUpload.sendKeys("C:\\Users\\sweth\\OneDrive\\Desktop\\Assignments");
		driver.findElement(By.cssSelector("input[id='terms']")).click();
	

	}

}
