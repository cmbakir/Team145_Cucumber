
Feature: US1007 Facebook yeni kayit


  Scenario:TC13 kullanici fakerdan degerlerle kayit olusturabilmeli

    Given kullanici "facebookUrl" anasayfaya gider
    Then facebook cookies kabul eder
    And 1 saniye bekler
    And facebook'da yeni hesap olustur butonuna basar
    And 1 saniye bekler
    When Faker class'indan bilgilerle facebook kayit formunu doldurur
    Then 1 saniye bekler
    And facebook kayit ol tusuna basar
    Then 12 saniye bekler