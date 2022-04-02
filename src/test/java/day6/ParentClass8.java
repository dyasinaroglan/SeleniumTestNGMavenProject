package day6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentClass8 {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public ParentClass8() {
        this.driver = Driver8.gotoDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendKeysTo(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public void sleepTo(long milis) throws InterruptedException {
        Thread.sleep(milis);
    }
    public void quit() throws InterruptedException {
        Driver8.quitDriver();
    }
}
