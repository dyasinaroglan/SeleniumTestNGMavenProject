package day5.projeX;

import org.openqa.selenium.By;

interface LocatorsClass6 {

    String url = "https://www.saucedemo.com/";

    By userName = By.id("user-name");
    By password = By.id("password");
    By loginButton = By.id("login-button");

    By lproducts = By.cssSelector("div[class='inventory_item_name']");
    By lAddToCarts = By.cssSelector("button[class='btn btn_primary btn_small btn_inventory']");
    By lprice = By.cssSelector("div[class='inventory_item_price']");

    By sepetteProducts = By.xpath("//div[@class='inventory_details_name large_size']");
    By sepettePrice = By.xpath("//div[@class='inventory_details_price']");

}
