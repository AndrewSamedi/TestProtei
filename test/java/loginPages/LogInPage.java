package loginPages;

import core.SeleniumPageTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import readProperties.ConfigProvider;

import java.security.Key;


public class LogInPage extends SeleniumPageTest {
   @FindBy(xpath = "//*[@id='loginEmail']")
    private WebElement emailText;

   @FindBy(xpath = "//*[@id=\"loginPassword\"]")
    private WebElement passwordText;

   @FindBy(xpath = "//*[@id=\"authButton\"]")
   private WebElement entryButt;

   public LogInPage(){
       driver.get(ConfigProvider.URL);
       PageFactory.initElements(driver,this);
   }

   public AnketaPage auth(String emailValue, String passwordValue){
       emailText.sendKeys(emailValue);
       passwordText.sendKeys(passwordValue);
       entryButt.click();
       return new AnketaPage();
   }
}
