package Assignment4;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class FeaturesPage {
      
       @FindBy(xpath="//*[@id=\'navigation\']/ul/li[2]/a")
       public WebElement featuresMenu;
      
       @FindAll(@FindBy(xpath="//h4[@class='title']"))
       public List<WebElement> features;
      
       public void getAllFeatures()
       {
             List<WebElement> allFeatures = features;
             for(WebElement i:allFeatures)
             {
                    System.out.println(i.getText());
             }
       }
      
      
       public FeaturesPage(WebDriver driver) {
             PageFactory.initElements(driver, this);
       }
 
}


