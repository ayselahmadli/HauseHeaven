package tests.Adem;

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

public class US03 extends TestBaseRapor{
    // US03:  kullanıcı olarak Home page sayfasının body bölümündeki öğelerin görünür
    // durumda ve fonksiyonların aktif durumda olduğunu görüntülebildiğimi doğrulayabilmeliyim.

    BasePage basePage;


    @Test
    public void TC01(){

        // Browser açılır
        basePage=new BasePage();


        // Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //home linkine tıklanır
        basePage.homeLinki.click();

        //Home sayfasının body bölümünün görünür olduğunu test edin
        Assert.assertTrue(basePage.homePageHowItworksBaslikElementi.isDisplayed()&&basePage.homePageHowItworksBaslikElementi.isEnabled());

        //Sayfa kapatılır
        Driver.closeDriver();

    }

    @Test
    public void TC02(){

        // Browser açılır
        basePage=new BasePage();


        // Url'e gidilir
        Driver.getDriver().get(ConfigReader.getProperty("Url"));

        //home linkine tıklanır
        basePage.homeLinki.click();

        //Anasayfa body bölümünde bulunan arama kısmında bir arama yapılır
        basePage.homePageSearchLocationInput.sendKeys("Texas");
        Select select =new Select(basePage.homePageMinPriceSelectKutusu);
        select.selectByValue("500");
        Select select1 =new Select(basePage.homePageMaxPriceSelectKutusu);
        select1.selectByValue("50000");
        ReusableMethods.clickWithJS(basePage.searchResultButton);

        WebElement homePageAramaSonucuElementi=Driver.getDriver().findElement(By.xpath("//div[@class='item-sorting clearfix']"));

        //Aram sonuç yazısı
        System.out.println(homePageAramaSonucuElementi.getText());

        //Arama yapıldığı  doğrulanır
        Assert.assertTrue(homePageAramaSonucuElementi.isDisplayed());

        //Sayfa kapatılır
        Driver.closeDriver();

    }
}