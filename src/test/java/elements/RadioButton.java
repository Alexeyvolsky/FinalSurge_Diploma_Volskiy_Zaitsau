package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RadioButton extends BaseElement{
    private final static String RADIOBUTTON_LOCATOR = "//label[text()='%s']/input";
    private final static String RADIOBUTTON_FOR_WORKOUTS = "//span[text()='Great']//ancestor::label//input";

    public RadioButton(WebDriver driver) {
        super(driver);
    }
    public void clickRadiobutton(String value){
        WebElement radiobutton = driver.findElement(By.xpath(String.format(RADIOBUTTON_LOCATOR, value)));
        scrollIntoView(radiobutton);
        radiobutton.click();
    }
    public void clickRadiobuttonWorkouts(String value){
        WebElement radiobutton = driver.findElement(By.xpath(String.format(RADIOBUTTON_FOR_WORKOUTS, value)));
        scrollIntoView(radiobutton);
        radiobutton.click();
    }
}
