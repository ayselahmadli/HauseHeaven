package tests.Mehdi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;
import pages.BasePage;
import utilities.Driver;
import utilities.TestBaseRapor;

public class US025 extends TestBaseRapor {
    //Contact Sayfasina erisim

    //Browser açılır
    //https://hauseheaven.com/login sayfasina gidilir
    //email ve sifre alanlari doldurulup login butonuna tiklanir
    //Kayıtlı bir kullanıcı olarak ana sayfada bulunan contact sayfasina tiklanir
    //Yönlendirilen sayfanın gerçek contact sayfasi oldugu dogrulanir sayfası olduğunu doğrulayın.

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

        //Kayıtlı bir kullanıcı olarak ana sayfada bulunan contact sayfasina tiklanir
        basePage.contactLinki.click();

        //Yönlendirilen sayfanın gerçek contact sayfasi oldugu dogrulanir sayfası olduğunu doğrulayın.
        String expectedContactUrl = "https://qa.hauseheaven.com/contact";
        String actualContactUrl = Driver.getDriver().getCurrentUrl();

        Assert.assertTrue(actualContactUrl.contains(expectedContactUrl));
        Driver.closeDriver();


    }

    //Mesaj gonderme

    //Browser açılır
    //https://qa.hauseheaven.com/login sayfasina gidilir
    //email ve sifre alanlari doldurulup login butonuna tiklanir
    //Kayıtlı bir kullanıcı olarak ana sayfada bulunan contact sayfasina tiklanir
    //Name, Subject, Email, Phone ve message alanlari doldurulur
    //Send message butonuna tiklanarak mesajin gonderildigi test edilir


    @Test
    public void test02() throws InterruptedException {
        basePage = new BasePage();

        //Browser açılır
        //https://hauseheaven.com/login sayfasina gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/login");
        basePage.signInLinki.click();

        //email ve sifre alanlari doldurulur
        basePage.emailUsernameButton.sendKeys("mehdiagaverdiyev@gmail.com");
        basePage.emailPasswordButton.sendKeys("123456Mm");

        JavascriptExecutor jsExecutor = (JavascriptExecutor) Driver.getDriver();
        jsExecutor.executeScript("window.scrollBy(0, 500)");

        //login butonuna tiklanir
        basePage.loginButonu.click();


        //Kayıtlı bir kullanıcı olarak ana sayfada bulunan contact sayfasina tiklanir
        basePage.contactLinki.click();
        Thread.sleep(5000);


        //Name, Subject, Email, Phone ve message alanlari doldurulur
        basePage.nameMetinKutusu.sendKeys("mehdi");
        basePage.subjectMetinKutusu.sendKeys("konu");
        basePage.emailMetinKutusu.sendKeys("mehdiagaverdiyev@gmail.com");
        basePage.phoneMetinKutusu.sendKeys("54645646");
        basePage.messageMetinKutusu.sendKeys("bu bir testtir");

        WebElement element = basePage.sendMessageButonu;
        JavascriptExecutor executor = (JavascriptExecutor) Driver.getDriver();
        executor.executeScript("arguments[0].click();", element);

        basePage.sendMessageButonu.submit(); // BURDA LOCATE DUZELTILDI CONTACT PAGEDE

        //Send message butonuna tiklanir
        Thread.sleep(3000);


        //WebElement succesMessage=Driver.getDriver().findElement(By.xpath("//*[@class='contact-message contact-success-message']"));
        WebElement succesMessage = Driver.getDriver().findElement(By.xpath("//*[@id='alert-container']"));
        String successMessageText = succesMessage.getText();
        System.out.println(successMessageText);
        Assert.assertTrue(succesMessage.isDisplayed());


        Driver.closeDriver();

    }

    //iletisim bilgilerinin goruntulenmesi

    //Browser açılır
    //https://hauseheaven.com/login sayfasina gidilir
    //email ve sifre alanlari doldurulup login butonuna tiklanir
    //Kayıtlı bir kullanıcı olarak ana sayfada bulunan contact sayfasina tiklanir
    //Reach us, directions, email ve Call us iletisim bilgilerinin gorunur oldugu test edilir


    @Test
    public void test03() {
        basePage = new BasePage();


        //Browser açılır
        //https://hauseheaven.com/login sayfasina gidilir
        Driver.getDriver().get("https://qa.hauseheaven.com/login");

        //email ve sifre alanlari doldurulur
        basePage.emailUsernameButton.sendKeys("mehdiagaverdiyev@gmail.com");
        basePage.emailPasswordButton.sendKeys("123456Mm");

        //login butonuna tiklanir
        basePage.loginButonu.click();


        //Kayıtlı bir kullanıcı olarak ana sayfada bulunan contact sayfasina tiklanir
        basePage.contactLinki.click();

        System.out.println("Buraya kadar calisiyor");

        //Reach us, directions, email ve Call us iletisim bilgilerinin gorunur oldugu test edilir
        Assert.assertTrue(basePage.reachUsAdresAlani.isDisplayed());
        Assert.assertTrue(basePage.reachUsAdresSatiri.isDisplayed());
        Assert.assertTrue(basePage.emailBilgiAlani.isDisplayed());
        Assert.assertTrue(basePage.emailBilgiSatiri.isDisplayed());
        Assert.assertTrue(basePage.callUsBilgiAlani.isDisplayed());
        Assert.assertTrue(basePage.callUsBilgiSatiri.isDisplayed());
        Assert.assertTrue(basePage.iletisimBilgileri.isDisplayed());


        Driver.closeDriver();

    }
}