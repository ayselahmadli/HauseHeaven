package tests.Adem;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US47 extends TestBaseRapor {

    BasePage basePage;


    @Test
    public void adminOlarakPaymentsMenusununGoruntulenmeTesti() {

        //Web tarayıcısını açın.
        basePage = new BasePage();


        //Site adresini tarayıcının adres çubuğuna yazın
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Admin Kullanıcı adı ve şifre bilgilerini girip Login butonuna tıklayınız.
        basePage.adminUserName.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPassword.sendKeys(ConfigReader.getProperty("Sifre"));

        //Admin Header bölümünden Sign in  butonuna tıklayın
        basePage.adminSignIn.click();

        //Locations butonuna tıklayınız
        basePage.adminLocations.click();

        //Locations bölümündeki menülerin görüntülenir olduğunu doğrulayınız
        Assert.assertTrue(basePage.adminLocationsCountries.isDisplayed()&&basePage.adminLocationCities.isDisplayed()&&basePage.adminLocationsStates.isEnabled());

        //Sayfayı kapatınız
        Driver.closeDriver();


    }
}