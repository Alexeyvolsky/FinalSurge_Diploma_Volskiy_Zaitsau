package pages;

import models.Hills;
import models.Rest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class WorkoutDetailsPage extends BasePage {

    private final static By VIEW_YOUR_WORKOUT= By.xpath("//span[text()='View and Edit your workout.']");
    private final static By ACTUAL_NAME = By.xpath("//span[@class='activityTypeName']/parent::div/following-sibling::div");
    private final static By ACTUAL_DESCRIPTION = By.xpath("//small[contains(text(),'Description:')]/ancestor::p");
    private final static String ACTUAL_WORKOUT_STATISTICS = "//div[@class='formSep']//span[@class='%s']";

    public WorkoutDetailsPage(WebDriver driver) {
        super(driver);
    }
    public Rest getWorkoutDetailsRest(){
        Rest workoutDetailsRest = new Rest();
        workoutDetailsRest.setWorkoutName(getActualName());
        workoutDetailsRest.setWorkoutDescription(getActualDescription());
        return workoutDetailsRest;

    }
//    public Hills getWorkoutDetailsHills(){
//        Hills workoutDetailsHills = new Hills();
//        workoutDetailsHills.setWorkoutName(getActualName());
//        workoutDetailsHills.setWorkoutDescription(getActualDescription());
//    }
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
