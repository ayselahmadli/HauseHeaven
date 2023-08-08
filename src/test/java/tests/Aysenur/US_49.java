package tests.Aysenur;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;



public class US_49 {

    BasePage basePage = new BasePage();
    Actions actions = new Actions(Driver.getDriver());

    @Test
    public void TC01() throws InterruptedException {

        basePage = new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminLocations.click();
        Assert.assertTrue(basePage.adminLocationsStates.isDisplayed());
        Assert.assertTrue(basePage.adminLocationsStates.isEnabled());

        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();

    }


    @Test
    public void TC02() throws InterruptedException {

        basePage = new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminLocations.click();

        basePage.adminLocationsStates.click();

        Assert.assertTrue(basePage.blunkAction.isDisplayed());
        Assert.assertTrue(basePage.blunkAction.isEnabled());

        Assert.assertTrue(basePage.adminLocationsStatesSearch.isDisplayed());
        Assert.assertTrue(basePage.adminLocationsStatesSearch.isEnabled());

        Assert.assertTrue(basePage.adminLocationsStatesCreate.isDisplayed());
        Assert.assertTrue(basePage.adminLocationsStatesCreate.isEnabled());

        Assert.assertTrue(basePage.adminLocationsStatesReload.isDisplayed());
        Assert.assertTrue(basePage.adminLocationsStatesReload.isEnabled());

        Assert.assertTrue(basePage.adminLocationStatesFilters.isDisplayed());
        Assert.assertTrue(basePage.adminLocationStatesFilters.isEnabled());

        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();

    }

    @Test
    public void TC03() throws InterruptedException {

        basePage = new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminLocations.click();
        basePage.adminLocationsStates.click();
        basePage.adminLocationsStatesCreate.click();

        basePage.adminLocationCitiesbutonuCreateNamealani.sendKeys("Aysenur");
        // adminLocationsPages.adminLocationsStatesCreateCountry.click();

        actions.click(basePage.adminLocationsStatesCreateCountry)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();

        // adminLocationsPages.countryTurkiye.sendKeys(Keys.ENTER);
        basePage.adminLocationsStatesCreateSaveExit.click();

        basePage.copKutusu.click();
        basePage.deleteButton.click();

        Assert.assertTrue(basePage.popUpLocation.isDisplayed());


        basePage.adminAdSoyadAdminTest.click();
        Thread.sleep(2000);
        basePage.adminLogout.click();



    }

    @Test
    public void TC04(){

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();

        basePage.adminLocations.click();
        basePage.adminLocationsStates.click();

        int unexpectedRecotds = Integer.valueOf(basePage.recordSayisi.getText());
        System.out.println(unexpectedRecotds);

        basePage.adminLocationsStatesCreate.click();

        basePage.adminLocationCitiesbutonuCreateNamealani.sendKeys("Aysenur");
        // adminLocationsPages.adminLocationsStatesCreateCountry.click();

        actions.click(basePage.adminLocationsStatesCreateCountry)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();

        // adminLocationsPages.countryTurkiye.sendKeys(Keys.ENTER);
        basePage.adminLocationsStatesCreateSaveExit.click();


        int actualRecords =Integer.valueOf(basePage.recordSayisi.getText());
        System.out.println(actualRecords);

        Assert.assertNotEquals(unexpectedRecotds,actualRecords);

        Driver.closeDriver();

    }
}