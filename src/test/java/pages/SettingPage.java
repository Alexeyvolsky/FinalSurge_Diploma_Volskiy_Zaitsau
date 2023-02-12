package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SettingPage extends BasePage   {

    private final static By USER_ICON = By.cssSelector("#EditProfile .img-avatar");
    private final static By EDIT_PROFILE_BUTTON = By.id("ProfileEditLink");

    public void waitUserIconPresent()   {
        waitForElementDisplayed(USER_ICON);
    }

    public void clickEditProfileButton()    {
        driver.findElement(EDIT_PROFILE_BUTTON);
    }
    public SettingPage(WebDriver driver) {
        super(driver);
    }
}
