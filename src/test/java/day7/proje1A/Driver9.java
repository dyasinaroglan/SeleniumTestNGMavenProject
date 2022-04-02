package day7.proje1A;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver9 {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public static WebDriver getDriver(){
        return getDriver(Browsers9.CHROME);
    }


    public static WebDriver getDriver(Browsers9 browsers9){
        if (driver == null){
            switch (browsers9){
                case EDGE :
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case FIREFOX:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
                    break;
                default:
                    WebDriverManager.chromedriver().setup();
                    driver = new ChromeDriver();
                    break;
            }
        }
        return driver;
    }
    public static void quitDriver(){

        driver.quit();
    }
}
