package OctAss2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebtableLogin {

   public static void main(String[] args) {

           WebDriverManager.chromedriver().setup();

         WebDriver driver = new ChromeDriver();

            driver.get("https://demo.guru99.com/test/web-table-element.php");

      List<WebElement> allNames = driver.findElements(By.cssSelector("table.dataTable td:nth-of-type(1)"));
                              for(WebElement i:allNames)

         {

             System.out.println(i.getText());

         }
                     driver.navigate().to("https://demo.guru99.com/test/login.html");

                  driver.findElement(By.id("email")).sendKeys("abcdef@gmail.com");

                   driver.findElement(By.id("passwd")).sendKeys("abcd@123");

                  driver.findElement(By.id("SubmitLogin")).click();

               }

	}

