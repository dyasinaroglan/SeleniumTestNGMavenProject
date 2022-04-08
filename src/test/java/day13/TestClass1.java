package day13;

import org.testng.annotations.Test;
import utils.ParentMethots;

public class TestClass1 extends ParentMethots {

    HomePage1 homePage1 = new HomePage1();

    @Test
    public void test1(){
        homePage1.gotoSite();
    }
    @Test(priority = 1)
    public void test2(){
        homePage1.logınTo();
    }
    @Test(priority = 2)
    public void test3(){
        homePage1.uptadeAccount("ahmet","veli","1234");
    }
}
