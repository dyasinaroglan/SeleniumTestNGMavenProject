package day3.proje1;

import org.openqa.selenium.By;

public interface LocatorsClass {

    String url = "https://www.saucedemo.com/";
    By users = By.cssSelector(".login_credentials");


    By lpassword = By.id("password");
    By login = By.id("login-button");
}
