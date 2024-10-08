package stepdefinitions;

import com.github.javafaker.Faker;
import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import pages.WebUniversityPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class WebDriverUniversityStepdefinitions {

    WebUniversityPage webUniversityPage = new WebUniversityPage();

    @When("login Portal'a  kadar asagi iner")
    public void login_portal_a_kadar_asagi_iner() {
        JavascriptExecutor jse = (JavascriptExecutor) Driver.getDriver();

        jse.executeScript("arguments[0].scrollIntoView({block: 'center'}); ",
                webUniversityPage.loginPortalElementi);

    }
    @When("login Portal'a tiklar")
    public void login_portal_a_tiklar() {
        webUniversityPage.loginPortalElementi.click();
    }
    @Then("acilan yeni window'a gecis yapar")
    public void acilan_yeni_window_a_gecis_yapar() {

        ReusableMethods.switchToWindowByTitle(Driver.getDriver() , ConfigReader.getProperty("webUniAcilanSayfaTitle"));

    }
    @Then("username ve password kutularina fake degerler yazdirir")
    public void username_ve_password_kutularina_fake_degerler_yazdirir() {
        Faker faker = new Faker();

        webUniversityPage.usernameKutusu.sendKeys(faker.name().username());
        webUniversityPage.passwordKutusu.sendKeys(faker.internet().password());

    }
    @Then("webDriverUniversity login butonuna basar")
    public void web_driver_university_login_butonuna_basar() {
        webUniversityPage.loginButonu.click();
    }
    @Then("popup'ta cikan yazinin {string} oldugunu test eder")
    public void popup_ta_cikan_yazinin_oldugunu_test_eder(String expectedAlertText) {

        String actualAlertYazisi = Driver.getDriver()
                .switchTo().alert()
                .getText();


        Assertions.assertEquals(expectedAlertText,actualAlertYazisi);
    }
    @Then("OK diyerek popup'i kapatir")
    public void ok_diyerek_popup_i_kapatir() {

        Driver.getDriver()
                .switchTo().alert()
                .accept();

    }
    @When("ilk windowa geri doner")
    public void ilk_windowa_geri_doner() {

        ReusableMethods.switchToWindowByUrl(Driver.getDriver(), ConfigReader.getProperty("webUniUrl"));

    }
    @Then("ilk windowa donuldugunu test eder")
    public void ilk_windowa_donuldugunu_test_eder() {

        String expectedTitle = ConfigReader.getProperty("webUniAnasayfaTitle");
        String actualTitle = Driver.getDriver().getTitle();

        Assertions.assertEquals(expectedTitle,actualTitle);

    }
}