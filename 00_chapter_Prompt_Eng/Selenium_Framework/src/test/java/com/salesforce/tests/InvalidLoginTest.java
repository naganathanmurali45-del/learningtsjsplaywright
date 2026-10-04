package com.salesforce.tests;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class InvalidLoginTest extends BaseTest {

    @Test(priority = 1, description = "TC-SF-LOGIN-002: Verify invalid login rejected with error message using synthetic random user ID")
    public void testInvalidLoginWithRandomCredentials() {
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.isLoginPageLoaded(), "Login page failed to load.");

        String randomUser = generateRandomUsername();
        String randomPassword = generateRandomPassword();

        loginPage.login(randomUser, randomPassword);

        Assert.assertTrue(loginPage.isErrorMessageDisplayed(), "Error message container should be visible for invalid login.");
        
        String actualErrorMessage = loginPage.getErrorMessageText();
        Assert.assertTrue(actualErrorMessage.contains("Please check your username and password"), 
                "Expected error message text not found. Actual: " + actualErrorMessage);
    }
}
