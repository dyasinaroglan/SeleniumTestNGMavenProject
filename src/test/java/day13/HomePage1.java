package day13;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import utils.ParentMethots;

public class HomePage1 extends ParentMethots {

    String url = "http://opencart.abstracta.us/";
    By lmyAccount = By.cssSelector("i[class='fa fa-user']");
    By lLogin = By.partialLinkText("Login");
    By lemail = By.id("input-email");
    By lpassword = By.id("input-password");
    By lLoginButton = By.cssSelector("input[type='submit']");

    By lLogOut = By.xpath("(//a[@class='list-group-item'])[13]");
    By leditAccount = By.xpath("//a[@class='list-group-item'][2]");
    By lfirstName = By.id("input-firstname");
    By llastName = By.id("input-lastname");
    By ltelephone = By.id("input-telephone");
    By lcontinueButton = By.cssSelector("input[value='Continue']");
    By lMessage = By.cssSelector("div[class='alert alert-success alert-dismissible']");


    public void gotoSite(){
        driver.get(url);
    }
    public void logınTo(){
        clickTo(lmyAccount);
        clickTo(lLogin);
        sendKeysTo(lemail,"testngkurs@gmail.com");
        sendKeysTo(lpassword,"testngkurs");
        clickTo(lLoginButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lLogOut));
    }
    public void uptadeAccount(String firstName, String lastName, String telephone){
        clickTo(leditAccount);

        sendKeysTo(lfirstName,firstName,true);
        sendKeysTo(llastName,lastName,true);
        sendKeysTo(ltelephone,telephone,true);
        clickTo(lcontinueButton);
        wait.until(ExpectedConditions.visibilityOfElementLocated(lMessage));

    }
}
