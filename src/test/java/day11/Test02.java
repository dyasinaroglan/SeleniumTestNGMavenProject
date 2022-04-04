package day11;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test02 {
    WebDriver driver;

    @Test
    public void test2(){
        this.driver = Driver.getDriver();
    }
    @Test
    public void t2(){
        Driver.getDriver().get("http://www.amazon.com");
    }
}
