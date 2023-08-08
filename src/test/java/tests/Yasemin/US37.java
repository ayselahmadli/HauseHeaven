package tests.Yasemin;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;


public class US37 extends TestBaseRapor {

    //TCO1: Admin Dashborda giriş yapılabilmeli
    //TC02: Real Estate başlığı altındaki Categories menüsüne giriş yapılabilmeli
    //TC03: Categories lerin görüntülenebildiğini doğrulayabilmeliyim
    //TC04: Categories sayısını görüntüleyebilmeliyim
    //TC05: Categories sayfasındaki öğelerin görüntülenebilir ve aktif olduğunu doğrulayabilmeliyim *
    //TC06: Yeni bir category ekleyebilmeliyim.
    //TC07: Eklenilen kategoriyleri düzenleyip,silebilmeliyim.


    BasePage basePage;





    SoftAssert softAssert;




    @Test
    public void TC01() {

        // Admin Dashborda giriş yapılabilmeli

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        basePage=new BasePage();

        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();

        String expectedUrl = "https://qa.hauseheaven.com/admin";
        String actualUrl = Driver.getDriver().getCurrentUrl();
        Assert.assertTrue(actualUrl.equals(expectedUrl));












        Driver.closeDriver();


    }

    @Test
    public void TC02() {

        // Real Estate başlığı altındaki Categories menüsüne giriş yapılabilmeli

        basePage=new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));


        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();


        basePage.realEstateButonu.click();
        basePage.adminRealEstateCategoriess.click();

        Assert.assertTrue(basePage.adminCategoriesGorunurluk.isDisplayed());

        Driver.closeDriver();




    }

    @Test
    public void  TC03 (){

        // TC03:Categories lerin görüntülenebildiğini doğrulayabilmeliyim

        basePage=new BasePage();


        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));


        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();


        basePage.realEstateButonu.click();
        basePage.adminRealEstateCategoriess.click();
        Assert.assertTrue(basePage.adminCategoriesGorunurluk.isDisplayed());
        Driver.closeDriver();

    }


    @Test
    public void TC04(){
        // Categories sayısını görüntüleyebilmeliyim

        basePage=new BasePage();


        softAssert=new SoftAssert();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));


        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();


        basePage.realEstateButonu.click();
        basePage.adminRealEstateCategoriess.click();

        WebElement categorilerinSayisi=Driver.getDriver().findElement(By.xpath("//span[@class='badge bg-secondary bold badge-dt']"));
        int sayi=Integer.valueOf(categorilerinSayisi.getText());
        System.out.println(sayi);

        Assert.assertTrue(categorilerinSayisi.isDisplayed());



        Driver.closeDriver();




    }

    @Test
    public void TC05(){
        //Categories sayfasındaki öğelerin görüntülenebilir ve aktif olduğunu doğrulayabilmeliyim *


        basePage=new BasePage();

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));


        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();


        basePage.realEstateButonu.click();

        basePage.adminRealEstateCategoriess.click();
        Assert.assertTrue(basePage.createElementi.isDisplayed()&&basePage.createElementi.isEnabled());

        Driver.closeDriver();



    }

    @Test
    public void TC06(){
        // Yeni bir category ekleyebilmeliyim.


        basePage=new BasePage();


        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));


        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();


        basePage.realEstateButonu.click();

        basePage.adminRealEstateCategoriess.click();
        basePage.createElementi.click();

        basePage.adminRealEstateCategoriesName.sendKeys("Triplex");
        basePage.adminRealEstateCategoriesDescription.sendKeys("Yeni categori eklendi");
        basePage.adminRealEstateCategoriesOrdertik.click();
        basePage.adminRealEstateCategoriesOrdertik.sendKeys("1");
        basePage.adminCategoriesSave.click();
        System.out.println("yeni categori eklendi");

        Assert.assertTrue(basePage.adminAlertSuccess.isDisplayed());
        Driver.closeDriver();



    }

    @Test
    public void TC07(){

        //    Eklenilen kategoriyleri düzenleyip,silebilmeliyim.

        basePage=new BasePage();


        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));


        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();
        basePage.realEstateButonu.click();
        basePage.adminRealEstateCategoriess.click();
        basePage.adminCategoriesDelete.click();
        basePage.adminCategoriesDeleteOnay.click();

        System.out.println("silme işlemi gerçekleşti");

        Assert.assertTrue(basePage.adminDeleteSuccess.isDisplayed());



        Driver.closeDriver();




    }


}


