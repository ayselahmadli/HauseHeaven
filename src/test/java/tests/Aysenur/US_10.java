package tests.Aysenur;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;

public class US_10 {

    BasePage basePage = new BasePage();


    @Test
    public void TC01(){

        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.contactBaslik.click();
        Assert.assertTrue(basePage.contactSayfasiBaslik.isDisplayed());


    }

    @Test
    public void TC02(){

        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.contactBaslik.click();

        basePage.nameMetinKutusu.sendKeys("Aysenur");
        Assert.assertTrue(basePage.nameMetinKutusu.isDisplayed());

        basePage.emailMetinKutusu.sendKeys("aysenur.algul34@gmail.com");
        Assert.assertTrue(basePage.emailMetinKutusu.isDisplayed());

        basePage.subjectMetinKutusu.sendKeys("bhjfbhbvjha");
        Assert.assertTrue(basePage.subjectMetinKutusu.isDisplayed());

        basePage.phoneMetinKutusu.sendKeys("0123456");
        Assert.assertTrue(basePage.phoneMetinKutusu.isDisplayed());


    }

    @Test
    public void TC03(){

        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.contactBaslik.click();

        basePage.nameMetinKutusu.sendKeys("Aysenur");
        Assert.assertTrue(basePage.nameMetinKutusu.isDisplayed());

        basePage.emailMetinKutusu.sendKeys("aysenur.algul34@gmail.com");
        Assert.assertTrue(basePage.emailMetinKutusu.isDisplayed());

        basePage.subjectMetinKutusu.sendKeys("bhjfbhbvjha");
        Assert.assertTrue(basePage.subjectMetinKutusu.isDisplayed());

        basePage.phoneMetinKutusu.sendKeys("0123456");
        Assert.assertTrue(basePage.phoneMetinKutusu.isDisplayed());



        basePage.messageMetinKutusu.sendKeys("Hello");
        basePage.sendMessageButonu.click();

        ReusableMethods.wait(7);
        Assert.assertTrue(basePage.sendMessageSuccesfully.isDisplayed());
    }

    @Test
    public void TC04(){

        SoftAssert softAssert = new SoftAssert();
        basePage = new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.contactBaslik.click();

        String adres = basePage.reachUsAdresAlani.getText();

        Driver.getDriver().switchTo().frame(basePage.haritaIFrame);

        Actions actions = new Actions(Driver.getDriver());
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        String iFrameElementAdres =  basePage.iFramePlaceNameElementi.getText();

        System.out.println(iFrameElementAdres);

        System.out.println(adres);

        Assert.assertTrue(adres.contains(iFrameElementAdres));

        Driver.closeDriver();
    }

}