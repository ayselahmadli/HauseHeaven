package tests.Yasemin;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import pages.*;
import utilities.ConfigReader;
import utilities.Driver;
import utilities.ReusableMethods;
import utilities.TestBaseRapor;

import java.awt.dnd.DragGestureEvent;
import java.io.DataInput;
import java.security.Key;
public class US23  extends TestBaseRapor {

    BasePage basePage;
    SoftAssert softAssert;

    @Test
    public void TC01() {
        //Kayıtlı kullanıcı olarak siteye kayıtlı emlakçıların listelendiği agents sayfasına ulaşabilmeliyim
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        softAssert = new SoftAssert();
        basePage = new BasePage();


        basePage.SignInLinki.click();
        basePage.emailUsernameButton.sendKeys("yaseminela1985@gmail.com");
        basePage.emailPasswordButton.sendKeys("273071Ela");
        basePage.loginButonu.submit();
        basePage.agentsMenu.click();
        Assert.assertTrue(basePage.allAgentsGorunurlugu.isDisplayed());
        Driver.closeDriver();
    }
    @Test
    public void TC02() {
        //Emlakçıların kayıtlı ilan sayısını ve diğer bilgilerini görüntüleyebilmeliyim
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        softAssert = new SoftAssert();
        basePage = new BasePage();


        basePage.SignInLinki.click();
        basePage.emailUsernameButton.sendKeys("yaseminela1985@gmail.com");
        basePage.emailPasswordButton.sendKeys("273071Ela");
        basePage.loginButonu.submit();
        basePage.agentsMenu.click();
        WebElement agentIlkElement = Driver.getDriver().findElement(By.xpath("//img[@class='img-fluid mx-auto']"));
        agentIlkElement.click();
        WebElement agentIlkElementGorunurlugu = Driver.getDriver().findElement(By.xpath("//img[@class='img-thumbnail']"));
        Assert.assertTrue(agentIlkElementGorunurlugu.isDisplayed());


        Driver.closeDriver();
    }
    @Test
    public void TC03() {
        // Kayıtlı kullanıcı olarak emlakçıların satılık ve kiralık ilanlarına ulaşabildiğimi doğrulayabilmeliyim
        Driver.getDriver().get(ConfigReader.getProperty("Url"));
        softAssert = new SoftAssert();
        basePage = new BasePage();


        basePage.SignInLinki.click();
        basePage.emailUsernameButton.sendKeys("yaseminela1985@gmail.com");
        basePage.emailPasswordButton.sendKeys("273071Ela");
        basePage.loginButonu.submit();
        basePage.agentsMenu.click();
        WebElement agentIlkElement = Driver.getDriver().findElement(By.xpath("//img[@class='img-fluid mx-auto']"));
        agentIlkElement.click();
        WebElement forSaleButon= Driver.getDriver().findElement(By.xpath("//a[@id=\"tab-type-1\"] "));
        WebElement  forRentButon=Driver.getDriver().findElement(By.xpath("//a[@id=\"tab-type-104\"]"));
        ReusableMethods.wait(3);
        JavascriptExecutor jsExecutor2 = (JavascriptExecutor) Driver.getDriver();
        jsExecutor2.executeScript("arguments[0].click();", forSaleButon);
        WebElement agentForSaleMulk=Driver.getDriver().findElement(By.xpath("//div[@class=\"listing-img-wrapper\"]"));
        softAssert.assertTrue(agentForSaleMulk.isDisplayed());
        softAssert.assertAll();
        Driver.closeDriver();







    }
}