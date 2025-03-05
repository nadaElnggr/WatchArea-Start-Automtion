package Base;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class BasePage {
    //vars
    protected WebDriver driver;

    //constructor 1
    public BasePage(WebDriver driver)
    {
        this.driver=driver;

    }

}


