Feature: US1013 WebDriverUniversity negatif login testi

  @wip
  Scenario: TC19 fake degerler ile giris yapilamamali

    Given kullanici "webUniUrl" anasayfaya gider
    When login Portal'a  kadar asagi iner
    And login Portal'a tiklar
    Then acilan yeni window'a gecis yapar
    And username ve password kutularina fake degerler yazdirir
    And webDriverUniversity login butonuna basar
    Then popup'ta cikan yazinin "validation failed" oldugunu test eder
    And OK diyerek popup'i kapatir
    When ilk windowa geri doner
    Then ilk windowa donuldugunu test eder
    And 3 saniye bekler
    And sayfayi kapatir