package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BaseModal extends BasePage {
    protected final static String BUTTON_LOCATOR = "//a[text()='%s']";
    protected final static By CALCULATE_PACES = By.id("saveButtonSettings");
    protected final static By GREEN_BOX = By.xpath("//h4[text()='Your Workout Paces']");

    public boolean isGreenBoxDisplay()  {
        try {
            driver.findElement(GREEN_BOX).isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
        return true;
    }
    public BaseModal(WebDriver driver) {
        super(driver);
    }
}
