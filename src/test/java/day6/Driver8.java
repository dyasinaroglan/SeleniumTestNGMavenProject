package day6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver8 {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static WebDriver gotoDriver(){
        return goToDriver(Browsers8.CHROME);
    }


    public static WebDriver goToDriver(Browsers8 browsers8){
        if(driver == null){
            switch (browsers8){
                case FIREFOX :
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case IE:
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
        }
        return driver;
    }
    public static void quitDriver() throws InterruptedException {
        Thread.sleep(1000);
        driver.quit();
    }

}
