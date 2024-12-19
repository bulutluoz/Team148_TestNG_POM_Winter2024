package tests.day17_CrossBrowserCalistirilacakTestler;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.TestotomasyonuPage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseCross;

public class C02_NegativeLoginTesti extends TestBaseCross {

    static TestotomasyonuPage testotomasyonuPage = new TestotomasyonuPage();

    @Test(groups = "smoke")
    public void gecersizPasswordTesti(){
        testotomasyonuPage = new TestotomasyonuPage();

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- account linkine basin
        testotomasyonuPage.accountLinki
                .click();
        // 3-  3 farkli test method’u olusturun.
        //	- gecerli email, gecersiz password
        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecerliEmail"));
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecersizPassword"));

        //4- Login butonuna basarak login olmayi deneyin
        testotomasyonuPage.loginButonu.click();

        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testotomasyonuPage.emailKutusu.isDisplayed());

        Driver.quitDriver();
    }

    @Test(groups = {"smoke","regression"})
    public void gecersizEmailTesti(){
        testotomasyonuPage = new TestotomasyonuPage();

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- account linkine basin
        testotomasyonuPage.accountLinki.click();
        //3-  3 farkli test method’u olusturun.
        //	- gecersiz email, gecerli password
        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecersizEmail"));
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecerliPassword"));
        //4- Login butonuna basarak login olmayi deneyin
        testotomasyonuPage.loginButonu.click();
        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testotomasyonuPage.emailKutusu.isDisplayed());
        Driver.quitDriver();
    }

    @Test(groups = {"smoke","E2E"})
    public void gecersizEmailGecersizPasswordTesti(){
        testotomasyonuPage = new TestotomasyonuPage();

        //1- https://www.testotomasyonu.com/ anasayfasina gidin
        Driver.getDriver().get(ConfigReader.getProperty("toUrl"));
        //2- account linkine basin
        testotomasyonuPage.accountLinki.click();
        //3-  3 farkli test method’u olusturun.
        //	- gecersiz email, gecersiz password.
        testotomasyonuPage.emailKutusu.sendKeys(ConfigReader.getProperty("toGecersizEmail"));
        testotomasyonuPage.passwordKutusu.sendKeys(ConfigReader.getProperty("toGecersizPassword"));
        //4- Login butonuna basarak login olmayi deneyin
        testotomasyonuPage.loginButonu.click();
        //5- Basarili olarak giris yapilamadigini test edin
        Assert.assertTrue(testotomasyonuPage.emailKutusu.isDisplayed());
        Driver.quitDriver();

    }
}
