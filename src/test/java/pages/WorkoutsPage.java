package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkoutsPage extends BasePage{
    private final static By SIDEBAR = By.cssSelector(".aw_sidebar");
    private final static String ACTIVE_TYPE_BUTTON = "//a[@data-code='%s']";
    private final static String ACCORDING_INNER = "//div[@class='accordion-inner']//a[text()='%s']";


    public WorkoutsPage(WebDriver driver) {
        super(driver);
    }
    public boolean isSidebarPresent(){
        return driver.findElement(SIDEBAR).isDisplayed();
    }
    public void clickActiveTypeButton(String text){
        driver.findElement(By.xpath(String.format(ACTIVE_TYPE_BUTTON,text))).click();
    }
    public void clickAccordingInnerButton(String text){
        driver.findElement(By.xpath(String.format(ACCORDING_INNER, text))).click();
    }
}
