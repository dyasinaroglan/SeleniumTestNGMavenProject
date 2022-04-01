package day4.ProjeA;

import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

import static day4.ProjeA.Locators5.*;

public class Test5 extends ParentClassA{

    List<WebElement> addToCartButton;

    @Test
    public void test1(){
        driver.get(url);
    }
    @Test(dependsOnMethods = {"test1"},priority = 1)
    public void login(){
        sendKeysTo(userName,"standard_user");
        sendKeysTo(password,"secret_sauce");
        clickTo(login);
    }
    @Test(priority = 2)
    public void addToCart(){
        addToCartButton = driver.findElements(addToCart);
        for (WebElement element : addToCartButton) {
            element.click();
        }
        clickTo(sepetBox);
        List<WebElement> productsSepet = driver.findElements(sepetInProducts);
        List<String> list1 = new ArrayList<>();

        for (WebElement product : productsSepet) {
            list1.add(product.getText());
            System.out.println(list1);
        }
        System.out.println("****************");
        List<WebElement> products = driver.findElements(beforeSepetProducts);
        List<String> list2 = new ArrayList<>();

        for (WebElement product : products) {
            list2.add(product.getText());
            System.out.println(list2);
        }
        for (int i = 1; i < list1.size() ; i++) {
            if(list1.get(i).equals(list2.get(i))){
                System.out.println(list1.get(i) + "ürün sepette var.");
            }
        }
    }
    @Test(priority = 3)
    public void test3(){
        clickTo(checkOut);
        sendKeysTo(firstName,"yasin");
        sendKeysTo(lastName,"sağlim");
        sendKeysTo(zipCode,"34000");
        clickTo(lcontinue);

    }
    @Test(dependsOnMethods = {"test3"})
    public void test4(){
        WebElement total = driver.findElement(ltotal);
        String totalText = total.getText();
        String tt = totalText.replaceAll("[$]","");
        Double rakam = Double.parseDouble(tt);
        Double account = 0.0;

        List<WebElement> price1 = driver.findElements(priceProducts); //fiyatların tamamını bir listeye attık
        List<String> priceList1 = new ArrayList<>();
        for (WebElement element : price1) {
            priceList1.add(element.getText());    //arrayList in içine fiyatları doldurduk
        }
        List<WebElement> price2 = driver.findElements(ltotal1);
        List<String> priceList2 = new ArrayList<>();
        for (WebElement element : price2) {
            priceList2.add(element.getText());
        }
        if(priceList1.size() == priceList2.size()){
            for (int i = 0; i < price1.size(); i++) {
                if(price1.get(i).equals(price2.get(i))){
                    System.out.println(price1.get(i) + "ürün sepette var...");
                }
                
            }
        }
    }
    public static double stringToDouble(String text){
        String tt = text.replaceAll("[$]","");
        Double rakam = Double.parseDouble(tt);
        return rakam;
    }
}