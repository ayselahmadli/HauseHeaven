package tests.Elif;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

public class US_024  extends TestBaseRapor {

    BasePage basePage = new BasePage();





    @Test
    public void Test01 (){

        basePage = new BasePage();



        // Url anasayfaya gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/");

        // Sing In butonuna tıklanır
        basePage.SignInLinki.click();
        ReusableMethods.wait(5);

        //Login olmak için email ve password bilgileri girilir.

        basePage.emailUsernameButton.click();

        basePage.emailUsernameButton.sendKeys("elifaridaglar@gmail.com");
        Assert.assertTrue(basePage.emailUsernameButton.isDisplayed());



        basePage.emailPasswordButton.sendKeys("elif@123");
        Assert.assertTrue(basePage.emailPasswordButton.isDisplayed());

        basePage.loginButonu.click();

        //Kayıtlı kullanıcı olarak blog sayfasına tıklanır.

        basePage.blogLinki.click();

        //Blog sayfasında blok yazılarının ayrıntısının görünür olduğu test edilir.

        basePage.blogIlkResim.click();

        ReusableMethods.wait(5);
        //WebElement yazıElementi= Driver.getDriver().findElement(By.xpath("//*[@class=\"post-title\"]"));

        //Assert.assertTrue(yazıElementi.isEnabled());

        Assert.assertTrue(basePage.blogIlkResimAyrinti.isEnabled());


    }

    @Test
    public void Test02 (){

        basePage = new BasePage();



        // Url anasayfaya gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/");

        basePage.blogLinki.click();

        basePage.blogIlkResim.click();

        ReusableMethods.wait(5);

        //Blog sayfasının yan barında Categories menü başlığının görünür ve aktif olduğu test edilir.

        Assert.assertTrue(basePage.blogContinueCategories.isDisplayed());
        Assert.assertTrue(basePage.blogContinueCategories.isEnabled());

        //Blog sayfasının yan barında Recent post menü başlığının görünür ve aktif olduğu test edilir.

        Assert.assertTrue(basePage.recentPosts.isDisplayed());
        Assert.assertTrue(basePage.recentPosts.isEnabled());

        //Blog sayfasının yan barında Fatured properties menü başlığının görünür ve aktif olduğu test edilir.

        //Assert.assertTrue(blogPage.blogFeaturedProperties.isDisplayed());
        //Assert.assertTrue(blogPage.blogFeaturedProperties.isEnabled());

        //Blog sayfasının da paylaşım butonları görünür ve aktif olduğu test edilir.

        //facebook
        Assert.assertTrue(basePage.blogFacebook.isDisplayed());
        Assert.assertTrue(basePage.blogFacebook.isEnabled());

        //likedin
        Assert.assertTrue(basePage.blogLinkedin.isDisplayed());
        Assert.assertTrue(basePage.blogLinkedin.isEnabled());

        //Twitter
        Assert.assertTrue(basePage.blogTwitter.isDisplayed());
        Assert.assertTrue(basePage.blogTwitter.isEnabled());

        Driver.closeDriver();



    }

}