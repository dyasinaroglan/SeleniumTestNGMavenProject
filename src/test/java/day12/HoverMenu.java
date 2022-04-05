package day12;

import day7.proje1A.ParentClass9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

public class HoverMenu extends ParentClass9 {

    String url = "http://opencart.abstracta.us/index.php?route=common/home";
    By menuItems = By.cssSelector("ul.nav.navbar-nav>li");


    @BeforeTest
    public void beforeTest(){
        driver.get(url);
    }
    @Test
    public void test() throws InterruptedException {
        List<WebElement> list = driver.findElements(menuItems);
        for (WebElement i : list) {
            Actions builder = new Actions(driver);
            Action action = builder.moveToElement(i).build();
            action.perform();
            if(i.findElements(By.cssSelector("div.dropdown-inner")).size()>0){
                System.out.println("alt başlığı var " + i.findElements(By.cssSelector("div.dropdown-inner li")).size());
                Assert.assertTrue(i.findElement(By.cssSelector("div.dropdown-inner")).isDisplayed());
            }else {
                System.out.println("alt başlığı yok");
            }
        }
    }
}
