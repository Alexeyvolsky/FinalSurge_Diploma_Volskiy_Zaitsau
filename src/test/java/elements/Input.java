package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Input extends BaseElement{

    private final static String INPUT_LOCATOR = "%s";
    private final String id;


    public Input(WebDriver driver, String id) {
        super(driver);
        this.id = id;
    }
    public void setValue(String value){
        WebElement input = driver.findElement(By.id(String.format(INPUT_LOCATOR, this.id)));
        scrollIntoView(input);
        input.sendKeys(value);
    }
}
