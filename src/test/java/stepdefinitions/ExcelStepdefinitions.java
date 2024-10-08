package stepdefinitions;

import io.cucumber.java.en.Then;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.Keys;
import pages.TestotomasyonPage;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ExcelStepdefinitions {

    TestotomasyonPage testotomasyonPage = new TestotomasyonPage();

    String excelSatirindakiUrunIsmi ;
    Double excelSatirindakiMinUrunMiktari ;
    Double toSayfasindaBulunanUrunSayisi;

    @Then("urun excelindeki {string} daki urunun min. miktarini ve urun ismini kaydeder")
    public void urun_excelindeki_daki_urunun_min_miktarini_ve_urun_ismini_kaydeder(String istenenSatir) throws IOException {
        // satir numarasi olarak String 2 gelecek, buna dikkat edelim

        String dosyaYolu = "src/test/resources/urunler.xlsx";
        FileInputStream fileInputStream = new FileInputStream(dosyaYolu);
        Workbook workbook = WorkbookFactory.create(fileInputStream);
        Sheet calisilanSayfa = workbook.getSheet("Sheet1");

        int index = Integer.parseInt(istenenSatir)-1;

        excelSatirindakiUrunIsmi = calisilanSayfa.getRow(index).getCell(0).getStringCellValue();
        excelSatirindakiMinUrunMiktari = calisilanSayfa.getRow(index).getCell(1).getNumericCellValue();

    }

    @Then("urun ismini testotomasyonu sayfasinda aratir ve bulunan sonuc sayisini kaydeder")
    public void urun_ismini_testotomasyonu_sayfasinda_aratir_ve_bulunan_sonuc_sayisini_kaydeder() {
        testotomasyonPage.aramaKutusu.sendKeys(excelSatirindakiUrunIsmi + Keys.ENTER);

        String aramaSonucuStr = testotomasyonPage.aramaSonucuElementi.getText(); // 3 Products Found
        aramaSonucuStr = aramaSonucuStr.replaceAll("\\D",""); // "3"

        toSayfasindaBulunanUrunSayisi = Double.parseDouble(aramaSonucuStr);

    }
    @Then("bulunan sonuc sayisinin {string} da verilen min. miktara esit veya daha fazla oldugunu test eder")
    public void bulunan_sonuc_sayisinin_da_verilen_min_miktara_esit_veya_daha_fazla_oldugunu_test_eder(String istenenSatir) {

        Assertions.assertTrue(excelSatirindakiMinUrunMiktari <= toSayfasindaBulunanUrunSayisi);
    }


}