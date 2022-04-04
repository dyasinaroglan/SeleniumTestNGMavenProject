package day9.project;
import day7.proje1A.Driver9;
import day7.proje1A.ParentClass9;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import static day9.project.Locators10.*;

public class Test10 extends ParentClass9 {


    @BeforeTest
    public void beforeTest(){
        driver.get(url);
        takeScreenShotSelenium();
    }
    @Test
    public void login(){
        sendKeysTo(userNAme,"Admin");
        sendKeysTo(password,"admin123");
        clickTo(logIn);

        try {
            wait.until(ExpectedConditions.visibilityOfElementLocated(welcome));
        }catch (Exception e){
            takeScreenShotSelenium();  //hata varsa screenShot al diyoruz
        }
    }

    @AfterTest
    public void afterTest(){
        takeScreenShotSelenium();
        Driver9.quitDriver();
    }
    public static void takeScreenShotSelenium(){                                         //MONTHS and HOUR ---> Ay ve Saat büyük
        String fileName = "ScreenShot_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss"));
        TakesScreenshot scrShot = (TakesScreenshot) Driver9.getDriver();
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("ScreenShot\\" + fileName + ".png");  //yerini belirtiyoruz
        try {
            FileUtils.copyFile(srcFile,destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
