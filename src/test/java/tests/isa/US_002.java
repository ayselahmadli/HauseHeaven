package tests.isa;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_002 extends TestBaseRapor{//Ziyaretçi


    BasePage basePage;
    @BeforeMethod
    public void setup(){
        //Browser açılır
        //Url anasayfaya gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
    }
    @AfterClass
    public void tearDown(){
        Driver.closeDriver();
    }

    @Test
    public void TC_001(){ //Bir ziyaretçi için Home page sayfasının header bölümündeki menüler görünür ve aktif olmalı

    //Header bölümündeki Home,Listing,Projects,Agents,Blog,Contact,Sign Up,Add Property,Sign In,Wishlist ögelerinin görünür olduğu test edilir

        basePage=new BasePage();
        Assert.assertTrue(basePage.homeLinki.isDisplayed());
        Assert.assertTrue(basePage.listingLinki.isDisplayed());
        Assert.assertTrue(basePage.projectsLinki.isDisplayed());
        Assert.assertTrue(basePage.agentsLinki.isDisplayed());
        Assert.assertTrue(basePage.blogLinki.isDisplayed());
        Assert.assertTrue(basePage.contactLinki.isDisplayed());
        Assert.assertTrue(basePage.signUpLinki.isDisplayed());
        Assert.assertTrue(basePage.addPropertyLinki.isDisplayed());
        Assert.assertTrue(basePage.signInLinki.isDisplayed());
        Assert.assertTrue(basePage.wishlistLinki.isDisplayed());

    //Header bölümündeki Home,Listing,Projects,Agents,Blog,Contact,Sign Up,Add Property,Sign In,Wishlist ögelerinin görünür olduğu test edilir

        Assert.assertTrue(basePage.homeLinki.isEnabled());
        Assert.assertTrue(basePage.listingLinki.isEnabled());
        Assert.assertTrue(basePage.projectsLinki.isEnabled());
        Assert.assertTrue(basePage.agentsLinki.isEnabled());
        Assert.assertTrue(basePage.blogLinki.isEnabled());
        Assert.assertTrue(basePage.contactLinki.isEnabled());
        Assert.assertTrue(basePage.signUpLinki.isEnabled());
        Assert.assertTrue(basePage.addPropertyLinki.isEnabled());
        Assert.assertTrue(basePage.signInLinki.isEnabled());
        Assert.assertTrue(basePage.wishlistLinki.isEnabled());
    }

}
