package PageObjectModule;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public  class contactUsPage extends abstracClass {
WebDriver driver;

public contactUsPage(){
    driver= Driver.getDriver();
    PageFactory.initElements(driver,this);
}

@FindBy(xpath = "//a[@title='Contact Us']")
    private WebElement contactUsButton;
public void clickContactUsButton(){

    clickFunction(contactUsButton);
}

@FindBy(name="id_contact")
    private WebElement selectHeadingDropDown;
public void selectFromDropDown(){

    selectElementFromDropDown(selectHeadingDropDown,"Webmaster");
}

@FindBy(id="email")
    private WebElement emailTextArea;
public void typeEmail(){

    sendKeysFunction(emailTextArea,"ahbilgic@hotmail.com");
}

@FindBy(id = "id_order")
    private  WebElement order;
public void typeOrderReference(){

    sendKeysFunction(order,"haluk123");
}

@FindBy(id="message")
    private WebElement messageBox;
public void typeMessage(){

    sendKeysFunction(messageBox,"Ürün kırıktır.");
}

@FindBy(id="submitMessage")
    private WebElement sendButton;
public void clickOnSendButton(){

    clickFunction(sendButton);
}

@FindBy(css = ".alert.alert-success")
    private  WebElement successMessage;
public void assertMyMessage(){

    assertion(successMessage,"Your message has been successfully sent to our team.");
}

}
