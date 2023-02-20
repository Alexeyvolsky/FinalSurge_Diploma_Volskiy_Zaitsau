package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;

import java.util.ArrayList;

public class PrintDetailsPage extends BasePage   {

    private final static By WORKOUTS_DATA = By.xpath("//td/span[2]");

    public boolean isPrintDetailsPageIsPresent()    {
        try {
            driver.findElement(WORKOUTS_DATA).isDisplayed();
        } catch (NoSuchElementException ex) {
            return false;
        }
        return true;
    }

    public String getPrintWorkoutData()  {
        return driver.findElement(WORKOUTS_DATA).getText();
    }

    public void getTabList()  {
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));
    }

    public PrintDetailsPage(WebDriver driver) {
        super(driver);
    }
}