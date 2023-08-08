package tests.Aysel;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US019 extends TestBaseRapor {

    BasePage basePage = new BasePage();

    @Test
    public void US019(){

        //Bir kullanici olarak https://qa.hauseheaven.com/ sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Kayıtlı kullanıcı olarak Home page sayfasının footer bölümündeki öğelerin ve
        // fonksiyonların görünür ve aktif olduğunu görüntüleyebildiğimi doğrulayabilmeliyim


        basePage.cookiesButton.click();

        basePage.signUpMenu.click();

        basePage.emailUsernameButton.click();
        basePage.emailUsernameButton.sendKeys("aysel.ahmadli@yahoo.com" + Keys.ENTER);
        basePage.emailPasswordButton.click();
        basePage.emailPasswordButton.sendKeys("A123456&");
        basePage.loginButonu.click();


        //Scroll down till the bottom of the page
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].scrollIntoView(true);",basePage.footerTumOgeler);

        Assert.assertTrue(basePage.iletisimBilgileri.isDisplayed() && basePage.iletisimBilgileri.isEnabled(),
                "İletisim Bilgileri aktifdir");
        Assert.assertTrue(basePage.aboutDiv.isDisplayed() && basePage.aboutDiv.isEnabled(),
                "About bolumu aktifdir");
        Assert.assertTrue(basePage.moreInformationDiv.isDisplayed() && basePage.moreInformationDiv.isEnabled(),
                "More İnformation bolumu aktifdir");
        Assert.assertTrue(basePage.newsDiv.isDisplayed() && basePage.newsDiv.isEnabled(),
                "News bolumu aktifdir");
        Assert.assertTrue(basePage.dowloadAppsDiv.isDisplayed() && basePage.dowloadAppsDiv.isEnabled(),
                "Download Apps bolumu aktifdir");
        Assert.assertTrue(basePage.sosyalMedyaaDiv.isDisplayed() && basePage.sosyalMedyaaDiv.isEnabled(),
                "Sosyal medya ikonlari aktifdir");
        Assert.assertTrue(basePage.aboutUsLinki.isDisplayed() && basePage.aboutUsLinki.isEnabled(),
                "About Us butonu aktifdir");
        Assert.assertTrue(basePage.contactUsLinki.isDisplayed() && basePage.contactUsLinki.isEnabled(),
                "Contact Us butonu aktifdir");
        Assert.assertTrue(basePage.termsConditionsLinki.isDisplayed() && basePage.termsConditionsLinki.isEnabled(),
                "Terms & Conditions butonu aktifdir");
        Assert.assertTrue(basePage.allPropertiesLinki.isDisplayed() && basePage.allPropertiesLinki.isEnabled(),
                "All properties butonu aktifdir");
        Assert.assertTrue(basePage.housesForSaleLinki.isDisplayed() && basePage.housesForSaleLinki.isEnabled(),
                "Houses for sale butonu aktifdir");
        Assert.assertTrue(basePage.housesForRentLinki.isDisplayed() && basePage.housesForRentLinki.isEnabled(),
                "Houses for rent butonu aktifdir");
        Assert.assertTrue(basePage.theBenefitsOfLinki.isDisplayed() && basePage.theBenefitsOfLinki.isEnabled(),
                "The Benefits Of Investing In Emerging Real Estate Markets butonu aktifdir");
        Assert.assertTrue(basePage.aGuideToNegotiatingLinki.isDisplayed() && basePage.aGuideToNegotiatingLinki.isEnabled(),
                "A Guide To Negotiating The Best Deal On Your Dream Home butonu aktifdir");
        Assert.assertTrue(basePage.theRiseOfSustainableLinki.isDisplayed() && basePage.theRiseOfSustainableLinki.isEnabled(),
                "The Rise Of Sustainable Homes: Building For A Greener Future butonu aktifdir");
        Assert.assertTrue(basePage.howToStageYourHomeLinki.isDisplayed() && basePage.howToStageYourHomeLinki.isEnabled(),
                "How to Stage Your Home for a Quick and Profitable Sale butonu aktifdir");
        Assert.assertTrue(basePage.investingInVacationLinki.isDisplayed() && basePage.investingInVacationLinki.isEnabled(),
                "Investing in Vacation Rental Properties: A Lucrative Opportunity butonu aktifdir");
        Assert.assertTrue(basePage.googlePlayLinkii.isDisplayed() && basePage.googlePlayLinkii.isEnabled(),
                "Google Play butonu aktifdir");
        Assert.assertTrue(basePage.appStoreLinkii.isDisplayed() && basePage.appStoreLinkii.isEnabled(),
                "App Store butonu aktifdir");
        Assert.assertTrue(basePage.emailKutusuSubscribe.isDisplayed() && basePage.emailKutusuSubscribe.isEnabled(),
                "Subscribe kısmındaki email kutusu butonu aktifdir");
        Assert.assertTrue(basePage.SubscribeButonu.isDisplayed() && basePage.SubscribeButonu.isEnabled(),
                "Subscribe kısmındaki Subscribe butonu aktifdir");
        Assert.assertTrue(basePage.facebookIkonu.isDisplayed() && basePage.facebookIkonu.isEnabled(),
                "Facebook butonu aktifdir");
        Assert.assertTrue(basePage.twitterIkonu.isDisplayed() && basePage.twitterIkonu.isEnabled(),
                "Twitter butonu aktifdir");
        Assert.assertTrue(basePage.instagramIkonu.isDisplayed() && basePage.instagramIkonu.isEnabled(),
                "Instagram butonu aktifdir");
        Assert.assertTrue(basePage.linkedinIkonu.isDisplayed() && basePage.linkedinIkonu.isEnabled(),
                "Linkedin butonu aktifdir");
        Assert.assertTrue(basePage.pinterestIkonu.isDisplayed() && basePage.pinterestIkonu.isEnabled(),
                "Pinterest butonu aktifdir");

        Driver.closeDriver();

    }
}

