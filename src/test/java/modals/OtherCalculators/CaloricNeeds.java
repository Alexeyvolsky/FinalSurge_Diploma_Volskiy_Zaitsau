package modals.OtherCalculators;

import elements.Input;
import elements.RadioButton;
import modals.BaseModal;
import org.openqa.selenium.WebDriver;

public class CaloricNeeds extends BaseModal {

    public void fillForm(models.OtherCalculators.CaloricNeeds caloricNeeds)  {
        new Input(driver).setValue("Weight", caloricNeeds.getWeight());
        new RadioButton(driver).clickRadiobutton(caloricNeeds.getWeightType().getName());
        new Input(driver).setValue("HeightInchCent", caloricNeeds.getHeight());
        new RadioButton(driver).clickRadiobutton(caloricNeeds.getHeightType().getName());
        new Input(driver).setValue("Age", caloricNeeds.getAge());
        new RadioButton(driver).clickRadiobutton(caloricNeeds.getGender().getName());
        new Input(driver).setValue("RunDist", caloricNeeds.getRunDistance());
        new RadioButton(driver).clickRadiobutton(caloricNeeds.getDistTypeCaloricNeeds().getName());
    }

    public CaloricNeeds(WebDriver driver) {
        super(driver);
        this.GREEN_BOX = "//*[contains(text(), \"%s\")]";
    }
}