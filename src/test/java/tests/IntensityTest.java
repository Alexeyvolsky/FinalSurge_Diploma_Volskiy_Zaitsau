package tests;

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
        intensity.fillForm();
        intensity.clickCalculatePaces();
        Assert.assertTrue(baseModal.isGreenBoxDisplay());
    }
}