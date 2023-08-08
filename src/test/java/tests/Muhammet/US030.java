package tests.Muhammet;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;


public class US030 extends TestBaseRapor {



   BasePage basePage;


    @Test
    public void testCase01() {

        basePage=new BasePage();


        //qa.hauseheaven.com/admin/login sayfasina gidilir

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Driver.getDriver().get(ConfigReader.getProperty("kullaniciAdi"));

        basePage.adminEmailButton.sendKeys("admin17" + Keys.ENTER);


        //Driver.getDriver().get(ConfigReader.getProperty("Sifre"));

        basePage.adminPasswordButton.sendKeys("951847");

        basePage.adminSignInButton.click();

        //Acilan yeni pencerenin sayfa başlığının (title) “Dashboard” oldugunu dogrulayin.

        String expectedIcerik= "Dashboard";
        String actualIcerik= basePage.dashboardClick.getText();

        Assert.assertEquals(actualIcerik,expectedIcerik);

    }
    @Test
    public void testCase02(){

        basePage=new BasePage();



        //qa.hauseheaven.com/admin/login sayfasina gidilir

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //dogru kullanici adi yazilir

        basePage.adminEmailButton.sendKeys("admin17" + Keys.ENTER);

        //dogru sifre yazilir

        basePage.adminPasswordButton.sendKeys("951847");

        //Sign in butonuna tiklanir

        basePage.adminSignInButton.click();

        basePage.blogButton.click();

        Assert.assertTrue(basePage.blokBasliklari.isDisplayed());

        String expectedIcerik= "Categories";
        String actualIcerik= basePage.categoriesLinki.getText();

        Assert.assertEquals(actualIcerik,expectedIcerik);


    }

    @Test
    public void testCase03(){


        basePage=new BasePage();

        //qa.hauseheaven.com/admin/login sayfasina gidilir

        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //dogru kullanici adi yazilir

        basePage.adminEmailButton.sendKeys("admin17" + Keys.ENTER);

        //dogru sifre yazilir

        basePage.adminPasswordButton.sendKeys("951847");

        //Sign in butonuna tiklanir

        basePage.adminSignInButton.click();

        // blok butonuna tiklanir

        //WebElement adminBlokButton = Driver.getDriver().findElement(By.xpath("//li[@id='cms-plugins-blog']"));
        //adminBlokButton.click();

        basePage.adminBlokButton1.click();

        // categories butonuna tiklanir

        basePage.categoriesLinki.click();


        // kategorilerin görüntülenebilir ve aktif durumda olduğunu test edin

        // WebElement blokTumKategoriler= Driver.getDriver().findElement(By.xpath("//div[@class='tree-categories-body card-body']"));

        Assert.assertTrue(basePage.blokTumKategoriler.isDisplayed());

        //Create tiklanir

        basePage.createNewCategoryButton.click();
        ReusableMethods.wait(2);

        basePage.nameTextBoxCategories.click();


        basePage.nameTextBoxCategories.sendKeys("Room Design");

        Select select=new Select(basePage.parentSelectMenuButton);

        select.selectByValue("17");


        Select select1=new Select(basePage.statusSelectMenuCategories);

        select1.selectByValue("draft");

        //WebElement saveExitButton=Driver.getDriver().findElement(By.xpath("(//button[@type=\"submit\"])[1]"));

        //saveExitButton.click();

        ReusableMethods.wait(3);

        basePage.saveButtonCategories.click();

        ReusableMethods.wait(5);


        //basePage.saveButtonCategories.click();   ///TIKLAMIYOR LOCATE DOGRU BUG OLABILIR

        //WebElement categoriGardenDesingSayisi=Driver.getDriver().findElement(By.xpath("(//span[@class='badge font-weight-bold bg-success'])[2]"));




        Assert.assertTrue(basePage.roomDesingGorunurluk.isDisplayed());


        basePage.roomDesingGorunurluk.click();  // cop kutusunu actirmak icin

        ReusableMethods.wait(2);

        basePage.roomDesingDelete.click(); // cop kusuna tiklar ve var olanlari siler

        ReusableMethods.wait(2);

        basePage.deleteOnay.click();

        ReusableMethods.wait(3);

        Assert.assertTrue(basePage.Onay.isDisplayed());


        // var olanalrin silindigini test etme yapilacak


        //161---172 arasinda problem var

    }
}


