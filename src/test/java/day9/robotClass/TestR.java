package day9.robotClass;
import day7.proje1A.ParentClass9;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import static day9.robotClass.LocatorsR.*;

public class TestR extends ParentClass9 {

    @BeforeTest
    public void beforeTest(){
        driver.get(url);
    }
    @Test
    public void test1(){
        clickTo(fileSelect);
    }
    @Test(priority = 1)
    public void test2() throws AWTException, InterruptedException, IOException {
        StringSelection str = new StringSelection("C:\\Users\\yasin\\Desktop\\gazete pencere\\sayi371.pdf");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(str,null);

        Robot robot = new Robot();
        robot.waitForIdle();
        robot.keyPress(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_V);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        robot.keyPress(KeyEvent.VK_ENTER);
        robot.waitForIdle();

        sleepTo(2000);
        String fileName = "ScreenShot\\";
        Rectangle rectangle = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());  //bütün ekranı alıyoruz.
        BufferedImage image = robot.createScreenCapture(rectangle);
        ImageIO.write(image, "png",new File(fileName));
    }

    @Test(priority = 2)
    public void test3(){
        clickTo(check);
        clickTo(submit);

        wait.until(ExpectedConditions.presenceOfElementLocated(message));
    }
}
