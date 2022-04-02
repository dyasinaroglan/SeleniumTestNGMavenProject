package day7.proje2A;

import org.openqa.selenium.By;

public interface LocatorsClassA {

    String url = "http://zero.webappsecurity.com/login.html";
    By userName = By.id("user_login");
    By password = By.id("user_password");
    By signIn = By.cssSelector("input[type='submit']");

    By transferFounds = By.id("transfer_funds_link");

    By amount = By.id("tf_amount");
    By description = By.id("tf_description");
    By lcontinue = By.id("btn_submit");
    By submit = By.id("btn_submit");

}
