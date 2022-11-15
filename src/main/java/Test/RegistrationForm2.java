package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class RegistrationForm2 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();

WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/contact-sales/");
		WebElement noEmp = driver.findElement(By.id("Form_getForm_NoOfEmployees"));
		
		Select dropDownNoOfEmp = new Select(noEmp);
		dropDownNoOfEmp.selectByValue("11 - 15");

	}

}
