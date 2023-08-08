package tests.isa;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_045  {//Admin

    BasePage basePage;

    Select select;

    @Test
    public void TC_001() throws InterruptedException {//Admin olarak admin dahsboarda giriş yapılabilmeli

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
    public void TC_002() throws InterruptedException {//Admin olarak Payments başlığının altındaki Transactions sayfası görüntülenebilmeli

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

        //Payments butonuna tıklanır ve açılan bölümde Transactions butonu tıklanır
        basePage.adminPaymentButton.click();
        basePage.adminPaymentTransactionsButton.click();

        //Transactions sayfasının görüldüğü test edilir
        String expectedTitle="Payments";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);

        Assert.assertTrue(actualTitle.contains(expectedTitle));


        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();
    }

    @Test
    public void TC_003() throws InterruptedException {//Admin olarak Payments başlığının altındaki Transactions sayfasındaki öğeler görüntülenebilmeli

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

        //Payments butonuna tıklanır ve açılan bölümde Transactions butonu tıklanır
        basePage.adminPaymentButton.click();
        basePage.adminPaymentTransactionsButton.click();

        //Yapılan işlem tablosunun görünür olduğu test edilir
        //filters,Reload,Search,Show from previous, next

        Assert.assertTrue(basePage.adminPaymentFiltersButton.isDisplayed());
        Assert.assertTrue(basePage.adminPaymentReloadButton.isDisplayed());
        Assert.assertTrue(basePage.adminPaymentSearchBox.isDisplayed());
        Assert.assertTrue(basePage.adminPaymentRecortsNum.isDisplayed());
        Assert.assertTrue(basePage.adminPaymentRecortNumFilter.isDisplayed());
        Assert.assertTrue(basePage.adminPaymentPreviousButton.isDisplayed());
        Assert.assertTrue(basePage.adminPaymentNextButton.isDisplayed());


        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();
    }
    @Test
    public void TC_004() throws InterruptedException {//Admin olarak Payments başlığının altındaki Transactions sayfasındaki öğeler aktif olmalı

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

        //Payments butonuna tıklanır ve açılan bölümde Transactions butonu tıklanır
        basePage.adminPaymentButton.click();
        basePage.adminPaymentTransactionsButton.click();

        //Filters,Reload,Previous,Next,mevcut sayfa numaraları ve Filters altındaki kutuların tıklanabilir olduğu test edilir
        Assert.assertTrue(basePage.adminPaymentFiltersButton.isEnabled());
        Assert.assertTrue(basePage.adminPaymentReloadButton.isEnabled());
        Assert.assertTrue(basePage.adminPaymentPreviousButton.isEnabled());
        Assert.assertTrue(basePage.adminPaymentNextButton.isEnabled());
        Assert.assertTrue(basePage.adminPaymentPageNumber1Button.isEnabled());
        Assert.assertTrue(basePage.adminPaymentPageNumber2Button.isEnabled());
        Assert.assertTrue(basePage.adminPaymentPageNumber3Button.isEnabled());
        Assert.assertTrue(basePage.adminPaymentCheckBox.isEnabled());

        String expectedTablo=basePage.adminPaymentTumIslemTablosu.getText();
        //Filters butonuna tıklanır ve açılan seçenekler işaretlenerek Apply butonu tıklanır
        basePage.adminPaymentFiltersButton.click();
        Thread.sleep(2000);
        select=new Select(basePage.adminPaymentFilterSelect_filedButton);
        select.selectByVisibleText("Status");
        select=new Select(basePage.adminPaymentFiltersIsEqualsToButton);
        select.selectByVisibleText("Is equal to");
        select=new Select(basePage.adminPaymentFiltersSelectOptionButton);
        select.selectByVisibleText("Pending");
        basePage.adminPaymentFilterApplyButton.click();

        //Sayfanın değiştiği test edilir
        String actualTablo=basePage.adminPaymentTumIslemTablosu.getText();
        Assert.assertNotEquals(actualTablo,expectedTablo);


        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();
    }

    @Test
    public void TC_005() throws InterruptedException {//Admin olarak Payments başlığının altındaki Transactions sayfasındaki ödeme sayısının görüntülenebilmeli

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

        //Payments butonuna tıklanır ve açılan bölümde Transactions butonu tıklanır
        basePage.adminPaymentButton.click();
        basePage.adminPaymentTransactionsButton.click();

        //Sayfadaki toplam işlem miktarının görünür olduğu test edilir
        Assert.assertTrue(basePage.adminPaymentRecortsNum.isDisplayed());


        basePage.adminAdSoyadAdminTest.click();
        basePage.adminLogout.click();
        Driver.closeDriver();
    }




}
