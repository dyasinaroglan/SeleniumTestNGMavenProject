package day5.projeZ;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class ParentClass7 {

    protected WebDriver driver;
    protected WebDriverWait wait;

    public ParentClass7() {
        this.driver = Driver7.getDriver();
        driver.manage().window().maximize();
        this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(15));
    }
    public void clickTo(By locator){
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }
    public void sendKeysTo(By locator, String text){
        wait.until(ExpectedConditions.visibilityOfElementLocated(locator)).sendKeys(text);
    }
    public void sleepTo(long milis){
        try {
            Thread.sleep(milis);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public void quitDriver(){
        sleepTo(2000);
        Driver7.quitDriver();
    }

}
