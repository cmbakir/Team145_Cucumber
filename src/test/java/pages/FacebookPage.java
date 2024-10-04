package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class FacebookPage {

    public FacebookPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "(//span[text()='Allow all cookies'])[2]")
    public WebElement cookiesKabulButonu;

    @FindBy(xpath = "//input[@id='email']")
    public WebElement emailKutusu;

    @FindBy(xpath = "//input[@id='pass']")
    public WebElement passwordKutusu;

    @FindBy(name = "login")
    public WebElement loginButonu;

    @FindBy(xpath = "//*[@*='open-registration-form-button']")
    public WebElement yeniKayitOlusturButonu;

    @FindBy(name = "firstname")
    public WebElement kayitOlusturFirstnameKutusu;

    @FindBy(name =  "websubmit")
    public WebElement kayitOlusturSubmitButonu;


}