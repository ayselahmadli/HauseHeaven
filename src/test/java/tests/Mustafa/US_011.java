package tests.Mustafa;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_011 extends TestBaseRapor {

    SoftAssert softAssert =new SoftAssert();
    BasePage basePage;

    /*
    Siteye bir emlakçı olarak kayıt olabildiğimi,
    Account dashboardunun görüntülenebilir ve fonksiyonların aktif durumda olduğunu,
    çıkış yapıp kayıtlı kullanıcı olarak  tekrar giriş yapabildiğimi doğrulayabilmeliyim
     */



    //Siteye emlakçı olarak kayıt olunabilmeli US011


    @Test(priority = 1)
    public void testCase01(){
        basePage =new BasePage();
        //Siteye emlakçı olarak kayıt olunabilmeli test case 01

        //1. Browser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        //3.Sign Up butonuna tıklanır
        basePage.signUpMenu.click();
        ReusableMethods.clickWithJS(basePage.registerNewAccountButonu);
        //4.Kayıt için gerekli alanlar doldurulur
        basePage.firstNameKutusu.sendKeys("Mustafa");
        basePage.lastnameKutusu.sendKeys("Sen");
        basePage.emailKutusu.sendKeys(ConfigReader.getProperty("sesenGmail"));
        basePage.usernameKutusu.sendKeys(ConfigReader.getProperty("sesenUsername"));
        basePage.passwordKutusu.sendKeys("Mustafa1234.");
        basePage.passwordConfirmKutusu.sendKeys("Mustafa1234.");
        ReusableMethods.clickWithJS(basePage.registerButonu);
        //5.Hesap açıldığı doğrulanır
        softAssert.assertTrue(basePage.hesapSahibiAdiElementi.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();


    }
    @Test(priority = 2)
    public void testCase02(){

        basePage =new BasePage();


        //Kayıt olduktan sonra sol menüdeki  Account dashboard'daki
        // Settings,Buy credits, Properties, Security ve Logout alanları görünür  ve aktif olmalı

        //1. Browser açılır
        //2.Url'e gidilir
        ReusableMethods.wait(2);
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //3.Sign In butonuna tıklanır
        basePage.signInButonu.click();
        //4.Kayıt için isim mail ve diğer alanlar doldurulur
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("sesenGmail"));
        basePage.emailPasswordButton.sendKeys("Mustafa1234.");
        //5.Login butonuna tıklanır
        ReusableMethods.clickWithJS(basePage.loginButonu);
        basePage.hesapSahibiAdiElementi.click();
        //6.Hesapta iken soldaki menüde yer alan Dashboard linklerinin görünür olduğu ve aktif olduğu doğrulanır
        softAssert.assertTrue(basePage.userDashboard.isDisplayed() &&basePage.userDashboard.isEnabled());
        softAssert.assertTrue(basePage.userSettings.isDisplayed() && basePage.userSettings.isEnabled());
        softAssert.assertTrue(basePage.userBuyCredits.isDisplayed() && basePage.userBuyCredits.isEnabled());
        softAssert.assertTrue(basePage.userBuyCredits.isDisplayed() && basePage.userBuyCredits.isEnabled());
        softAssert.assertTrue(basePage.userProperties.isDisplayed() && basePage.userProperties.isEnabled());
        softAssert.assertTrue(basePage.userSecurity.isDisplayed() && basePage.userSecurity.isEnabled());
        softAssert.assertTrue(basePage.userLogout.isDisplayed() && basePage.userLogout.isEnabled());
        softAssert.assertAll();
        Driver.closeDriver();

    }
    @Test(priority = 3)
    public void testCase03(){
        basePage =new BasePage();
        //Siteden çıkış  yapılabilmeli

        //1.Browser açılır
        //2.Url'e gidilir
        ReusableMethods.wait(2);
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        //3.Sign In butonuna tıklanır
        basePage.signInButonu.click();
        //4.Kayıt için isim mail ve diğer alanlar doldurulur
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("sesenGmail"));
        basePage.emailPasswordButton.sendKeys("Mustafa1234.");
        //5.Login butonuna tıklanır
        ReusableMethods.clickWithJS(basePage.loginButonu);
        basePage.hesapSahibiAdiElementi.click();
        //6.Logout butonuna tıklanır ve çıkış yapıldığı doğrulanır
        basePage.logoutButonu.click();
        Assert.assertTrue(basePage.signInButonu.isDisplayed());
        Driver.closeDriver();

    }
    @Test(priority = 4)
    public void testCase04(){

        basePage =new BasePage();
        //Çıkış yaptıktan sonra kayıtlı kullanıcı olarak tekrar giriş yapılabilmeli

        //1.Browser açılır
        //2.Url'e gidilir
        ReusableMethods.wait(2);
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        //3.Sign In butonuna tıklanır
        ReusableMethods.clickWithJS(basePage.signInButonu);
        //4.Kayıt için isim mail ve diğer alanlar doldurulur
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("sesenGmail"));
        basePage.emailPasswordButton.sendKeys("Mustafa1234.");

        //5.Login butonuna tıklanır
        ReusableMethods.clickWithJS(basePage.loginButonu);
        //6.Logout butonuna tıklanır ve çıkış yapıldığı doğrulanır
        basePage.hesapSahibiAdiElementi.click();
        ReusableMethods.wait(2);
        basePage.logoutButonu.click();
        ReusableMethods.wait(2);
        //7. Sign In butonuna tıklanır
        basePage.signInButonu.click();
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("sesenGmail"));
        basePage.emailPasswordButton.sendKeys("Mustafa1234.");
        ReusableMethods.clickWithJS(basePage.loginButonu);
        //8.Giriş yapıldığı doğrulanır
        Assert.assertTrue(basePage.hesapSahibiAdiElementi.isDisplayed());
        Driver.closeDriver();

    }

}