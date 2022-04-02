package day7.proje1A;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentClass9 {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public ParentClass9() {
        this.driver = Driver9.getDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.manage().deleteAllCookies();
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
    public void quitTo() throws InterruptedException {
        sleepTo(4000);
        Driver9.quitDriver();
    }
    public int random(int size){
        return (int) (Math.random()*size);
    }
}
