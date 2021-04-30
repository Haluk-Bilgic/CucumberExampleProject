package stepDefinition;

import PageObjectModule.register_Page;
import cucumber.api.PendingException;
import cucumber.api.java.After;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class RegisterSteps {
private WebDriver driver;
    register_Page register_page=new register_Page();
    @Given("^Navigate to Websitee$")
    public void navigateToWebsitee() {
        driver= Driver.getDriver();
        driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @And("^click Sign in botton$")
    public void clickSignInBotton() {
        register_page.clickSignInButton();
    }

    @And("^type email\"([^\"]*)\"$")
    public void typeEmail(String email) throws Throwable {
        register_page.typeEmail(email);
    }

    @And("^click on Create an Account button$")
    public void clickOnCreateAnAccountButton() {
        register_page.clickOnSubmitButton();
    }

    @And("^choose title$")
    public void chooseTitle() {
    }

    @And("^type firstaname\"([^\"]*)\" and lastname\"([^\"]*)\"$")
    public void typeFirstanameAndLastname(String firstName, String lastName) throws Throwable {
       register_page.clickFirstnameAndLastname(firstName,lastName);
    }

    @And("^type password\"([^\"]*)\"$")
    public void typePassword(String password1) throws Throwable {
       register_page.typePassword(password1);
    }

    @And("^type Company\"([^\"]*)\"$")
    public void typeCompany(String company1) throws Throwable {
      register_page.typeCompany(company1);
    }

    @And("^type address\"([^\"]*)\"$")
    public void typeAddress(String address1) throws Throwable {
      register_page.typeAddress(address1);
    }

    @After
    public  void quitDriver() throws InterruptedException {
        Thread.sleep(2000);

        Driver.closeDriver();
    }
}
