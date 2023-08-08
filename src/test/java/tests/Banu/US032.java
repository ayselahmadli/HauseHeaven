package tests.Banu;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.*;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US032 extends TestBaseRapor {
    BasePage basePage;
    SoftAssert softAssert;
    Select select;



    @Test(priority = 0)
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

    @Test(priority = 1)
    public void testCase02() {
        basePage = new BasePage();
        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.testimonialsButton.click();

        String expectedUrl = "https://qa.hauseheaven.com/admin/testimonials";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        softAssert.assertEquals(actualUrl, expectedUrl, "Testimonials Sayfasi Acilmadi");

        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();


    }

    @Test(priority = 2)
    public void testCase03() {

        basePage = new BasePage();
        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.testimonialsButton.click();

        softAssert.assertTrue(basePage.adminTestimonialsSonucSayisi.isDisplayed());

        System.out.println("Toplam Testimonials Sayisi : " + basePage.adminTestimonialsSonucSayisi);
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();
    }

    @Test(priority = 3)
    public void testCase04() {

        basePage = new BasePage();
        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.testimonialsButton.click();
        basePage.adminTestimonialsIlkTestimonial.click();

        softAssert.assertTrue(basePage.adminTestimonialsContent.isDisplayed(), "Testimonials Icerigi Goruntulenemedi");
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();

    }

    @Test(priority = 4)
    public void testCase05() {
        basePage = new BasePage();
        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.testimonialsButton.click();
        basePage.createButton.click();

        basePage.adminTestimonialsNameBox.sendKeys("name1");
        basePage.adminTestimonialsContent.sendKeys("content");

        basePage.adminTestimonialsSaveAndExit.click();


        //adminTestimonialsPage.testimonialsSearchButton.sendKeys("name1");


        softAssert.assertTrue(basePage.adminTestimonialFirstName.isDisplayed());
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();


    }

    @Test(priority = 5)
    public void testCase06() {

        basePage = new BasePage();
        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.testimonialsButton.click();
        basePage.testimonialsSearchButton.clear();
        basePage.testimonialsSearchButton.sendKeys("name1" + Keys.ENTER);

        ReusableMethods.wait(3);

        basePage.adminTestimonialsEdit.click();


        basePage.adminTestimonialsContent.click();
        String contentIlkHal = basePage.adminTestimonialsContent.getText();

        basePage.adminTestimonialsContent.sendKeys("new content added");

        basePage.adminTestimonialSave.click();

        basePage.testimonialsButton.click();

        basePage.testimonialsSearchButton.clear();
        ReusableMethods.wait(3);

        basePage.testimonialsSearchButton.sendKeys("name1");
        ReusableMethods.wait(3);

        basePage.adminTestimonialsEdit.click();
        String contentIkinciHal = basePage.adminTestimonialsContent.getText();

        softAssert.assertFalse(contentIkinciHal.equals(contentIlkHal), "Testimonial Uzerinde Degisiklik Yapilamadi");
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();


    }

    @Test(priority = 6)
    public void testCase07() {

        basePage = new BasePage();
        softAssert = new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();


        basePage.testimonialsButton.click();
        basePage.testimonialsSearchButton.clear();
        basePage.testimonialsSearchButton.sendKeys("name1");

        ReusableMethods.wait(3);

        basePage.adminTestimonialsDelete.click();
        ReusableMethods.wait(3);
        basePage.adminTestimonialsDeleteConfirm.click();
        ReusableMethods.wait(3);

        softAssert.assertFalse(basePage.adminTestimonialsDeletedMessage.isDisplayed(), "Mesaj Goruntulenemedi");
        softAssert.assertAll();

        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();


    }

}