package day2.proje2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface LocatorsClass {

    String url = "https://formsmarts.com/form/yu?mode=h5";
    By businessRdio = By.cssSelector("input[value='Business']");
    By onlineOptionSelect = By.cssSelector("option[value='Online Advertising']");
    By everyDay = By.cssSelector("input[value='Every Day']");
    By avarage = By.cssSelector("input[value='Average']");
    By XYZ = By.id("u_3Ch_4597");
    By favoriteFeature = By.id("u_3Ch_89597");
    By firstName = By.id("u_3Ch_4598");
    By lastName = By.id("u_3Ch_4599");
    By email = By.id("u_3Ch_4600");
    By date = By.id("u_3Ch_14597");
    By citySelect = By.id("u_3Ch_678913");
    By countrySelect = By.id("u_3Ch_14598");

    By clickButton = By.id("u_3Ch_4604");
    By commentMessage = By.id("u_3Ch_4602");
    By devam = By.cssSelector("input[type='submit']");
    By onay = By.xpath("(//input[@class='button-primary'])[1]");

    String message = "Form başarı ile gönderilmiştir. Teşekkürler.";
    By messageText = By.cssSelector("span[class='ok-large']");



}
