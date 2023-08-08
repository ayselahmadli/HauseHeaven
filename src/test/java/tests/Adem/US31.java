package tests.Adem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US31 extends TestBaseRapor {
    BasePage basePage;


    @Test
    public void adminOlaraktagSayfasinaYonlendirilmeTesti() {

        //Web tarayıcısını açın.
        basePage = new BasePage();


        //Site adresini tarayıcının adres çubuğuna yazın
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Admin Kullanıcı adı ve şifre bilgilerini girip Login butonuna tıklayınız.
        basePage.adminUserName.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPassword.sendKeys(ConfigReader.getProperty("Sifre"));

        //Admin Header bölümünden Sign in  butonuna tıklayın
        basePage.adminSignIn.click();

        //Dashboard altındaki Blog butonuna tıklayınız
        basePage.blogButton.click();

        //Taglar butonuna basınız
        basePage.blogTagsButton.click();

        //Taglar sayfasına yönlendirildiğinizi doğrulayın
        String expectedUrl = "https://qa.hauseheaven.com/admin/blog/tags";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(expectedUrl, actualUrl);

        //Sayfayı kapatınız
        Driver.closeDriver();

    }

    @Test
    public void adminOlarakVarOlantaglarinDogrulanmaTesti() {

        //Web tarayıcısını açın.
        basePage = new BasePage();

        // Site adresini tarayıcının adres çubuğuna yazın
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Admin Kullanıcı adı ve şifre bilgilerini girip Login butonuna tıklayınız.
        basePage.adminUserName.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPassword.sendKeys(ConfigReader.getProperty("Sifre"));

        //Admin Header bölümünden Sign in  butonuna tıklayın
        basePage.adminSignIn.click();

        //Dashboard altındaki Blog butonuna tıklayınız
        basePage.blogButton.click();

        //Taglar butonuna basınız
        basePage.blogTagsButton.click();

        //Var olan Tagların görüntülendiğini doğrulayınız
        int unExpectedTagSayisi = 0;
        int actualTagSayisi = Integer.valueOf(basePage.totalTagsNumberElement.getText());
        Assert.assertNotEquals(unExpectedTagSayisi, actualTagSayisi);

        //Sayfayı kapatınız
        Driver.closeDriver();

    }


    @Test
    public void adminOlarakYeniTagEklemeTesti() {

        //Web tarayıcısını açın.
        basePage = new BasePage();


        //Site adresini tarayıcının adres çubuğuna yazın
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Admin Kullanıcı adı ve şifre bilgilerini girip Login butonuna tıklayınız.
        basePage.adminUserName.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPassword.sendKeys(ConfigReader.getProperty("Sifre"));

        //Admin Header bölümünden Sign in  butonuna tıklayın
        basePage.adminSignIn.click();

        //Dashboard altındaki Blog butonuna tıklayınız
        basePage.blogButton.click();

        //Taglar butonuna basınız
        basePage.blogTagsButton.click();

        //Create butonuna basınız
        basePage.createNewTagButton.click();

        //Name ve Description bölümünü doldurunuz
        basePage.nameTextBoxTags.sendKeys("sale");
        basePage.descriptionTextBoxTags.sendKeys("The house is equipped with four good bedrooms and two bathrooms. The rent includes 8 activity cards with free access to many activities such as tropical water park, sports hall, playground and many other activities for children and adults.");


        //Save butonuna basınız
        basePage.saveButtonTags.click();

        //Yeni Tag'ın eklendiğini doğrulayınız
        Assert.assertTrue(basePage.adminBlogSuccess.isDisplayed());

        //Sayfayı kapatınız
        Driver.closeDriver();
    }


    @Test
    public void adminOlarakTagSilmeTesti() {

        //Web tarayıcısını açın.
        basePage = new BasePage();


        //Site adresini tarayıcının adres çubuğuna yazın
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Admin Kullanıcı adı ve şifre bilgilerini girip Login butonuna tıklayınız.
        basePage.adminUserName.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPassword.sendKeys(ConfigReader.getProperty("Sifre"));

        //Admin Header bölümünden Sign in  butonuna tıklayın
        basePage.adminSignIn.click();

        //Dashboard altındaki Blog butonuna tıklayınız
        basePage.blogButton.click();

        //Taglar butonuna basınız
        basePage.blogTagsButton.click();

        //Silmek istediğiniz Tag'ı seçiniz
        basePage.firstTagDeleteButton.click();

        //Sil butonuna basınız
        basePage.deleteConfirm.click();

        //Tagın silindiğini doğrulayınız
        Assert.assertTrue(basePage.adminBlogSuccess.isDisplayed());

        //Sayfayı kapatınız
        Driver.closeDriver();


    }


    @Test
    public void adminOlarakTagDuzenlemeTesti() {

        //Web tarayıcısını açın.
        basePage = new BasePage();


        //Site adresini tarayıcının adres çubuğuna yazın
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Admin Kullanıcı adı ve şifre bilgilerini girip Login butonuna tıklayınız.
        basePage.adminUserName.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPassword.sendKeys(ConfigReader.getProperty("Sifre"));

        //Admin Header bölümünden Sign in  butonuna tıklayın
        basePage.adminSignIn.click();

        //Dashboard altındaki Blog butonuna tıklayınız
        basePage.blogButton.click();

        //Taglar butonuna basınız
        basePage.blogTagsButton.click();

        //Düzenlemek istediğiniz Tag'ı seçiniz
        basePage.firstTagEditButton.click();

        //Edit butonuna basınız
        basePage.nameTextBoxTags.sendKeys("Big sale");

        //Gerekli düzenlemeleri yapınız
        basePage.descriptionTextBoxTags.sendKeys("The house is equipped with four good bedrooms and two bathrooms.");

        //Save butonuna basınız
        basePage.saveButtonTags.click();

        //Tagların düzenlendiğini doğrulayınız
        Assert.assertTrue(basePage.adminBlogSuccess.isDisplayed());

        //Sayfayı kapatınız
        Driver.closeDriver();


    }

}