package tests.Banu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US043  extends TestBaseRapor{



    SoftAssert softAssert;
    BasePage basePage;

    String subject = "subjectTest";
    String name = "Team4Name";
    Select select;





    @Test(priority = 0)
    public void test01() {


        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        basePage.contactLinki.click();

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/contact";

        softAssert.assertEquals(actualUrl, expectedUrl, "Contact Sayfasina Yonlendirilemedi");

        basePage.nameMetinKutusu.sendKeys(name);
        basePage.emailMetinKutusu.sendKeys("yurdakulbanu@gmail.com");
        basePage.subjectMetinKutusu.sendKeys(subject);
        basePage.phoneMetinKutusu.sendKeys("1234567890");
        basePage.messageMetinKutusu.sendKeys("mesaj icerigi" + Keys.TAB + Keys.ENTER);

        ReusableMethods.wait(5);

        softAssert.assertTrue(basePage.mesajGonderildiYazisi.isDisplayed());

        softAssert.assertAll();

        Driver.closeDriver();



    }

    @Test(priority = 1)
    public void test02() {


        softAssert = new SoftAssert();
        basePage = new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminHeaderContactsElement.click();

        softAssert.assertTrue(basePage.adminHeaderContactMesajSayisi.isDisplayed());

        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();
        Driver.closeDriver();

    }

    @Test(priority = 2)
    public void test03() {

        softAssert = new SoftAssert();
        basePage = new BasePage();


        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();



        String expedtedUrl = "https://qa.hauseheaven.com/admin/contacts";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(actualUrl, expedtedUrl, "Admin Contact Sayfasi Acilmadi");
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();
        Driver.closeDriver();

    }

    @Test(priority = 3)
    public void test04() {

        softAssert = new SoftAssert();
        basePage = new BasePage();


        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.adminContactButton.click();

        softAssert.assertTrue(basePage.adminContactSearchBox.isDisplayed());
        softAssert.assertTrue(basePage.adminContactExportButton.isDisplayed());
        softAssert.assertTrue(basePage.adminContactReloadButton.isDisplayed());
        softAssert.assertTrue(basePage.adminContactEditElementi.isDisplayed());
        softAssert.assertTrue(basePage.adminContactCheckBox.isDisplayed());
        softAssert.assertTrue(basePage.adminContactSearchBox.isEnabled());
        softAssert.assertTrue(basePage.adminContactExportButton.isEnabled());
        softAssert.assertTrue(basePage.adminContactReloadButton.isEnabled());
        softAssert.assertTrue(basePage.adminContactEditElementi.isEnabled());
        softAssert.assertTrue(basePage.adminContactCheckBox.isEnabled());
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();
        Driver.closeDriver();


    }


    @Test(priority = 4)
    public void test05() {

        softAssert = new SoftAssert();
        basePage = new BasePage();


        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.adminContactButton.click();

        softAssert.assertTrue(basePage.adminContactRecortSayisi.isDisplayed());
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();
        Driver.closeDriver();

    }

    @Test(priority = 5)
    public void test06() {

        softAssert = new SoftAssert();
        basePage = new BasePage();
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.adminContactButton.click();

        basePage.adminContactSearchBox.clear();
        ReusableMethods.wait(3);

        basePage.adminContactSearchBox.sendKeys(name);
        ReusableMethods.wait(3);

        softAssert.assertTrue(basePage.searchArkasindanElement.isDisplayed());
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();
        Driver.closeDriver();


    }

    @Test(priority = 6)
    public void test07() {

        softAssert = new SoftAssert();
        basePage = new BasePage();


        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.adminContactButton.click();

        basePage.adminContactSearchBox.clear();
        ReusableMethods.wait(3);

        basePage.adminContactSearchBox.sendKeys(name);
        ReusableMethods.wait(3);

        basePage.searchArkasindanElement.click();

        // Contacts sayfasina girilince, listede Contact'lerin silinmesi icin buton yok
        // Contact icerigine girilince silme icin buton yok
        // Anasayfadan eklenen herhangi bir Contact silinemiyor
        // Bug

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();
        Driver.closeDriver();


    }

    @Test(priority = 7)
    public void test08() {
        softAssert = new SoftAssert();
        basePage = new BasePage();


        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.adminContactButton.click();

        basePage.adminContactSearchBox.clear();
        ReusableMethods.wait(3);

        basePage.adminContactSearchBox.sendKeys(name);
        ReusableMethods.wait(5);

        basePage.adminContactEditElementi.click();


        // Contact icerigine girilince daha once doldurulan alanlarda degisiklik yapilamiyor
        // Bug

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();
        Driver.closeDriver();


    }

    @Test(priority = 8)
    public void test09() {

        softAssert = new SoftAssert();
        basePage = new BasePage();


        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.adminContactButton.click();

        basePage.adminContactSearchBox.clear();
        ReusableMethods.wait(3);

        basePage.adminContactSearchBox.sendKeys(name);
        ReusableMethods.wait(5);

        basePage.adminContactEditElementi.click();

        select = new Select(basePage.adminContactIcerikStatusSelectMenusu);
        select.selectByValue("read");

        basePage.adminContactEditSaveButton.click();

        basePage.adminContactEditSaveExitButton.click();

        ReusableMethods.wait(5);

        String actualStatusDurum = basePage.adminContactSearchSonrasiStatusGoruntule.getText();
        String expectedStatusDurum = "Read";

        softAssert.assertEquals(actualStatusDurum, expectedStatusDurum, "Durum Guncellenemedi");
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();



    }


}