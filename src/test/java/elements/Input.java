package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input extends BaseElement{

    private final static String INPUT_LOCATOR = "%s";

    public Input(WebDriver driver) {
        super(driver);
    }
    public void setValue(String value){
        WebElement input = driver.findElement(By.id(INPUT_LOCATOR));
        scrollIntoView(input);
        input.sendKeys(value);
    }
}
