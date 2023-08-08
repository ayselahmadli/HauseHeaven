package tests.Muhammet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US042 extends TestBaseRapor {

    BasePage basePage=new BasePage();


    @Test
    public void testcase01() {

        basePage=new BasePage();


        //qa.hauseheaven.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //gecerli kullanici adi veya email adresi girilir

        basePage.adminEmailButton.sendKeys("admin17" + Keys.ENTER);
        basePage.adminPasswordButton.sendKeys("951847");

        //sign in linkine tiklanir

        basePage.adminSignInButton.click();

        // "Packages" linkine tiklanir ve

        basePage.adminPackagesbuttton.click();

        //sayfanin packages bolumune yonlendirildigi gorulur

        String expectedSonIcerik = "Packages";
        String actualSonIcerik = basePage.adminPackagesGorunurluk.getText();

        Assert.assertTrue(basePage.adminPackagesGorunurluk.isDisplayed());


    }

    @Test
    public void testCase02() {
     basePage=new BasePage();


        //qa.hauseheaven.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //gecerli kullanici adi veya email adresi girilir

        basePage.adminEmailButton.sendKeys("admin17" + Keys.ENTER);
        basePage.adminPasswordButton.sendKeys("951847");

        //sign in linkine tiklanir

        basePage.adminSignInButton.click();

        // "Packages" linkine tiklanir

        basePage.adminPackagesbuttton.click();

        // Acilan sayfada ogelerin bir liste halinde yer aldigi gorulmelidir

        Assert.assertTrue(basePage.adminPackagesListe.isDisplayed());

    }

    @Test
    public void testCase03() {
        basePage=new BasePage();


        //qa.hauseheaven.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //gecerli kullanici adi veya email adresi girilir

        basePage.adminEmailButton.sendKeys("admin17" + Keys.ENTER);
        basePage.adminPasswordButton.sendKeys("951847");

        //sign in linkine tiklanir

        basePage.adminSignInButton.click();

        // "Packages" linkine tiklanir

        basePage.adminPackagesbuttton.click();

        //Sayfa sag tarafinda bulunan create butonuna basilir

        basePage.adminPackagesbutonuCreate.click();

        //acilan sayfanin new package sayfasi oldugu dogrulanir

        basePage.adminNewPackagesGorunurluk.isDisplayed();

        //sayfada yer alan bilgiler doldurulur ve save butonuna tiklanir

        basePage.adminPackagesbutonuCreatename.sendKeys("Can");
        basePage.adminPackagesbutonuCreatePrice.sendKeys("2000");
        basePage.adminPackagesbutonuCreatePercentsave.sendKeys("10");
        basePage.adminPackagesbutonuCreateNumberoflistening.sendKeys("3");
        basePage.adminPackagesbuttonuCreateOrder.sendKeys("1");
        basePage.adminPackagesbutonuCreateSaveButton.click();

        ReusableMethods.wait(2);

        //dashboard altinda "Packages" sayfasi tiklanir

        basePage.adminPackagesbuttton.click();

        //en son eklenen ilan bu sayfada gorulmelidir

        String expectedListe = "Can";
        String actualListe = basePage.adminPackagesListeSonEklenen.getText();

        Assert.assertTrue(basePage.adminPackagesListeSonEklenen.isDisplayed());


    }

    @Test
    public void testCase04() {

       basePage=new BasePage();

        //Browser açılır
        //qa.hauseheaven.com/admin/login sayfasina gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        //gecerli kullanici adi veya email adresi girilir
        basePage.adminEmailButton.sendKeys("admin17" + Keys.ENTER);
        // password kutusuna gecerli sifre girilir
        basePage.adminPasswordButton.sendKeys("951847");
        //sign in linkine tiklanir
        basePage.adminSignInButton.click();
        //Dashboard altinda "Packages" sayfasi tiklanir
        basePage.adminPackagesbuttton.click();

        //Sayfa sag tarafinda bulunan create butonuna basilir
        basePage.adminPackagesbutonuCreate.click();
        //sayfada yer alan bilgiler doldurulur ve save butonuna tiklanir

        basePage.adminPackagesbutonuCreatename.sendKeys("Can");
        basePage.adminPackagesbutonuCreatePrice.sendKeys("2000");
        basePage.adminPackagesbutonuCreatePercentsave.sendKeys("10");
        basePage.adminPackagesbutonuCreateNumberoflistening.sendKeys("3");
        basePage.adminPackagesbuttonuCreateOrder.sendKeys("1");
        basePage.adminPackagesbutonuCreateSaveButton.click();
        ReusableMethods.wait(2);

        //dashboard altinda "Packages" sayfasi tiklanir

        basePage.adminPackagesbuttton.click();

        //son eklenen packagesin sag tarafinda bulunan edit kismina tiklanir
        basePage.adminPackagesbutonuCreateEdit.click();


        // duzenlemeler yapilmali ve save&exit linkine tiklanmali

        basePage.adminPackagesbutonuCreatename.clear();
        basePage.adminPackagesbutonuCreatename.click();
        basePage.adminPackagesbutonuCreatename.sendKeys("tost");
        basePage.adminPackagesbutonuCreatePrice.sendKeys("9000");
        basePage.adminPackagesbutonuCreateSaveexit.click();

        // create edilen packagenin en sag tarafinda delete butonuna tiklanir
        // ve acilan pencereden delete tiklanir ve silindigi dogrulanir

        basePage.adminPackagesbutonuSearchbox.click();
        basePage.adminPackagesbutonuSearchbox.sendKeys("tost");
        basePage.adminPackagesCheckboxButonu.click();
        basePage.adminPackagesBulkactionButton.click();
        ReusableMethods.wait(1);
        basePage.adminPackagesbutonuCreateDelete.click();
        ReusableMethods.wait(1);
        basePage.adminNewPackagesDeleteOnayButonu.click();




        Assert.assertTrue(basePage.adminPackagesDeleteOnaySonrasiSilindiMesaji.isDisplayed());





    }
}