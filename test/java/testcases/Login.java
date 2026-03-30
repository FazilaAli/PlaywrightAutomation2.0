package testcases;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import pages.HomePage;

import javax.sound.sampled.Port;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static config.Configuration.*;

public class Login extends BaseTest {

    @Test
    @Tag("positive")
    public void PositiveLogin(){
        // Navigate to URL
        hp.navigateToUrl(Configuration.BASE_URL);

        // Set IP and Port
        hp.submitIPAndPort(IP, PORT);

        // Set User Id
        hp.enterUserId(USERNAME);

        // Set Password
        hp.enterPassword(PASSWORD);

        // Click Sign in button
        hp.clickSignIn();

        // "Alert !"
        page.locator("//span[contains(text(),'Alert !')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Alert !')]")).isVisible();

//        // "Access Control Insights"
//        page.locator("//button[contains(text(),'Access Control Insights')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//        assertThat(page.locator("//button[contains(text(),'Access Control Insights')]")).isVisible();
    }

    @Test
    @Tag("negative")
    public void NegativeLogin(){
        // Navigate to URL
        hp.navigateToUrl(Configuration.BASE_URL);

        // Set IP and Port
        hp.submitIPAndPort(IP, PORT);

        // Set User Id
        hp.enterUserId("TestUser");

        // Set Password
        hp.enterPassword("TestPassword");

        // Click Sign in button
        hp.clickSignIn();

        // "Alert !"
        page.locator("//span[contains(text(),'Alert !')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Alert !')]")).isVisible();

        // "User ID or Password is invalid."
        page.locator("//div[contains(text(),'User ID or Password is invalid.')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'User ID or Password is invalid.')]")).isVisible();

    }

    @Test
    @Tag("negative")
    public void EmptyFieldsLogin(){
        // Navigate to URL
        hp.navigateToUrl(Configuration.BASE_URL);

        // Set IP and Port
        hp.submitIPAndPort(IP, PORT);

        // Set User Id
        hp.enterUserId("");

        // Set Password
        hp.enterPassword("");

        // Click Sign in button
        hp.clickSignIn();

        // "User ID is required"
        page.locator("//p[contains(text(),'User ID is required')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'User ID is required')]")).isVisible();

        // "Enter Password"
        page.locator("//p[contains(text(),'Enter Password')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Enter Password')]")).isVisible();
    }
}

