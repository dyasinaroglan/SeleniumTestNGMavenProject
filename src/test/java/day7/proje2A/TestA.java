package day7.proje2A;
import day7.proje1A.ParentClass9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static day7.proje2A.LocatorsClassA.*;

public class TestA extends ParentClass9 {

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

        clickTo(transferFounds);
    }
    @Test(priority = 1)
    public void test2(){
        WebElement fromAccount = driver.findElement(By.cssSelector("select[id='tf_fromAccountId']"));
        Select select = new Select(fromAccount);
        List<WebElement> list1 = select.getOptions();

        list1.get(random(list1.size())).click();

        WebElement toAccount = driver.findElement(By.cssSelector("select[id='tf_toAccountId']"));
        Select select1 = new Select(toAccount);
        List<WebElement> list2 = select1.getOptions();

        list2.get(random(list2.size())).click();
        sendKeysTo(amount,"500");
        sendKeysTo(description,"test başarılı");
        clickTo(lcontinue);
        clickTo(submit);
    }
}
