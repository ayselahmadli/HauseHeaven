package tests.Aysenur;

import com.beust.ah.A;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import static utilities.Driver.getDriver;

public class US_40 {

    BasePage basePage = new BasePage();


    @Test
    public void TC01() throws InterruptedException {



        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.homePageIlkMulkIlani.click();

        basePage.emlakciNameBox.sendKeys("Aysenur");
        basePage.emlakciPhoneBox.sendKeys("123456");
        basePage.emlakciEmail.sendKeys("ayse@gmail.com");
        basePage.emlakciMessageBox.sendKeys("Ayse was here");
        basePage.emlakciSendMessageButton.submit();
        Assert.assertTrue(basePage.mesajGonderildiMi.isDisplayed());


    }

    @Test
    public void TC02() throws InterruptedException {

        basePage = new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();
        basePage.adminConsultButtonUstundekiSayi.isDisplayed();

        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();

    }


    @Test
    public void TC03() throws InterruptedException {

        basePage = new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        ReusableMethods.wait(3);

        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        ReusableMethods.wait(3);

        basePage.adminConsults.click();

        Assert.assertTrue(basePage.adminConsultsbulkActons.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsbulkActons.isEnabled());

        Assert.assertTrue(basePage.adminConsultsFilters.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsFilters.isEnabled());

        Assert.assertTrue(basePage.adminConsultsSearch.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsSearch.isEnabled());

        Assert.assertTrue(basePage.adminConsultsReload.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsReload.isEnabled());

        Assert.assertTrue(basePage.adminConsultsEdit.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsEdit.isEnabled());

        Assert.assertTrue(basePage.adminConsultsCheckboxKutusu.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsCheckboxKutusu.isEnabled());

        Assert.assertTrue(basePage.adminConsultsName.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsName.isEnabled());

        Assert.assertTrue(basePage.adminConsultsEmail.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsEmail.isEnabled());

        Assert.assertTrue(basePage.adminConsultsStatus.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsStatus.isEnabled());

        Assert.assertTrue(basePage.adminConsultsPhone.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsPhone.isEnabled());

        Assert.assertTrue(basePage.adminConsultsCreatedAt.isDisplayed());
        Assert.assertTrue(basePage.adminConsultsCreatedAt.isEnabled());

        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();

    }

    @Test
    public void TC04() throws InterruptedException {

        basePage = new BasePage();

        SoftAssert softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminConsults.click();

        softAssert.assertTrue(basePage.adminConsultsRecordsSayisi.isDisplayed());


        System.out.println("kayıylı islem sayisi : "+basePage.adminConsultsRecordsSayisi);

        softAssert.assertTrue( basePage.adminConsultsKayitlidanişirlarinIlki.isDisplayed());

        System.out.println(basePage.adminConsultsKayitlidanişirlarinIlki);

        softAssert.assertAll();

        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();

    }

    @Test
    public void TC05(){

        Actions actions = new Actions(getDriver());

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminConsults.click();
        basePage.adminConsultsEdit.click();
        basePage.adminConsultsStatüsReadUnRead.click();
        basePage.readButton.click();
        basePage.save_exitButton.click();

        Assert.assertTrue(basePage.popUp.isDisplayed());


        Driver.closeDriver();

    }
}