package tests.Gizem;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US022 extends TestBaseRapor  {

//Kayıtlı kullanıcı olarak sitedeki projeler sayfasına ulaşılabilmeli
//Bu sitede yer alan proje ilanlarinin sayisini goruntuleyebilmeli
//projeyi ve proje ayrintilari goruntulenebilmeli
//projeler sayfasinda arama yapip sonuc alinabildigini
//Sonuclarda cikan projelerin ayrintilari goruntulenebilmeli ve dogrulanabilmeli

    BasePage basePage=new BasePage();
    Actions actions=new Actions(Driver.getDriver());

    @Test
    public void test01() {
        basePage = new BasePage();



        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));


        //2-Sign in buttonuna tiklanir
        basePage.SignInLinki.click();
        System.out.println("Sign in yapildi");

        //3-Email-password alanlar doldurulur

        basePage.emailUsernameButton.sendKeys("gizemzyrt@gmail.com");
        basePage.emailPasswordButton.sendKeys("hause@123");

        //4-Login butonuna tiklanir
        basePage.loginButonu.click();
        System.out.println("kullanici olarak giris yapildi");



        //5-Buy credits butununa tiklanir ve islemler yapilir
        basePage.userDashboardNew.click();
        basePage.userBuyCredits.click();
        basePage.buycreditspost.click();

        ReusableMethods.wait(3);

        basePage.usercardNumber.sendKeys(ConfigReader.getProperty("kartBilgisi"));
        basePage.usercardfullname.sendKeys(ConfigReader.getProperty("fullname"));
        basePage.usercardmmyy.sendKeys(ConfigReader.getProperty("expireDate"));
        basePage.userbuyCreditsCvc.sendKeys("567");
        basePage.userCheckout.click();


        //6-Projects butonuna tiklanir

        basePage.projeButtonNev.click();

        //5-Proje ilanlari sayfasinda proje sayisi goruntulenmeli
        Assert.assertTrue(basePage.projectsResultNumber.isDisplayed());
        System.out.println("Kayıtlı kullanıcı olarak sitedeki projeler sayfasına ulaşıldi ve Sitede yer alan proje ilanlarinin sayisini goruntulendi");

        basePage.logoutButon.click();

    }


    @Test
    public void test02() {
        basePage = new BasePage();

        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //2-Sign in buttonuna tiklanir
        basePage.SignInLinki.click();
        System.out.println("Sign in yapildi");

        //3-Email-password alanlar doldurulur

        basePage.emailUsernameButton.sendKeys("gizemzyrt@gmail.com");
        basePage.emailPasswordButton.sendKeys("hause@123");

        //4-Login butonuna tiklanir
        basePage.loginButonu.click();
        System.out.println("kullanici olarak giris yapildi");


        //5-Projects butonuna tiklanir
        basePage.projeButtonNev.click();

        basePage.projeCookies.click();
        //6-Projeler ve ayrintilari goruntulenmelidir

        basePage.projectsSayfadakiTumIlanlar.isDisplayed();

        Assert.assertTrue(basePage.projeayrinti1.isDisplayed());

        System.out.println("proje ve proje ayrintilari goruntulendi");

        basePage.logoutButon.click();

    }


    @Test
    public void test03(){

        basePage = new BasePage();
        actions=new Actions(Driver.getDriver());

        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //2-Sign in buttonuna tiklanir
        basePage.SignInLinki.click();
        System.out.println("Sign in yapildi");

        //3-Email-password alanlari doldurulur

        basePage.emailUsernameButton.sendKeys("gizemzyrt@gmail.com");
        basePage.emailPasswordButton.sendKeys("hause@123");

        //4-Login butonuna tiklanir
        basePage.loginButonu.click();
        System.out.println("Kullanici olarak giris yapildi");


        //5-Projects butonuna tiklanir
        basePage.projeButtonNev.click();

        //6-Proje sayfasinda arama yapip sonuc alinmalidir
        ReusableMethods.wait(1);

        actions.click(basePage.countryButonu)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ENTER)
                .perform();

        basePage.projeCategoryNew.click();
        ReusableMethods.wait(1);
        basePage.projeCategoryHouseNew.click();


        basePage.searchButonu.click();

        Assert.assertTrue(basePage.projectsResultNumber.isDisplayed());


        //7-Sonuclarda cikan projelerin ayrintilari goruntulenip dogrulanmalidir


        Driver.getDriver().get("https://qa.hauseheaven.com/projects/tropical-haven-residences");


        Assert.assertTrue(basePage.projectsSayfadakiTumIlanlar.isDisplayed());


        basePage.logoutButon.click();

        Driver.closeDriver();


    }



}