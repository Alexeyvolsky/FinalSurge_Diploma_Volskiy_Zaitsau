package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void positiveLoginTest() {
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertTrue(dashboardPage.isUserIconPresent());
    }
}
