package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class DemoqaPage {

    public DemoqaPage(){
        PageFactory.initElements(Driver.getDriver(), this);

    }
    @FindBy(xpath = "(//*[@class='card-body'])[2]")
    public WebElement formLinki;

    @FindBy(xpath = "(//*[@class='header-text'])[1]")
    public WebElement elementLinki;

    @FindBy(xpath = "//*[text()='Check Box']")
    public WebElement checkBoxLinki;

    @FindBy(xpath = "(//*[@type='button'])[4]")
    public WebElement homeOku;

    @FindBy(xpath = "(//*[@type='button'])[5]")
    public WebElement desktopOku;

    @FindBy(xpath = "(//*[@class='rct-checkbox'])[3]")
    public WebElement noteCheckBoxu;

    @FindBy(xpath = "(//*[@class='rct-checkbox'])[4]")
    public WebElement commandsCheckBoxu;





}
