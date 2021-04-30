package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class register_Page extends BasePage {

private WebDriver driver;

public  register_Page(){
    driver= Driver.getDriver();
    PageFactory.initElements(driver,this);
}

@FindBy(css = ".login")
    private WebElement SignInButton;

@FindBy(name = "email_create")
    private  WebElement emailTextBox;

@FindBy(css = "#SubmitCreate")
    private  WebElement submitButton;

@FindBy(css = "#id_gender1")
private WebElement gender;

@FindBy(id = "customer_firstname")
private  WebElement firstname;

@FindBy(id = "customer_lastname")
private WebElement lastname;

@FindBy(name = "passwd")
private WebElement password;

@FindBy(id = "company")
private WebElement company;

@FindBy(name = "address1")
private WebElement address;



public void clickSignInButton(){
    clickFunction(SignInButton);
}
public void typeEmail(String email){
    sendKeysFunction(emailTextBox,email);
}
public void clickOnSubmitButton(){
    clickFunction(submitButton);
}
public void clickOnGender(){
    clickFunction(gender);
}
public void clickFirstnameAndLastname(String firstName,String lastName){
    sendKeysFunction(firstname,firstName);
    sendKeysFunction(lastname,lastName);
}
public void typePassword(String password1){
    sendKeysFunction(password,password1);
}
public void typeCompany(String company1){
    sendKeysFunction(company,company1);
}
public void typeAddress(String address1){
    sendKeysFunction(address,address1);
}

}
