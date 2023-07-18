package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class BankManagerLoginPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Add Customer']")
    WebElement addCustomer;
    @CacheLookup
    @FindBy(xpath = "//button[normalize-space()='Open Account']")
    WebElement openAccountTab;
    public void clickOnAddCustomer()
    {
        //click On "Add Customer" Tab
        clickOnElement(addCustomer);
    }
    public void clickOnOpenAccountTab()
    {
        //click On "Open Account" Tab
        clickOnElement(openAccountTab);
    }
}
