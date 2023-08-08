package tests.isa;

import com.github.javafaker.Faker;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;
import java.time.Duration;

public class US_013  extends TestBaseRapor{//Kullanıcı

    BasePage basePage;
    Faker faker;
    Select select;
    SoftAssert softAssert;


    @AfterMethod
    public void tearDown(){
        //Driver.closeDriver();
    }

    @Test
    public void TC_001(){ //Kayıtlı kullanıcı olarak site anasayfasından account dashboarda ulaşabilmeli
        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        basePage=new BasePage();
        //Sign In butonu tıklanır
        basePage.signInLinki.click();
        //Email/Username ve Password bölümleri doldurulur ve Login butonu tıklanır
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.emailPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.loginButonu.click();

    //Sitenin sol yan kısmındaki Dashboard tıklanır ve ilgili sayfaya gittiği doğrulanır
        basePage.isimSoyisim.click();
        basePage.userDashboard.click();

        String expectedEmailIcerik="/dashboard";
        String actualEmail=Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualEmail.contains(expectedEmailIcerik));
        basePage.logoutButon.click();

    }

    @Test
    public void TC_002() throws InterruptedException, IOException {//Kayıtlı kullanıcı olarak account information kısmında güncelleme yapabilmeli
        basePage=new BasePage();
        faker=new Faker();
        softAssert=new SoftAssert();
        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Sign In butonu tıklanır
        basePage.signInLinki.click();
        //Email/Username ve Password bölümleri doldurulur ve Login butonu tıklanır
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.emailPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.loginButonu.click();

        //Settings’e tıklanır
        basePage.isimSoyisim.click();
        basePage.userSettings.click();

        //Account Information kısmında güncelleme yapılır ve Save butonuna tıklanır
        basePage.userSettingsFirstName.clear();
        basePage.userSettingsFirstName.sendKeys(faker.name().name());
        basePage.userSettingLastName.clear();
        basePage.userSettingLastName.sendKeys(faker.name().lastName());
        basePage.userSettingsUserName.clear();
        basePage.userSettingsUserName.sendKeys("admin17");
        basePage.userSettingsPhone.clear();
        basePage.userSettingsPhone.sendKeys(faker.phoneNumber().cellPhone());
        basePage.userSettingsShortDescription.clear();
        basePage.userSettingsShortDescription.sendKeys(faker.lordOfTheRings().character());


        try {
            basePage.userSettingsEmail.sendKeys(faker.internet().emailAddress());
        } catch (Exception e) {
            ReusableMethods.getScreenshot("Account Information");
        }

        select=new Select(basePage.userSettingsBirthdayYear);
        select.selectByVisibleText("1990");

        select=new Select(basePage.userSettingsBirthdayMonth);
        select.selectByVisibleText("9");

        select=new Select(basePage.userSettingsBirthdayDay);
        select.selectByVisibleText("25");

        select=new Select(basePage.userSettingsGender);//0.male 1.female 2.other
        select.selectByIndex(0);
        basePage.userSettingsSave.submit();

        //Ekranda “Update profile successfully!” yazısının göründüğü doğrulanır
      softAssert.assertTrue(basePage.userSettingsUpdateprofileSuccessfully.isDisplayed());

        softAssert.assertAll();

        basePage.logoutButon.click();
    }
    @Test
    public void Kredi_Satinalma_Testi() throws InterruptedException {//Kayıtlı kullanıcı olarak yeni krediler satın alabilmeli
        extentTest = extentReports.createTest("Kredi Satin Alma Testi","Kayıtlı kullanıcı yeni krediler satın alabilmeli");
        basePage=new BasePage();
        softAssert=new SoftAssert();

        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        extentTest.info("Kullanici hauseheaven anasayfaya gider");
        //Sign In butonu tıklanır
        basePage.signInLinki.click();
        //Email/Username ve Password bölümleri doldurulur ve Login butonu tıklanır
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.emailPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.loginButonu.click();
        extentTest.info("verilen "+ConfigReader.getProperty("kullaniciAdi")+" ve sifreyi yazip SIGN IN butonuna basar");

        //Buy credits seçeneği tıklanır
        basePage.isimSoyisim.click();
        basePage.userBuyCredits.click();
        extentTest.info("Dashboard sayfasina gider Buy credits'e tiklar");
        //Post bölümündeki PURCHASE butonu tıklanır
        basePage.userBuyCreditsFirstPost.click();
        Thread.sleep(3000);

        //Kart bilgileri girilir ve Checkout butonu tıklanır
        basePage.getUserBuyCreditsCardNumber.sendKeys(ConfigReader.getProperty("kartBilgisi"));
        basePage.getUserBuyCreditsCardLastDateMMYY.sendKeys(ConfigReader.getProperty("expireDate"));
        basePage.getUserBuyCreditsCardFullname.sendKeys("Isa Avci");
        basePage.getUserBuyCreditsCardCVC.sendKeys(ConfigReader.getProperty("cdv"));
        basePage.getUserBuyCreditsCheckoutButon.click();
        extentTest.info("Kart bilgilerini girer Checkout butonuna basar");
        //“Add Credits Successfully” yazısının görüldüğü test edilir
        Thread.sleep(3000);
        Assert.assertTrue(basePage.getUserBuyCreditsAddCreditsSuccessfully.isDisplayed());
        extentTest.pass("Başarılı şekilde kredi satınalınabildigi test edilir");

        Driver.closeDriver();
        //basePage.logoutButon.click();

    }
    @Test
    public void TC_004(){//Kayıtlı kullanıcı olarak şifremi değiştirebilmeli
        basePage=new BasePage();
        softAssert=new SoftAssert();

        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Sign In butonu tıklanır
        basePage.signInLinki.click();
        //Email/Username ve Password bölümleri doldurulur ve Login butonu tıklanır
        basePage.emailUsernameButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.emailPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        basePage.loginButonu.click();

        //Security seçeneği tıklanır
        basePage.isimSoyisim.click();
        basePage.userSecurity.click();

        //New pasword ve Confirmation password bölümlerine yeni password yazılır ve Update password butonuna tıklanır
        basePage.UserSecurityNewPassword.sendKeys("isa1234.");
        basePage.UserSecurityConfirmationPassword.sendKeys("isa1234.");
        basePage.UserSecurityUpdatePassword.click();

        //Eski şifreyi tekrar kaydet
        basePage.UserSecurityNewPassword.sendKeys("951847");
        basePage.UserSecurityConfirmationPassword.sendKeys("951847");
        basePage.UserSecurityUpdatePassword.click();

        //Ekranda “Password successfully changed” yazısının göründüğü doğrulanır
        softAssert.assertTrue(basePage.UserSecurityPasswordSuccesfullyChanged.isDisplayed());

        softAssert.assertAll();

        basePage.logoutButon.click();
    }










}
