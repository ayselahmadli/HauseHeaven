package tests.Mehdi;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US028 extends TestBaseRapor {
    //Browser açılır
    //qa.hauseheaven.com/admin/login sayfasina gidilir
    //email ve password alanlari doldurulur
    //sign in butonuna clicklenir
    //blog basligi clicklenir
    //acilan sayfada Dashboard altinda "Packages" sayfasi gorulmeli
    //"Packages" linkine tiklanir ve sayfanin packages bolumune yonlendirildigi gorulur

    BasePage basePage;

    @Test
    public void testCase01(){

        basePage = new BasePage();



        //Browser açılır
        //qa.hauseheaven.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //email ve password alanlari doldurulur
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));

        //sign in butonuna clicklenir
        basePage.adminSignInButton.click();

        //blog basligi clicklenir
        basePage.blogButonu.click(); //BLOGBUTONU PATH DEGISTI

        //acilan sayfada Dashboard altinda "Packages" sayfasi gorulmeli

        Assert.assertTrue(basePage.adminPackagesbuttton.isDisplayed());

        //"Packages" linkine tiklanir
        basePage.adminPackagesbuttton.click();

        // sayfanin packages bolumune yonlendirildigi gorulur
        Assert.assertTrue(Driver.getDriver().getCurrentUrl().contains("https://qa.hauseheaven.com/admin/real-estate/packages"),"packages bolumune yonlendirildi");

        Driver.closeDriver();





    }
}
