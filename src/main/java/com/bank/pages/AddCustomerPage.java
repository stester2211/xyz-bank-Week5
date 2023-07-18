package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AddCustomerPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='First Name']")
    WebElement firstName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Last Name']")
    WebElement lastName;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='Post Code']")
    WebElement postCode;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickAddCustomer;
    public void enterFirstName(String fname)
    {
        //enter FirstName
        sendTextToElement(firstName,fname);
    }
    public void enterLastName(String lname)
    {
        //enter LastName
        sendTextToElement(lastName,lname);
    }
    public void enterPostCode(String postcodeNum)
    {
        //enter PostCode
        sendTextToElement(postCode,postcodeNum);
    }
    public void clickOnAddCustomer()
    {
        //click On "Add Customer" Button
        clickOnElement(clickAddCustomer);
    }
    public void verifyMessageCustomerAdded()
    {
        //verify message "Customer added successfully"
        // storing all required data one by one and then split it and compare it to verify the alert message
        String cxx="Customer";
        String added= "added";
        String successful="successfully";

        String alertMessage = driver.switchTo().alert().getText();
        String[] arr= alertMessage.split(" ");
        String cx= arr[0];
        String add= arr[1];
        String success= arr[2];

        if(cx.equalsIgnoreCase(cxx) && added.equalsIgnoreCase(add) && successful.equalsIgnoreCase(success))
        {
            System.out.println("Customer added message verify successfully");
        }
        else
        {
            System.out.println("Customer added message not found");
        }
    }
    public void acceptPopupByclickOnOKButton()
    {
        //click on "ok" button on popup.
        //This acceptAlert method is from Utility class
        acceptAlert();
    }

}
