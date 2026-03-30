package testcases;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import utils.Utility;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static config.Configuration.*;

public class Signup extends BaseTest {

    @Test
    @Tag("positive")
    public void PositiveSignup() {
        // Navigate to URL
        hp.navigateToUrl(Configuration.BASE_URL);

        // Set IP and Port
        hp.submitIPAndPort(IP, PORT);

        // Click Request an Account
        hp.clickRequestAccount();

        // Generate random user id
        String userId = Utility.generateRandomUserId();

        // Set User Id
        hp.enterUserId(userId);

        // Set User Name
        hp.enterUserName("TestUser");

        // Set Password
        hp.enterPassword("TestUser12+");

        // Click Next button
        hp.clickSignIn();

        // Set Email Address
        hp.setEmail(Utility.generateRandomYopmailEmail());

        // Set Phone number
        hp.enterPhone(Utility.generateRandomPhoneNumber());

        // Click Next button
        hp.clickSignIn();

        // "Your request has been successfully submitted."
        page.locator("//p[contains(text(),'Your request has been successfully submitted.')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Your request has been successfully submitted.')]")).isVisible();

    }

    @Test
    @Tag("negative")
    public void NegativeSignup() {

        // Navigate to URL
        hp.navigateToUrl(Configuration.BASE_URL);

        // Set IP and Port
        hp.submitIPAndPort(IP, PORT);

        // Click Request an Account
        hp.clickRequestAccount();

        // Click Next button
        hp.clickSignIn();

        // "User ID is required."
        page.locator("//p[contains(text(),'User ID is required.')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'User ID is required.')]")).isVisible();
        // "Full Name is required."
        page.locator("//p[contains(text(),'Full Name is required.')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Full Name is required.')]")).isVisible();
        // "Password is required."
        page.locator("//p[contains(text(),'Password is required.')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Password is required.')]")).isVisible();

        // Set User Id
        hp.enterUserId(" ");

        // "No spaces or special characters allowed in username."
        page.locator("(//div[contains(text(),'No spaces or special characters allowed in username.')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[contains(text(),'No spaces or special characters allowed in username.')])[1]")).isVisible();

        // Set User Id
        hp.enterUserId("@");

        // "No spaces or special characters allowed in username."
        page.locator("(//div[contains(text(),'No spaces or special characters allowed in username.')])[2]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[contains(text(),'No spaces or special characters allowed in username.')])[2]")).isVisible();

        // Set User Id
        hp.enterUserId("123");

        // "User ID must be at least 8 characters."
        page.locator("(//p[contains(text(),'User ID must be at least 8 characters.')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//p[contains(text(),'User ID must be at least 8 characters.')])[1]")).isVisible();

        // Generate random user id
        String userId = Utility.generateRandomUserId();

        // Set User Id
        hp.enterUserId(userId);

        // Set User Name
        hp.enterUserName("1");

        // "Only alphabets and spaces are allowed in name."
        page.locator("(//div[contains(text(),'Only alphabets and spaces are allowed in name.')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[contains(text(),'Only alphabets and spaces are allowed in name.')])[1]")).isVisible();

        // Set User Name
        hp.enterUserName("@");

        // "Only alphabets and spaces are allowed in name."
        page.locator("(//div[contains(text(),'Only alphabets and spaces are allowed in name.')])[2]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[contains(text(),'Only alphabets and spaces are allowed in name.')])[2]")).isVisible();

        // Set User Name
        hp.enterUserName("TestUser");

        // Set Password
        hp.enterPassword(" ");

        // "Spaces are not allowed in password."
        page.locator("//div[contains(text(),'Spaces are not allowed in password.')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Spaces are not allowed in password.')]")).isVisible();

        // Set Password
        hp.enterPassword("TestUser12+");

        // Click Next button
        hp.clickSignIn();

        // Click Next button
        hp.clickSignIn();

        // "Email is required."
        page.locator("//p[contains(text(),'Email is required.')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Email is required.')]")).isVisible();

        // "Phone Number is required"
        page.locator("//p[contains(text(),'Phone Number is required')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Phone Number is required')]")).isVisible();

        // Set Email Address
        hp.setEmail("@");

        // "Invalid email address."
        page.locator("//p[contains(text(),'Invalid email address.')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Invalid email address.')]")).isVisible();

        // Set Email Address
        hp.setEmail(Utility.generateRandomYopmailEmail());

        // Set Phone number
        hp.enterPhone(Utility.generateRandomPhoneNumber());

        // Click Next button
        hp.clickSignIn();

        // "Your request has been successfully submitted."
        page.locator("//p[contains(text(),'Your request has been successfully submitted.')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Your request has been successfully submitted.')]")).isVisible();

    }

}

