package day3.proje3;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static day3.proje3.Locators4.*;

public class Test4 extends ParentClass4{

    @BeforeTest
    public void beforeTest(){
        driver = Driver.getDriver();
    }

    @Test
    public void test1(){
        openSite(url);
        sendKeysTo(userName,"krafttechno@gmail.com");
        sendKeysTo(password,"techno123.");
        clickTo(signIn);
    }
    @Test(priority = 1)
    public void test2(){
        String element = driver.findElement(metin).getText();
        Assert.assertEquals(element,metinText);
        if(element.equals(metinText)){
            System.out.println("testt başarılı bir şeklide sonuçlanmıştır");
        }
    }
    @Test(priority = 2)
    public void test3() {
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url, expectedUrl);
        if (url.equals(expectedUrl)) {
            System.out.println("url doğrudur");
        }
    }
}
