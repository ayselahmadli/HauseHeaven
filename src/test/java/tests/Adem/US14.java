package tests.Adem;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US14 extends TestBaseRapor {
    BasePage basePage;


    @Test
    public void emlakIlanlariniGoruntulemeTesti() {

        basePage = new BasePage();

        //Web tarayıcısını açın.
        //Site adresini tarayıcının adres çubuğuna yazın
        Driver.getDriver().get(ConfigReader.getProperty("Url"));


        //Header bölümünden Sign in  butonuna tıklayın
        basePage.SignInLinki.click();

        //Kullanıcı adı ve şifre bilgilerini girip Login butonuna tıklayınız
        basePage.emailUsernameButton.sendKeys("ademqa@mynet.com");
        basePage.emailPasswordButton.sendKeys("AdemQA.6174");

        // Kullanıcı adının yazdığı butonu tıklayın
        basePage.loginButonu.submit();
        basePage.userSignInButonu.click();

        //Properties sayfasına gidin
        Driver.getDriver().get("https://qa.hauseheaven.com/account/properties");
        //userDashboardPage.userProperties.click();

        //Emlak ilanlarının görünür olduğunu doğrulayın
        WebElement userEmlakSayisi = Driver.getDriver().findElement(By.xpath("//span[@class='badge bg-secondary bold badge-dt']"));
        String ilanSayisiElementi = userEmlakSayisi.getText();
        int ilanSayisi = Integer.valueOf(ilanSayisiElementi);
        System.out.println(ilanSayisi);
        Assert.assertTrue(ilanSayisi > 0);

        //Sayfayı kapatınız
        Driver.closeDriver();

    }

    @Test
    public void yeniEmlakIlaniEklemeTesti() {

        basePage = new BasePage();

        //Web tarayıcısını açın.
        //Site adresini tarayıcının adres çubuğuna yazın
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Header bölümünden Sign in  butonuna tıklayın
        basePage.SignInLinki.click();

        //Kullanıcı adı ve şifre bilgilerini girip Login butonuna tıklayınız
        basePage.emailUsernameButton.sendKeys("ademqa@mynet.com");
        basePage.emailPasswordButton.sendKeys("AdemQA.6174");
        basePage.loginButonu.submit();
        basePage.userSignInButonu.click();

        //Add property butonuna basın
        basePage.addPropertyClick.click();

        //Cookies Tıklayınız
        basePage.cookies.click();

        //Tittle,Description,Content,Images,City,Property location,Latitude,Longitude ve diğer alanları doldurun
        basePage.titleClick.sendKeys("2722 KINSEY AVE, 21223");
        basePage.descriptionClick.sendKeys("In the middle of Jutland is Gjern hills and here is this cottage with whirlpool and sauna. ");
        basePage.contentClick1.sendKeys("The house is equipped with all necessities for a comfortable holiday and is modernly furnished with i.a. whirlpool, sauna, washing machine, wood burning stove and Blu-ray player. The house is equipped with four good bedrooms and two bathrooms. The rent includes 8 activity cards with free access to many activities such as tropical water park, sports hall, playground and many other activities for children and adults. Close to the house you will find an 18-hole international golf course and a 9-hole short course in Søhøjlandets Golf Klub. Pga. Corona restrictions are currently not possible to use water park and some indoor facilities. Please check the applicable rules at the reception at Landal.");

        WebElement cityDropDownElementi = Driver.getDriver().findElement(By.xpath("//select[@id='city_id']"));
        Select selectCity = new Select(cityDropDownElementi);
        selectCity.selectByIndex(2);
        basePage.propertyLocationClick.sendKeys("miami");
        basePage.latitudeClick.sendKeys("23456781");
        basePage.longitudeClick.sendKeys("89764321");
        basePage.numberBedroomsClick.sendKeys("3");
        basePage.numberBathroomsClick.sendKeys("1");
        basePage.numberFloorsClick.sendKeys("1");
        basePage.squaresClick.sendKeys("1");
        basePage.priceClick.sendKeys("900000");
        basePage.propertyLabelClick.sendKeys("sale");

        WebElement distanceKeyDropDownElementi = Driver.getDriver().findElement(By.xpath("//select[@name='facilities[][id]']"));
        Select selectDistance = new Select(distanceKeyDropDownElementi);
        selectDistance.selectByIndex(1);

        basePage.distanceElement.sendKeys("5");


        WebElement typeElement = Driver.getDriver().findElement(By.id("type_id"));
        Select selectType = new Select(typeElement);
        selectType.selectByIndex(0);

        //Save butonuna tıklayın
        basePage.saveElement.submit();

        //Yeni emlak ilanının eklendiğini doğrulayın
        Assert.assertTrue(basePage.userAlertSuccess.isDisplayed());

        //Sayfayı kapatınız
        Driver.closeDriver();
    }

    @Test
    public void emlakDuzenlemeTesti() {

        basePage = new BasePage();


        //Web tarayıcısını açın.
        //Site adresini tarayıcının adres çubuğuna yazın
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Header bölümünden Sign in  butonuna tıklayın
        basePage.SignInLinki.click();

        //Kullanıcı adı ve şifre bilgilerini girip Login butonuna tıklayınız
        basePage.emailUsernameButton.sendKeys("ademqa@mynet.com");
        basePage.emailPasswordButton.sendKeys("AdemQA.6174");
        basePage.loginButonu.submit();
        basePage.userSignInButonu.click();

        //cookies tıklayınız
        basePage.cookies.click();

        //Proporties butonunu tıklayınız
        Driver.getDriver().get("https://qa.hauseheaven.com/account/properties");

        //userDashboardPage.userProperties.click();

        //Edit butonunu tıklayıp gerekli düzenlemeleri yapınız.
        basePage.userEditButon.click();
        basePage.titleClick.sendKeys("2722 KINSEY AVE, 21225");
        basePage.descriptionClick.sendKeys("In the middle of Jutland is Gjern hills  ");

        //Save butonuna tıklayın
        basePage.saveElement.submit();

        //Yaptıgınız değişikliklerin gerçekleştiğini doğrulayınız.
        Assert.assertTrue(basePage.userAlertSuccess.isDisplayed());

        //Sayfayı kapatınız
        Driver.closeDriver();
    }

    @Test
    public void emlakSilmeTesti() {

        basePage = new BasePage();

        //Web tarayıcısını açın.
        //Site adresini tarayıcının adres çubuğuna yazın
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Header bölümünden Sign in  butonuna tıklayın
        basePage.SignInLinki.click();

        //Kullanıcı adı ve şifre bilgilerini girip Login butonuna tıklayınız
        basePage.emailUsernameButton.sendKeys("ademqa@mynet.com");
        basePage.emailPasswordButton.sendKeys("AdemQA.6174");
        basePage.loginButonu.submit();
        basePage.userSignInButonu.click();
        basePage.cookies.click();

        //Proporties butonunu tıklayınız
        Driver.getDriver().get("https://qa.hauseheaven.com/account/properties");

        //Silmek istediğiniz ilanı seçiniz
        WebElement userEmlakSayisi = Driver.getDriver().findElement(By.xpath("//span[@class='badge bg-secondary bold badge-dt']"));
        String ilanSayisiElementi = userEmlakSayisi.getText();
        int ilanSayisi = Integer.valueOf(ilanSayisiElementi);
        System.out.println(ilanSayisi);

        // userDashboardPage.userProperties.submit();



        //Delete butonuna basınız
        basePage.userDeleteButon.click();

        //Silme işlemini onaylayınız.
        basePage.userDeleteConfirmButon.click();

        //Emlak ilanının silindiğini doğrulayınız
        Driver.getDriver().get("https://qa.hauseheaven.com/account/properties");
        WebElement userGuncelEmlakSayisi = Driver.getDriver().findElement(By.xpath("//span[@class='badge bg-secondary bold badge-dt']"));
        String guncelIlanSayisiElementi = userGuncelEmlakSayisi.getText();
        int guncelIlanSayisi = Integer.valueOf(guncelIlanSayisiElementi);
        System.out.println(guncelIlanSayisi);
        Assert.assertNotEquals(ilanSayisi, guncelIlanSayisi);

        //Sayfayı kapatınız
        Driver.closeDriver();
    }


}