package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest{
    @Test
    public void pozitiveLoginTest(){
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
        Assert.assertTrue(dashboardPage.isUserIconPresent());
    }
}
