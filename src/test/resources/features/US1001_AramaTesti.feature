
@ilkDeneme
Feature: US1001 Arama Testi

  Scenario: TC01 kullanici phone arattiginda urun bulabilmeli
    Given kullanici testotomasyonu anasayfaya gider
    Then arama kutusuna phone yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC02 kullanici dress arattiginda urun bulabilmeli
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna dress yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC03 kullanici baby arattiginda urun bulabilmeli
    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna baby yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir