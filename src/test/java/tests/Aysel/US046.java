package tests.Aysel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US046 extends TestBaseRapor {

    BasePage basePage = new BasePage();
    @Test
    public void TC_01() throws InterruptedException {

        //Bir kullanici olarak https://qa.hauseheaven.com/ sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //siteye kayıtlı kullanıcı olarak giriş yaparak yeni kredi için ödeme yapıp
        // çıkış yapıp admin sayfasında bu ödemenin admin dashboard'da görüntülenebildiğini doğrulayabilmeliyim

        basePage.cookiesButton.click();

        basePage.signUpMenu.click();

        basePage.emailUsernameButton.click();
        basePage.emailUsernameButton.sendKeys("aysel.ahmadli@yahoo.com" + Keys.ENTER);
        basePage.emailPasswordButton.click();
        basePage.emailPasswordButton.sendKeys("A123456&");
        basePage.loginButonu.click();
        basePage.userLinki.click();
        basePage.userBuyCredits.click();
        basePage.purchase.click();

        //Kart bilgileri girilir ve Checkout butonu tıklanır
        Thread.sleep(3);
        basePage.getUserBuyCreditsCardNumber.sendKeys(ConfigReader.getProperty("kartBilgisi"));
        basePage.getUserBuyCreditsCardLastDateMMYY.sendKeys(ConfigReader.getProperty("expireDate"));
        basePage.getUserBuyCreditsCardFullname.sendKeys("Aysel Ahmadli");
        basePage.getUserBuyCreditsCardCVC.sendKeys(ConfigReader.getProperty("cvc"));
        basePage.getUserBuyCreditsCheckoutButon.click();


        basePage.Logout.click();

    }
    @Test
    public void TC_02()  {

        //Admin olarak https://qa.hauseheaven.com/ sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        basePage.adminEmailButton.click();
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.click();
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre") );
        basePage.adminSignInButton.click();

        basePage.adminPaymentButton.click();
        basePage.adminPaymentTransactionsButton.click();

        Assert.assertTrue(basePage.aldigimKrediGoruntulendi.isDisplayed() && basePage.aldigimKrediGoruntulendi.isEnabled(),
                "Bu ödeme admin dashboard'da görüntülendi");

        Driver.closeDriver();


    }

}