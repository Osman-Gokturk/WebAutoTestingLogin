package proEd3.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import proEd3.utilities.Driver;

public class LoginPage {

    public LoginPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(id="formBasicEmail")
    public WebElement username;

    @FindBy(id="formBasicPassword")
    public WebElement password;

    @FindBy(xpath="//button[@type='submit']")
    public WebElement submitButton;

    /*
    pop-up for wron credentials
     */
    @FindBy(xpath="//*[text()='invalid credentials']")
    public WebElement invalidCredsErrorMessage;
}
