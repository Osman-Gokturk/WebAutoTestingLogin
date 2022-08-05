package proEd3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proEd3.utilities.Driver;

public class SuccessLoginPage {

    public void SuccessLoginPage(){
        PageFactory.initElements(Driver.getDriver(),this);
    }

    @FindBy(xpath = "//button[@id='dropdown-basic-button]")
    public static WebElement userIDLoged;
}