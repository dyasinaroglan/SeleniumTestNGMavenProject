package day12;

import day7.proje1A.ParentClass9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Locale;

public class Scenario extends ParentClass9 {

    String url = "http://opencart.abstracta.us";
    By lsearchText = By.cssSelector("input[type='text']");
    By searchButton = By.cssSelector("button[class='btn btn-default btn-lg']");



    @BeforeTest
    public void beforeTest(){
        driver.get(url);
    }
    @Test
    public void test1(){
        sendKeysTo(lsearchText,"mac");
        clickTo(searchButton);
        List<WebElement> list1 = driver.findElements(By.cssSelector("div.caption>h4"));
        for (WebElement element : list1) {
            System.out.println(element.getText());
            if(element.getText().toLowerCase(Locale.ROOT).contains("mac")){
                System.out.println("mac geçiyor");
            }else {
                System.out.println("mac geçmiyor");
            }

        }

    }
}
