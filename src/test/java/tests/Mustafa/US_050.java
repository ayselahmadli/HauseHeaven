package tests.Mustafa;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_050 extends TestBaseRapor {



    BasePage basePage;

    SoftAssert softAssert =new SoftAssert();
    @Test
    public void testCase01(){

        basePage =new BasePage();

        //Admin dashboarda giriş yapıp Locations başlığının altındaki Cities sayfası görüntülenebilmeli

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5. Yan menüde bulunan Locations tabına tıklanır
        basePage.adminLocations.click();
        //6. Cities seçeneğine tıklanır
        ReusableMethods.wait(2);
        ReusableMethods.clickWithJS(basePage.adminLocationCities);
        //7.Sayfanın açıldığı doğrulanır
        String expectedUrl="https://qa.hauseheaven.com/admin/cities";
        String actaulUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actaulUrl,expectedUrl,"sayfaya gidilemedi");
        softAssert.assertAll();
        Driver.closeDriver();

    }

    @Test
    public void testCase02(){

        basePage =new BasePage();


        //Sayfadaki öğeler görüntelenebilir ve aktif olmalı

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5. Yan menüde bulunan Locations tabına tıklanır
        basePage.adminLocations.click();
        //6. Cities seçeneğine tıklanır
        ReusableMethods.clickWithJS(basePage.adminLocationCities);
        //7.Sayfadaki öğelerin görünür olduğu ve aktif olduğu doğrulanır
        softAssert.assertTrue(basePage.adminLocationCities.isDisplayed()&&
                basePage.adminLocationCities.isEnabled());

        softAssert.assertTrue( basePage.adminLocationCitiesSeacrhbox.isDisplayed()&&
                basePage.adminLocationCitiesSeacrhbox.isEnabled());

        softAssert.assertTrue(basePage.adminLocationCitiesbutonuFilters.isDisplayed()&&
                basePage.adminLocationCitiesbutonuFilters.isEnabled());

        softAssert.assertTrue(basePage.adminLocationCitiesBlunkActionButton.isDisplayed()&&
                basePage.adminLocationCitiesBlunkActionButton.isEnabled());

        softAssert.assertTrue(basePage.adminLocationCitiesbutonuCreate.isDisplayed()&&
                basePage.adminLocationCitiesbutonuCreate.isEnabled());


        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase03(){

        basePage =new BasePage();

        //Kayıtlı şehir sayısı görüntülenebilmeli

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5. Yan menüde bulunan Locations tabına tıklanır
        basePage.adminLocations.click();
        //6. Cities seçeneğine tıklanır
        ReusableMethods.clickWithJS( basePage.adminLocationCities);

        //7.Şehir sayısının görüntülendiği test edilir
        softAssert.assertTrue(basePage.adminAccountSehirSayisi.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void testCase04(){
        extentTest =extentReports.createTest("Sehir Ekleme Testi","sehir eklenebilmeli");

        basePage =new BasePage();

        Actions actions =new Actions(Driver.getDriver());
        //Yeni şehir eklenebilmeli

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));
        extentTest.info("urle gidilir");

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        extentTest.info("username ve password girilir");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        extentTest.info("sign ın butonuna tıklanır");
        //5. Yan menüde bulunan Locations tabına tıklanır
        basePage.adminLocations.click();
        extentTest.info("Locationsa tıklanır");
        //6. Cities seçeneğine tıklanır
        ReusableMethods.clickWithJS(basePage.adminLocationCities);
        //7.Yanda bulunan create butonuna tıklanır
        basePage.adminLocationCitiesbutonuCreate.click();
        extentTest.info("create butonuna tıklanır");
        //8.Açılan sayfada şehir bilgileri girilir
        basePage.adminLocationCitiesbutonuCreateNamealani.sendKeys("Sanlıurfa4");
        basePage.adminLocationCitiesbutonuCreateSlugalani.sendKeys("Test7");

        ReusableMethods.waitAndSendText(basePage.adminLocationsCitiesCountrySecmeButonu,"TURKIYE"+Keys.ENTER);

        actions.click(basePage.adminLocationCitiesbutonuCreateOrder).
                keyDown(Keys.BACK_SPACE).keyUp(Keys.BACK_SPACE).perform();

        ReusableMethods.wait(2);
        basePage.adminLocationCitiesbutonuCreateOrder.sendKeys("125");
        extentTest.info("sehir bilgileri eklenir");
        //9.Save butonuna tıklanır
        ReusableMethods.waitAndClickElement(basePage.adminLOcateCitiesCreateSave_ExitButton,2);
        ReusableMethods.wait(2);
        ReusableMethods.waitAndClickElement(basePage.adminLOcateCitiesCreateSave_ExitButton,2);
        extentTest.info("save butonuna tıklanır");
        //10. Şehrin eklendiği test edili
        softAssert.assertTrue(basePage.basariliSehirEklemeSilmeMesaji.getText().contains("Created successfully"));
        extentTest.pass("sehrin eklendiği test edilir");
        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase05(){

        basePage =new BasePage();

        //Şehir düzenlenebilmeli

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5. Yan menüde bulunan Locations tabına tıklanır
        basePage.adminLocations.click();
        //6. Cities seçeneğine tıklanır
        ReusableMethods.clickWithJS(basePage.adminLocationCities);
        //7.Edit tabına tıklanır
        ReusableMethods.wait(2);

        ReusableMethods.clickWithJS(basePage.adminLocationCitiesbutonuEdit);

        ReusableMethods.wait(2);

        //8.Açılan sayfada şehir bilgileri girilir
        Actions actions =new Actions(Driver.getDriver());
        actions.click(basePage.adminLocationCitiesbutonuCreateNamealani).
                sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).
                sendKeys(Keys.BACK_SPACE).perform();
        basePage.adminLocationCitiesbutonuCreateNamealani.sendKeys("Sanlıurfa2");
        ReusableMethods.waitAndClickElement(basePage.adminLOcateCitiesCreateSave_ExitButton,2);
        ReusableMethods.wait(2);
        ReusableMethods.waitAndClickElement(basePage.adminLOcateCitiesCreateSave_ExitButton,2);
        //9.Şehir bilgilerinin güncellendiği doğrulanır
        ReusableMethods.wait(2);

        Assert.assertTrue(basePage.basariliSehirEklemeSilmeMesaji.getText().contains("Updated successfully"));

        Driver.closeDriver();
    }

    @Test
    public void testCase06(){


        basePage =new BasePage();

        //Şehir silinebilmeli

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5. Yan menüde bulunan Locations tabına tıklanır
        basePage.adminLocations.click();
        //6. Cities seçeneğine tıklanır
        ReusableMethods.clickWithJS(basePage.adminLocationCities);
        //7.Delete tabına tıklanır

        ReusableMethods.wait(2);
        basePage.adminLocationCitiesbutonuDelete.click();
        basePage.adminLocationCitiesbutonuDeleteSonraki.click();

        //8.Şehrin silindiği test edilir
        basePage.adminLocationCitiesSeacrhbox.sendKeys("Ankara");
        ReusableMethods.wait(2);

        Assert.assertTrue(basePage.basariliSehirEklemeSilmeMesaji.getText().contains("Deleted successfully"));
        Driver.closeDriver();

    }
}