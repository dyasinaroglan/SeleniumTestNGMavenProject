package day9.project;

import org.openqa.selenium.By;

public interface Locators10 {

    String url = "https://opensource-demo.orangehrmlive.com/index.php/auth/login";
    By userNAme = By.id("txtUsername");
    By password = By.id("txtPassword");
    By logIn = By.id("btnLogin");
    By welcome = By.id("welcome");
}
