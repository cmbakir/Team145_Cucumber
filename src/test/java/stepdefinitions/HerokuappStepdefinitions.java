package stepdefinitions;

import io.cucumber.java.en.*;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.NoSuchElementException;
import pages.HerokuPage;

public class HerokuappStepdefinitions {

    HerokuPage herokuPage = new HerokuPage();

    @When("kullanici Add Element butonuna basar")
    public void kullanici_add_element_butonuna_basar() {
        herokuPage.addElementButonu.click();
    }
    @When("Delete butonu’nun gorunur oldugunu test eder")
    public void delete_butonu_nun_gorunur_oldugunu_test_eder() {
        Assertions.assertTrue( herokuPage.deleteButonu.isDisplayed());
    }
    @Then("Delete tusuna basar")
    public void delete_tusuna_basar() {

        herokuPage.deleteButonu.click();

    }
    @Then("Add Remove Elements yazisinin gorunur oldugunu test eder")
    public void add_remove_elements_yazisinin_gorunur_oldugunu_test_eder() {
        Assertions.assertTrue(herokuPage.addRemoveYaziElementi.isDisplayed());
    }

    @Then("Delete butonu’nun gorunur olmadigini test eder")
    public void deleteButonuNunGorunurOlmadiginiTestEder() {

        // Olmayan bir webElementi kullanmaya calisirsak
        // NoSuchElementException aliriz
        // Biz gorunur olmadigini test etmek istiyorsak
        // aslinda NoSuchElementException olusmasini test etmeliyiz


        try {
            herokuPage.deleteButonu.click();
            throw  new AssertionError("Delete butonu kullanilabilir durumda");

        }catch (NoSuchElementException e){
            // NoSuchElementException olustu ise testimiz PASSED olmalidir
            Assertions.assertTrue(true);
        }



    }
}