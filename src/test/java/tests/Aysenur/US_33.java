package tests.Aysenur;

import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.internal.IConfiguration;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_33 {

    BasePage basePage = new BasePage();
    @Test
    public void TC01() throws InterruptedException {

        basePage = new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        //Dashboard sayfasına ulaşıldığı doğrulanır

        String expectedTitle="Dashboard";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
        //  Assert.assertTrue(adminDashboardPage.adminDashboardSayfaTitle.isDisplayed());

        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();

    }

    @Test
    public void TC02(){

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.realEstateButonu.click();
        Assert.assertTrue(basePage.propertiesButonu.isDisplayed());
        Assert.assertTrue(basePage.propertiesButonu.isEnabled());

        Assert.assertTrue(basePage.adminRealEstateFeature.isDisplayed());
        Assert.assertTrue(basePage.adminRealEstateFeature.isEnabled());

        Assert.assertTrue(basePage.adminRealEstateFacilities.isDisplayed());
        Assert.assertTrue(basePage.adminRealEstateFacilities.isEnabled());

        Assert.assertTrue(basePage.adminRealEstateCategories.isDisplayed());
        Assert.assertTrue(basePage.adminRealEstateCategories.isEnabled());

        Assert.assertTrue(basePage.adminRealEstateTypes.isDisplayed());
        Assert.assertTrue(basePage.adminRealEstateTypes.isEnabled());


        Driver.closeDriver();

    }

}