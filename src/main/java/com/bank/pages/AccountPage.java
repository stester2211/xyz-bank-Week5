package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class AccountPage extends Utility
{
    // - store Transaction, deposit and withdraw.
    @CacheLookup
    @FindBy(xpath ="//input[@placeholder='amount']")
    WebElement enterAmount;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickDepositButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement actualTextDepositSuccessFully;
    @CacheLookup
    @FindBy(xpath = "//input[@placeholder='amount']")
    WebElement enterWithdrawAmount;
    @CacheLookup
    @FindBy(xpath = "//button[@type='submit']")
    WebElement clickOnWithdrawButton;
    @CacheLookup
    @FindBy(xpath = "//span[@class='error ng-binding']")
    WebElement actualTextTransactionSuccessful;

    public void enterTheAmount(String amount)
    {
        //Enter amount 100
        sendTextToElement(enterAmount,amount);
    }
    public void clickDepositButton()
    {
        //click on "Deposit" Button
        clickOnElement(clickDepositButton);
    }
    public String verifySuccessfulMessage()
    {
        //verify message "Deposit Successful"
        return getTextFromElement(actualTextDepositSuccessFully);
    }
    public void enterWithdrawAmount(String withdrawAmount)
    {
        // Enter amount 50
        sendTextToElement(enterWithdrawAmount,withdrawAmount);
    }
    public void clickOnWithdrawButton()
    {
        //click on "Withdraw" Button
        clickOnElement(clickOnWithdrawButton);
    }
    public String verifyTransactionSuccessfulMessage()
    {
        //verify message "Transaction Successful"
        return getTextFromElement(actualTextTransactionSuccessful);
    }
}
