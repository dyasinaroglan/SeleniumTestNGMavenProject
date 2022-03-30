package day2;

import org.checkerframework.checker.units.qual.A;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;
import utils.ParentMethots;

import java.util.List;
import java.util.Locale;

import static day2.LocatorsClass.*;

public class Tests extends ParentMethots {

    List<WebElement> productsName;
    List<WebElement> addToCarts;
    List<WebElement> sepetUrunIsım;

    @Test
    public void test1(){
        openSite(url);
        sendKeysTo(userName,"standard_user");
        sendKeysTo(password,"secret_sauce");
        clickTo(login);
        productsName = driver.findElements(lproducts);
        for (WebElement element : productsName) {
            System.out.println(element.getText());
        }
    }
    @Test(priority = 1)
    public void test2(){
        addToCarts = driver.findElements(laddToCart);
        for (WebElement addToCart : addToCarts) {
           addToCart.click();
        }
    }
    @Test(priority = 2)
    public void test3(){
        clickTo(sepetClick);
        wait.until(ExpectedConditions.numberOfElementsToBeMoreThan(sepetUrunName,5));

    }
    @Test(priority = 3)
    public void test4(){
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(actualUrl,"https://www.saucedemo.com/cart.html");

        if(actualUrl == url){
            System.out.println("doğru adrestesiniz");
        }
        clickTo(checkOutButton);
    }
    @Test(dependsOnMethods = {"test4"})
    public void test5(){
        sendKeysTo(lFirstName,"yasin");
        sendKeysTo(lLastName,"aroglan");
        sendKeysTo(lZipCode,"34000");
        clickTo(continueButton);

        if(true)
            wait.until(ExpectedConditions.visibilityOfElementLocated(totalText));
            System.out.println("test başarılı bir şekilde tamamlanmıştır");
        }

    }

