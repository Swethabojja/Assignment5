package Assignment4;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class RetrieveHeadersPage {
      
       @FindAll(@FindBy(tagName="h3"))
       public List<WebElement> h3Headers;
      
       public void findAllH3Headers()
       { 
             List<WebElement> allH3Headers = h3Headers;
             for(WebElement i:allH3Headers)
             {
                    System.out.println(i.getText());
             }
       }
      
       @FindAll(@FindBy(tagName="h4"))
       public List<WebElement> h4Headers;
      
       public void findAllH4Headers()
       {
             List<WebElement> allH4Headers = h4Headers;
             for(WebElement i:allH4Headers)
             {
                    System.out.println(i.getText());
             }
       }
      
       @FindAll(@FindBy(tagName="h5"))
       public List<WebElement> h5Headers;
      
       public void findAllH5Headers()
       {
             List<WebElement> allH5Headers = h5Headers;
             for(WebElement i:allH5Headers)
             {
                    System.out.println(i.getText());
             }
       }
      
       @FindAll(@FindBy(tagName="h6"))
       public List<WebElement> h6Headers;
      
       public void findAllH6Headers()
       {
             List<WebElement> allH6Headers = h6Headers;
             for(WebElement i:allH6Headers)
             {
                    System.out.println(i.getText());
             }
       }
      
       public void RetrieveHeadersPage(WebDriver driver) {
             PageFactory.initElements(driver, this);
 
       }

}
