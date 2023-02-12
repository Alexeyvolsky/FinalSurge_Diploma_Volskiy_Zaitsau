package modals;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import pages.BasePage;

public class BaseModal extends BasePage {
    protected final static String BUTTON_LOCATOR = "//a[text()='%s']";
    protected final static String CALCULATE_PACES = "%s";
    protected static String GREEN_BOX = "//h4[text()='%s']";
    protected final static String CALCULATOR_BUTTON_LOCATOR = "//a[text()='%s']";

    public boolean isGreenBoxDisplay(String text)  {
        try {
            driver.findElement(By.xpath(String.format(GREEN_BOX, text))).isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
        return true;
    }

    public void clickCalculatePaces(String id)   {
        driver.findElement(By.id(String.format(CALCULATE_PACES, id))).click();
    }

    public void clickCalculatorType(String value)   {
        driver.findElement(By.xpath(String.format(CALCULATOR_BUTTON_LOCATOR, value))).click();
    }

    public void openIframe(String id)    {
        driver.switchTo().frame(id);
    }

    public void closeIframe()   {
        driver.switchTo().defaultContent();
    }

    public BaseModal(WebDriver driver) {
        super(driver);
    }
}