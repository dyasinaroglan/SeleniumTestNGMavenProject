package day5.projeZ;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import static day5.projeZ.LocatorsClass7.*;

public class Test7 extends ParentClass7 {

    @BeforeTest
    public void beforeTest() {
        driver.get(url);
    }

    @Test
    public void test() {
        Actions actions = new Actions(driver);
        WebElement hedefBank = driver.findElement(bank);
        WebElement hedefKutu = driver.findElement(hedefAccount);

         Action action = actions.clickAndHold(hedefBank).moveToElement(hedefKutu).release().build();
         action.perform();
         //ikinci yol
        /*
         Action action1 = actions.dragAndDrop(hedefBank,hedefKutu).build();
         action1.perform();
         */
        // TODO: 1.04.2022 clickAndHold --> ögeye tıklayıp basılı tutuyor.
        // TODO: 1.04.2022 moveToElement --> hedefe  hareket ettiren 
        // TODO: 1.04.2022 realese --> hedefi bırakan. realese olmazsa hedefe konmadan geri gider.

    }
}
