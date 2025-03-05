package Base;

import Pages.CreateWatchArea;
import Pages.LoginPage;
import Pages.WatchArea;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import java.time.Duration;

public class BaseTest {
    //attributes
    protected  String test_url = "https://watcharea-aramco02.3i-vision.com/#/authentication/signin";
    protected WebDriver driver;
    protected static LoginPage login;
    protected static CreateWatchArea create_watcharea;


    //constructor1
    public BaseTest()
    {
    }

    @BeforeMethod
    public void browser_setup()
    {
        driver = new ChromeDriver();
        WebDriverManager.chromedriver().setup();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(9000));
        driver.get(test_url);
        login = new LoginPage(driver);
        create_watcharea = new CreateWatchArea(driver);

    }


    @AfterMethod
    public void tearDown()
    {
        driver.close();
    }

}
