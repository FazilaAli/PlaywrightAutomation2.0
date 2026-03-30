package testcases.Configuration.SystemSetups;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Shifts extends BaseTest {

    @Test
    public void Shifts() {

        // Login
        hp.Login();

        hp.clickConfiguration();

        hp.clickSystemSetups();

        hp.clickKeyboardArrowRightIcon();

        hp.clickShifts();

        // Title assertion
        page.locator("//p[text()='List Of Shift']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[text()='List Of Shift']")).isVisible();
        System.out.println("Title Verified Successfully.");

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

        ss.enterShiftCode("AU");

        ss.enterShiftTitle("Automation");

        ss.enterStartingTime("09:00");

        ss.enterEndingTime("12:00");

        ss.enterShiftDuration("03:00");

        ss.enterGraceTime("00:15");

        us.clickSave();

        ss.enterSecondaryTitle("Automation");

        us.clickSave();

        // Verify saving toaster
        page.locator("//div[contains(text(),'The record for')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'The record for')]")).isVisible();
        page.locator("//div[contains(text(),'has been created successfully.')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'has been created successfully.')]")).isVisible();
        System.out.println("Record Save Verified Successfully.");

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

