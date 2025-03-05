package Pages;

import Base.BasePage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage extends BasePage {
    //variables
    private String mail = "admin@watcharea-aramco02.com";
    private String password = "test";
    WebDriver driver;

    //Locators
    @FindBy(xpath = "//*[@formcontrolname='userName']")
    WebElement mail_text_field;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement mail_submit_button;

    @FindBy(xpath = "//*[@formcontrolname='password']")
    WebElement password_text_field;

    @FindBy(xpath = "//*[@type='submit']")
    WebElement password_submit_button;

    //Assertions
    @FindBy(xpath= "//*[@id=\"mat-tab-label-0-0\"]/span[2]/span/span/span")
    WebElement profile_assert;

    public String profile_assert_result;

    //constructor
    public LoginPage(WebDriver driver) {
        super(driver);
        PageFactory.initElements(driver, this);

    }

    public  void enter_mail()
    {
        mail_text_field.sendKeys(mail);
        mail_submit_button.click();
    }

    public  void enter_password()
    {
        password_text_field.sendKeys(password);
        password_submit_button.click();
        profile_assert_result = profile_assert.getText();
    }


}
