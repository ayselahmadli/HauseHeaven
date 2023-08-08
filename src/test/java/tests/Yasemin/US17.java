package tests.Yasemin;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US17 extends TestBaseRapor {

    // US17: Kayıtlı kullanıcı olarak Home page sayfasının body bölümündeki öğelerin görünür
    // durumda ve fonksiyonların aktif durumda olduğunu görüntülebildiğimi doğrulayabilmeliyim.
    BasePage basePage;
    SoftAssert softAssert;



    @Test
    public void TC01(){

        softAssert=new SoftAssert();



        // US17: Kayıtlı kullanıcı olarak Home page sayfasının body bölümündeki öğelerin görünür olduğunu doğrulamalıyım

        //1-Browser açılır
        //2. Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.SignInLinki.click();
        basePage.emailUsernameButton.sendKeys("yaseminela1985@gmail.com");
        basePage.emailPasswordButton.sendKeys("273071Ela");
        basePage.loginButonu.click();
        basePage.homeLinki.click();

        softAssert.assertTrue(basePage.homePageBodySearchforLocasyon.isDisplayed()&&basePage.homePageHowItWorksElements.isDisplayed());
        softAssert.assertAll();


        Driver.closeDriver();

    }


    @Test
    public void TC02(){

        // TC02:Kayıtlı kullanıcı olarak HomePage saysanın fonksiyonların çalışır olduğunu doğrulamalıyım.

        Driver.getDriver().get(ConfigReader.getProperty("Url"));


        softAssert=new SoftAssert();
        basePage=new BasePage();



        basePage.SignInLinki.click();
        basePage.emailUsernameButton.sendKeys("yaseminela1985@gmail.com");
        basePage.emailPasswordButton.sendKeys("273071Ela");
        basePage.loginButonu.submit();
        basePage.homeLinki.click();

        softAssert.assertTrue(basePage.homePageBodySearchforLocasyon.isEnabled()&&basePage.homePageLocasyon.isEnabled());

        softAssert.assertAll();


        Driver.closeDriver();




    }


}