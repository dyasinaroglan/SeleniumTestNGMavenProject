package day5.projeZ;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static day5.projeZ.LocatorsClass7.*;

public class Test7_1 extends ParentClass7{

    @BeforeTest
    public void beforeTest(){
        driver.get(url1);
    }
    @Test
    public void Test(){
        List<WebElement> countries = driver.findElements(lcountries);
        List<WebElement> capitals = driver.findElements(lcapitals);

        String expected = "rgba(0, 255, 0, 1)";
        Actions actions = new Actions(driver);
        Action action;

        for (int i = 0; i < capitals.size(); i++){
            for (int j = 0; j < countries.size(); j++) {
                action = actions.dragAndDrop(capitals.get(i),countries.get(j)).build();
                action.perform();
                if(capitals.get(i).getCssValue("background-color").equals(expected)){
                 break;
                }
            }
        }
        sleepTo(2000);
    }
    @AfterTest
    public void test(){
        Driver7.quitDriver();
    }
}
