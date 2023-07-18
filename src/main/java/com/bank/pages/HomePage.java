package com.bank.pages;

import com.bank.utilities.Utility;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;

public class HomePage extends Utility
{
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Bank Manager Login')]")
    WebElement loginButton;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Customer Login')]")
    WebElement customerLogin;

    public void ClickOnBankMangerLoginButton()
    {
        //click On "Bank Manager Login" Tab
        clickOnElement(loginButton);
    }
    public void clickOnCustomerLoginTab()
    {
        //click on "Customer Login" Tab
        clickOnElement(customerLogin);
    }

}
