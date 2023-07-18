package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomerLoginPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Login')]")
    WebElement clickLoginButton;

    public void searchCustomer()
    {
        //search customer that you created.
        selectByValueFromDropDown(searchCustomer,"1");
    }
    public void clickOnLoginButton()
    {
        //click on "Login" Button
        clickOnElement(clickLoginButton);
    }
}
