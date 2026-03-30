package testcases.AttendanceInsights;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;
import utils.Utility;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AttendanceSetup extends BaseTest {

    @Test
    public void AttendanceSetup() {

        // Login
        hp.Login();

        hp.clickAttendanceControls();

        hp.clickAttendanceSetups();

        // Title Assertion
        page.locator("//p[text()='List of Attendance Type']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[text()='List of Attendance Type']")).isVisible();
        System.out.println("Title Verified Successfully.");

        // Wait For Rights Data Fetching
        page.waitForTimeout(3000);
        
        // Click Add Record
        hp.clickAddRecord();

        // Generate random user id
        String AttendanceType = Utility.generateRandomAccessLevel();

        // Set Attendance Type
        at.enterAttendanceTypeTitle(AttendanceType);

        // Select Status
        at.clickInactiveStatus();

        // Click Save
        at.clickSave();

        // Set Secondary Access Level
        at.enterSecondaryTitle(AttendanceType);

        // Click Save
        at.clickSave();

        page.locator("//div[contains(text(),'The record for')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'The record for')]")).isVisible();
        page.locator("//div[contains(text(),'has been created successfully.')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'has been created successfully.')]")).isVisible();
        System.out.println("Record Saving Verified Successfully.");

        page.locator("//td[contains(text(),'" + AttendanceType + "')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[contains(text(),'" + AttendanceType + "')]")).isVisible();
        System.out.println("Record Existence Verified Successfully.");

        Locator toggle = page.locator("//tr[./td[normalize-space()='" + AttendanceType + "']]//input[@type='checkbox' and @aria-checked='false']");
        assertThat(toggle).isVisible();
        System.out.println("Status Inactive Verified Successfully.");

        // Update status
        at.clickInputSwitch(AttendanceType);

        Locator toggle2 = page.locator("//tr[./td[normalize-space()='" + AttendanceType + "']]//input[@type='checkbox' and @aria-checked='true']");
        assertThat(toggle2).isVisible();
        System.out.println("Status Inactive Verified Successfully.");

        // Click on Edit Icon
        at.clickEditIcon(AttendanceType);

        // Select Status
        at.clickInactiveStatus();

        // Click Save
        at.clickSave();

        // Verify updating toaster
        page.locator("//div[contains(text(),'Record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record [')]")).isVisible();
        page.locator("//div[contains(text(),'] updated successfully')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'] updated successfully')]")).isVisible();
        System.out.println("Record Update Verified Successfully.");

        // Verify inactive toggle
        Locator toggle3 = page.locator("//tr[./td[normalize-space()='" + AttendanceType + "']]//input[@type='checkbox' and @aria-checked='false']");
        assertThat(toggle3).isVisible();
        System.out.println("Status Inactive Verified Successfully.");

        // Delete Record
        at.clickDeleteIcon(AttendanceType);
        at.clickDelete();

        // Verify deleting toaster
        page.locator("//div[contains(text(),'Deleting record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Deleting record [')]")).isVisible();
        System.out.println("Record Delete Verified Successfully.");

        // Verify that record is deleted
        String xpath = "//tr[./td[normalize-space()='" + AttendanceType + "']]";
        assertThat(page.locator(xpath)).hasCount(0);

    }

}

