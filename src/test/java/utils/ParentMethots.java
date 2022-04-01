package utils;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentMethots {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public ParentMethots(){
        driver = Driver.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }
    public void openSite(String url){
        driver.get(url);
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendKeysTo(By locator,String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public void sendKeysTo(By locator,String text, boolean clear){
        WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        if(clear){
            element.clear();
            element.sendKeys(text);
        }
    }
    public void quit() throws InterruptedException {
        Thread.sleep(2000);
        Driver.quit();
    }
    public void sleepTo(long milis) throws InterruptedException {
        Thread.sleep(milis);
    }
}
