package testcases.Configuration;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class DevicesSettings extends BaseTest {

    @Test
    public void Devices() {

        // Login
        hp.Login();

        hp.clickConfiguration();

        hp.clickSystemHierarchy();

        hp.clickDevices();

        // Title assertion
        page.locator("//p[text()='List of Devices']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[text()='List of Devices']")).isVisible();
        System.out.println("Title Verified Successfully.");

        page.waitForTimeout(5000);

        // Set Access Level for Search
        ac.enterSearchInput("Automation");

        page.waitForTimeout(2000);

        // Click search
        ac.clickSearchButton();

        page.waitForTimeout(5000);

        // Delete Record
        atr.clickDeleteIcon("Automation");
        at.clickDelete();

        // Verify deleting toaster
        page.locator("//div[contains(text(),'Deleting record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Deleting record [')]")).isVisible();
        System.out.println("Record Delete Verified Successfully.");

        // Click Add Record
        hp.clickAddRecord();
        page.waitForTimeout(5000);

        ds.enterDeviceTitle("Automation");

        us.clickSave();

        ds.enterSecondaryTitle("Automation");

        us.clickSave();

        us.clickSave();

        page.locator("//div[contains(text(),'The record has been created successfully in the system.')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'The record has been created successfully in the system.')]")).isVisible();
        System.out.println("Record Creation Verified Successfully.");

        page.waitForTimeout(2000);

        // Verify active toggle
        Locator toggle3 = page.locator("//tr[./td[normalize-space()='Automation']]//input[@type='checkbox' and @aria-checked='true']");
        assertThat(toggle3).isVisible();
        System.out.println("Status Active Verified Successfully.");

        us.clickStatus3("Automation");

        // Verify updating toaster
        page.locator("//div[contains(text(),'Record Updated Successfully')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record Updated Successfully')]")).isVisible();

        // Verify inactive toggle
        Locator toggle4 = page.locator("//tr[./td[normalize-space()='Automation']]//input[@type='checkbox' and @aria-checked='false']");
        assertThat(toggle4).isVisible();
        System.out.println("Status InActive Verified Successfully.");

        // Click Edit
        atr.clickEditIcon("Automation");

        // Wait For Rights Data Fetching
        page.waitForTimeout(3000);

        ss.clickDropdownStatus();

        ss.clickOptionActive();

        // Click Save
        us.clickSave();

        // Verify updating toaster
        page.locator("//div[contains(text(),'Record Updated Successfully')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record Updated Successfully')]")).isVisible();

        // Verify active toggle
        Locator toggle5 = page.locator("//tr[./td[normalize-space()='Automation']]//input[@type='checkbox' and @aria-checked='true']");
        assertThat(toggle5).isVisible();
        System.out.println("Status Active Verified Successfully.");

    }

}

