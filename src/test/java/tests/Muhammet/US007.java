package tests.Muhammet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US007 extends TestBaseRapor {



    BasePage basePage;
    SoftAssert softAssert;


    @Test
    public void projectSayfasiGorunurlukTesti() {



        basePage=new BasePage();

        //Hause heaven anasayfaya gidilir

        Driver.getDriver().get(ConfigReader.getProperty("Url"));


        //Header bölümündeki Projects ögesinin görünür olduğu test edilir

        ReusableMethods.wait(2);


        Assert.assertTrue(basePage.projebutton.isDisplayed());


        //Projects ogesine tiklanir ve sayfanin projects sayfasina gittigi dogrulanir

        basePage.projebutton.click();  // project linkini tiklar

        String expectedUrl = "https://qa.hauseheaven.com/projects";
        String actualUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertEquals(expectedUrl,actualUrl);

    }

    @Test
    public void projectSayfasiIlanSayiTesti(){

        basePage=new BasePage();
        //Hause heaven anasayfaya gidilir

        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        basePage.projebutton.click();  // project linkini tiklar

        //Projects sayfasi  sayisi  gorulmelidir

        Assert.assertTrue(basePage.projectsResultNumber.isDisplayed());

        //Projects sayfasi tum ilanlarin gorulebilir oldugunu test edin

        Assert.assertTrue(basePage.projectsSayfadakiTumIlanlar.isDisplayed());

    }

    @Test
    public void projeAyrintiTesti(){

        basePage=new BasePage();

        //Hause heaven anasayfaya gidilir

        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Projects ogesine tiklanir

        basePage.projebutton.click();

        // Projects sayfasi acildiginda birinci siradaki ilana tiklanir

        basePage.projectsIlkIlan.click();


        Assert.assertTrue(basePage.projectsIlanAyrintiSayfasi.isDisplayed());

        Driver.getDriver().navigate().back();


        // Projects sayfasi acildiginda ikinci siradaki ilana tiklanir

        basePage.projectsIkinciIlan.click();

        Assert.assertTrue(basePage.projectsIlanAyrintiSayfasi.isDisplayed());

        basePage.projectsLinki.click(); // tekrar anasayfaya doner

        // Projects sayfasi acildiginda ucuncu siradaki ilana tiklanir

        basePage.projectsUcuncuIlan.click();

        Assert.assertTrue(basePage.projectsIlanAyrintiSayfasi.isDisplayed());



    }


    @Test
    public void searchButtonGorunurlukTesti(){

        basePage=new BasePage();

        //basePage=new basePage;

        //Hause heaven anasayfaya gidilir

        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Projects ogesine tiklanir

        basePage.projebutton.click();

        // acilan sayfada search butonunun gorulur oldugunu test edin

        Assert.assertTrue(basePage.searchButonu.isDisplayed());


        // United States of America secilir

        basePage.searchCountry.click();

        //WebElement ABD = Driver.getDriver().findElement(By.xpath("(//li[@role='option'])[1]"));

        //ABD.click();
        basePage.ABD.click();

        //Select select=new Select(basePage.searchCategory);
        //select.selectByIndex(2);



        // WebElement hauseElementi = Driver.getDriver().findElement(By.xpath("(//li[@role='option'])[4]"));

        // hauseElementi.click();

        // basePage.hauseElementi.click();

        basePage.searchButonu.click();


        // filtreleme sonucu cikan sonucun testi


        basePage.filtreSonucResults.click();

        Assert.assertTrue(basePage.projectsIlkIlan.isDisplayed());






    }

}

