package day11;

import day7.proje1A.ParentClass9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.LinkedList;
import java.util.List;

public class Test4 extends ParentClass9 {

    String url = "http://opencart.abstracta.us/index.php?route=common/home";
    By lSearchInput = By.cssSelector("input[name='search']");
    By lSearchButton = By.cssSelector("#search button");
    By lMenuBar = By.cssSelector("ul.nav.navbar-nav > li");

    List<String> menu = new LinkedList<>(){{
        add("Desktops");
        add("Laptops & Notebooks");
    }};

    @Test
    public void test1(){
        driver.get(url);
        sendKeysTo(lSearchInput,"mac");
        clickTo(lSearchButton);
        List<WebElement> menuBar = driver.findElements(lMenuBar);

        for (int i = 0; i < menuBar.size(); i++) {
            Assert.assertEquals(menuBar.get(i).getText(), menu.get(i));
        }
    }
}
