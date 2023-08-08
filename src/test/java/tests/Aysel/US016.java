package tests.Aysel;

import org.openqa.selenium.Keys;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US016 extends TestBaseRapor {

    BasePage basePage = new BasePage();

    @Test
    public void US016(){

        //Bir kullanici olarak https://qa.hauseheaven.com/ sitesine gidin
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //Kayıtlı kullanıcı olarak  Home page sayfasının header bölümündeki menülerin görünür ve
        //aktif olduğunu görüntüleyebildiğimi doğrulayabilmeliyim

        basePage.cookiesButton.click();

        basePage.signUpMenu.click();

        basePage.emailUsernameButton.click();
        basePage.emailUsernameButton.sendKeys("aysel.ahmadli@yahoo.com" + Keys.ENTER);
        basePage.emailPasswordButton.click();
        basePage.emailPasswordButton.sendKeys("A123456&");
        basePage.loginButonu.click();



        Assert.assertTrue(basePage.homeLinkii.isDisplayed() && basePage.homeLinkii.isEnabled(),
                "Home butonu aktifdir");
        Assert.assertTrue(basePage.logoButonu.isDisplayed() && basePage.logoButonu.isEnabled(),
                "Logo butonu aktifdir");
        Assert.assertTrue(basePage.listingLinkii.isDisplayed() && basePage.listingLinkii.isEnabled(),
                "Listing butonu aktifdir");
        Assert.assertTrue(basePage.projectsLinkii.isDisplayed() && basePage.projectsLinkii.isEnabled(),
                "Projects butonu aktifdir");
        Assert.assertTrue(basePage.agentsLinkii.isDisplayed() && basePage.agentsLinkii.isEnabled(),
                "Agents butonu aktifdir");
        Assert.assertTrue(basePage.blogLinkii.isDisplayed() && basePage.blogLinkii.isEnabled(),
                "Blog butonu aktifdir");
        Assert.assertTrue(basePage.contactLinkii.isDisplayed() && basePage.contactLinkii.isEnabled(),
                "Contact butonu aktifdir");
        Assert.assertTrue(basePage.signUpLinkii.isDisplayed() && basePage.signUpLinkii.isEnabled(),
                "Sign Up butonu aktifdir");
        Assert.assertTrue(basePage.addPropertyLinkii.isDisplayed() && basePage.addPropertyLinkii.isEnabled(),
                "Add Property butonu aktifdir");
        Assert.assertTrue(basePage.userLinki.isDisplayed() && basePage.userLinki.isEnabled(),
                "User butonu aktifdir");
        Assert.assertTrue(basePage.logoutLinki.isDisplayed() && basePage.logoutLinki.isEnabled(),
                "Logout butonu aktifdir");
        Assert.assertTrue(basePage.wishlistLinkii.isDisplayed() && basePage.wishlistLinkii.isEnabled(),
                "Wishlist butonu aktifdir");

        Driver.closeDriver();

    }

}

