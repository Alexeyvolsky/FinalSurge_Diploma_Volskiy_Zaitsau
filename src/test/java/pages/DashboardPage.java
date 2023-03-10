package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class DashboardPage extends BasePage{
    private final static By USER_ICON = By.id("LayoutProfilePic");
    private final static By LOGOUT_BUTTON = By.xpath("//a[text()='Logout']");
    private final static By WORKOUTS_MENU = By.xpath("//a[text()='Workouts']");
    private final static String WORKOUTS_BUTTONS = "//a[text()='%s']";

    public DashboardPage(WebDriver driver) {
        super(driver);
    }
    public boolean isUserIconPresent() {
        return driver.findElement(USER_ICON).isDisplayed();
    }
    public void clickLogoutButton(){
        driver.findElement(LOGOUT_BUTTON).click();
    }
    public void moveToWorkoutsMenu(){
        Actions actions =new Actions(driver);
        actions.moveToElement(driver.findElement(WORKOUTS_MENU)).perform();
    }
    public void clickWorkoutsButton(String text){
        driver.findElement(By.xpath(String.format(WORKOUTS_BUTTONS, text))).click();
    }
}
