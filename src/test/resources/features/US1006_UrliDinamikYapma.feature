
Feature: US1006 Dinamik Url kullanimi

  @wip
  Scenario: TC12 kullanici url'i dinamik olarak girebilmeli

    Given kullanici "toFormUrl" anasayfaya gider
    * 3 saniye bekler
    Then dogum tarihi ay acilir menuden "Haziran" secer
    And secilen ayin "Haziran" oldugunu test eder
    When acilir menude toplam 13 option oldugunu test eder
    And sayfayi kapatir