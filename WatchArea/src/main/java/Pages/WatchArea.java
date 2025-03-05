package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class WatchArea extends BasePage {
    //Driver
    WebDriver driver;
    //Locators
    @FindBy(xpath = "//*[@src=\"assets/images/IconsMenu/watch-area.png\"]")
    WebElement watch_area_button;


    public WatchArea(WebDriver driver)
    {
        super(driver);
        PageFactory.initElements(driver, this);
    }

    public void naviagte_to_watcharea()
    {
        watch_area_button.click();

    }
}
