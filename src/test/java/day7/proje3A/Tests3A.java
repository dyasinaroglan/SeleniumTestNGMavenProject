package day7.proje3A;

import day7.proje1A.ParentClass9;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static day7.proje3A.Locators3A.*;

public class Tests3A extends ParentClass9 {
    @BeforeTest
    public void beforeTest(){
        driver.get(url);
    }
    @Test
    public void test1(){
        sendKeysTo(userName,"username");
        sendKeysTo(password,"password");
        clickTo(signIn);
        driver.navigate().back();
    }
    @Test(priority = 1)
    public void test2(){
        clickTo(transferFunds);
        clickTo(payBills);
        WebElement payee = driver.findElement(lpayee);
        Select select = new Select(payee);
        List<WebElement> list1 = select.getOptions();
        list1.get(random(list1.size())).click();
    }
    @Test(priority = 2)
    public void test3(){
        WebElement account = driver.findElement(laccount);
        Select select = new Select(account);
        List<WebElement> list2 = select.getOptions();
        list2.get(random(list2.size())).click();
        sendKeysTo(amount,"500");
    }
    @Test(priority = 3)
    public void test4(){
        clickTo(date);
        String year = "July 2023";
        while (!driver.findElement(dateYear).getText().equalsIgnoreCase(year)){
            clickTo(nextButton);
        }
        clickTo(daySelect);
        sendKeysTo(description,"test devam ediyor");

        clickTo(paySubmit);
    }
    @Test(priority = 4)
    public void test5(){
        wait.until(ExpectedConditions.presenceOfElementLocated(message));
        //element mevcut olana kadar bekle
    }

}
