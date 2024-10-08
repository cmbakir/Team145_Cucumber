
Feature: US1012 Excel ile toplu arama


  Scenario Outline: TC18 arama sonucunda excelde verilen min sonuctan fazla urun bulunabilmeli

    Given kullanici "toUrl" anasayfaya gider
    Then urun excelindeki "<istenenSatir>" daki urunun min. miktarini ve urun ismini kaydeder
    And urun ismini testotomasyonu sayfasinda aratir ve bulunan sonuc sayisini kaydeder
    And bulunan sonuc sayisinin "<istenenSatir>" da verilen min. miktara esit veya daha fazla oldugunu test eder
    And sayfayi kapatir
    Examples:
      |istenenSatir|
      |2           |
      |3           |
      |4           |
      |5           |
      |6           |
      |7           |
      |8           |
      |9           |