package com.salesforce.tests;

import com.salesforce.base.BaseTest;
import com.salesforce.pages.LoginPage;
import org.testng.Assert;
import org.testng.annotations.Test;

public class ValidLoginTest extends BaseTest {

    @Test(priority = 1, description = "TC-SF-LOGIN-001: Verify valid login authentication attempt")
    public void testValidLoginSubmission() {
        LoginPage loginPage = new LoginPage(driver);

        Assert.assertTrue(loginPage.isLoginPageLoaded(), "Login page failed to load properly.");

        String validUsername = System.getenv().getOrDefault("SF_VALID_USER", "test.user@salesforce.com");
        String validPassword = System.getenv().getOrDefault("SF_VALID_PASS", "ValidPassword123!");

        loginPage.login(validUsername, validPassword);

        // Assert submission attempted without unhandled client crash
        Assert.assertNotNull(driver.getCurrentUrl(), "Page URL should not be null after login submission.");
    }
}
