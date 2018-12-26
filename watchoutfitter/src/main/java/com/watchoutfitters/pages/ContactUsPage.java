package com.watchoutfitters.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class ContactUsPage {

    @FindBy(xpath = "/html/body/div[5]/div[2]/div[2]/ul/li[3]/a")
    private WebElement contactUsLink;

    @FindBy(xpath = "//h1[@class='collection_title']")
    private WebElement title;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[1]/div[1]/div/input")
    private WebElement funame;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[1]/div[2]/div/input")
    private WebElement email;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[1]/div[3]/div/textarea")
    private WebElement message;

    @FindBy(xpath = "//*[@id=\"_form_1_\"]/div[3]/a")
    private WebElement activeCampaignLink;

    @FindBy(xpath = "//*[contains(text(),'help-c')]")
    private WebElement helpCenterLink;



    @FindBy(id = "_form_1_submit")
    private WebElement submitButton;

    public void ContactusPage(){
        contactUsLink.click();
        String text = title.getText();
        Assert.assertEquals(text,"CONTACT US");
        System.out.println("Contact Us page is displayed");
        funame.sendKeys("Ziyad Hussain");
        email.sendKeys("hussain.ziyad90@gmail.com");
        message.sendKeys("Hi this is a test case");
        submitButton.click();
        Assert.assertEquals(false,submitButton.isEnabled());
        System.out.println("Submit button is not clickable");
        helpCenterLink.click();
        Assert.assertEquals(true,helpCenterLink.isEnabled());




    }



}

