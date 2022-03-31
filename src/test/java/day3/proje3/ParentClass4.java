package day3.proje3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentClass4 {

    WebDriver driver;
    WebDriverWait wait;


    public ParentClass4() {
        this.driver = Driver.getDriver();
        driver.manage().window().maximize();
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void quiteDriver() throws InterruptedException {
        Driver.quitDriver();
    }
    public void openSite(String url){
        driver.get(url);
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendKeysTo(By locator,String str){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(str);
    }
}
