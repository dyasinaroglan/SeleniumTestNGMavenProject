package day4.ProjeA;
import org.openqa.selenium.By;

interface Locators5 {

    String url = "https://www.saucedemo.com/";
    By userName = By.id("user-name");
    By password = By.id("password");
    By login = By.id("login-button");
    By addToCart = By.cssSelector("button[class='btn btn_primary btn_small btn_inventory'");
    By sepetBox = By.cssSelector("a[class='shopping_cart_link']");

    By sepetInProducts = By.cssSelector("div[class='inventory_item_name']");
    By beforeSepetProducts = By.cssSelector("div[class='inventory_item_name']");
    By checkOut = By.id("checkout");
    By firstName = By.id("first-name");
    By lastName = By.id("last-name");
    By zipCode = By.id("postal-code");
    By lcontinue = By.cssSelector("input[type='submit']");

    By priceProducts = By.xpath("//div[@class='inventory_item_price']");   //div[@class='inventory_item_name']

    By ltotal = By.xpath("//div[@class='inventory_item_price']");
    By ltotal1 = By.xpath("//div[@class='summary_subtotal_label']");

}
