package day2.proje3;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import utils.ParentMethots;

import java.util.List;
import static day2.proje3.LocatorsClass.*;

public class LoginTest extends ParentMethots {

    List<WebElement> userNames;

    @BeforeTest
    public void beforeTest(){
        driver.navigate().to(url);
        userNames = driver.findElements(users);
        System.out.println(userNames.get(0));

    }
}

