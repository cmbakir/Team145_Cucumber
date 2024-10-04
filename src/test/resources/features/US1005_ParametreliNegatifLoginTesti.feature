
Feature: US1005 gecersiz bilgilerle giris yapilamaz

  Scenario: TC09 gecersiz email ile giris yapilamamali

    Given kullanici testotomasyonu anasayfaya gider
    Then account linkini tiklar
    When email olarak "toGecersizEmail" girer
    And password olarak "toGecerliPassword" girer
    Then login butonuna basar
    And giris yapilamadigini test eder
    And 2 saniye bekler
    And sayfayi kapatir


  Scenario: TC10 gecersiz password ile giris yapilamamali
    Given kullanici testotomasyonu anasayfaya gider
    Then account linkini tiklar
    When email olarak "toGecerliEmail" girer
    And password olarak "toGecersizPassword" girer
    Then login butonuna basar
    And giris yapilamadigini test eder
    And 2 saniye bekler
    And sayfayi kapatir


  Scenario: TC11 gecersiz email gecersiz password testi
    Given kullanici testotomasyonu anasayfaya gider
    Then account linkini tiklar
    When email olarak "toGecersizEmail" girer
    And password olarak "toGecersizPassword" girer
    Then login butonuna basar
    And giris yapilamadigini test eder
    And 2 saniye bekler
    And sayfayi kapatir