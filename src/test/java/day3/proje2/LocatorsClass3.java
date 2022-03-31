package day3.proje2;

import org.openqa.selenium.By;

public class LocatorsClass3 {

    public static final String url = "https://www.snapdeal.com/";
    public static final By searchText = By.cssSelector("input[id='inputValEnter']");
    public static final By str = By.xpath("(//div[@class='search-result-txt-section  marT12'])[1]");
    public static final String metinStr = "We've got 267 results for 'teddy bear'";
    public static final By sneapdal = By.xpath("(//img[@title='Snapdeal'])[1]");
    public static final String actualUrl = "https://www.snapdeal.com/";
}
