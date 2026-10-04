package com.salesforce.tests;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginRegressionTest extends BaseTest {

    @Test(priority = 1, description = "TC-SF-LOGIN-003: Verify Salesforce login UI elements and regression integrity")
    public void testLoginRegressionUIElements() {
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.isLoginPageLoaded(), "Login page UI elements failed to load during regression run.");
        
        // Negative blank credentials check
        loginPage.login("", "");
        
        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Submitting empty credentials should trigger error validation in regression run.");
    }
}
