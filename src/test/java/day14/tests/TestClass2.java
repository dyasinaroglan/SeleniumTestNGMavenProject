package day14.tests;

import org.testng.annotations.Test;

public class TestClass2 {

    @Test(groups = {"grupB"},dependsOnMethods = {"test6"})
    public void test4(){
        System.out.println("test4");
    }
    @Test(groups = {"grupA","grupC"})
    public void test5(){
        System.out.println("test5");
    }
    @Test(groups = {"grupA"})
    public void test6(){
        System.out.println("test6");
    }
}
