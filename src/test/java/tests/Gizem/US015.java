package tests.Gizem;

import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public  class US015 extends TestBaseRapor {

//Kayıtlı kullanıcı olarak account sayfasına yeni ilan eklenebilmeli,
// düzenlenebilmeli, silinebilmeli ve doğrunabilmeli



    BasePage basePage = new BasePage();


    @Test
    public void test01() {
        basePage = new BasePage();


        //1-url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        //2-sign buttonuna tiklanir
        basePage.SignInLinki.click();
        //3-email-password alanlari doldurulur
        basePage.emailUsernameButton.sendKeys("gizemzyrt@gmail.com");
        basePage.emailPasswordButton.sendKeys("hause@123");
        //4-login butonuna tiklanir
        basePage.loginButonu.click();

        basePage.userbutton.click();

        System.out.println("Account sayfasina ulasildi");


        basePage.logoutButon.click();


    }

    @Test
    public void test02() {
        basePage = new BasePage();



        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        //2-Sign buttonuna tiklanir
        basePage.SignInLinki.click();
        //3-Email-password alanlari doldurulur
        basePage.emailUsernameButton.sendKeys("gizemzyrt@gmail.com");
        basePage.emailPasswordButton.sendKeys("hause@123");
        //4-Login butonuna tiklanir
        basePage.loginButonu.click();

        //5-Buy credits butununa tiklanir ve islemler yapilir
        basePage.userDashboardNew.click();
        basePage.userBuyCredits.click();

        //5a-Post bolumundeki PURCHASE butonu tiklanir
        basePage.userBuyCreditsFreeFirstPosttt.click();
        ReusableMethods.wait(5);

        //5b-Kart bilgileri girilir ve checkout butonuna tiklanir
        basePage.usercardNumber.sendKeys(ConfigReader.getProperty("kartBilgisi"));
        basePage.usercardmmyy.sendKeys(ConfigReader.getProperty("expireDate"));
        basePage.usercardfullname.sendKeys(ConfigReader.getProperty("fullname"));
        basePage.userbuyCreditsCvc.sendKeys("567");

        basePage.userCheckout.click();

        System.out.println("Yeni ilan ekleyebilmek icin credi satin alindi");

        basePage.logoutButon.click();


    }

    @Test
    public void test03() {

        basePage = new BasePage();



        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        //2-Sign buttonuna tiklanir
        basePage.SignInLinki.click();
        //3-Email-password alanlari doldurulur
        basePage.emailUsernameButton.sendKeys("gizemzyrt@gmail.com");
        basePage.emailPasswordButton.sendKeys("hause@123");
        //4-Login butonuna tiklanir
        basePage.loginButonu.click();
        //5-Add property butonuna tiklayiniz
        basePage.addPropertyLinki.click();
        basePage.usercookies.click();

        //6-Acilan penceredeki alanlar doldurulmali

        ReusableMethods.wait(3);
        basePage.titleClick.sendKeys("new properties1");
        basePage.descriptionClick.sendKeys("home sweet home");
        basePage.contentClickNew.sendKeys("aaadsadsafd");

        Actions actions=new Actions(Driver.getDriver());
        actions.click(basePage.cityElementi)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .sendKeys(Keys.ARROW_DOWN)
                .click();

        basePage.propertyLocationClick.sendKeys("turkey");
        basePage.latitudeClick.sendKeys("233445");
        basePage.longitudeClick.sendKeys("282.8292");
        basePage.numberBedroomsClick.sendKeys("2");
        basePage.numberBathroomsClick.sendKeys("3");
        basePage.numberFloorsClick.sendKeys("2");
        basePage.squaresClick.sendKeys("3");
        basePage.priceClick.sendKeys("1000");
        basePage.usdClick.isEnabled();
        basePage.propertyLabelClick.sendKeys("my properties");

        Select select =new Select(basePage.typeClick);
        select.selectByIndex(1);

        basePage.saveAndExitClick.submit();

        Assert.assertTrue(basePage.useraddpropertiesSaveexitSuccesNew.isDisplayed());

        ReusableMethods.wait(2);

        System.out.println("Account sayfasina yeni ilan eklendi");


        basePage.logoutButon.click();

    }

    @Test
    public void test04(){

        basePage = new BasePage();



        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        //2-Sign buttonuna tiklanir
        basePage.SignInLinki.click();
        //3-Email-password alanlari doldurulur
        basePage.emailUsernameButton.sendKeys("gizemzyrt@gmail.com");
        basePage.emailPasswordButton.sendKeys("hause@123");
        //4-Login butonuna tiklanir
        basePage.loginButonu.click();


        basePage.userbutton.click();
        basePage.userProperties.click();

        //8-Save&exit yapildiktan sonra edit kutusuna tiklanip duzenlenlemeler yapilir

        basePage.userPropertiesSearch.sendKeys("new properties1");

        ReusableMethods.wait(1);

        basePage.useraddpropertiesEditNew.click();
        basePage.descriptionClick.sendKeys("good place ");

        basePage.saveAndExitClick.submit();
        Assert.assertTrue(basePage.editsuccess.isDisplayed());
        ReusableMethods.wait(1);

        basePage.logoutButon.click();


        System.out.println(" account sayfasına eklenen yeni ilan duzenlendi");


    }

    @Test
    public void test05(){
        basePage = new BasePage();



        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        //2-Sign buttonuna tiklanir
        basePage.SignInLinki.click();
        //3-Email-password alanlari doldurulur
        basePage.emailUsernameButton.sendKeys("gizemzyrt@gmail.com");
        basePage.emailPasswordButton.sendKeys("hause@123");
        //4-Login butonuna tiklanir
        basePage.loginButonu.click();


        basePage.userbutton.click();
        basePage.userProperties.click();

        ReusableMethods.wait(2);

        basePage.userPropertiesSearch.sendKeys("new properties1");

        basePage.useraddpropertiesTrash.click();

        ReusableMethods.wait(2);

        basePage.trashComfirmButton.click();
        ReusableMethods.wait(1);


        Assert.assertTrue(basePage.addPropertiesNoRecord.isDisplayed(),"Acoount sayfasina eklenen ilan silindi ve dogrulandi");

        basePage.logoutButon.click();





    }
}