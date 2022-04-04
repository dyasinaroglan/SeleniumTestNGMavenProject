package day8;
import day7.proje1A.ParentClass9;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.List;

import static day8.LocatorsB.*;

public class TestB extends ParentClass9 {

    int ogrSayisi = 0;
    @BeforeTest

    public void beforeTest(){
        driver.get(url);
    }
    @Test
    public void test() throws InterruptedException {

        List<WebElement> students = driver.findElements(lStudents);
        List<WebElement> teams = driver.findElements(lTeaams);
        WebElement[][] webElements = new WebElement[5][];  //5 Takım olduğu için 5 satır. sütünlar hepsinin farklı
        webElements[0] = new WebElement[4];
        webElements[1] = new WebElement[4];
        webElements[2] = new WebElement[4];
        webElements[3] = new WebElement[3];
        webElements[4] = new WebElement[6];

        Actions builder = new Actions(driver);
        Action action;
        for (int i = 0; i < webElements.length ; i++) { //5
            for (int j = 0; j < webElements[i].length; j++) {  //webElements'in i.elemanının uzunluğu
                action = builder.clickAndHold(students.get(ogrSayisi)).moveToElement(teams.get(i)).build();
                action.perform();
                sleepTo(1000);
                action = builder.release(teams.get(i)).build();
                action.perform();
                ogrSayisi++;
                if(j == webElements[i].length) break;
            }
        }
        List<WebElement> boxList;
        for (int i = 1; i <= webElements.length ; i++) {
            boxList = driver.findElements(By.cssSelector("ul#box"+ i + " li" ));
            Assert.assertEquals(boxList.size(),webElements[i-1].length);
        }
    }

}
