package day5.select;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import utils.Driver;
import utils.ParentMethots;

import java.util.List;

public class Select1 extends ParentMethots {

    public static WebDriver driver;
    public static WebDriverWait wait;

    String url = "https://www.ebay.com/";
    By lCategories = By.cssSelector("select[id='gh-cat']");


    @Test
    public void test1(){
        driver = Driver.getDriver();
        driver.get(url);
    }
    @Test(priority = 1)
    public void test2() throws InterruptedException {
        WebElement categories = driver.findElement(lCategories);
        Select select = new Select(categories);
        sleepTo(1000);
        //select i 3 şekilde seçebiliyoruz
        //select.selectByValue("");
        select.selectByIndex(10);
        //select.selectByVisibleText("");

        //Ya da bu categorinin içindeki tüm listeyi bir listin içine atabiliriz

        List<WebElement> options = select.getOptions();
        String secim = options.get(10).getText();
        System.out.println("secim : " + secim);
    }
 }
