package tests.Banu;

import com.beust.ah.A;
import org.jsoup.Connection;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.ConcurrentModificationException;

public class US029 extends TestBaseRapor {

    BasePage basePage;
    SoftAssert softAssert;
    Select select;
    String newBlogPostName = "blog post name4";


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


        basePage.blogButton.click();

        softAssert.assertTrue(basePage.blogPostsButton.isDisplayed());
        softAssert.assertTrue(basePage.blogCategoriesButton.isDisplayed());
        softAssert.assertTrue(basePage.blogTagsButton.isDisplayed());

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


        basePage.blogButton.click();

        basePage.blogPostsButton.click();

        basePage.createnewPostButton.click();

        basePage.nameTextBoxPosts.sendKeys(newBlogPostName);
        basePage.descriptionTextBox.sendKeys("blog post description");
        basePage.contentTextBox.sendKeys("blog post content ");

        select = new Select(basePage.adminBlogPostSelectMenu);
        select.selectByValue("draft");

        basePage.latestNewsCheckbox.click();

        basePage.adminBlogPostSaveAndExit.click();

        String expectedText = newBlogPostName;
        String actualText = basePage.firstBlogElementName.getText();

        softAssert.assertEquals(actualText, expectedText, "Blog Post Names Are Not The Same");

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


        basePage.blogButton.click();

        basePage.blogPostsButton.click();
        basePage.firstPostEditButton.click();
        basePage.descriptionTextBox.sendKeys(" new material added");
        basePage.buildingMaterialsCheckbox.click();
        basePage.saveButtonPosts.click();

        basePage.revisionHistoryButton.click();

        softAssert.assertTrue(basePage.blogPostChangeControl.isDisplayed());
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


        basePage.blogButton.click();

        basePage.blogPostsButton.click();

        basePage.searchTextBox.sendKeys(newBlogPostName);

        ReusableMethods.wait(3);
        basePage.blogPostDeleteSearchSonrasi.click();
        ReusableMethods.wait(2);
        softAssert.assertTrue(basePage.succesfulToastMessage.isDisplayed());


        softAssert.assertAll();
        basePage.adminTestKose.click();
        ReusableMethods.wait(2);
        basePage.adminTestLogoutButton.click();


    }
}