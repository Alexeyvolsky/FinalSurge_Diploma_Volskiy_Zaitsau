package tests;

import io.github.bonigarcia.wdm.WebDriverManager;
import modals.BaseModal;
import modals.WorkoutCalculators.Intensity;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import pages.DashboardPage;
import pages.HeaderNavigate;
import pages.LoginPage;
import pages.WorkoutsPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
    protected final static String BASE_URL = "https://log.finalsurge.com/";
    protected final static String USERNAME = "aleksvolsky@gmail.com";
    protected final static String PASSWORD = "1234567890QwE";
    protected WebDriver driver;
    protected LoginPage loginPage;
    protected DashboardPage dashboardPage;
    protected WorkoutsPage workoutsPage;
    protected HeaderNavigate headerNavigate;
    protected Intensity intensity;
    protected BaseModal baseModal;
    @BeforeClass(alwaysRun = true)
    public void setUp(){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
//        options.addArguments("--headless");
        options.addArguments("--ignore-certificate-errors");
        options.addArguments("--disable-popup-blocking");
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        loginPage = new LoginPage(driver);
        dashboardPage = new DashboardPage(driver);
        workoutsPage = new WorkoutsPage(driver);
        headerNavigate = new HeaderNavigate(driver);
        intensity = new Intensity(driver);
        baseModal = new BaseModal(driver);
    }
    @BeforeMethod(alwaysRun = true)
    public void navigate() {
        driver.get(BASE_URL);
    }
    @AfterClass(alwaysRun = true)
    public void tearDown() {
        driver.quit();
    }

}
