
Feature: US1002 bastaki tekrarlari Background ile yapma

  Background: sayfaya gitme
    Given kullanici testotomasyonu anasayfaya gider


  Scenario: TC04 kullanici phone arattiginda urun bulabilmeli
    Then arama kutusuna phone yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC05 kullanici dress arattiginda urun bulabilmeli
    When arama kutusuna dress yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir


  Scenario: TC06 kullanici baby arattiginda urun bulabilmeli
    When arama kutusuna baby yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And sayfayi kapatir