package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class TestotomasyonuStepdefinitions {

    TestotomasyonPage testotomasyonPage = new TestotomasyonPage();

    @Given("kullanici testotomasyonu anasayfaya gider")
    public void kullanici_testotomasyonu_anasayfaya_gider() {
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
    }

    @Then("arama kutusuna phone yazip aratir")
    public void arama_kutusuna_phone_yazip_aratir() {
        testotomasyonPage.aramaKutusu.sendKeys("phone" + Keys.ENTER);
    }

    @Then("arama sonucunda urun bulunabildigini test eder")
    public void arama_sonucunda_urun_bulunabildigini_test_eder() {

        String unExpectedSonucYazisi = ConfigReader.getProperty("toUnexpectedAramaSonucu");
        String actualAramaSonucu = testotomasyonPage.aramaSonucuElementi
                .getText();

        Assertions.assertNotEquals(unExpectedSonucYazisi,actualAramaSonucu);

    }

    @Then("sayfayi kapatir")
    public void sayfayi_kapatir() {
        Driver.quitDriver();
    }

    @When("arama kutusuna dress yazip aratir")
    public void aramaKutusunaDressYazipAratir() {

        testotomasyonPage.aramaKutusu.sendKeys("dress" + Keys.ENTER);
    }


    @When("arama kutusuna baby yazip aratir")
    public void aramaKutusunaBabyYazipAratir() {
        testotomasyonPage.aramaKutusu.sendKeys("baby" + Keys.ENTER);
    }

    @When("arama kutusuna {string} yazip aratir")
    public void aramaKutusunaYazipAratir(String aranacakElement) {

        testotomasyonPage.aramaKutusu.sendKeys(aranacakElement + Keys.ENTER);
    }

    @And("{int} saniye bekler")
    public void saniyeBekler(int beklenecekSure) {

        ReusableMethods.bekle(beklenecekSure);
    }

    @Then("account linkini tiklar")
    public void account_linkini_tiklar() {
        testotomasyonPage.accountLinki.click();
    }

    @When("email olarak {string} girer")
    public void email_olarak_girer(String configurationEmailTuru) {

        testotomasyonPage.emailKutusu.sendKeys(  ConfigReader.getProperty(configurationEmailTuru)  );
    }

    @When("password olarak {string} girer")
    public void password_olarak_girer(String configurationPasswordTuru) {
        testotomasyonPage.passwordKutusu.sendKeys( ConfigReader.getProperty(configurationPasswordTuru));
    }

    @When("login butonuna basar")
    public void login_butonuna_basar() {
        testotomasyonPage.signInButonu.click();
    }

    @Then("basarili olarak giris yapilabildigini test eder")
    public void basarili_olarak_giris_yapilabildigini_test_eder() {

        Assertions.assertTrue(testotomasyonPage.signoutButonu.isDisplayed());

    }

    @Then("logout butonuna basar")
    public void logout_butonuna_basar() {

        testotomasyonPage.signoutButonu.click();

    }

    @And("giris yapilamadigini test eder")
    public void girisYapilamadiginiTestEder() {

        Assertions.assertTrue(testotomasyonPage.emailKutusu.isDisplayed());
    }

    @Given("kullanici {string} anasayfaya gider")
    public void kullanici_anasayfaya_gider(String configDosyasiUrl) {

        Driver.getDriver().get(ConfigReader.getProperty(configDosyasiUrl));
    }

}