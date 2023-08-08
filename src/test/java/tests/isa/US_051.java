package tests.isa;

import org.openqa.selenium.*;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class US_051 extends TestBaseRapor {

    BasePage basePage;

    Select select;
    Actions actions;

    @Test
    public void TC_001() throws InterruptedException {//Admin olarak admin dashoboard bölümündeki Media sayfasına ulaşabilmeli
        basePage=new BasePage();

        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));


        //Email/Username ve Password bölümleri doldurulur ve SIGN IN butonu tıklanır
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        Thread.sleep(2000);
        basePage.adminSignInButton.click();

        //Media seçeneğine tıklanır
        basePage.adminMediaButton.click();

        //Media sayfasının görüldüğü test edilir
        String expectedTitle="Media";
        String actualTitle=Driver.getDriver().getTitle();
        System.out.println(actualTitle);

        Assert.assertTrue(actualTitle.contains(expectedTitle));


        basePage.adminAdSoyadAdminTest.click();
        basePage.adminLogout.click();
    }
    @Test
    public void TC_002() throws InterruptedException {//Admin olarak soldaki Media sayfasından dosya upload edilebilmeli

        basePage = new BasePage();
        actions=new Actions(Driver.getDriver());


        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));


        //Email/Username ve Password bölümleri doldurulur ve SIGN IN butonu tıklanır
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        Thread.sleep(2000);
        basePage.adminSignInButton.click();

        //Media seçeneğine tıklanır
        basePage.adminMediaButton.click();
        actions.doubleClick(basePage.adminMediaFolderTEAM4).perform();
        //Upload butonu tıklanır
        //Yüklenecek dosya secilir

        String dinamikDosyaYolu = System.getProperty("user.home") + "/Desktop/PROJE/3.jpeg";
        String dosyayaAdi = "3";

        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        int imagesElement = 2;
        jsExecutor.executeScript("arguments[0].value='" + dinamikDosyaYolu + "';", imagesElement);

        basePage.adminUploadButton.sendKeys(dinamikDosyaYolu);

        //Success yazısının görüldüğü test edilir
        //Assert.assertTrue(basePage.adminMediaDownloadSuccessMessage.isDisplayed());

        //basePage=new basePage();
        //basePage.adminHome.click();
        basePage.adminAdSoyadAdminTest.click();
        basePage.adminLogout.click();

    }
    @Test
    public void Media_Download_Testi() throws InterruptedException, IOException {//Admin olarak soldaki Media sayfasından internet adresindeki herhangi bir resmi yükleyebilmeli
        extentTest = extentReports.createTest("Resim Yukleme Testi","Media sayfasından internet adresindeki herhangi bir resim yüklenebilmeli");
        basePage = new BasePage();

        actions=new Actions(Driver.getDriver());


        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        extentTest.info("Kullanici hauseHeaven/admin login anasayfaya gider");

        //Email/Username ve Password bölümleri doldurulur ve SIGN IN butonu tıklanır
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        Thread.sleep(2000);
        basePage.adminSignInButton.click();
        extentTest.info("verilen "+ConfigReader.getProperty("kullaniciAdi")+" ve sifreyi yazip giris yapar");

        //Media seçeneğine tıklanır
        basePage.adminMediaButton.click();
        actions.doubleClick(basePage.adminMediaFolderTEAM4).perform();
        extentTest.info("TEAM4 klasorune girer");
        //Download butonuna tıklanır
        basePage.adminDownloadButton.click();
        extentTest.info("Download butonuna tiklar");
        //Açılan sekmeye indirilecek resim Url i girilir ve Download butonuna tıklanır
        String pictureUrl="https://www.homify.com.tr/odalar/evler";
        basePage.adminDowloadTextarea.sendKeys(pictureUrl);

        basePage.adminDowloadMediaDownload.click();
        extentTest.info("Resim linki ekler");
        //Success yazısının görüldüğü test edilir

        ReusableMethods.wait(2);


        Assert.assertTrue(basePage.adminMediaDownloadSuccessMessage.isDisplayed());
        extentTest.pass("Resim yuklendigini test eder");




       // Driver.closeDriver();

        //basePage=new basePage();
        //basePage.adminHome.click();
        //basePage.adminAdSoyadAdminTest.click();
        //basePage.adminLogout.click();
    }

    @Test
    public void TC_004() throws InterruptedException {//Admin olarak soldaki Media sayfasından yeni klasör açılabilmeli

        basePage = new BasePage();

        actions=new Actions(Driver.getDriver());
        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage = new BasePage();

        //Email/Username ve Password bölümleri doldurulur ve SIGN IN butonu tıklanır
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        Thread.sleep(2000);
        basePage.adminSignInButton.click();

        //Media seçeneğine tıklanır
        basePage.adminMediaButton.click();
        actions.doubleClick(basePage.adminMediaFolderTEAM4).perform();
        //Create folder butonu tıklanır
        basePage.adminCreateFolderButton.click();

        //Açılan sekmeye dosya adı girilir ve Create butonu tıklanır
        String folderName="A";
        basePage.adminCreateFolderNameBox.sendKeys(folderName);
        basePage.adminCreateFolderNameBoxCreateButton.click();

        //Arama kutusuna dosya ismi yazılır ve aratılır
        basePage.adminMediaSearchBox.sendKeys(folderName);
        basePage.getAdminMediaSearchBoxButton.submit();

        WebElement adminMediaFolderNameExist=Driver.getDriver().findElement(By.xpath("//div[@title=\""+folderName+"\"]"));
        //Dosyanın yüklendiği test edilir (Kutunun isEmpty olduğu ya da dosyanın görünür olduğu )
        Assert.assertTrue(adminMediaFolderNameExist.isDisplayed());

        //basePage=new basePage();
        //basePage.adminHome.click();
        basePage.adminAdSoyadAdminTest.click();
        basePage.adminLogout.click();
    }

    @Test
    public void TC_005() throws InterruptedException {//Admin olarak soldaki Media sayfasından dosyaları filtreleyebilmeli

        basePage = new BasePage();


        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage = new BasePage();

        //Email/Username ve Password bölümleri doldurulur ve SIGN IN butonu tıklanır
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        Thread.sleep(2000);
        basePage.adminSignInButton.click();

        //Media seçeneğine tıklanır
        basePage.adminMediaButton.click();


        //Filter(Document) butonu tıklanır

        Dimension expectedResult=basePage.adminMediaFilterEverythingTeam4.getSize();
        System.out.println(expectedResult);
        basePage.adminMediaFilterButton.click();
        basePage.videoFilter.click();

        //Açılan menüde Document,Video,Image,Everything seçenekleri test edilir

        Dimension actualResult=basePage.adminMediaFilterEverythingTeam4.getSize();
        System.out.println(actualResult);
        Assert.assertNotEquals(actualResult,expectedResult);

        basePage.adminMediaFilterButton.click();
        basePage.documentFilter.click();

        actualResult=basePage.adminMediaFilterEverythingTeam4.getSize();
        Assert.assertNotEquals(actualResult,expectedResult);

        //Sayfadaki filtrelenen ürünlerin doğru filtrelendiği test edilir

        basePage.adminHome.click();
        basePage.adminAdSoyadAdminTest.click();
        basePage.adminLogout.click();
    }
    @Test
    public void TC_006() throws InterruptedException {//Admin olarak soldaki Media sayfasından görüntülenen bölümü değiştirebilmeli

        basePage = new BasePage();


        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        basePage = new BasePage();

        //Email/Username ve Password bölümleri doldurulur ve SIGN IN butonu tıklanır
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));
        basePage.adminPasswordButton.sendKeys(ConfigReader.getProperty("Sifre"));
        Thread.sleep(2000);
        basePage.adminSignInButton.click();

        //Media seçeneğine tıklanır
        basePage.adminMediaButton.click();

        //Açılan menüde All media,Trash,Recent,Favorites seçenekleri test edilir
        basePage.adminViewInAllMediaButton.click();
        basePage.trashView.click();
        Assert.assertTrue(basePage.trashTitle.isDisplayed());
        Thread.sleep(2000);

        basePage.adminViewInAllMediaButton.click();
        basePage.recentView.click();
        Assert.assertTrue(basePage.recentTitle.isDisplayed());
        Thread.sleep(2000);


        basePage.adminHome.click();
        basePage.adminAdSoyadAdminTest.click();
        basePage.adminLogout.click();


        //Driver.closeDriver();
    }





}
