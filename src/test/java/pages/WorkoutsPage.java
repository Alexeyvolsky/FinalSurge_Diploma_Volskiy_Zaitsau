package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkoutsPage extends BasePage{
    private final static By SIDEBAR = By.cssSelector(".aw_sidebar");
    private final static By REST_BUTTON = By.xpath("//a[@data-code='rest']");


    public WorkoutsPage(WebDriver driver) {
        super(driver);
    }
    public boolean isSidebarPresent(){
        return driver.findElement(SIDEBAR).isDisplayed();
    }
    public void clickRestButton(){
        driver.findElement(REST_BUTTON).click();
    }
}
