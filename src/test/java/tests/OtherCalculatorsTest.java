package tests;

import enums.*;
import models.OtherCalculators.CaloricNeeds;
import models.OtherCalculators.PaceCalculator;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class OtherCalculatorsTest extends BaseTest  {

    @BeforeMethod
    public void login() {
        loginPage.setEmailInput(USERNAME);
        loginPage.setPasswordInput(PASSWORD);
        loginPage.clickLoginButton();
    }

    @Test
    public void positivePaceCalculatorTest()    {
        headerNavigate.clickOtherCalculatorsButton();
        baseModal.openIframe("OtherCalciFrame");
        baseModal.clickCalculatorType("Pace Calculator");
        PaceCalculator paceCalculatorValue = PaceCalculator.builder().setRunDistance("10")
                .setDistTypePaceCalculator(DistTypePaceCalculator.KILOMETERS).setHours("1").setMinutes("5")
                .setSeconds("43").build();
        paceCalculator.fillForm(paceCalculatorValue);
        baseModal.clickCalculatePaces("saveButtonSettings");
        Assert.assertTrue(baseModal.isGreenBoxDisplay("Pace Chart"));
    }

    @Test
    public void positiveCaloricNeedsTest()  {
        headerNavigate.clickOtherCalculatorsButton();
        baseModal.openIframe("OtherCalciFrame");
        CaloricNeeds caloricNeedsValue = CaloricNeeds.builder().setWeight("87").setWeightType(WeightType.KG)
                .setHeight("180").setHeightType(HeightType.CENTIMETERS).setAge("23").setGender(Gender.MALE_CALORIC_NEEDS)
                .setRunDistance("10").setDistTypeCaloricNeeds(DistTypeCaloricNeeds.KILOMETERS).build();
        caloricNeeds.fillForm(caloricNeedsValue);
        baseModal.clickCalculatePaces("saveButtonSettings");
        Assert.assertTrue(baseModal.isGreenBoxDisplay("Today's Caloric Needs"));
    }
}