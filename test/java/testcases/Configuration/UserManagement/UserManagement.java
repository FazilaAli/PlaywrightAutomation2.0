package testcases.Configuration.UserManagement;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class UserManagement extends BaseTest {

    @Test
    public void UserManagement() {

        // Login
        hp.Login();

        hp.clickConfiguration();

        hp.clickUserManagement();

        // Title assertion
        page.locator("//p[text()='List of Role']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[text()='List of Role']")).isVisible();
        System.out.println("Title Verified Successfully.");

        // Wait For Rights Data Fetching
        page.waitForTimeout(3000);

        // Click Add Record
        hp.clickAddRecord();
        page.waitForTimeout(5000);

        us.enterRoleDescription("This is a managing role.");

        us.clickCustomCheckbox();

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
        Locator toggle3 = page.locator("//tr[./td[normalize-space()='This is a managing role.']]//input[@type='checkbox' and @aria-checked='true']");
        assertThat(toggle3).isVisible();
        System.out.println("Status Active Verified Successfully.");

        us.clickStatus();

        // Verify updating toaster
        page.locator("//div[contains(text(),'Record Updated Successfully')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record Updated Successfully')]")).isVisible();

        // Verify inactive toggle
        Locator toggle4 = page.locator("//tr[./td[normalize-space()='This is a managing role.']]//input[@type='checkbox' and @aria-checked='false']");
        assertThat(toggle4).isVisible();
        System.out.println("Status InActive Verified Successfully.");

        // Click Edit
        atr.clickEditIcon("This is a managing role.");

        // Wait For Rights Data Fetching
        page.waitForTimeout(3000);

        us.clickCustomSwitch();

        us.enterSearch("Devices Settings");

        us.clickViewAddEditDelete();

        us.enterSearch("Devices Settings");

        us.clickDelete();

        // Click Save
        us.clickSave();

        // Verify updating toaster
        page.locator("//div[contains(text(),'Record Updated Successfully')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record Updated Successfully')]")).isVisible();

        // Verify active toggle
        Locator toggle2 = page.locator("//tr[./td[normalize-space()='This is a managing role.']]//input[@type='checkbox' and @aria-checked='true']");
        assertThat(toggle2).isVisible();
        System.out.println("Status Active Verified Successfully.");

        // Verify Record Update
        // Click Edit
        atr.clickEditIcon("This is a managing role.");

        // Wait For Rights Data Fetching
        page.waitForTimeout(3000);

        us.enterSearch("Devices Settings");

        page.locator("//*[@class='dropbtn' and text()='View, Add, Edit']")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//*[@class='dropbtn' and text()='View, Add, Edit']")).isVisible();

        // Click Save
        us.clickSave();

        // Delete Record
        atr.clickDeleteIcon("This is a managing role.");
        at.clickDelete();

        // Verify deleting toaster
        page.locator("//div[contains(text(),'Deleting record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Deleting record [')]")).isVisible();
        System.out.println("Record Delete Verified Successfully.");


    }

}

