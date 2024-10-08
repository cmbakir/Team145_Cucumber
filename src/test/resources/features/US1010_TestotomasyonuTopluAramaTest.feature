
Feature: US1010 kullanici verilen listedeki tum urunler icin arama testi yapar


  Scenario Outline: : TC16 liste olarak verilen urunler icin arama yapilabilmeli

    Given kullanici "toUrl" anasayfaya gider
    Then arama kutusuna "<aranacakKelimeler>" yazip aratir
    And arama sonucunda urun bulunabildigini test eder
    Then 1 saniye bekler
    And sayfayi kapatir

    Examples:
      |aranacakKelimeler|
      |phone  |
      |java   |
      |dress  |
      |nutella|
      |baby   |
      |apple  |
      |samsung|


      # arama testini verilen tum kelimeler icin ayri ayri yapin
      # phone, java, dress, nutella, baby, apple, samsung