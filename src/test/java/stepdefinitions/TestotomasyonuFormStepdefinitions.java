package stepdefinitions;

import dev.failsafe.internal.util.Assert;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.support.ui.Select;
import pages.ToFormPage;

public class TestotomasyonuFormStepdefinitions {


    ToFormPage toFormPage = new ToFormPage();
    Select select = new Select(toFormPage.dtAyDropdownMenu);

    @Then("dogum tarihi ay acilir menuden {string} secer")
    public void dogum_tarihi_ay_acilir_menuden_secer(String secilecekAy) {
        select.selectByVisibleText(secilecekAy);
    }
    @Then("secilen ayin {string} oldugunu test eder")
    public void secilen_ayin_oldugunu_test_eder(String expectedSeciliOption) {

        String actualSeciliOption = select.getFirstSelectedOption()
                .getText();

        Assertions.assertEquals(expectedSeciliOption,actualSeciliOption);
    }
    @When("acilir menude toplam {int} option oldugunu test eder")
    public void acilir_menude_toplam_option_oldugunu_test_eder(Integer expectedOptionSayisi) {

        int actualOptionSayisi = select.getOptions().size();

        Assertions.assertEquals(expectedOptionSayisi,actualOptionSayisi);
    }
}