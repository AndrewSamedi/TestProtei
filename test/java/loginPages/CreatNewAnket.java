package loginPages;

import core.SeleniumPageTest;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreatNewAnket extends SeleniumPageTest {
    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[1]")
    WebElement crEmail;

    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[2]")
    WebElement crName;

    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[3]")
    WebElement crGender;

    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[4]")
    WebElement crChoice1;

    @FindBy(xpath = "//*[@id=\"dataTable\"]/tbody/tr/td[5]")
    WebElement crChoice2;

    public CreatNewAnket() {
        PageFactory.initElements(driver,this);
    }

    public String getEmail(){
        return crEmail.getText();
    }

    public String getName(){
        return crName.getText();
    }

    public String getGender(){
        return crGender.getText();
    }

    public String getChoice1(){
        return crChoice1.getText();
    }
    public String getChoice2(){
        return crChoice2.getText();
    }
}
