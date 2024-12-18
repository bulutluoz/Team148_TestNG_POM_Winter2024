package tests.day16_htmlReports;

import org.testng.annotations.Test;
import utilities.ConfigReader;
import utilities.Driver;

public class C07_YeniKayitOlusturma {

    // Farkli datalarla tabloya 5 kayit ekleyip, asagidaki testi yapin.
    //	When kullanici https://editor.datatables.net/ adresine gider
    //	Then new butonuna basar
    //	And tum bilgileri girer
    //	And Create tusuna basar
    //	When kullanici ilk isim ile arama yapar
    //	Then isim bolumunde isminin oldugunu dogrular


    @Test
    public void kayitTesti(String firstName, String lastName, String position,
                           String office, String extension, String startDate, int salary){

        //	 kullanici https://editor.datatables.net/ adresine gider
        Driver.getDriver().get(ConfigReader.getProperty("editorUrl"));

        //	new butonuna basar

        //	 tum bilgileri girer

        //	 Create tusuna basar

        //	 kullanici ilk isim ile arama yapar

        //	 isim bolumunde isminin oldugunu dogrular


    }
}
