package day5.projeX;

import day5.projeX.Driver6;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;

public class ParentClass6 {

    protected WebDriver driver;
    protected WebDriverWait wait;


    public ParentClass6() {
        this.driver = Driver6.getDriver();
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(15));
        driver.manage().window().maximize();
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendKeysTo(By locator,String str){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(str);
    }
    public void sleep(long milis) throws InterruptedException {
        Thread.sleep(milis);
    }
    public void quitDriver() throws InterruptedException {
        sleep(2000);
        Driver6.quitDriver();
    }
    public void stringListKontrol(List<String> list1, List<String> list2){
        for (int i = 0; i < list1.size(); i++) {
            if(list1.get(i).equals(list2.get(i))){
                System.out.println(list1.get(i) + "ürün sepette var...");
            }
        }
    }
    public List<String> elementToString(List<WebElement> list){
        List<String> textList = new ArrayList<>();
        for (WebElement element : list) {
            textList.add(element.getText());
            
        }
        return textList;
    }

    public int random(int size){
        return (int) (Math.random()*size);
    }
}
