package tests.Elif;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_048 extends TestBaseRapor {

    BasePage basePage = new BasePage();





    @Test
    public void Test01(){

        basePage = new BasePage();




        //Url anasayfaya gidilir.
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //Geçerli Email-Username girilir
        basePage.adminEmailButton.click();
        basePage.adminEmailButton.sendKeys(ConfigReader.getProperty("kullaniciAdi"));

        //Geçerli Password girilir.
        basePage.passwordAdmin.sendKeys(ConfigReader.getProperty("Sifre"));

        //Sign In butonuna tıklanır
        basePage.adminGirisSingIn.click();

        //Dashboard butonuna tıklanır.
        basePage.dashboardAdmin.click();

        //Locations elementi tıklanır
        basePage.adminLocations.click();

        //Menüdeki  Countries'in görünür ve aktif olduğu doğrulanır

        basePage.adminLocationsCountries.click();

        Assert.assertTrue(basePage.adminLocationsCountries.isDisplayed());
        Assert.assertTrue(basePage.adminLocationsCountries.isEnabled());

    }

    @Test
    public void Test02(){

        basePage = new BasePage();




        //Sayfadaki kayıtlı countries görünürlüğü doğrulanır.
        Assert.assertTrue(basePage.adminLocationsContriesRecordsSayisi.isDisplayed());


    }

    @Test
    public void Test03(){

        basePage = new BasePage();



        //Sayfadaki  Blunk Actions elementinin görünür ve aktif olduğu doğrulanır
        Assert.assertTrue(basePage.adminLocationsCountriesBulkActions.isDisplayed());
        Assert.assertTrue(basePage.adminLocationsCountriesBulkActions.isEnabled());

        //Sayfadaki  Filters elementinin görünür ve aktif olduğu doğrulanır
        Assert.assertTrue(basePage.adminLocationsCountriesFilters.isDisplayed());
        Assert.assertTrue(basePage.adminLocationsCountriesFilters.isEnabled());

        //Sayfadaki  Search elementinin görünür ve aktif olduğu doğrulanır
        Assert.assertTrue(basePage.adminLocationsCountriesSearch.isDisplayed());
        Assert.assertTrue(basePage.adminLocationsCountriesSearch.isEnabled());

        //Sayfadaki  Create elementinin görünür ve aktif olduğu doğrulanır
        Assert.assertTrue(basePage.adminLocationsCountriesCreate.isDisplayed());
        Assert.assertTrue(basePage.adminLocationsCountriesCreate.isEnabled());

        //Sayfadaki " Reload" elementinin görünür ve aktif olduğu doğrulanır
        Assert.assertTrue(basePage.adminLocationsCountriesReload.isDisplayed());
        Assert.assertTrue(basePage.adminLocationsCountriesReload.isEnabled());

    }

    @Test
    public void Test04(){

        basePage = new BasePage();



        basePage.adminLocations.click();
        //create buton elementine tıklanır
        basePage.adminLocationsCountries.click();



        //açılan sayfada ilgili bilgiler doldurulur
        basePage.adminLocationsCountriesCreate.click();

        basePage.adminLocationsCountriesCreateName.sendKeys("Elif");

        basePage.adminLocationsCounriesCreateNationality.click();
        basePage.adminLocationsCounriesCreateNationality.sendKeys("Turkiye");

        basePage.adminLocationsCountriesCreateCountryISOcode.click();
        basePage.adminLocationsCountriesCreateCountryISOcode.sendKeys("1234567890");

        basePage.adminLocationsContriesSaveExit.click();

        basePage.adminLocationsCountriesEdit.click();

        basePage.adminLocationsCountriesCreateName.sendKeys("Zeynep");

        basePage.adminLocationsCounriesCreateNationality.click();
        basePage.adminLocationsCounriesCreateNationality.sendKeys("Turkiye");

        basePage.adminLocationsCountriesCreateCountryISOcode.click();
        basePage.adminLocationsCountriesCreateCountryISOcode.sendKeys("1234567891");

        basePage.adminLocationsContriesSaveExit.click();

        basePage.adminLocationsContriesDelete.click();

        basePage.adminLocationsContriesDeleteikinci.click();


        //Edit buton elementine tıklanır
        //Açılan sayfadaki country bilgisi değiştirilir
        //save&exit buton elementine tıklanır
        //Değişikiğin görünürlüğü doğrulanır
        //Delete buton elementine tıklanır
        //Çıkan ekrandaki delete buton elementine tıklanır
        //Countries in silindiği doğrulanır


        basePage.CountriesDeleteSon.click();
        Assert.assertTrue(basePage.CountriesDeleteSon.isDisplayed());

        Driver.closeDriver();









    }
}