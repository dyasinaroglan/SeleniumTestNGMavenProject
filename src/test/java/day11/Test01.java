package day11;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Test01 {

    WebDriver driver;

    @Test
    public void test1(){
        this.driver = Driver.getDriver();
    }
    @Test
    public void t1(){
        Driver.getDriver().get("http://www.google.com");

        Test02 test02 = new Test02();  //amazon
        test02.t2();

        Test03 test03 = new Test03();  //yahoo
        test03.t3();
    }

}
