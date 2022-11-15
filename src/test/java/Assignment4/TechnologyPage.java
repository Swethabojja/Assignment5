package Assignment4;

import java.util.List;
 
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class TechnologyPage {
      
       @FindBy(xpath="//*[@id=\'navigation\']/ul/li[3]/a")
       public WebElement technologyMenu;
      
       @FindAll(@FindBy(xpath="//*[@class='mb-0']"))
       public List<WebElement> technologies;
      
       public void getAllTechnologies()
       {
             List<WebElement> allTechnologies = technologies;
             for(WebElement i:allTechnologies)
             {
                    System.out.println(i.getText());
             }
       }
      
       public TechnologyPage(WebDriver driver) {    
             PageFactory.initElements(driver, this);
       }
 
}
