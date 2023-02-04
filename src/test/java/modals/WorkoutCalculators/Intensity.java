package modals.WorkoutCalculators;

import elements.Input;
import elements.RadioButton;
import modals.BaseModal;
import org.openqa.selenium.WebDriver;

public class Intensity extends BaseModal {

    public Intensity fillForm()  {
        new RadioButton(driver).clickRadiobutton(" Marathon");
        new Input(driver, "TimeHH").setValue("2");
        new Input(driver, "TimeMM").setValue("10");
        new Input(driver, "TimeSS").setValue("10");
        return this;
    }

    public void clickCalculatePaces()   {
        driver.findElement(CALCULATE_PACES).click();
    }
    public Intensity(WebDriver driver) {
        super(driver);
    }
}
