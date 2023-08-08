package tests.Adem;

import org.bson.assertions.Assertions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.Assertion;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US01 extends TestBaseRapor {

    @Test
    public void ziyaretciOlarakhausehaevenWebSitesineBasariylaUlasabilmeTesti(){
        //Web tarayıcısını açın.
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Site adresini tarayıcının adres çubuğuna yazın
        String expectedUrl="https://qa.hauseheaven.com/";

        //Ana sayfanın başarıyla yüklenip yüklenmediğini doğrulayın.
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);

        //Sayfayı kapatınız
        Driver.closeDriver();

    }

}