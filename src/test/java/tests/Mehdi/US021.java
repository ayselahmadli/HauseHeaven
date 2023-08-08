package tests.Mehdi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.util.List;

public class US021 extends TestBaseRapor {
    //Siteye kayitli olarak giris yapabilmeliyim

    //Browser acilir
    //https://qa.hauseheaven.com sayfasina gidilir
    //Email/Username girilir
    //Login'e tıklanır

    BasePage basePage;
    @Test
    public void test01() {
        basePage = new BasePage();


        //Browser açılır
        //https://hauseheaven.com/login sayfasina gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/login");

        //email ve sifre alanlari doldurulur
        basePage.emailUsernameButton.sendKeys("mehdiagaverdiyev@gmail.com");
        basePage.emailPasswordButton.sendKeys("123456Mm");

        //login butonuna tiklanir
        basePage.loginButonu.click();
        basePage.loginButonu.isEnabled();

        Driver.closeDriver();
    }



    //Browser acilir
    //https://qa.hauseheaven.com sayfasina gidilir
    //Mulklerin bilgi ayrintilarinin gorundugu kontrol edilir
    //Muklerin sosyal medyada paylasilabilir oldugu kontrol edilir
    //Ilanlarin 'WishList'e eklenebildigi kontrol edilir
    //Puan verilebildigi ve yorum yazilabildigi dogrulanir
    //Sayfa kapatilir

    @Test
    public void test02() {
        basePage = new BasePage();


        //Browser açılır
        //https://hauseheaven.com/login sayfasina gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/properties/dynamic-group-coordinator");


        ReusableMethods.wait(2);

        //Mulklerin bilgi ayrintilarinin gorundugu kontrol edilir

        WebElement deatilFeatures = Driver.getDriver().findElement(By.xpath("(//*[@class=\"property_block_title\"])[1]"));
        Assert.assertTrue(deatilFeatures.isDisplayed());
        //System.out.println(listingPage.banuYurdakulMulk.getText());

        ReusableMethods.wait(5);

        List<WebElement>mulkDetaylari=Driver.getDriver().findElements(By.xpath("//*[@class=\"property_block_title\"]"));
        for (WebElement each:mulkDetaylari
        ) {
            Assert.assertTrue(each.isDisplayed());



        }



        //Muklerin sosyal medyada paylasilabilir oldugu kontrol edilir

        WebElement shareButton = Driver.getDriver().findElement(By.xpath("//*[@class=\"btn btn-likes\"]"));

        Actions actions = new Actions(Driver.getDriver());
        actions.moveToElement(shareButton).perform();

        ReusableMethods.wait(5);

        WebElement facebookButton = Driver.getDriver().findElement(By.xpath("//*[@class=\"lni-facebook\"]"));
        WebElement tweetButton = Driver.getDriver().findElement(By.xpath("//*[@class=\"cl-twitter\"]"));
        WebElement linkedinButton = Driver.getDriver().findElement(By.xpath("//*[@class=\"cl-linkedin\"]"));

        Assert.assertTrue(facebookButton.isEnabled());
        Assert.assertTrue(tweetButton.isEnabled());
        Assert.assertTrue(linkedinButton.isEnabled());

        ////Ilanlarin 'WishList'e eklenebildigi kontrol edilir

        WebElement wishList = Driver.getDriver().findElement(By.xpath("//*[@class=\"btn btn-likes add-to-wishlist\"]"));
        wishList.click();

        WebElement addedButton = Driver.getDriver().findElement(By.xpath("//*[@class='alert alert-success alert-dismissible']"));
        String acturalResult = addedButton.getText();
        String expectedResult = "Added to wishlist successfully!";

        Assert.assertTrue(acturalResult.contains(expectedResult));



        //Puan verilebildigi ve yorum yazilabildigi dogrulanir

        List<WebElement>puanlama =Driver.getDriver().findElements(By.xpath("//*[@class=\"br-widget\"]"));
        for (WebElement each: puanlama
        ) {
            Assert.assertTrue(each.isEnabled());

        }

        WebElement yorumTextBox = Driver.getDriver().findElement(By.xpath("(//*[@class=\"form-control ht-80\"])"));
        Assert.assertFalse(yorumTextBox.isEnabled());

        Driver.closeDriver();

    }
}