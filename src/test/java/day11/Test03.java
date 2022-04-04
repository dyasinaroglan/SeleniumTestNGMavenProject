package day11;

import org.openqa.selenium.WebDriver;

public class Test03 {


    WebDriver driver;

    public void test3(){
        this.driver = Driver.getDriver();
    }
    public void t3(){
        Driver.getDriver().get("http://www.yahoo.com");
    }
}
