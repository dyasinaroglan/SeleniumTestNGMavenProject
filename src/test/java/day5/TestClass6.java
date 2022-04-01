package day5;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static day5.LocatorsClass6.*;

public class TestClass6 extends ParentClass6{


    @BeforeTest
    public void beforeTest(){
        driver.get(url);
    }
    @Test
    public void login(){
        sendKeysTo(userName,"standard_user");
        sendKeysTo(password,"secret_sauce");
        clickTo(loginButton);
    }
    @Test(priority = 1)
    public void test1(){

        List<WebElement> products = driver.findElements(lproducts);
        List<WebElement> addToCart = driver.findElements(lAddToCarts);
        List<WebElement> price = driver.findElements(lprice);

        elementToString(products);
        elementToString(addToCart);
        elementToString(price);

        int randomSayı = random(products.size());

        String randomProductsName = elementToString(products).get(randomSayı);
        String randomPrice = elementToString(price).get(randomSayı);

        addToCart.get(randomSayı).click();
        products.get(randomSayı).click();

        String sepetteUrunName = driver.findElement(sepetteProducts).getText();
        String sepetteFiyat = driver.findElement(sepettePrice).getText();


        Assert.assertEquals(randomProductsName,sepetteUrunName);
        Assert.assertEquals(randomPrice,sepetteFiyat);

    }


}
