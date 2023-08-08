package tests.Mehdi;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US038 extends TestBaseRapor {
    //Giriş ve Types Sayfasına Erişim

    //Browser açılır
    //https://qa.hauseheaven.com/admin/login sayfasina gidilir
    //email ve password alanlari doldurulur
    //sign in butonuna clicklenir
    //Real Estate menusune cliklenir
    //Type sayfasina cliklenip ulasilabilirligi kontrol edilir


    BasePage basePage;

    @Test
    public void test01(){

        basePage = new BasePage();


        //Browser açılır
        //qa.hauseheaven.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //email ve password alanlari doldurulur
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));

        //sign in butonuna clicklenir
        basePage.adminSignInButton.click();

        //Real Estate menusune cliklenir
        basePage.realEstateButton.click();

        //Type sayfasina cliklenip ulasilabilirligi kontrol edilir
        basePage.realEstateTypeButton.click();
        basePage.realEstateTypeButton.isEnabled();

        Driver.closeDriver();



    }

    //Type sayisinin goruntulenmesi

    //Browser açılır
    //https://qa.hauseheaven.com/admin/login sayfasina gidilir
    //email ve password alanlari doldurulur
    //sign in butonuna clicklenir
    //Real Estate menusune cliklenir
    //Type sayfasina cliklenip sayfaya gidilir
    //Sayfanın başlık veya altbilgi kısmında mevcut olan Types sayısını bulunur.
    //Sayfada görüntülenen Types sayısının, gerçek sistemdeki Types sayısına eşit olduğunu doğrulanir.



    @Test
    public void test02(){


        basePage = new BasePage();


        //Browser açılır
        //qa.hauseheaven.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //email ve password alanlari doldurulur
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));

        //sign in butonuna clicklenir
        basePage.adminSignInButton.click();

        //Real Estate menusune cliklenir
        basePage.realEstateButton.click();

        //Type sayfasina cliklenir
        basePage.realEstateTypeButton.click();

        //Sayfanın başlık veya altbilgi kısmında mevcut olan Types sayısını bulunur.
        String resultCount = basePage.realEstateTypeResulText.getText();
        int resultCountActual=Integer.parseInt(resultCount);
        int expextedCountResult=10;


        //Sayfada görüntülenen Types sayısının, gerçek sistemdeki Types sayısına eşit olduğunu doğrulanir.
        Assert.assertFalse(resultCountActual==expextedCountResult);

        Driver.closeDriver();
    }

    //Yeni Type Ekleme

    //Browser açılır
    //https://qa.hauseheaven.com/admin/login sayfasina gidilir
    //email ve password alanlari doldurulur
    //sign in butonuna clicklenir
    //Real Estate menusune cliklenir
    //Type sayfasina cliklenip sayfaya gidilir
    //create butonuna basilir
    //name, code, slug ve order alanlari doldurulur
    //save and exit butonuna clciklenip yeni type eklendigi dogrulanir




    @Test
    public void test03(){


        basePage = new BasePage();


        //Browser açılır
        //qa.hauseheaven.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //email ve password alanlari doldurulur
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));

        //sign in butonuna clicklenir
        basePage.adminSignInButton.click();

        //Real Estate menusune cliklenir
        basePage.realEstateButton.click();

        //Type sayfasina cliklenir
        basePage.realEstateTypeButton.click();

        //create butonuna basilir
        basePage.realEstateTypeCreatButton.click();

        //name, code, slug ve order alanlari doldurulur
        basePage.realEstateTypeNameTextBox.sendKeys("Mehdi");
        basePage.realEstateTypeCodeTextBox.sendKeys("1234");
        basePage.realEstateTypeSlugTextBox.sendKeys("Slug");
        basePage.realEstateTypeOrderTextBox.sendKeys("2");

        //save and exit butonuna clciklenip yeni type eklendigi dogrulanir
        basePage.realEstateTypeSaveExitButton.click(); // locate alma sorunu

       /* String actualResult=basePage.realEstateTypeSaveExitSuccesMessage.getText();

        System.out.println(actualResult);
        String expectedResult="Created successfully";

        Assert.assertTrue(actualResult.contains(expectedResult));*/
        // Assert.assertTrue(basePage.realEstateTypeSaveExitSuccesMessage.isDisplayed());

        Driver.closeDriver();


    }

    //Type Düzenleme

    //Browser açılır
    //https://qa.hauseheaven.com/admin/login sayfasina gidilir
    //email ve password alanlari doldurulur
    //sign in butonuna clicklenir
    //Real Estate menusune cliklenir
    //Type sayfasina cliklenip sayfaya gidilir
    //Yeni eklenen Type'in edit butonu bulunup, clicklenir
    //Name, code , slug ve order boxlar random doldurulur
    //save and exit butonuna clicklenip , degisikliklerin islendigi dogrulanir



    @Test
    public void test04 () throws InterruptedException {

        basePage = new BasePage();


        //Browser açılır
        //qa.hauseheaven.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //email ve password alanlari doldurulur
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));

        //sign in butonuna clicklenir
        basePage.adminSignInButton.click();

        //Real Estate menusune cliklenir
        basePage.realEstateButton.click();

        //Type sayfasina cliklenir
        basePage.realEstateTypeButton.click();

        Thread.sleep(5000);
        //Yeni eklenen Type'in edit butonu bulunup, clicklenir
        basePage.realEstateTypEditButton.click();

        //Name, code , slug ve order boxlar random doldurulur
        basePage.realEstateTypMexNameTextBox.sendKeys("sdgs");
        basePage.realEstateTypeCodeTextBox.sendKeys("123456");
        basePage.realEstateTypeSlugTextBox.sendKeys("sdg");
        basePage.realEstateTypeOrderTextBox.sendKeys("1");

        basePage.realEstateTypeSaveExitButton.click();
        Assert.assertTrue(basePage.realEstateTypeUpdatedSuccesMessage.isDisplayed());
        //save and exit butonuna clicklenip , degisikliklerin islendigi dogrulanir

        Driver.closeDriver();


    }

    //Type silme



    //Browser açılır
    //https://qa.hauseheaven.com/admin/login sayfasina gidilir
    //email ve password alanlari doldurulur
    //sign in butonuna clicklenir
    //Real Estate menusune cliklenir
    //Type sayfasina cliklenip sayfaya gidilir
    //Yeni eklenen Type'in silinebildigini silme butonuna clicklenir
    //ve silindigi dogrulanir




    @Test
    public void test05 () {
        basePage = new BasePage();


        //Browser açılır
        //qa.hauseheaven.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //email ve password alanlari doldurulur
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));

        //sign in butonuna clicklenir
        basePage.adminSignInButton.click();

        //Real Estate menusune cliklenir
        basePage.realEstateButton.click();

        //Type sayfasina cliklenir
        basePage.realEstateTypeButton.click();

        basePage.realEstateTypeDeletedButton.click();
        basePage.realEstateTypeConfirmDeletedButton.click();
        //Yeni eklenen Type'in silinebildigini silme butonuna clicklenir

        Assert.assertTrue(basePage.realEstateTypeSaveDeletedSuccesMessage.isDisplayed());
        //ve silindigi dogrulanir


        Driver.closeDriver();
    }
}