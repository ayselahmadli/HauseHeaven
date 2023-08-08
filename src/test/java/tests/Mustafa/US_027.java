package tests.Mustafa;

import org.apache.hc.core5.reactor.DefaultConnectingIOReactor;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.IOException;

public class US_027 extends TestBaseRapor {

    BasePage basePage;

    @Test
    public void testCase01(){
        basePage=new BasePage();

        //Admin dashboard sayfasında Header bölümünden sitenin anasayfasına gidebilmeliyim

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5.Headerda bulunan view website tabına tıklanır
        basePage.adminDashboardViewWebSiteButonu.click();
        //6.Siteye gidilemediği doğrulanır
        String sayfauUrl=Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://qa.hauseheaven.com/";
        Assert.assertNotEquals(sayfauUrl,expectedUrl);
        Driver.closeDriver();

    }

    @Test
    public void testCase02(){
        basePage=new BasePage();

        //Kenardaki menüyü açıp kapatabilmeliyim

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5.Hamburger menü ikonuna tıklanır
        basePage.adminDashboardizgaraMenu.click();
        //6.Menülerin açılıp kapandığı doğrulanır
        Assert.assertFalse(basePage.adminDashboardAnasayfaImage.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void testCase03(){
        basePage=new BasePage();

        //Notification bölümüne ulaşabilmeliyim

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5.Notification ikonuna tıklanır
        basePage.adminDashboardNotificationButonu.click();
        //6. Notificationın açıldığı doğrulanır
        Assert.assertTrue(basePage.getAdminDashboardNotificationKapatmaButonu.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void testCase04(){
        basePage=new BasePage();

        //Profil bilgileri sayfasına gidebilmeliyim

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5. Sağda yer alan Admin Test butonuna tıklanır
        basePage.adminDashboardAdminTestButonu.click();
        //6.Açılan pencereden Profile seçeneğine tıklanır
        basePage.adminDashboardAdminTestProfile.click();
        //7.Profile sayfasına gidildiği doğrulanır
        String expectedUrl="https://qa.hauseheaven.com/admin/system/users/profile/24";
        String actualUrl=Driver.getDriver().getCurrentUrl();
        Assert.assertEquals(actualUrl,expectedUrl);
        Driver.closeDriver();
    }

    @Test
    public void testCase05() throws IOException {
        basePage=new BasePage();

        //Kullanıcı bilgilerimi düzenleyebilmeliyim

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5. Sağda yer alan Admin Test butonuna tıklanır
        basePage.adminDashboardAdminTestButonu.click();
        //6.Açılan pencereden Profile seçeneğine tıklanır
        basePage.adminDashboardAdminTestProfile.click();
        //7.Profile sayfasında iken first name ve last name alanlarına yeni isimler girilir
        basePage.adminDashboardProfileFirstnameKutusu.sendKeys("Mustafa");
        basePage.adminDashboardProfileLastnameKutusu.sendKeys("sen");
        //8.Update butonuna tıklanır
        basePage.adminDashboardAdminTestProfileUpdateButonu.click();
        //9.Profile bilgilerinin değiştiği doğrulanır(degismiyor)
        ReusableMethods.getScreenshot("PrfilBilgisiHatasi");
        Assert.assertFalse(basePage.adminDashboardProfileFirstnameKutusu.getText().contains("Mustafa"));
        Driver.closeDriver();


    }

    @Test
    public void testCase06() throws IOException {
        basePage=new BasePage();


        //Şifremi değiştirebilmeliyim

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        ReusableMethods.wait(2);
        //5. Sağda yer alan Admin Test butonuna tıklanır

        basePage.adminDashboardAdminTestButonu.click();

        ReusableMethods.wait(2);
        //6.Açılan pencereden Profile seçeneğine tıklanır
        basePage.adminDashboardAdminTestProfile.click();
        //7.Change Password sekmesine tıklanır
        basePage.adminDashboardAdminTestProfileChangePasswordButonu.click();
        //8.Şu anki password yazılır
        basePage.adminDashboardAdminTestProfileOldPasswordKutusu.sendKeys("951847");
        //9. Yeni password yazılır
        basePage.adminDashboardAdminTestProfileYeniPasswordKutusu.sendKeys("951847");
        basePage.adminDashboardAdminTestProfileConfirmPasswordKutusu.sendKeys("951847");
        //10.Update butonuna tıklanır
        basePage.adminDashboardAdminTestProfileChangeUpdateButonu.click();

        //11. Passwordun değiştiği doğrulanır(degismiyor)
        ReusableMethods.getScreenshot("PasswordHatasi");
        Assert.assertTrue(basePage.adminDashboardAdminTestProfileChangePasswordHataMesaji.isDisplayed());
        Driver.closeDriver();
    }

    @Test
    public void testCase07(){
        BasePage basePage=new BasePage();



        //Çıkış yaparak admin giriş sayfasına ulaşabilmeliyim

        //1.Broser açılır
        //2.Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl2"));

        //3.Username ve password girilir
        basePage.adminEmailButton.sendKeys("admin19");
        basePage.adminPasswordButton.sendKeys("951847");
        //4.Sign In Butonuna tıklanır
        basePage.adminSignInButton.click();
        //5.Sağda yer alan Admin Test butonuna tıklanır
        basePage.adminDashboardAdminTestButonu.click();
        //6.Logout seçeneğine tıklanır
        ReusableMethods.clickWithJS(basePage.adminLogout);
        //7.Çıkış yapıldığı doğrulanır
        Assert.assertTrue(basePage.adminSignInButton.isDisplayed());
        Driver.closeDriver();
    }
}