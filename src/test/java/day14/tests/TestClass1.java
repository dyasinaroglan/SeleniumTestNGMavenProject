package day14.tests;

import org.testng.annotations.Test;

public class TestClass1 {

    @Test(groups = {"grupA"})
    public void test1(){
        System.out.println("test1");
    }
    @Test(groups = {"grupB","grupA"})
    public void test2(){
        System.out.println("test2");
    }
    @Test(groups = {"grupB"})
    public void test3(){
        System.out.println("test3");
    }
}
