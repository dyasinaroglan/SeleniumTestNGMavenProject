package day7.proje3A;

import org.openqa.selenium.By;

interface Locators3A {

    String url = "http://zero.webappsecurity.com/login.html";

    By userName = By.id("user_login");
    By password = By.id("user_password");

    By signIn = By.cssSelector("input[type='submit']");
    By transferFunds = By.id("transfer_funds_link");
    By payBills = By.linkText("Pay Bills");
    By lpayee = By.id("sp_payee");
    By laccount = By.id("sp_account");
    By amount = By.id("sp_amount");

    By date = By.id("sp_date");
    By nextButton = By.cssSelector("span[class='ui-icon ui-icon-circle-triangle-e']");

    By dateYear = By.cssSelector("div[class='ui-datepicker-title']");
    By daySelect = By.xpath("(//a[@class='ui-state-default'])[12]");
    By description = By.id("sp_description");

    By paySubmit = By.cssSelector("input[type='submit']");

    By message = By.cssSelector("span[title='$ 500 payed to payee apple']");
}
