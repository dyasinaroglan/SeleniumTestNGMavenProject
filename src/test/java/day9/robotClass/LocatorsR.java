package day9.robotClass;

import org.openqa.selenium.By;

public interface LocatorsR {
    String url = "https://demo.guru99.com/test/upload/";
    By fileSelect = By.id("file_wraper0");

    By check = By.id("terms");
    By submit = By.id("submitbutton");
    By message = By.id("res");
}
