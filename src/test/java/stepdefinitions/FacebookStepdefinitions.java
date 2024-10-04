package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import pages.FacebookPage;
import utilities.Driver;

public class FacebookStepdefinitions {

    FacebookPage facebookPage = new FacebookPage();
    Faker faker = new Faker();
    Actions actions = new Actions(Driver.getDriver());

    @Then("facebook cookies kabul eder")
    public void facebook_cookies_kabul_eder() {
        facebookPage.cookiesKabulButonu.click();
    }
    @Then("facebook'da yeni hesap olustur butonuna basar")
    public void facebook_da_yeni_hesap_olustur_butonuna_basar() {
        facebookPage.yeniKayitOlusturButonu.click();
    }
    @When("Faker class'indan bilgilerle facebook kayit formunu doldurur")
    public void faker_class_indan_bilgilerle_facebook_kayit_formunu_doldurur() {

        actions.click(facebookPage.kayitOlusturFirstnameKutusu)
                .sendKeys(faker.name().firstName())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.name().lastName())
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys("5")
                .sendKeys(Keys.TAB)
                .sendKeys("Mar")
                .sendKeys(Keys.TAB)
                .sendKeys("1990")
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.TAB)
                .sendKeys(Keys.ARROW_RIGHT)
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().emailAddress())
                .sendKeys(Keys.TAB)
                .sendKeys(faker.internet().password()).perform();

    }
    @Then("facebook kayit ol tusuna basar")
    public void facebook_kayit_ol_tusuna_basar() {
        facebookPage.kayitOlusturSubmitButonu.click();
    }
}