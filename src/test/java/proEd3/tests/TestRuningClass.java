package proEd3.tests;

import com.github.javafaker.Faker;
import org.testng.Assert;
import org.testng.annotations.Test;
import proEd3.pages.HomePAge;
import proEd3.pages.LoginPage;
import proEd3.pages.SuccessLoginPage;
import proEd3.utilities.ConfigReader;
import proEd3.utilities.Driver;
import proEd3.utilities.ReusableMethods;

public class TestRuningClass {
    HomePAge homePage;
    LoginPage loginPage;
    SuccessLoginPage successLoginPage;

    //To produce a fake username and password
    Faker faker;

    @Test
    public void positiveLogin(){
        successLoginPage=new SuccessLoginPage();
        homePage=new HomePAge();
        loginPage=new LoginPage();

        Driver.getDriver().get(ConfigReader.getProperty("app_Url"));
        homePage.homeLoginButton.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("admin_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("admin_password"));
        loginPage.submitButton.click();

        /* Verification
         */
        Assert.assertTrue(successLoginPage.userIDLoged.isDisplayed());
       // Driver.closeDriver();
    }


    @Test
    public void customerLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("app_Url"));

        successLoginPage=new SuccessLoginPage();
        homePage=new HomePAge();
        loginPage=new LoginPage();


        homePage.homeLoginButton.click();
        loginPage.username.sendKeys(ConfigReader.getProperty("customer_username"));
        loginPage.password.sendKeys(ConfigReader.getProperty("customer_password"));
        loginPage.submitButton.click();

        /* Verification
         */
        Assert.assertTrue(SuccessLoginPage.userIDLoged.isDisplayed());
        //Driver.closeDriver();
    }

    @Test
    public void failureLogin(){
        Driver.getDriver().get(ConfigReader.getProperty("app_Url"));

        homePage=new HomePAge();
        loginPage=new LoginPage();
        faker  =new Faker();


        homePage.homeLoginButton.click();
        loginPage.username.sendKeys(faker.internet().emailAddress());
        loginPage.password.sendKeys(faker.internet().password());
        loginPage.submitButton.click();

        /* Verification
         */
        ReusableMethods.waitForVisibility(loginPage.invalidCredsErrorMessage,5);
        Assert.assertTrue(loginPage.invalidCredsErrorMessage.isDisplayed());

    }
}
