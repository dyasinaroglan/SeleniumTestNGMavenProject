package day3.proje3;

import org.openqa.selenium.By;

interface Locators4 {

    String url = "https://demo.applitools.com/";
    By userName = By.id("username");
    By password = By.id("password");
    By signIn = By.id("log-in");
    By metin = By.cssSelector("h6[id='time']");
    String metinText = "Your nearest branch closes in: 30m 5s";
    String expectedUrl = "https://demo.applitools.com/app.html";
}
