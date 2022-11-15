package Assignment4;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
 
public class SubmitPage {
              
     @FindBy(xpath="//*[@id=\'topnav\']/div/div[2]/a")
      public WebElement getQuote;
              
   @FindBy(id="hs-form-iframe-0")
   public WebElement popUp;
              
    @FindBy(id="firstname-e83e7559-32cd-4d21-8fe5-970edce9bc8e")
     public WebElement fullName;
              
     @FindBy(id="email-e83e7559-32cd-4d21-8fe5-970edce9bc8e")
      public WebElement eMail;
              
      @FindBy(id="country-e83e7559-32cd-4d21-8fe5-970edce9bc8e")
        public WebElement country;
              
       @FindBy(id="message-e83e7559-32cd-4d21-8fe5-970edce9bc8e")
         public WebElement message;
              
         @FindBy(id="voomplatform3-e83e7559-32cd-4d21-8fe5-970edce9bc8e")
         public WebElement interestCheckbox;
              
          @FindBy(xpath="//input[@type='submit']")
           public WebElement Submit;
              
          public SubmitPage(WebDriver driver) {  
           PageFactory.initElements(driver, this);
               }
 
}

