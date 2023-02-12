package modals;

import elements.Input;
import elements.TextArea;
import models.Rest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class AddNewWorkoutModal extends BaseModal{
    private final static By ADD_WORKOUT_BUTTON=By.id("saveButton");

    public void fillform(Rest workout){
        new Input(driver).clearAndSetValue("WorkoutDate", workout.getDate());
//        new Input(driver).setValue("WorkoutTime");
        new Input(driver).setValue("Name", workout.getWorkoutName());
        new TextArea(driver).setValue("Desc", workout.getWorkoutDescription());
    }
    public AddNewWorkoutModal(WebDriver driver) {
        super(driver);
    }
    public void clickAddWorkoutButton(){
        driver.findElement(ADD_WORKOUT_BUTTON).click();
    }
}
