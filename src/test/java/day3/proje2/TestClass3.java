package day3.proje2;

import org.openqa.selenium.Keys;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;
import utils.ParentMethots;
import static day3.proje2.LocatorsClass3.*;

public class TestClass3 extends ParentMethots {

    @Test
    public void Test(){
        openSite(url);
        sendKeysTo(searchText,"teddy bear" + Keys.ENTER);
        wait.until(ExpectedConditions.visibilityOfElementLocated(str));
    }
    @Test(priority = 1)
    public void test1(){
        clickTo(sneapdal);
        String url = driver.getCurrentUrl();
        Assert.assertEquals(url,actualUrl);
        if(url.equals(actualUrl)){
            System.out.println("test başarılı bir şekilde tamamlanmıştır.");
        }
    }
}
