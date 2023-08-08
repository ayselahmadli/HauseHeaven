package tests.Aysenur;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_20 extends TestBaseRapor {

    /*
    TC01:Ziyaretçi olarak site anasayfasından mülklerin Listelendiği List sayfasını görüntüleyebilmeliyim
    TC02:Ziyaretçi  olarak sitede var olan Mülk sayısını görüntüleyebilmeliyim
    TC03:Görüntülenen ilanların ayrıntılarına ulaşabilmeliyim
    TC04:Sayfada arama yaparak sonuc alınan sonuçların sayısını görüntüleyebilmeliyim
     */


    BasePage basePage;
    SoftAssert softAssert;


    @Test
    public void TC01(){

        //TC01:Ziyaretçi olarak site anasayfasından mülklerin Listelendiği List sayfasını görüntüleyebilmeliyim

        softAssert=new SoftAssert();
        basePage=new BasePage();

        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Sign In butonu tıklanır
        basePage.signInLinki.click();
        //Email/Username ve Password bölümleri doldurulur ve Login butonu tıklanır
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.emailPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.loginButonu.click();


        basePage.listingLinki.click();
        softAssert.assertTrue(basePage.listingPropertiesyazisi.isDisplayed());
        softAssert.assertAll();

        basePage.logoutButon.click();

    }

    @Test
    public void TC02(){

        // Ziyaretçi olarak sitede var olan mülk sayısını görüntüleyebilmeliyim

        softAssert=new SoftAssert();
        basePage=new BasePage();

        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Sign In butonu tıklanır
        basePage.signInLinki.click();
        //Email/Username ve Password bölümleri doldurulur ve Login butonu tıklanır
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.emailPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.loginButonu.click();

        basePage.listingLinki.click();
        softAssert.assertTrue(basePage.listingMulkSayisi.isDisplayed());
        softAssert.assertAll();

        basePage.logoutButon.click();

    }

    @Test
    public void TC03(){

        //TC03:Görüntülenen ilanların ayrıntılarına ulaşabilmeliyim

        softAssert=new SoftAssert();
        basePage=new BasePage();

        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Sign In butonu tıklanır
        basePage.signInLinki.click();
        //Email/Username ve Password bölümleri doldurulur ve Login butonu tıklanır
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.emailPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.loginButonu.click();

        basePage.listingLinki.click();

        Driver.getDriver().get("https://qa.hauseheaven.com/properties/2468-pine-avenue");

        softAssert.assertTrue(basePage.listingListelenenMulkOzellik1.isDisplayed()&&basePage.listingListenenMulkDetails.isDisplayed());
        softAssert.assertAll();

        basePage.logoutButon.click();




    }

    @Test
    public void TC04(){

        //TC04: Ziyaretçi olarak Sayfada arama yaparak sonuc alınan sonuçların sayısını görüntüleyebilmeliyim

        softAssert=new SoftAssert();
        basePage=new BasePage();

        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Sign In butonu tıklanır
        basePage.signInLinki.click();
        //Email/Username ve Password bölümleri doldurulur ve Login butonu tıklanır
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.emailPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.loginButonu.click();

        basePage.listingElement.click();
        basePage.listingPageSearchTextBox.click();
        basePage.allowCookiesbutton.click();

        basePage.listingPageCategoryElementi.click();
        basePage.listingCategoryApartment.click();
        basePage.listingFindNewHome.submit();
        softAssert.assertTrue(basePage.listingMulkSayisi.isDisplayed());
        softAssert.assertAll();


        basePage.logoutButon.click();

        Driver.closeDriver();



    }

}