package loginPages;


import core.SeleniumPageTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AnketaPage extends SeleniumPageTest {
    @FindBy(xpath = "//*[@id=\"dataEmail\"]")
    private WebElement emailText;

    @FindBy(xpath = "//*[@id=\"dataName\"]")
    private WebElement nameText;

    @FindBy(xpath = "//*[@id=\"dataCheck11\"]")
    private WebElement checkVar1;

    @FindBy(xpath = "//*[@id=\"dataSelect21\"]")
    private WebElement checkVar2;

    @FindBy(xpath = "//*[@id=\"dataSend\"]")
    private WebElement addButt;

    @FindBy(xpath = "/html/body/div[3]/div/div/div[2]/button")
    WebElement successAdd;

   public AnketaPage(){
        PageFactory.initElements(driver,this);
    }

    public CreatNewAnket creatAnketa(String email,String name){
        emailText.sendKeys(email);
        nameText.sendKeys(name);
        checkVar1.click();
        checkVar2.click();
        addButt.click();
        successAdd.click();
        return new CreatNewAnket();
    }

}
