package day6;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static day6.LocatorsClass8.*;


public class Test8 extends ParentClass8{

    @BeforeTest
    public void beforeTest(){
        driver.get(url);
    }
    @Test
    public void test(){
        clickTo(alertClick);
        driver.switchTo().alert().accept();
    }
    @Test(priority = 1)
    public void test1(){
        clickTo(fiveSecondsAlert);
        wait.until(ExpectedConditions.alertIsPresent());

        driver.switchTo().alert().accept();
    }
    @Test(priority = 2)
    public void test2() throws InterruptedException {
        clickTo(confirmButton);
        driver.switchTo().alert().dismiss();
        sleepTo(2000);
        clickTo(confirmButton);
        driver.switchTo().alert().accept();
    }
    @Test(priority = 3)
    public void test3(){
        clickTo(promptBox);
        driver.switchTo().alert().sendKeys("test tamamlandı");
        driver.switchTo().alert().accept();
    }
}
