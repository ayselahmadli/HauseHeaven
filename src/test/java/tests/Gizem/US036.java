package tests.Gizem;

import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US036 extends TestBaseRapor {

    BasePage basePage=new BasePage();

    SoftAssert softAssert=new SoftAssert();
    @Test
    public void test01(){

        basePage=new BasePage();

        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //2-Email/username-password alanlari doldurulur
        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();

        //3-Dashboard da yer alan Real Estate de tiklanir

        basePage.dashboardClick.click();
        basePage.realEstateButonu.click();
        basePage.adminfacilitiesbutton.click();

        System.out.println("Admin dashboarda giris yapip Real Estate/ Facilities sayfasina ulasildi");

        // basePage.adminTestLogout.click();
        basePage.adminTestIsim.click();
        ReusableMethods.wait(1);
        basePage.adminLogoutNew.click();


    }

    @Test
    public void test02(){

        basePage=new BasePage();

        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        //2-Email/username-password alanlar doldurulur
        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();
        //3-Dashboard da yer alan Real Estate de tiklanir
        basePage.dashboardClick.click();
        basePage.realEstateButonu.click();
        // 4-Real estate alaninin icerisindeki Facilitiese tiklanip goruntulenir
        basePage.adminfacilitiesbutton.click();
        Assert.assertTrue(basePage.adminfacilitiesbutton.isDisplayed());
        System.out.println("Real Estate icerisindeki Facilities tiklanip goruntulendi");

        basePage.adminTestIsim.click();
        ReusableMethods.wait(1);
        basePage.adminLogoutNew.click();

    }

    @Test
    public void test03(){
        basePage=new BasePage();


        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));
        //2-Email/username-password alanlar doldurulur
        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();
        //3-Dashboard da yer alan Real Estate de tiklanir
        basePage.dashboardClick.click();
        basePage.realEstateButonu.click();
        //4-Real estate alaninin icerisindeki Facilitiese tiklanip goruntulenir
        basePage.adminfacilitiesbutton.click();


        //5-Facilities sayisi goruntulenir
        Assert.assertTrue( basePage.adminfacilitiessayisi.isDisplayed());
        System.out.println("Real Estate icerisindeki Facilities sayisi goruntulendi");


        basePage.adminTestIsim.click();
        ReusableMethods.wait(1);
        basePage.adminLogoutNew.click();


    }

    @Test
    public void test04(){

        basePage=new BasePage();

        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //2-Email/username-password alanlar doldurulur Sign yapilir
        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();

        //3-Dashboard da yer alan Real Estate de tiklanir

        basePage.dashboardClick.click();
        basePage.realEstateButonu.click();


        // 4-Real estate alaninin icerisindeki Facilitiese tiklanip goruntulenir
        basePage.adminfacilitiesbutton.click();
        basePage.adminfacilitiesbutton.isDisplayed();

        System.out.println("Real Estate icerisindeki Facilities tiklanip goruntulendi");

        //5-Facilities sayfadaki ogeler goruntulenenip aktif oldugu dogrulanir

        basePage.adminFacilitiesFilters.click();
        basePage.adminFacilitiesFiltersSelectFieldup.isEnabled();

        System.out.println("Facilities bolumu icerisindeki Filter butonu gorunur ve aktiftir");

        Select select=new Select(basePage.adminFacilitiesFiltersSelectFieldup);
        select.selectByValue("name");
        System.out.println("name secildi");

        basePage.adminFacilitiesFiltersIsequals.isEnabled();
        select=new Select(basePage.adminFacilitiesFiltersIsequals);
        select.selectByIndex(0);
        System.out.println("Contains secildi");

        basePage.adminFacilitiesFiltersAddfilter.click();

        select=new Select(basePage.adminFacilitiesFiltersSelectFielddown);
        select.selectByValue("status");
        System.out.println("status secildi");

        select=new Select(basePage.adminFacilitiesFiltersContains);
        select.selectByIndex(2);
        System.out.println(" Greater than secildi");


        basePage.adminFacilitiesFiltersValueup.sendKeys("name");


        basePage.adminFacilitiesFiltersApply.click();
        System.out.println("Apply tiklandi");

        //5- dogrulama bolumu


        Assert.assertTrue(basePage.filtrenenFacilitiesigoruntuleme.isDisplayed());
        System.out.println("Filtrenen name goruntulendi");

        System.out.println("Facilities sayfadaki ogeler goruntulenebilmeli ve aktif oldugu dogrulandi");

        basePage.adminTestIsim.click();
        ReusableMethods.wait(1);
        basePage.adminLogoutNew.click();
    }

    @Test
    public void test05(){

        basePage=new BasePage();


        //1-Url ile giris yapilir
        Driver.getDriver().get(ConfigReader.getProperty("adminUrl"));

        //2-Email/username-password alanlar doldurulur
        basePage.adminEmailButton.sendKeys("admin17");
        basePage.adminPasswordButton.sendKeys("951847");
        basePage.adminSignInButton.click();

        //3-Dashboard da yer alan Real Estate de tiklanir
        basePage.dashboardClick.click();
        basePage.realEstateButonu.click();

        // 4-Real estate alaninin icerisindeki Facilitiese tiklanip goruntulenir
        basePage.adminfacilitiesbutton.click();
        basePage.adminFacilitiesFiltersSelectFieldup.isEnabled();

        //5-Yeni Facilities eklemek icin alanlar doldurulur ve save &exit ile eklendigi dogrulanir
        basePage.adminFacilitiesCreate.click();
        System.out.println("Created butuna tiklandi");

        basePage.adminFacilitiesCreateName.sendKeys("gizem");
        basePage.adminFacilitiesCreateIcon.click();
        basePage.adminFacilitiesCreateIconInstagram.click();

        basePage.adminFacilitiesCreateSaveExit.click();

        //6-Eklenen facilities dizenlenip,silinir ve dogrulanir

        basePage.adminFacilitiesEdit.click();

        basePage.adminFacilitiesCreateName.sendKeys("omer");

        basePage.adminFacilitiesCreateSaveExit.click();

        basePage.searchElementi.sendKeys("gizem");


        basePage.facilitiesTrash.click();
        ReusableMethods.wait(2);
        basePage. adminFacilitiesTrashDelete.click();



        Assert.assertTrue(basePage.facilitiesDeleteSucces.isDisplayed());
        System.out.println("Succes! yazi elementi goruntulendi");

        basePage.adminTestIsim.click();
        ReusableMethods.wait(1);
        basePage.adminLogoutNew.click();

        Driver.closeDriver();


    }



}