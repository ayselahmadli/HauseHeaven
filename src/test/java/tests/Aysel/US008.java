package tests.Aysel;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


public class US008 extends TestBaseRapor {
    BasePage basePage = new BasePage();

    @Test
    public void TC_01() {


        //Bir ziyaretçi olarak https://qa.hauseheaven.com/ sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.cookiesButton.click();

        //Agents tiklayin
        basePage.agentsMenuu.click();

    }

    @Test
    public void TC_02() {

        //Bir ziyaretçi olarak https://qa.hauseheaven.com/ sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.agentsMenuu.click();

        //Bir ziyaretçi olarak siteye kayıtlı emlakçıların listelendiği doğrulayin
        Assert.assertTrue(basePage.allAgentsGorunurlugu.isDisplayed() &&
                basePage.allAgentsGorunurlugu.isEnabled(),"Tum emlakcilar goruntulendi");

        //Ilk emlakcinin bilgilerini dogrulayin
        Assert.assertTrue(basePage.digerBilgiler.isDisplayed() &&
                        basePage.agentsIlkIlanPropertiesElementi.isDisplayed() ,
                "Bilgiler goruntulendi");

    }


    @Test
    public void TC_03() {

        //Bir ziyaretçi olarak https://qa.hauseheaven.com/ sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.agentsMenuu.click();

        //Ilk emlakciya tikla
        basePage.agentsIlkElementt.click();

        // emlakçıların satılık ve kiralık ilanlarına ulaşabildiğimi doğrulayabilmeliyim
        Assert.assertTrue(basePage.agentSatilikKiralikButonElementi.isDisplayed() &&
                        basePage.agentSatilikKiralikButonElementii.isEnabled(),
                "Ilk emlakcinin kiralik ve satilik butonu goruntulendi");


        //Emlakcinin satilik ilanlarini dogrula
        Assert.assertTrue(basePage.AgentsIlkSatilikElementininGorunurlugu.isDisplayed() &&
                        basePage.AgentsIlkSatilikElementininGorunurlugu.isEnabled(),
                "Satilik ilanlar goruntulendi");


        Driver.getDriver().navigate().back();

        //Ikinci emlakcinin bilgilerini dogrulayin
        Assert.assertTrue(basePage.agentsIkinciIlanPropertiesElementi.isDisplayed() &&
                basePage.ikinciSiradakininDigerBilgileri.isEnabled() ,"Bilgiler goruntulendi");

        //Ikinci emlakciya tikla
        basePage.agentsIkinciElementt.click();

        // Ikinci emlakçınin satılık ve kiralık ilanlarına ulaşabildiğimi doğrulayabilmeliyim
        Assert.assertTrue(basePage.agentSatilikKiralikButonElementi.isDisplayed() &&
                        basePage.agentSatilikKiralikButonElementii.isEnabled(),
                "Ikinci emlakcinin kiralik ve satilik butonu goruntulendi");


        // emlakçıların satılık  ilanlarına ulaşabildiğimi doğrulayabilmeliyim
        Assert.assertTrue(basePage.agentSatilikKiralikButonElementi.isDisplayed() &&
                basePage.agentSatilikKiralikButonElementi.isEnabled());
        Assert.assertTrue(basePage.ikinciAgentIlkElementi.isDisplayed() &&
                basePage.ikinciAgentIlkElementi.isEnabled());
        Assert.assertTrue(basePage.ikinciAgentIkıncıElementi.isDisplayed() &&
                basePage.ikinciAgentIkıncıElementi.isEnabled());
        Assert.assertTrue(basePage.ikinciAgentUcuncuElementi.isDisplayed() &&
                basePage.ikinciAgentUcuncuElementi.isEnabled());
        Assert.assertTrue(basePage.ikinciAgentDorduncuElementi.isDisplayed() &&
                basePage.ikinciAgentDorduncuElementi.isEnabled());

        Driver.closeDriver();

    }

}