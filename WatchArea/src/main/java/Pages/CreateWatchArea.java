package Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.time.Duration;

public class CreateWatchArea extends WatchArea{
    //data
    String name = "automation watch area";

    //Locators
    @FindBy(xpath = "//*[@href=\"#/admin/watch-area/watch-area-list\"]")
    WebElement watch_area_tab;

    @FindBy(xpath = "//*[@class=\"fas fa-plus\"]")
    WebElement new_watch_area_button;

    @FindBy(xpath = "//*[@formcontrolname='watchAreaNameFL']")
    WebElement english_name_field;

    @FindBy(xpath = "//*[@id='dropdownTreeOrganizationUnit']")
    WebElement organization_unit;

    @FindBy(xpath = "//*[@id=\"dropdownTreeOrganizationUnit_tree_active\" and @tabindex=\"0\"]")
    WebElement organization_unit_first_element;

    @FindBy(xpath = "//*[@formcontrolname=\"watchAreaTypeId\"]")
    WebElement Type_Field;

    @FindBy(xpath = "//*[@id=\"mat-option-6\"\n]")
    WebElement first_type_option;

    @FindBy(xpath = "//*[@formcontrolname=\"latitude\"\n]")
    WebElement latitude_field;

    @FindBy(xpath = "//*[text()= 'Location Longitude']")
    WebElement longtiude_field;






    public CreateWatchArea(WebDriver driver) {
        super(driver);
    }

    public void create_new_watcharea()
    {
        super.naviagte_to_watcharea();
        watch_area_tab.click();
        new_watch_area_button.click();

    }
    public void create_watcharea_with_required_fields()
    {
       this.create_new_watcharea();
       english_name_field.sendKeys(name);
       Type_Field.click();
       first_type_option.click();
       organization_unit.click();
       organization_unit_first_element.click();
       latitude_field.click();
       longtiude_field.click();

    }
}
