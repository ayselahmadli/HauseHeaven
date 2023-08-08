package tests.Mehdi;

import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US06  {

    //Mulk Detaylarina Ulasma
    //Browser açılır
    //https://qa.hauseheaven.com/ sayfasina gidilir
    //Header bolumunde Listing basligina tiklanir
    //ilk mulkun view butonuna tiklanir
    // aciklama , lokasyon, details , nearby ve yorumlarin goruntulendigi dogrulanir



    BasePage basePage;


    @Test
    public void testCase01() throws InterruptedException {
        basePage=new BasePage();
        //Browser açılır
        //https://qa.hauseheaven.com/properties/dynamic-group-coordinator sayfasina gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/properties/dynamic-group-coordinator");
        basePage.allowCookiesbutton.click();


        Assert.assertTrue(basePage.ilkMulkdetailesfeatures.isDisplayed());
        System.out.println("geldiburayakadara");

        Assert.assertTrue(basePage.ilkMulkdetailesfeatures.isDisplayed());
        Assert.assertTrue(basePage.ilkMulkDescription.isDisplayed());
        Assert.assertTrue(basePage.ilkMulkGallery.isDisplayed());
        Assert.assertTrue(basePage.ilkMulkReview.isDisplayed());
        System.out.println("geldiburayakadara");





        Driver.closeDriver();

    }

    @Test
    public void testCase02(){
        basePage=new BasePage();

        //Browser açılır
        //https://hauseheaven.com/ sayfasina gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/properties/dynamic-group-coordinator");
        basePage.allowCookiesbutton.click();

        Actions actions=new Actions(Driver.getDriver()).moveToElement(basePage.ilkMulkShare);
        actions.perform();

        actions.moveToElement(basePage.ilkMulkLinkedinShare).perform();
        basePage.ilkMulkLinkedinShare.isEnabled();

        actions.moveToElement(basePage.ilkMulkTweetShare).perform();
        basePage.ilkMulkTweetShare.isEnabled();

        actions.moveToElement(basePage.ilkMulkFacebookShare).perform();
        basePage.ilkMulkFacebookShare.isEnabled();




        Driver.closeDriver();
    }
    @Test
    public void testCase03() throws InterruptedException {

       basePage=new BasePage();

        //Browser açılır
        //"https://qa.hauseheaven.com/properties/dynamic-group-coordinator" sayfasina gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/properties/dynamic-group-coordinator");
        basePage.allowCookiesbutton.click();


        Thread.sleep(5000);


        // Actions actions=new Actions(Driver.getDriver()).moveToElement(basePage.wishListButton);
        //actions.perform();

        Thread.sleep(3000);

        //acilan sayfada wishlist butonuna tiklanir
        basePage.wishListButton.click();

        //urunun wishliste eklendigi dogrulanir
        String succesAlertActual=basePage.wishlistSuccesAlert.getText();
        String succesExpectedAlert="Added to wishlist successfully!";
        Assert.assertTrue(succesAlertActual.contains(succesExpectedAlert));
        basePage.wishListButton.isEnabled();

        Driver.closeDriver();
    }

    @Test
    public void testCase04() throws InterruptedException {
       basePage=new BasePage();


        //"https://qa.hauseheaven.com/properties/dynamic-group-coordinator" sayfasina gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/properties/dynamic-group-coordinator");
        basePage.allowCookiesbutton.click();


        basePage.nameTextBox.sendKeys("name");
        basePage.ikinciemailTextBox.sendKeys("email@gmail.com");
        basePage.ikinciPhoneTextBox.sendKeys("123654");
        basePage.ikincimessageTextBox.sendKeys("message");

        basePage.sendMessageButton.submit();

        Thread.sleep(5000);
        String sendMesageButtonTextActual=basePage.succesSendMessage.getText();
        String expectedMessage="Send consult successfully!";

        Assert.assertTrue(sendMesageButtonTextActual.contains(expectedMessage));


        Driver.closeDriver();
    }
}