package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonPage;
import utilities.ConfigReader;
import utilities.Driver;

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
}