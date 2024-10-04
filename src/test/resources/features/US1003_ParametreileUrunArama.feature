
Feature: US1003 Kullanici parametre olarak yazdigi kelimeyi aratir

  Scenario: TC07 kullanici istedigi kelimeyi aratabilmeli

    Given kullanici testotomasyonu anasayfaya gider
    When arama kutusuna "backpack" yazip aratir
    Then arama sonucunda urun bulunabildigini test eder
    And 5 saniye bekler
    And sayfayi kapatir

      # cucumber'da feature'a yazilan sayilar parametre olarak algilanir