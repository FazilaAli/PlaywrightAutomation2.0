package testcases.Configuration.SystemSetups;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class VehicleCategory extends BaseTest {

    @Test
    public void VehicleCategory() {

        // Login
        hp.Login();

        hp.clickConfiguration();

        hp.clickSystemSetups();

        hp.clickVehicleCategory();

        // Title assertion
        page.locator("//p[text()='Vehicle Category']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[text()='Vehicle Category']")).isVisible();
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

        ss.enterTitle("Automation");

        ss.clickPlateColorDropdown();

        ss.clickRedPlateOption();

        us.clickSave();

        ss.enterSecondaryTitle2("Automation");

        us.clickSave();

        // Verify saving toaster
        page.locator("//div[contains(text(),'Record created for [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record created for [')]")).isVisible();

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
        page.locator("//div[contains(text(),'Record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record [')]")).isVisible();
        // Verify updating toaster
        page.locator("//div[contains(text(),'] updated successfully')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'] updated successfully')]")).isVisible();

        // Verify active toggle
        Locator toggle5 = page.locator("//tr[./td[normalize-space()='Automation']]//input[@type='checkbox' and @aria-checked='true']");
        assertThat(toggle5).isVisible();
        System.out.println("Status Active Verified Successfully.");


    }

}

