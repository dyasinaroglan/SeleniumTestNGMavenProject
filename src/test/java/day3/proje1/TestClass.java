package day3.proje1;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.Test;
import utils.ParentMethots;

import java.util.List;

import static day3.proje1.LocatorsClass.*;


public class TestClass extends ParentMethots {

    @Test
    public void test1() throws InterruptedException {
        driver.get(url);
        WebElement element = driver.findElement(users);
        String userText = element.getText();
        String[] userNames = userText.split("\n");

        for (int i = 1; i < userNames.length; i++) {
            Thread.sleep(1000);
            WebElement userName = driver.findElement(By.xpath("(//input[@class='input_error form_input'])[1]"));
            userName.clear();
            userName.sendKeys(userNames[i]);

            clickTo(lpassword);
            sendKeysTo(lpassword,"secret_sauce",true);
            Thread.sleep(2000);
            clickTo(login);

            driver.navigate().back();
            Thread.sleep(2000);


            List<WebElement> products = driver.findElements(By.cssSelector("span[class='title']"));
            if(products.size()==1){
                System.out.println(userNames[i] + " : Bu userName ile login olundu....");
                Thread.sleep(2000);
                driver.navigate().back();
            }else {
                WebElement error = driver.findElement(By.cssSelector("div[class='error-message-container error']"));
                System.out.println(userNames[i] + " : Bu username ile login olunamadı..." + error.getText());
            }
        }
    }

}
