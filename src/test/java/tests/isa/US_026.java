package tests.isa;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_026  {//Admin
    BasePage basePage;



    @Test
    public void TC_001() throws InterruptedException {//Admin olarak admin dashboard sayfasına ulaşabilmeli
        basePage=new BasePage();


        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage=new BasePage();

        //Email/Username ve Password bölümleri doldurulur ve SIGN IN butonu tıklanır
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        Thread.sleep(2000);
        basePage.adminSignInButton.click();

        //Dashboard sayfasına ulaşıldığı doğrulanır
        System.out.println(Driver.getDriver().getCurrentUrl());//https://qa.hauseheaven.com/admin
        System.out.println(Driver.getDriver().getTitle());//Dashboard | Hause Heaven
        String expectedTitle="Dashboard";
        String actualTitle=Driver.getDriver().getTitle();

        Assert.assertTrue(actualTitle.contains(expectedTitle));
        Assert.assertTrue(basePage.adminDashboardSayfaTitle.isDisplayed());


        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();
    }
    @Test
    public void TC_002() throws InterruptedException {//Admin olarak sayfadaki Active Properties, Pending Properties, Expired Properties ve Agents kısımları görüntülenebilmeli


        basePage=new BasePage();

        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage=new BasePage();

        //Email/Username ve Password bölümleri doldurulur ve SIGN IN butonu tıklanır
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        Thread.sleep(2000);
        basePage.adminSignInButton.click();

        //Sayfadaki Active Properties, Pending Properties, Expired Properties ve Agents kısımları görünür olduğu test edilir
        Assert.assertTrue(basePage.activePropertiesClick.isDisplayed());
        Assert.assertTrue(basePage.pendingPropertiesClick.isDisplayed());
        Assert.assertTrue(basePage.expiredPropertiesClick.isDisplayed());
        Assert.assertTrue(basePage.agentsClick.isDisplayed());


        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();

    }

    @Test
    public void TC_003() throws InterruptedException {//Sayfadaki Active Properties, Pending Properties, Expired Properties ve Agents kısımları aktif olduğu test edilir

        basePage=new BasePage();

        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage=new BasePage();

        //Email/Username ve Password bölümleri doldurulur ve SIGN IN butonu tıklanır
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        Thread.sleep(2000);
        basePage.adminSignInButton.click();

        //Sayfadaki Active Properties, Pending Properties, Expired Properties ve Agents kısımları aktif olduğu test edilir
        Assert.assertTrue(basePage.activePropertiesClick.isEnabled());
        Assert.assertTrue(basePage.pendingPropertiesClick.isEnabled());
        Assert.assertTrue(basePage.expiredPropertiesClick.isEnabled());
        Assert.assertTrue(basePage.agentsClick.isEnabled());


        basePage.adminAdSoyadAdminTest.click();
        basePage.adminLogout.click();
        Driver.closeDriver();
    }












}
