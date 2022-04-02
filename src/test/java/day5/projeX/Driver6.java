package day5.projeX;

import day5.projeX.Browsers6;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Driver6 {

    private static WebDriver driver;
    private static WebDriverWait wait;

    public static WebDriver getDriver(){
        return getDriver(Browsers6.CHROME);
    }

    public static WebDriver getDriver(Browsers6 browsers6){
        if(driver == null){
            switch (browsers6){
                case IE :
                    WebDriverManager.iedriver().setup();
                    driver = new InternetExplorerDriver();
                    break;
                case EDGE:
                    WebDriverManager.edgedriver().setup();
                    driver = new EdgeDriver();
                    break;
                case SAFARI:
                    WebDriverManager.safaridriver().setup();
                    driver = new SafariDriver();
                case FIRFOX:
                    WebDriverManager.firefoxdriver().setup();
                    driver = new FirefoxDriver();
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
