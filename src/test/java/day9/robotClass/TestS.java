package day9.robotClass;
import day7.proje1A.ParentClass9;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;
import java.util.Set;

import static day9.robotClass.LocatorsR.*;

public class TestS extends ParentClass9 {
    /*
        https://www.snapdeal.com/ gidin
        search input "casio watch man" aratın
        ilk satır ürünlein ismini ekrana yazdırın
        ilk satır ürünlerinden random bir tanesine tıkla
        selenium ile ekran kaydı al
        robot ile sayfanın (100,100,500,500) alanın görüntüsünü kaydet.
         */

    @BeforeTest
    public void test(){
        driver.get(url1);
    }
    @Test
    public void test1(){
        sendKeysTo(searchText,"casio watch man" + Keys.ENTER);
        List<WebElement> list = wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(firstProducts));
        for (WebElement element : list) {
            System.out.println(element.getText());
        }
        String anaSayfaID = driver.getWindowHandle();
        list.get(random(list.size())).click();
        Set<String> windowID = driver.getWindowHandles();
        for (String s : windowID) {
            if(!windowID.equals(anaSayfaID)){
                driver.switchTo().window(s);
            }
        }
    }

    @Test(priority = 1)
    public void test2() throws IOException, AWTException {

        String fileName = "screenshot_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss"));
        TakesScreenshot srcShot = (TakesScreenshot) driver;
        File scrFile = srcShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("screenShot\\" + fileName + ".png");
        try {
            FileUtils.copyFile(scrFile,destFile);
        }catch (IOException e){
            e.printStackTrace();
        }
        takeScreenShotByRobots(100,100,500,500);
    }




    public int random(int size){
        return (int) (Math.random()*size);
    }
    public static void takeScreenShotByRobots(int x, int y, int widht, int height) throws AWTException, IOException {
        Robot robot = new Robot();
        Rectangle rect = new Rectangle(x,y,widht,height);
        BufferedImage image = robot.createScreenCapture(rect);
        String fileName = "screenShot_" + LocalDateTime.now().format(DateTimeFormatter.ofPattern("yyyy_MM_dd_HH_mm_ss"));
        File destFile = new File("ScreenShot\\" + fileName + ".png");
        ImageIO.write(image,"png",destFile);
    }
}
