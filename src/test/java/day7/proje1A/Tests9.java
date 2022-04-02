package day7.proje1A;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.Set;

import static day7.proje1A.LocatorsClass9.*;

public class Tests9 extends ParentClass9{

    JavascriptExecutor js;
    String anaSayfaID = driver.getWindowHandle();

    @BeforeTest
    public void beforeTest(){
        driver.get(url);
    }
    @Test
    public void test1(){
        clickTo(search);
        sendKeysTo(search,"kitap");
        clickTo(searchButton);
        clickTo(cerez);
    }
    @Test(priority = 1)
    public void test2() throws InterruptedException {
        js = (JavascriptExecutor) driver;
        WebElement element = driver.findElement(By.cssSelector("img[data-image-index='40']"));
        js.executeScript("arguments[0].scrollIntoView(true);",element);
        sleepTo(2000);
        element.click();
        WebElement twitter = driver.findElement(By.cssSelector("i[class='a-icon a-icon-share-twitter']"));
        js.executeScript("arguments[0].scrollIntoView();",twitter);
        twitter.click();


        Set<String>windowID =driver.getWindowHandles();
        for (String s : windowID) {
            if(!windowID.equals(anaSayfaID)){
                driver.switchTo().window(s);
                sleepTo(2000);
                driver.close();
            }
        }
        driver.switchTo().window(anaSayfaID);
    }


}
