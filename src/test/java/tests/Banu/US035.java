package tests.Banu;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

import java.security.Key;

public class US035 {

    BasePage basePage;
    SoftAssert softAssert;
    Select select;



    String featureTitle = "New Feature";

    @Test
    public void testCase01() {
        basePage = new BasePage();
        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();
        String expectedUrl = "https://qa.hauseheaven.com/admin";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(actualUrl, expectedUrl, "Admin sayfasina girilemedi");
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();

    }

    @Test
    public void testCase02() {

        basePage = new BasePage();

        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminRealEstateButton.click();

        basePage.adminFeatureLink.click();

        String expectedUrl = "https://qa.hauseheaven.com/admin/real-estate/properties";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(actualUrl, expectedUrl, "Features sayfasina gidilemedi");

        softAssert.assertAll();
        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();

    }

    @Test
    public void testCase03() {
        basePage = new BasePage();

        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminRealEstateButton.click();

        basePage.adminFeatureLink.click();

        softAssert.assertTrue(basePage.ilkSiradakiFeature.isDisplayed());
        softAssert.assertTrue(basePage.ikinciSiradakiFeature.isDisplayed());

        softAssert.assertAll();
        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();


    }

    @Test
    public void testCase04() {
        basePage = new BasePage();
        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminRealEstateButton.click();

        basePage.adminFeatureLink.click();

        softAssert.assertTrue(basePage.featureSayisiElementi.isDisplayed(), "Feature Sayisi Bolumu Goruntulenemedi");
        String featureSayisiYazisi = basePage.featureSayisiElementi.getText();

        Integer featureSayisi = Integer.parseInt(featureSayisiYazisi);

        softAssert.assertTrue(featureSayisi > 0, "Feature Sayisi Bulunamadi");

        softAssert.assertAll();
        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();


    }

    @Test
    public void testCase05() {
        basePage = new BasePage();
        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminRealEstateButton.click();

        basePage.adminFeatureLink.click();

        basePage.createElementi.click();

        basePage.titleElementi.sendKeys(featureTitle);

        select = new Select(basePage.featureIconSelectMenusu);
        select.selectByValue("ti-google");

        basePage.saveElementi.click();

        ReusableMethods.wait(5);
        softAssert.assertTrue(basePage.featureKaydedildiMesaji.isDisplayed());

        softAssert.assertAll();
        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();


    }

    @Test
    public void testCase06() {
        basePage = new BasePage();

        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminRealEstateButton.click();

        basePage.adminFeatureLink.click();

        basePage.searchElementi.sendKeys(featureTitle + Keys.ENTER);

        softAssert.assertTrue(basePage.ilkSiradakiFeature.isDisplayed());

        basePage.ilkFeatureEdit.click();

        basePage.titleElementi.clear();
        basePage.titleElementi.sendKeys("Changes Are Made");

        basePage.saveElementi.click();

        ReusableMethods.wait(5);

        softAssert.assertTrue(basePage.featureKaydedildiMesaji.isDisplayed());

        softAssert.assertAll();
        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();


    }

    @Test
    public void testCase07() {
        basePage = new BasePage();
        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminRealEstateButton.click();

        basePage.adminFeatureLink.click();

        basePage.searchElementi.sendKeys(featureTitle + Keys.ENTER);

        softAssert.assertTrue(basePage.ilkSiradakiFeature.isDisplayed());

        basePage.ilkFeatureDelete.click();
        ReusableMethods.wait(3);
        basePage.featureDeleteConfirm.click();

        ReusableMethods.wait(5);

        softAssert.assertTrue(basePage.featureKaydedildiMesaji.isDisplayed());

        softAssert.assertAll();
        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();


    }
}