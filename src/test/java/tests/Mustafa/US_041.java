package tests.Mustafa;

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

public class US_041 extends TestBaseRapor {
    SoftAssert softAssert =new SoftAssert();

    BasePage basePage;

    @Test
    public void testCase01(){
        //Site anasayfasından bir account açabilmeliyim


        basePage =new BasePage();
        //1. Browser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //3.Sign Up butonuna tıklanır
        basePage.signUpMenu.click();

        ReusableMethods.clickWithJS(basePage.registerNewAccountButonu);
        //4.Kayıt için gerekli alanlar doldurulur
        basePage.firstNameKutusu.sendKeys("Mustafa");
        basePage.lastnameKutusu.sendKeys("Sen");
        basePage.emailKutusu.sendKeys(ConfigReader.getProperty("sesenGmail"));
        basePage.usernameKutusu.sendKeys(ConfigReader.getProperty("sesenUsername"));
        basePage.passwordKutusu.sendKeys("Mustafa1234.");
        basePage.passwordConfirmKutusu.sendKeys("Mustafa1234.");
        ReusableMethods.clickWithJS(basePage.registerButonu);
        //5.Hesap açıldığı doğrulanır
        softAssert.assertTrue(basePage.hesapSahibiAdiElementi.isDisplayed(),"hesap acılamadı");
        softAssert.assertAll();
        Driver.closeDriver();
    }
    @Test
    public void testCase02(){

        basePage =new BasePage();
        //Admin dashboarda giriş yapıp accounts sayfasına ulaşabilmeliyim

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5.Yan menüde yer alan Accounst tabına tıklanır
        basePage.adminAccountButonu.click();
        //6. Sayfaya gidildği doğrulanır
        String expectedUrl="https://qa.hauseheaven.com/admin/real-estate/accounts";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        softAssert.assertEquals(actualUrl,expectedUrl,"sayfaya gidilemedi");
        softAssert.assertAll();
        Driver.closeDriver();
    }
    @Test
    public void testCase03(){
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
        //5.Yan menüde yer alan Accounst tabına tıklanır
        basePage.adminAccountButonu.click();
        //6.Sayfadaki öğelerin görüntülenebilir olduğu ve aktif olduğu doğrulanır

        softAssert.assertTrue(basePage.adminAccountFilters.isDisplayed()
                &&basePage.adminAccountFilters.isDisplayed());

        softAssert.assertTrue(basePage.adminAccountCreate.isDisplayed()
                && basePage.adminAccountCreate.isEnabled());

        softAssert.assertTrue(basePage.adminAccountReload.isDisplayed()
                &&basePage.adminAccountReload.isDisplayed());

        softAssert.assertTrue(basePage.adminAccountSearchButonu.isDisplayed()
                && basePage.adminAccountSearchButonu.isEnabled());

        softAssert.assertAll();
        Driver.closeDriver();
    }
    @Test
    public void testCase04(){

        basePage =new BasePage();
        //Account sayısını görebilmeliyim.

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));
        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5.Yan menüde yer alan Accounst tabına tıklanır
        basePage.adminAccountButonu.click();
        //6.Accounts sayısının görüldüğü doğrulanır
        softAssert.assertTrue(basePage.adminAccountSayisiElementi.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();
    }

    @Test
    public void testCase05(){

        basePage =new BasePage();
        //Eklediğim öğeler görüntülenebilmeli

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));
        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5.Yan menüde yer alan Accounst tabına tıklanır
        basePage.adminAccountButonu.click();

        //6. Eklenen öğenin görünür olduğu doğrulanır
        basePage.adminAccountSearchButonu.sendKeys("mustafa");
        ReusableMethods.wait(2);
        boolean flag=false;
        for (WebElement each: basePage.adminAccountTumhesaplarListesi
        ) {
            if (each.getText().contains("mustafasen0663@gmail.com")){
                flag =true;
            }
        }
        softAssert.assertTrue(flag);
        softAssert.assertAll();
        Driver.closeDriver();
    }
    @Test
    public void testCase06(){

        basePage =new BasePage();
        //Eklediğim öğeler silinebilmeli

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));
        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5.Yan menüde yer alan Accounst tabına tıklanır
        basePage.adminAccountButonu.click();
        //6.Eklenen öğe yanındaki + ikonuna tıklanır
        basePage.adminAccountSearchButonu.sendKeys("mustafa");

        Actions actions =new Actions(Driver.getDriver());
        actions.click(basePage.adminAccountDeleteCitiesPlusButonu).perform();

        ReusableMethods.wait(1);
        ReusableMethods.clickWithJS(basePage.adminAccountSehirDeleteButonu);
        basePage.deleteConfirm.click();


        //7.Öğenin silindiği doğrulanır
        /*adminAccountPage.adminAccountSearchButonu.sendKeys("mustafa");
        ReusableMethods.wait(3);
        boolean flag =true;
        for (WebElement each: adminAccountPage.adminAccountTumhesaplarListesi
             ) {
            if (!each.getText().contains("mustafasen0663@gmail.com")){
                flag=false;
            }
        }

         */
        softAssert.assertTrue(basePage.basariliSehirEklemeSilmeMesaji.getText().contains("Deleted successfully"));
        softAssert.assertAll();
        Driver.closeDriver();
    }


}