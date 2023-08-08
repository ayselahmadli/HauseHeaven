package tests.Aysel;


import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US034 extends TestBaseRapor  {

    BasePage basePage = new BasePage();

    @Test
    public void TC_01() throws InterruptedException {

        //Admin olarak https://qa.hauseheaven.com/ sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));


        //admin dahsboarda giriş yapıp Real Estate başlığının altındaki properties sayfasına ulşabildiğimi ve
        // bu sayfadaki ilanların görüntülenebildiğini, aktif ilan sayısının görüntülenebilidğini,
        // yeni ilan ekleyip, düzeneleyip silebildiğimi doğrulayabilmeliyim

        basePage.adminEmailButton.click();
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.click();
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.adminSignInButton.click();
        basePage.realEstateButonu.click();

        basePage.propertiesButonu.click();
        Assert.assertTrue(basePage.propertiesButonu.isDisplayed() &&
                basePage.propertiesButonu.isEnabled() ,"Properties butonuna ulasildi");
        Assert.assertTrue(basePage.propertiesButonuTumIlanlar.isDisplayed() &&
                basePage.propertiesButonuTumIlanlar.isEnabled(),"Tum ilanlara ulasildi");

        basePage.createElementi.click();
        basePage.titleElementi.click();
        basePage.titleElementi.sendKeys("Yeni İlan");

        basePage.descrioptionTextAreaElementi.click();
        basePage.descrioptionTextAreaElementi.sendKeys("Yeni ilan basariyla kayd edildi");

        //adminRealStatePage.showHideElementi.click();

        basePage.paragraphElementi.sendKeys("ilan");

        //adminRealStatePage.addMediaElementi.click();
        WebElement cityElementi=Driver.getDriver().findElement(By.xpath("(//span[@class=\"select2-selection__rendered\"])[1]"));
        Actions actions=new Actions(Driver.getDriver());
        actions.click(cityElementi)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .click();
        basePage.propertyLocationElementi.sendKeys("New York");
        basePage.latudeElementi.sendKeys("1.5");
        basePage.longitudeElementi.sendKeys("100.5");
        basePage.numberBedroomsElementi.sendKeys("2");
        basePage.numberBathroomsElementi.sendKeys("1");
        basePage.numberFloorsElementi.sendKeys("2");
        basePage.squareElementi.sendKeys("120");
        basePage.priceElementi.sendKeys("1000");
        //adminRealStatePage.currencyElementi.click();
        Assert.assertTrue(basePage.selectfacilityElementi.isEnabled());
        basePage.distanceElementi.sendKeys("2000");
        Assert.assertTrue(basePage.currencyElementi.isEnabled());
        Assert.assertTrue(basePage.typeElementi.isEnabled());
        Assert.assertTrue(basePage.wifiElementi.isEnabled());
        Assert.assertTrue(basePage.headerloyoutElementi.isEnabled());
        Assert.assertTrue(basePage.moderationStatussElementi.isEnabled());
        Thread.sleep(3);
        basePage.saveAndExitElementii.click();

        Assert.assertTrue(basePage.editElementi.isDisplayed() &&
                basePage.editElementi.isEnabled());
        basePage.editElementi.click();

        Driver.getDriver().navigate().back();

        Assert.assertTrue(basePage.deleteElementi.isDisplayed() &&
                basePage.deleteElementi.isEnabled());
        basePage.deleteElementi.click();

        Driver.closeDriver();

    }
}