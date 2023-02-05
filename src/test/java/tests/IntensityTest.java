package tests;


import enums.SelectEvent;
import models.WorcoutCalculators.Intensity;
import org.testng.Assert;
import org.testng.annotations.Test;

public class IntensityTest extends BaseTest {

    @Test
    public void positiveIntensityTest() {
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
        headerNavigate.clickWorkoutCalculateButton();
        driver.switchTo().frame("IntensityCalciFrame");
        Intensity intensityValue = Intensity.builder().setHours("0").setMinutes("12").setSeconds("12").setSelectEvent(SelectEvent.MILE).build();
        intensity.fillForm(intensityValue);
        intensity.clickCalculatePaces();
        Assert.assertTrue(baseModal.isGreenBoxDisplay());
        driver.switchTo().defaultContent();
    }
}