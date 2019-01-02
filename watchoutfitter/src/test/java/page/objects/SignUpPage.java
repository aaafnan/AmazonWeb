package page.objects;

import base.BrowserDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import reporting.TestLogger;

public class SignUpPage extends BrowserDriver {


    @FindBy(className = "icon-account")
    private WebElement myAccountIcon;

    @FindBy(xpath = "//*[@id=\"customer_register_link\"]")
    private WebElement signUpLink;

    @FindBy(name = "customer[first_name]")
    private WebElement fName;

    @FindBy(xpath = "//*[contains(@name,'las')]")
    private WebElement lName;

    @FindBy(name= "customer[email]")
    private WebElement email;

    @FindBy(name = "customer[password]")
    private WebElement pass;

    @FindBy(xpath = "//*[@id=\"create_customer\"]/div[5]/input")
    private WebElement signUpButton;

    public void signUpPage() throws InterruptedException {
        myAccountIcon.click();
        signUpLink.click();
        fName.sendKeys("hamad");
        lName.sendKeys("hussain");
        email.sendKeys("hamad@yahoo.com");
        pass.sendKeys("khan12");
        signUpButton.click();
        TestLogger.log("user landed on Homepage");


    }
}