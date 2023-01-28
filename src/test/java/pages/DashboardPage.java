package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DashboardPage extends BasePage{
    private final static By USER_ICON = By.id("LayoutProfilePic");
    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    public boolean isUserIconPresent() {
        return driver.findElement(USER_ICON).isDisplayed();
    }

}
