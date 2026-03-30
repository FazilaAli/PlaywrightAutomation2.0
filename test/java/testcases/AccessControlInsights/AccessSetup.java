package testcases.AccessControlInsights;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;
import utils.Utility;

import java.util.regex.Pattern;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AccessSetup extends BaseTest {

    @Test
    public void AccessSetup() {

        // Login
        hp.Login();

        hp.clickAccessControls();

        hp.clickAccessSetups();

        // Title Assertion
        page.locator("//p[text()='List of Access Level']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[text()='List of Access Level']")).isVisible();
        System.out.println("Title Verified Successfully.");

        // Wait For Rights Data Fetching
        page.waitForTimeout(3000);
        // Click Add Record
        hp.clickAddRecord();

        // Generate random user id
        String accesslevel = Utility.generateRandomAccessLevel();

        // Set Access Level
        ac.enterAccessLevelTitle(accesslevel);

        // Select Status
        ac.clickInactiveStatus();

        // Click Save
        ac.clickSave();

        // Set Secondary Access Level
        ac.enterSecondaryTitle(accesslevel);

        // Click Save
        ac.clickSave();

        page.locator("//div[contains(text(),'The record for')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'The record for')]")).isVisible();
        page.locator("//div[contains(text(),'has been created successfully.')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'has been created successfully.')]")).isVisible();
        System.out.println("Record Saving Verified Successfully.");

        // Set Access Level for Search
        ac.enterSearchInput(accesslevel);

        // Click search
        ac.clickSearchButton();

        // Serach not working --- https://dev.azure.com/SAM-Controls/Digital%20Faciliter/_workitems/edit/1596
//        Locator rows = page.locator("//table[contains(@class,'p-datatable-table')]//tbody/tr");
//        // wait for 1 row to appear
//        rows.first().waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//        // assert exactly 1 row exists
//        assertThat(rows).hasCount(1);
//        System.out.println("One Row on Display Verified Successfully.");

        page.locator("//td[contains(text(),'" + accesslevel + "')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[contains(text(),'" + accesslevel + "')]")).isVisible();
        System.out.println("Record Existence Verified Successfully.");

//        Locator toggle = page.locator("//div[@class='p-inputswitch p-component']");
//        assertThat(toggle).hasAttribute("aria-checked", "false");
//        System.out.println("Status Inactive Verified Successfully.");

        // Update status
        ac.clickInputSwitch();

        // Assert Status Update --- https://dev.azure.com/SAM-Controls/Digital%20Faciliter/_workitems/edit/1630
//        Locator toggle = page.locator("//div[@class='p-inputswitch p-component']");
//        assertThat(toggle).hasAttribute("aria-checked", "true");
//        System.out.println("Status Active Verified Successfully.");

        // Click on Edit Icon
        ac.clickEditIcon();

        // Select Status
        ac.clickInactiveStatus();

        // Click Save
        ac.clickSave();

        page.locator("//div[contains(text(),'The record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'The record [')]")).isVisible();
        page.locator("//div[contains(text(),'] has been successfully updated in the system.')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'] has been successfully updated in the system.')]")).isVisible();
        System.out.println("Record Update Verified Successfully.");

        // Delete Record
        ac.clickDeleteIcon();
        ac.clickDelete();

        page.locator("//div[contains(text(),'Deleting record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Deleting record [')]")).isVisible();
        System.out.println("Record Delete Verified Successfully.");

//        // "No available options"
//        page.locator("//td[contains(text(),'No available options')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//        assertThat(page.locator("//td[contains(text(),'No available options')]")).isVisible();
//        System.out.println("No available options Verified Successfully.");

    }

}

