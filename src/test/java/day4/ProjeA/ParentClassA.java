package day4.ProjeA;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentClassA {

    WebDriver driver;
    WebDriverWait wait;

    public ParentClassA() {
        this.driver = Driver.getDriver();
        driver.manage().window().maximize();
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendKeysTo(By locator, String str){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(str);
    }
    public void sendKeysTo(By locator, String str, boolean clear){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        if(clear){
            element.clear();
            element.sendKeys(str);
        }
    }
    public void sleep(long mılıs) throws InterruptedException {
        Thread.sleep(2000);
    }
    public void quit() throws InterruptedException {
        Driver.quitDriver();
    }
}
