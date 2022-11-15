package OctAss2;

import java.util.Iterator;
import java.util.Set;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Click_Input_Submit 
{

 public static void main(String[] args) {

                    WebDriverManager.chromedriver().setup();

                   WebDriver driver = new ChromeDriver();
                              
                driver.get("https://demo.guru99.com/popup.php");
                 String parentWindow = driver.getWindowHandle();

               driver.findElement(By.xpath("/html/body/p/a")).click();  

                Set<String> ids = driver.getWindowHandles();

              Iterator<String> ID = ids.iterator();
                   while(ID.hasNext())

          {
                String childWindow = ID.next();

                   if(!parentWindow.equals(childWindow))

               {

                  driver.switchTo().window(childWindow);

                   driver.findElement(By.name("emailid")).sendKeys("Testuser@gmail.com");

               driver.findElement(By.name("btnLogin")).click();
               }
          
 
    

