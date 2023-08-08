package tests.Mustafa;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;

import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_018 extends TestBaseRapor {


    @Test
    public void testCase01(){


        //Kayıtlı kullanıcı olarak Home page
        //sayfasının body bölümündeki arama ksımında arama yapabilmeliyim

        //1-Browser açılır
        //2. Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        BasePage basePage =new BasePage();

        //3.Sign In butonuna tıklanarak giriş yapılır
        basePage.signInButonu.click();
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("sesenGmail"));
        basePage.emailPasswordButton.sendKeys("Mustafa1234.");
        ReusableMethods.clickWithJS(basePage.loginButonu);
        //4.Anasayfa body bölümünde bulunan arama kısmında bir arama yapılır
        basePage.homePageSearchLocationInput.sendKeys("Texas");
        Select select =new Select(basePage.homePageMinPriceSelectKutusu);
        select.selectByValue("500");

        Select select1 =new Select(basePage.homePageMaxPriceSelectKutusu);
        select1.selectByValue("50000");
        //5.Arama yapıldığı ve doğrulanır
        ReusableMethods.clickWithJS(basePage.searchResultButonu);
        ReusableMethods.wait(2);
        Assert.assertTrue(basePage.homePageAramaSonuclariElementi.isDisplayed());
        Driver.closeDriver();

    }

    @Test
    public void testCase02(){

        //Arama yaptıktan sonra sonuç sayısı görüntülenebilmeli

        //1-Browser açılır
        //2. Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        BasePage basePage =new BasePage();

        //3.Sign In butonuna tıklanarak giriş yapılır
        basePage.signInButonu.click();
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("sesenGmail"));
        basePage.emailPasswordButton.sendKeys("Mustafa1234.");
        ReusableMethods.clickWithJS(basePage.loginButonu);
        //4.Anasayfa body bölümünde bulunan arama kısmında bir arama yapılır
        basePage.homePageSearchLocationInput.sendKeys("Texas");
        Select select =new Select(basePage.homePageMinPriceSelectKutusu);
        select.selectByValue("500");

        Select select1 =new Select(basePage.homePageMaxPriceSelectKutusu);
        select1.selectByValue("50000");
        //5.Sonuç sayısının görüntülendiği doğrulanır
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(basePage.searchResultButonu);
        ReusableMethods.wait(1);
        Assert.assertTrue(basePage.homePageAramaSonuclariElementi.getText().contains("Found"));
        Driver.closeDriver();

    }
}