package tests.day16_htmlReports;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;

public class C04_DataProviderIleTopluAramaTesti {

    /*
        Data provider ile verilen bir listedeki her bir deger icin
        test method'unu bagimsiz olarak calistirabiliriz

        DataProvider ile test yapabilmek icin
        once test methodumuzu parametre ile calisacak sekilde
        tek bir urun icin yazalim
     */


    @Test
    public void aramaTesti( String aranacakUrun){

        // testotomasyonu sayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));

        TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

        // arama kutusuna aranacakUrun'u yazdirip enter'a basin

        testotomasyonuPage.aramaKutusu.sendKeys(aranacakUrun + Keys.ENTER);

        // arama sonucunda urun bulunabildigini test edin

        String unexpectedAramaSonucu = ConfigReader.getProperty("toUnexpectedSonuc");
        String actualAramaSonucYazisi = testotomasyonuPage.aramaSonucuElementi.getText();

        Assert.assertNotEquals(actualAramaSonucYazisi,unexpectedAramaSonucu,aranacakUrun+" bulunamadi" );

        Driver.quitDriver();
    }
}
