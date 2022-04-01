package day5.projeZ;

import org.openqa.selenium.By;

public interface LocatorsClass7 {

    String url = "http://demo.guru99.com/test/drag_drop.html";
    By bank = By.id("credit2");
    By hedefAccount = By.xpath("(//li[@class='placeholder'])[1]");


    String url1 = "http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html";
    By lcountries = By.cssSelector("div#countries div[id^='box']");
    By lcapitals = By.cssSelector("div#dropContent div[id^='box']");

}
