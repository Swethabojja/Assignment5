package Assignment4;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class SelectVdoctorPage {
 
       @FindBy(linkText = "Products")
       public WebElement products;
      
       @FindBy(linkText = "vDoctor")
       public WebElement vDoctor;
      
       public SelectVdoctorPage(WebDriver driver) { 
             PageFactory.initElements(driver, this);
       }     
}

