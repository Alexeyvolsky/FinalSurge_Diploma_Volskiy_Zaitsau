package tests;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class SettingsTest extends BaseTest  {

    @BeforeMethod
    public void login() {
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
        headerNavigate.waitSettingButtonPresent("Settings");
    }

    @Test
    public void settingsTest()  {
        headerNavigate.clickUserBoxButton("Settings");
        settingPage.waitUserIconPresent();
        settingPage.clickEditProfileButton();
    }
}
