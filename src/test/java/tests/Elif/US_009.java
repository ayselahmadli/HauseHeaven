package tests.Elif;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US_009 extends TestBaseRapor {

    BasePage basePage = new BasePage();






    @Test
    public void Test01 () throws InterruptedException {

        basePage = new BasePage();

        // Url anasayfaya gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/");

        //Header 'daki "blog" elementine tıklanır.
        basePage.blogLinki.click();

        basePage.blogLinki.click();
        Thread.sleep(3000);


        //Blog sayfasına yönlendirildiği doğrulanmalı.
        Assert.assertTrue(basePage.blogText.isDisplayed());


    }

    @Test
    public void Test02(){


        basePage = new BasePage();

        Driver.getDriver().get("https://qa.hauseheaven.com/");

        basePage.blogLinki.click();

        // Elemente tıklandığında blog yazısının içeriğinin görünürlüğü test edilir.
        Assert.assertTrue(basePage.blogBlog.isDisplayed());


        // Blog sayfasında blok yazılarının ayrıntılarına ulaşılabildiği test edilir.(continue)
        basePage.blogIlkResim.click();




    }

    @Test
    public void Test03 (){




        basePage = new BasePage();

        Driver.getDriver().get("https://qa.hauseheaven.com/");

        basePage.blogLinki.click();

        //Blog sayfasının yan barında Cotegories menü başlığının görünürlüğü test edilir.
        basePage.blogIlkResim.click();

        Assert.assertTrue(basePage.blogContinueCategories.isDisplayed());

        //Blog sayfasının yan barında Recent post menü başlığının görünürlüğü test edilir.

        // Recent post butonunu bulamadım.

        //blogPage.recentPosts.click();
        Assert.assertTrue(basePage.recentPosts.isDisplayed());

        //Blog sayfasının yan barında Fatured properties menü başlığının görünürlüğü test edilir.
        //blogPage.FeatureProperties.click();
        Assert.assertTrue(basePage.FeatureProperties.isDisplayed());



    }

    @Test
    public void Test04(){


        basePage = new BasePage();

        Driver.getDriver().get("https://qa.hauseheaven.com/");

        basePage.blogLinki.click();

        basePage.blogIlkResim.click();

        //Blog sayfasında blog yazılarının paylaşılması için Facebook ikonunun görünür ve aktif olması test edilir.


        Assert.assertTrue(basePage.blogFacebook.isDisplayed());
        Assert.assertTrue(basePage.blogFacebook.isEnabled());


        //Blog sayfasında blog yazılarının paylaşılması için Linkedin ikonunun görünür ve aktif olduğu test edilir.

        Assert.assertTrue(basePage.blogLinkedin.isDisplayed());
        Assert.assertTrue(basePage.blogLinkedin.isEnabled());


        //Blog sayfasında blog yazılarının paylaşılması için Twitter ikonunun görünür ve aktif olduğu test edilir.

        Assert.assertTrue(basePage.blogTwitter.isDisplayed());
        Assert.assertTrue(basePage.blogTwitter.isEnabled());

        Driver.closeDriver();



    }


}