package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class Dropdown extends BaseElement{
    private final static String DROPDOWN_LOCATOR ="name='%s'";

    public Dropdown(WebDriver driver) {
        super(driver);
    }
    public void setDropdown(String name) {
        Select dropDown = new Select(driver.findElement(By.name(String.format(DROPDOWN_LOCATOR, name))));
//        List<WebElement> allOptions = dropDown.getOptions();
        scrollIntoView(dropDown);
    }

}
