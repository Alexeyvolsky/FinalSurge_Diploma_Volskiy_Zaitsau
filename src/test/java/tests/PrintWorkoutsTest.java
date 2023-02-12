package tests;

import models.PrintWorkout;
import org.testng.annotations.Test;

public class PrintWorkoutsTest extends BaseTest {

    @Test
    public void positivePrintWorkoutTest()  {
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
        headerNavigate.clickPrintWorkoutButton();
        baseModal.openIframe("PrintWorkoutsiFrame");
        PrintWorkout printWorkoutValue = PrintWorkout.builder().setStartingData("02/01/2023").setEndingData("02/20/2023").build();
        printWorkouts.fillForm(printWorkoutValue);
        baseModal.clickCalculatePaces("saveButtonPrint");
    }
}
