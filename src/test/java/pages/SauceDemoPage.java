package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class SauceDemoPage {

    public SauceDemoPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(name = "user-name")
    public WebElement usernameKutusu;

    @FindBy(id = "password")
    public WebElement passwordKutusu;

    @FindBy(id="login-button")
    public WebElement loginButton;

    @FindBy(xpath = "(//*[@class='inventory_item_name '])[1]")
    public WebElement ilkUrunIsimElementi;

    @FindBy(id = "add-to-cart")
    public WebElement addToCartButonu;

    @FindBy(className = "shopping_cart_link")
    public WebElement alisverisSepetElementi;

    @FindBy(xpath = "//*[@class='inventory_item_name']")
    public WebElement sepettekiUrunIsimElementi;


}