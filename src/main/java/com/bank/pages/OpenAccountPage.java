package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class OpenAccountPage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//select[@id='userSelect']")
    WebElement searchCustomer;
    @CacheLookup
    @FindBy(xpath = "//select[@id='currency']")
    WebElement selectCurrency;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Process')]")
    WebElement clickProcess;

    public void searchCustomer(String cxName)
    {
        //Search customer that created in first test
        selectByVisibleTextFromDropDown(searchCustomer,cxName);
    }
    public void selectCurrencyPound(String currencyType)
    {
        //Select currency "Pound"
        selectByValueFromDropDown(selectCurrency,currencyType);
    }
    public void clickOnProcessButton()
    {
        //click on "process" button
        clickOnElement(clickProcess);
    }
    public void verifyMessageAccountCreated()
    {
        //verify message "Account created successfully"
        // storing all required data one by one and then split it and compare it to verify the alert message
        String acc="Account";
        String create= "created";
        String success="successfully";

        String alertMessage = driver.switchTo().alert().getText();
        String[] arr= alertMessage.split(" ");
        String account= arr[0];
        String created= arr[1];
        String successfully= arr[2];

        if(account.equalsIgnoreCase(acc) && created.equalsIgnoreCase(create) && success.equalsIgnoreCase(successfully))
        {
            System.out.println("Account created successfully message verify successfully");
        }
        else
        {
            System.out.println("Account created message not found");
        }
    }
    public void acceptPopupByClickingOk()
    {
        //click on "ok" button on popup.
        //This acceptAlert method is from Utility class
        acceptAlert();
    }
}
