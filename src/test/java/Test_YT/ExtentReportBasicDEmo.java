package Test_YT;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportBasicDEmo {
        
	public static void main(String[] args) {
		
		ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extentReports.html");
		
		   // create ExtentReports and attach reporter(s)
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(htmlReporter);
        
        // creates a toggle for the given test, adds all log events under it    
        ExtentTest test1 = extent.createTest("Google Search Test One", "this is atest to validate google search funtionality");
        
        test1.log(Status.INFO, "Starting Test Case");
WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
     driver.get("https://google.com");
        test1.pass("Navigate to google.com");
        
        driver.findElement(By.name("q")).sendKeys("Automation");
        test1.pass("Entered the text in SearchBox");
        driver.findElement(By.name("btnK")).sendKeys(Keys.RETURN);
        test1.pass("Pressed keyboard enter key");
        
        driver.close();
        driver.quit();
        test1.pass("Close the browser");
        
        
        test1.info("Test completed");
        
     // calling flush writes everything to the log file
        extent.flush();
        
   
        
	}

}
