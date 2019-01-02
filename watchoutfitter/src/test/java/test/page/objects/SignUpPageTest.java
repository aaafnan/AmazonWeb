package test.page.objects;

import base.BrowserDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import page.objects.SignUpPage;

public class SignUpPageTest extends BrowserDriver {

    SignUpPage objOfSignUpPage=null;

    @BeforeMethod
    public void initializationOfElements(){
        objOfSignUpPage= PageFactory.initElements(driver,SignUpPage.class);
        System.out.println("succesfully created Account");
    }

    @Test
    public void SignUpTest() throws InterruptedException {
        objOfSignUpPage.signUpPage();
    }
}

