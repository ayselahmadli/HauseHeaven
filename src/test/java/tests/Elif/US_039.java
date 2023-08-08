package tests.Elif;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_039 extends TestBaseRapor {

    BasePage basePage = new BasePage();




    @Test
    public void Test01 (){

        basePage = new BasePage();



        // Url anasayfaya gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/");


        // Sing In butonuna tıklanır
        basePage.SignInLinki.click();

        //Login olmak için email ve password bilgileri girilir.

        //Email-Username için doğru bilgi girilir.

        basePage.emailUsernameButton.click();

        basePage.emailUsernameButton.sendKeys("elifaridaglar@gmail.com");
        Assert.assertTrue(basePage.emailUsernameButton.isDisplayed());


        //Password için dopru bilgi girilir.
        basePage.emailPasswordButton.sendKeys("elif@123");
        Assert.assertTrue(basePage.emailPasswordButton.isDisplayed());

        //Login butonuna tıklanır.

        basePage.loginButonu.click();

        //Subscribe butonuna gelinir ve bir email girilir




        basePage.homeSubscribeEmail.sendKeys("eeeabcde@gmail.com");

        //Subscribe butonuna tıklanır.
        ReusableMethods.wait(3);
        basePage.enterSubscrib.submit();
        ReusableMethods.wait(3);

    }

    @Test
    public void Test02 (){

        basePage = new BasePage();



        //Url anasayfaya gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));


        //Geçerli Email-Username girilir
        basePage.adminEmailButton.click();
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));

        //Geçerli Password girilir.
        basePage.passwordAdmin.sendKeys(ConfigReader.getProperty("Sifre"));

        //Sign In butonuna tıklanır
        basePage.adminGirisSingIn.click();

        //Dashboard butonuna tıklanır.
        basePage.dashboardAdmin.click();


        //Newsletters butonuna tıklanır.
        basePage.newsletterAdmin.click();

    }

    @Test
    public void Test03(){


        basePage = new BasePage();



        //Url anasayfaya gidilir.
        //Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));



        //Geçerli Email-Username girilir
        ReusableMethods.wait(3);
        //basePage.adminEmailButton.click();
        //ReusableMethods.wait(3);
        //basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));

        //Geçerli Password girilir.
        //homePage.passwordAdmin.sendKeys(ConfigReader.getProperty("Sifre"));

        //Sign In butonuna tıklanır
        //homePage.adminGirisSingIn.click();

        //Dashboard butonuna tıklanır.
        //homePage.dashboardAdmin.click();


        //Newsletters butonuna tıklanır.
        //adminLocationsPages.newsletterAdmin.click();



        //Sayfadaki  Filters butonunun görünür ve aktif olduğu test edilir.

        Assert.assertTrue(basePage.newsletterFiltersButton.isDisplayed());
        Assert.assertTrue(basePage.newsletterFiltersButton.isEnabled());

        //Sayfadaki  Search butonunun görünür ve aktif olduğu test edilir.
        Assert.assertTrue(basePage.searchButton.isDisplayed());
        Assert.assertTrue(basePage.searchButton.isEnabled());

        //Sayfadaki  Export butonunun görünür ve aktif olduğu test edilir.
        //Assert.assertTrue(adminNewsletterPage.exportButton.isDisplayed());   ?????
        Assert.assertTrue(basePage.exportButton.isEnabled());

        //Sayfadaki  Reload butonunun görünür ve aktif olduğu test edilir.
        Assert.assertTrue(basePage.reloadButton.isDisplayed());
        Assert.assertTrue(basePage.reloadButton.isEnabled());

        //Sayfadaki  Next butonunun görünür ve aktif olduğu test edilir.
        Assert.assertTrue(basePage.nextButton.isDisplayed());
        Assert.assertTrue(basePage.nextButton.isEnabled());

        Driver.closeDriver();

    }







}