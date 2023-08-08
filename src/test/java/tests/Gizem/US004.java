package tests.Gizem;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US004  extends TestBaseRapor {

    @Test
    public void test01() {

        //Ziyaretci olarak home page sayfasının
        // footer bölümündeki öğeler ve fonksiyonlarin
        // görünür ve aktif oldugu dogrulanabilmeli

        BasePage basePage=new BasePage();
        SoftAssert softAssert=new SoftAssert();

        // 1-https://hauseheaven.com/ adresine gidiniz
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        System.out.println("Url giris yapildi");


        //2-Footer bolumunun gorunurlugunu test edin
        softAssert.assertTrue(basePage.footerTumOgeler.isDisplayed());
        System.out.println("Footer bolumu goruntulendi");

        //3-Footer bolumu iletisim bilgilerinin gorunurlugunu test edin
        softAssert.assertTrue(basePage.iletisimBilgileri.isDisplayed());

        System.out.println("Footer bolumu iletisim bilgileri goruntulendi");


        //4-Footer kısmındaki About ve alt başlıkları gorunurlugunu test edin

        softAssert.assertTrue(basePage.aboutDiv.isDisplayed());
        System.out.println("Footer kısmındaki About ve alt başlıkları goruntulendi");


        //4a- Footer/About kısmındaki About us linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.aboutUsLinki.isEnabled());
        System.out.println("Footer/About kısmındaki About us linkine erisildi");


        //4b- Footer/About kısmındaki Contact us linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.contactLinki.isEnabled());
        System.out.println("Footer/About kısmındaki Contact us linkine erisildi");

        //4c- Footer/About kısmındaki Terms & Conditions linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.termsConditionsLinki.isEnabled());
        System.out.println("Footer/About kısmındaki Terms & Conditions linkine erisildi");

        //5- Footer kısmındaki More Information ve alt başlıklarınin gorunur oldugunu test edin

        softAssert.assertTrue(basePage.moreInformationDiv.isDisplayed());
        System.out.println("Footer kısmındaki More Information goruntulendi");


        //5a-Footer/MORE INFORMATION kısmındaki All properties linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.allPropertiesLinki.isEnabled());
        System.out.println("Footer/MORE INFORMATION kısmındaki All properties linkine erisildi");


        //5b- Footer/MORE INFORMATION kısmındaki Houses for sale linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.housesForSaleLinki.isEnabled());
        System.out.println("Footer/MORE INFORMATION kısmındaki Houses for sale linkine erisildi");

        //5c- Footer/MORE INFORMATION kısmındaki Houses for rent linkine aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.housesForRentLinki.isEnabled());
        System.out.println("Footer/MORE INFORMATION kısmındaki Houses for rent linkine erisildi");


        //6-Footer kısmındaki News ve alt başlıklarınin gorunur oldugunu test edin
        softAssert.assertTrue(basePage.newsDiv.isDisplayed());
        System.out.println("Footer kısmındaki News goruntulendi");

        //6a- Footer/NEWS kısmındaki The Benefits Of Investing In Emerging Real Estate Markets linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.theBenefitsOfLinki.isEnabled());
        System.out.println("Footer/NEWS kısmındaki The Benefits Of Investing In Emerging Real Estate Markets linkine erisildi");

        //6b- Footer/NEWS kısmındaki A Guide To Negotiating The Best Deal On Your Dream Home linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.aGuideToNegotiatingLinki.isEnabled());
        System.out.println("Footer/NEWS kısmındaki A Guide To Negotiating The Best Deal On Your Dream Home linkine erisildi");

        //6c-Footer/NEWS kısmındaki The Rise Of Sustainable Homes: Building For A Greener Future linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.theRiseOfSustainableLinki.isEnabled());
        System.out.println("Footer/NEWS kısmındaki The Rise Of Sustainable Homes: Building For A Greener Future linkine erisildi");

        //6d- Footer/NEWS kısmındaki How to Stage Your Home for a Quick and Profitable Sale linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.howToStageYourHomeLinki.isEnabled());
        System.out.println("Footer/NEWS kısmındaki How to Stage Your Home for a Quick and Profitable Sale linkine erisildi");

        //6e- Footer/NEWS kısmındaki Investing in Vacation Rental Properties: A Lucrative Opportunity linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.investingInVacationLinki.isEnabled());
        System.out.println("Footer/NEWS kısmındaki Investing in Vacation Rental Properties: A Lucrative Opportunity linkine erisildi");

        //7- Footer kısmındaki Dowload Apps ve alt başlıklarınin gorunurlugunu test ediniz
        softAssert.assertTrue(basePage.dowloadAppsDiv.isDisplayed());
        System.out.println(" Footer kısmındaki Dowload Apps goruntulendi");

        //7a-Footer/Download Apps kısmındaki Google Play linkinin aktif oldugunu dogrulayiniz

        softAssert.assertTrue(basePage.googleplayNew.isEnabled());
        System.out.println("Footer/Download Apps kısmındaki Google Play linkine erisildi");


        //7b- Footer/Download Apps kısmındaki App Store linkinin aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.appStoreLinki.isEnabled());
        System.out.println("Footer/Download Apps kısmındaki App Store linkine erisildi");


        // 8- Footer/Subscribe kısmındaki email kutusunun erisilebilir oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.emailKutusuSubscribe.isEnabled());
        System.out.println("Footer/Subscribe kısmındaki email kutusunun erisildi");

        //9- Footer/Subscribe kısmındaki Subscribe butonunun aktif oldugunu dogrulayiniz
        softAssert.assertTrue(basePage.SubscribeButonu.isEnabled());

        System.out.println("Subscribe butonuna erisildi");

        softAssert.assertAll();

        Driver.closeDriver();

    }

}