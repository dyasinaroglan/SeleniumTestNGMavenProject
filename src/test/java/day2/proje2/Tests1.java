package day2.proje2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentMethots;
import static day2.proje2.LocatorsClass.*;

public class Tests1 extends ParentMethots {

    @BeforeTest
    public void gotoSite(){
        driver.get(url);
    }
    @Test
    public void test1(){
        clickTo(businessRdio);
        wait.until(ExpectedConditions.visibilityOfElementLocated(onlineOptionSelect));
        WebElement selectButton = driver.findElement(By.xpath("//select[@id='u_3Ch_4588']"));
        Select select = new Select(selectButton);
        select.selectByValue("Online Advertising");
        clickTo(everyDay);
        clickTo(avarage);
        WebElement selectButton1 = driver.findElement(XYZ);
        Select select1 = new Select(selectButton1);
        select1.selectByValue("I'm using XYZ for about a week");
        sendKeysTo(favoriteFeature,"test devam ediyor.");
        sendKeysTo(firstName,"yasin");
        sendKeysTo(lastName,"aroglan");
        sendKeysTo(email,"yasinargln264@gmail.com");
        sendKeysTo(date,"19.05.1991");
    }
    @Test
    public void test2(){
        WebElement element1 = driver.findElement(countrySelect);
        Select select1 = new Select(element1);
        select1.selectByValue("TR");

        WebElement element = driver.findElement(citySelect);
        Select select = new Select(element);
        select.selectByValue("TR-64");
        clickTo(clickButton);
        sendKeysTo(commentMessage,"bu yaptımız doğru mu sence?");
        clickTo(devam);
        clickTo(onay);

        wait.until(ExpectedConditions.visibilityOfElementLocated(messageText));
    }
}
