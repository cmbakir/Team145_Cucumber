
Feature:US1011 kullanici yanlis bilgiler kullandiginda giris yapamaz


  Scenario Outline:TC17 yanlis kullanici bilgileri ile giris yapilamamali

    Given kullanici "toUrl" anasayfaya gider
    Then account linkini tiklar
    When email olarak direkt kullanilacak "<verilenEmail>" girer
    And password olarak direkt kullanilacak "<verilenPassword>" girer
    Then login butonuna basar
    And giris yapilamadigini test eder
    And 1 saniye bekler


    Examples:
      |verilenEmail    	|verilenPassword    |
      |esra@fmail.com  	|1234555            |
      |gamze@gmail.com 	|mesela123          |
      |zehra@zmail.com 	|asdf4321           |
      |ayca@amail.com  	|6543241tre65       |
      |gulnur@gmail.com	|123ert678          |