package day8;

import org.openqa.selenium.By;

public interface LocatorsB {

    String url = "http://dhtmlgoodies.com/scripts/drag-drop-nodes/drag-drop-nodes.html";
    By lStudents = By.cssSelector("li[id^='node']");
    By lTeaams = By.cssSelector("ul[id^='box']");
}
