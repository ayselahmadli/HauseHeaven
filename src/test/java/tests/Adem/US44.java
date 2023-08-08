package tests.Adem;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US44 extends TestBaseRapor {

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

        //Payments  butonuna tıklayınız
        basePage.adminPaymentButton.click();

        //Payments  menüsünün görünür olduğunu doğrulayınız
        Assert.assertTrue(basePage.adminPaymentTransactionsButton.isDisplayed()&&basePage.adminPaymentTransactionsButton.isEnabled());


        Driver.closeDriver();
        //Sayfayı kapatınız

    }
}