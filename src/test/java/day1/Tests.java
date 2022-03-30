package day1;

import utils.Driver;
import utils.ParentMethots;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tests extends ParentMethots{

    String url = "https://www.saucedemo.com/";
    By userName = By.id("user-name");
    By password = By.id("password");
    By login = By.id("login-button");
    By addToCart = By.id("add-to-cart-sauce-labs-backpack");
    By sepet = By.cssSelector("a[class='shopping_cart_link']");
    By urunName = By.linkText("Sauce Labs Backpack");

    WebDriver driver;

    @BeforeTest
            public void beforeTest(){
        driver = Driver.getDriver();
    }
    @Test
    public void test(){
        openSite(url);
    }
    @Test(priority = 1)
    public void login(){
        sendKeysTo(userName,"standard_user");
        sendKeysTo(password,"secret_sauce");
        clickTo(login);
    }
    @Test(priority = 2)
    public void addToCart(){
        clickTo(addToCart);
        clickTo(sepet);
        wait.until(ExpectedConditions.visibilityOfElementLocated(urunName));
        }
}
