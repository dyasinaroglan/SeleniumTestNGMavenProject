package day2.proje1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.ParentMethots;

import java.util.List;

public interface LocatorsClass {

    String url = "https://www.saucedemo.com/";
    By userName = By.id("user-name");
    By password = By.id("password");
    By login = By.id("login-button");
    By lproducts = By.cssSelector("div[class='inventory_item_name']");
    By laddToCart = By.cssSelector("button[class='btn btn_primary btn_small btn_inventory']");

    By sepetClick = By.cssSelector("a[class='shopping_cart_link']");
    By sepetUrunName = By.cssSelector(".inventory_item_name");
    By checkOutButton = By.cssSelector("button[class='btn btn_action btn_medium checkout_button']");
    By lFirstName = By.id("first-name");
    By lLastName = By.id("last-name");
    By lZipCode = By.id("postal-code");
    By continueButton = By.id("continue");
    By totalText = By.cssSelector("div[class='summary_total_label']");


}
