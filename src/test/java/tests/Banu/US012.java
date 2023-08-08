package tests.Banu;

import org.bson.io.BsonOutput;
import org.checkerframework.checker.units.qual.A;
import org.checkerframework.checker.units.qual.C;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.security.Key;

public class US012 extends TestBaseRapor {


    BasePage basePage;
    SoftAssert softAssert;
    Select select;
    String description = "New Property Added By Team4";
    String location = "Ankara1";
    String propertyTitleText = "New Property View Test13";



    @Test(priority = 0)
    public void testCase01() {

        softAssert = new SoftAssert();
        basePage = new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.userDashboardSignIn.click();
        System.out.println("sign in tiklandi");

        basePage.emailUsernameButton.sendKeys("banuyurdakulQA@gmail.com");
        System.out.println("email girildi");

        basePage.emailPasswordButton.sendKeys("1234567.h");
        System.out.println("password girildi");

        basePage.loginButonu.click();
        System.out.println("login tiklandi");

        basePage.addPropertyClick.click();
        System.out.println("add property tiklandi");

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/account/properties/create";
        softAssert.assertEquals(actualUrl, expectedUrl, "Add Property Sayfasina Yonlendirildi");

        basePage.titleClick.sendKeys(propertyTitleText);
        String description = "New Property Added By Team4";
        basePage.descriptionClick.sendKeys(description);
        System.out.println("description girildi");

        basePage.addPropertyContent.sendKeys("1");
        System.out.println("content girildi");

        basePage.propertyLocationClick.sendKeys(location);
        basePage.latitudeClick.sendKeys("1");
        basePage.longitudeClick.sendKeys("1");
        basePage.numberBedroomsClick.sendKeys("1");
        basePage.numberBathroomsClick.sendKeys("1");
        basePage.numberFloorsClick.sendKeys("1");
        basePage.squaresClick.sendKeys("100");
        basePage.priceClick.sendKeys("100000");
        basePage.propertyLabelClick.sendKeys("NewProperty");


        select = new Select(basePage.selectFacilityClick);
        select.selectByValue("3");
        System.out.println("facility secildi");


        basePage.addPropertyDistance.sendKeys("1");
        System.out.println("distance girildi");

        select = new Select(basePage.typeClick);
        select.selectByValue("1");
        System.out.println("type secildi");

        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) Driver.getDriver();
        jsExecutor2.executeScript("arguments[0].click();", basePage.addPropertySave);

        ReusableMethods.wait(4);

        softAssert.assertTrue(basePage.propertySuccesfullyAdded.isDisplayed());


        softAssert.assertAll();

        basePage.logoutButonu.click();


    }

    @Test(dependsOnMethods = "testCase01")
    public void testCase02() {
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage = new BasePage();
        basePage.pendingPropertiesClick.click();
        basePage.searchClick.sendKeys(propertyTitleText + Keys.ENTER);
        ReusableMethods.wait(3);
        basePage.pendingPropertiesCheckbox.click();
        basePage.bulkActionsClick.click();

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(basePage.bulkChanges).perform();
        ReusableMethods.wait(2);
        basePage.moderationStatusSecenegi.click();

        ReusableMethods.wait(2);

        Select select1 = new Select(basePage.moderationStatusSelectMenu);
        select1.selectByValue("approved");

        basePage.moderationStatusSubmit.click();

        ReusableMethods.wait(2);

        basePage.activePropertiesClick.click();
        basePage.searchClick.clear();
        basePage.searchClick.sendKeys(propertyTitleText);
        ReusableMethods.wait(3);

        if (basePage.activePropertiesModerationStatusGorunum.isDisplayed()) {

            String actualModerationStatus = basePage.activePropertiesModerationStatusGorunum.getText();
            String expectedModerationStatus = "Approved";
            softAssert.assertEquals(actualModerationStatus, expectedModerationStatus, "");
            softAssert.assertAll();

        }

        basePage.logoutButonu.click();

    }


    @Test(priority = 2)
    public void testCase03() {

        softAssert = new SoftAssert();
        basePage = new BasePage();


        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.userDashboardSignIn.click();

        basePage.emailUsernameButton.sendKeys("banuyurdakulQA@gmail.com");
        System.out.println("email girildi");

        basePage.emailPasswordButton.sendKeys("1234567.h");
        System.out.println("password girildi");

        basePage.userDashboardSignIn.click();

        System.out.println("sign in tiklandi");


        basePage.loginButonu.click();
        System.out.println("login tiklandi");


        basePage.listingLinki.click();
        System.out.println("Listing tiklandi");

        String actualUrl = Driver.getDriver().getCurrentUrl();
        String expectedUrl = "https://qa.hauseheaven.com/properties?layout=sidebar";

        softAssert.assertEquals(actualUrl, expectedUrl, "Properties Sayfasina Yonlendirildi");

        basePage.listingPageSearchTextBox.sendKeys(propertyTitleText + Keys.ENTER);

        ReusableMethods.wait(5);
        basePage.listingPageSearchSonrasiPropertyName.click();
        System.out.println("ilk mulk tiklandi");


        String actualTitle = basePage.listingPagePropertyTitle.getText();

        softAssert.assertEquals(actualTitle, propertyTitleText, "Property Titles Are Not The Same");

        softAssert.assertAll();

        // bug: description olarak girilen alan content olarak listede gorunuyor

        basePage.logoutButonu.click();

    }

    @Test(priority = 3)
    public void testCase04() {

        softAssert = new SoftAssert();
        basePage = new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.userDashboardSignIn.click();
        System.out.println("sign in tiklandi");

        basePage.emailUsernameButton.sendKeys("banuyurdakulQA@gmail.com");
        System.out.println("email girildi");

        basePage.emailPasswordButton.sendKeys("1234567.h");
        System.out.println("password girildi");

        basePage.loginButonu.click();
        System.out.println("login tiklandi");


        basePage.listingLinki.click();
        System.out.println("Listing tiklandi");

        basePage.listingPageSearchTextBox.sendKeys(location + Keys.ENTER);

        System.out.println("arama yapildi");

        ReusableMethods.wait(5);
        basePage.listingPageSearchSonrasiPropertyName.click();
        System.out.println("ilk mulk tiklandi");


        basePage.nameTextBox.sendKeys("banu yurdakul");
        System.out.println("name girildi");
        basePage.PhoneTextBox.sendKeys("12345678");
        System.out.println("phone girildi");
        basePage.emailTextBox.sendKeys(ConfigReader.getProperty("kayitliKullaniciEmailBanu"));
        System.out.println("mail girildi");
        basePage.messageTextBox.sendKeys("message tested" + Keys.ENTER + Keys.TAB + Keys.ENTER);

        ReusableMethods.wait(5);

        WebElement succesfulAlert = Driver.getDriver().findElement(By.xpath("//div[@id=\"alert-container\"]"));

        softAssert.assertTrue(succesfulAlert.isDisplayed(), "Alert Message Could Not Be Displayed");

        softAssert.assertAll();

        basePage.logoutButonu.click();
    }


}