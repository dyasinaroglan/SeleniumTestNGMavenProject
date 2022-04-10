package day14.tests;

import day11.Browser;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.Driver;
import utils.ParentMethots;

public class TestClass3 {

    WebDriver driver;


    @BeforeTest
    @Parameters("browserName")
    public void beforeTest(String browser){
        driver = Driver.getDriver(browser);

    }

    @Test
    public void gotoUrl(){
        driver.get("http://opencart.abstracta.us/");
    }
    @Test(dependsOnMethods = {"gotoUrl"})
    @Parameters({"searchText","browserName"})
    public void test(String text, String browser){
        driver.findElement(By.cssSelector("input[name='search']")).sendKeys(text);
        System.out.println("method : " + browser);

    }
    @AfterTest
    @Parameters("browserName")
    public void afterTest(String bName) throws InterruptedException {
        Thread.sleep(2000);
        System.out.println(bName);
        Driver.quit();

    }
}
