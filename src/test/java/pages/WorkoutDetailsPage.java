package pages;

import models.Rest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkoutDetailsPage extends BasePage {

    private final static By VIEW_YOUR_WORKOUT= By.xpath("//span[text()='View and Edit your workout.']");
    private final static By ACTUAL_NAME = By.xpath("//span[@class='activityTypeName']/parent::div/following-sibling::div");
    private final static By ACTUAL_DESCRIPTION = By.xpath("//small[contains(text(),'Description:')]/ancestor::p");

    public WorkoutDetailsPage(WebDriver driver) {
        super(driver);
    }
    public Rest getWorkoutDetails(){
        Rest workoutDetails = new Rest();
        workoutDetails.setWorkoutName(getActualName());
        workoutDetails.setWorkoutDescription(getActualDescription());
        return workoutDetails;
    }
    public boolean isViewYourWorkoutPresent(){
        return driver.findElement(VIEW_YOUR_WORKOUT).isDisplayed();
    }
    public String getActualName(){
        return driver.findElement(ACTUAL_NAME).getText();
    }
    public String getActualDescription(){
        return driver.findElement(ACTUAL_DESCRIPTION).getText().split(":")[1].trim();
    }
}
