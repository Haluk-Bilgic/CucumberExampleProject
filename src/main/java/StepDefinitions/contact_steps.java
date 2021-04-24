package stepDefinition;


import PageObjectModule.contactUsPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.WebDriver;
import utilities.Driver;

import java.util.concurrent.TimeUnit;

public class contact_steps {
    PageObjectModule.contactUsPage contactUspage=new contactUsPage();

    private WebDriver driver;

    @Given("^Navigate to Website$")
    public void navigate_to_Website() throws Throwable {
driver= Driver.getDriver();
driver.manage().window().maximize();
        driver.get("http://automationpractice.com/index.php");
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
    }

    @Given("^Click on contact us button$")
    public void click_on_contact_us_button() throws Throwable {
contactUspage.clickContactUsButton();
    }

    @Given("^Select subject Heading$")
    public void select_subject_Heading() throws Throwable {
contactUspage.selectFromDropDown();
    }

    @Given("^Type email$")
    public void type_email() throws Throwable {
contactUspage.typeEmail();
    }

    @Given("^Type order reference$")
    public void type_order_reference() throws Throwable {
contactUspage.typeOrderReference();
    }

    @Given("^Type a message$")
    public void type_a_message() throws Throwable {
contactUspage.typeMessage();
    }

    @When("^Click on submit button$")
    public void click_on_submit_button() throws Throwable {
contactUspage.clickOnSendButton();
    }

    @Then("^Verify success message$")
    public void verify_success_message() throws Throwable {
contactUspage.assertMyMessage();
Driver.closeDriver();
    }



}
