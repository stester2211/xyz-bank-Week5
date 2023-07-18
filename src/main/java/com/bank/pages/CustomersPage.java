package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class CustomersPage extends Utility
{
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Logout')]")
    WebElement actualTabLogout;
    @CacheLookup
    @FindBy(xpath ="//button[contains(text(),'Logout')]")
    WebElement clickLogout;
    @CacheLookup
    @FindBy(xpath ="//label[contains(text(),'Your Name :')]")
    WebElement actualTextYourName;
    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Deposit']")
    WebElement clickDepositTab;
    @CacheLookup
    @FindBy(xpath ="//button[normalize-space()='Withdrawl']")
    WebElement clickOnWithdrawTab;

    public void verifyTabLogout()
    {
        //verify "Logout" Tab displayed.
        boolean logoutTab= actualTabLogout.isDisplayed();
    }
    public void clickOnLogoutButton()
    {
        //click on "Logout"
        clickOnElement(clickLogout);
    }
    public String verifyTextYourName()
    {
        //verify "Your Name" text displayed.
        return getTextFromElement(actualTextYourName);
    }
    public void clickOnDepositTab()
    {
        //click on "Deposit" Tab
        clickOnElement(clickDepositTab);
    }
    public void clickOnWithdrawlTab()
    {
        //click on "Withdraw" Tab
        clickOnElement(clickOnWithdrawTab);
    }
}
