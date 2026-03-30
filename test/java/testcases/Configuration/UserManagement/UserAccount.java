package testcases.Configuration.UserManagement;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;
import utils.Utility;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class UserAccount extends BaseTest {

    @Test
    public void UserAccount() {

        // Login
        hp.Login();

        hp.clickConfiguration();

        hp.clickUserManagement();

        hp.clickUserAccount();

        // Title assertion
        page.locator("//p[text()='List of Users']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[text()='List of Users']")).isVisible();
        System.out.println("Title Verified Successfully.");

        // Wait For Rights Data Fetching
        page.waitForTimeout(3000);

        // Click Add Record
        hp.clickAddRecord();
        page.waitForTimeout(5000);

        us.clickSave();

        us.enterUserId(Utility.generateUserId());

        us.enterUserEmail(Utility.generateEmail());

        String name = Utility.generateFullName();
        us.enterFullName(name);

        us.enterPhone(Utility.generatePhone());

        us.enterUserPassword(Utility.generatePassword());

        us.clickDesignationDropdown();

        us.clickDesignationOptionItManager();

        us.clickTermsCheckbox();

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
        Locator toggle3 = page.locator("//tr[./td[text()='" + name +"']]//input[@type='checkbox' and @aria-checked='false']");
        assertThat(toggle3).isVisible();
        System.out.println("Status Active Verified Successfully.");

        us.clickStatus2(name);

        // Verify updating toaster
        page.locator("//div[contains(text(),'Record Updated Successfully')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record Updated Successfully')]")).isVisible();

        // Verify inactive toggle
        Locator toggle4 = page.locator("//tr[./td[text()='" + name +"']]//input[@type='checkbox' and @aria-checked='true']");
        assertThat(toggle4).isVisible();
        System.out.println("Status InActive Verified Successfully.");

        // Click Edit
        atr.clickEditIcon(name);

        // Wait For Rights Data Fetching
        page.waitForTimeout(3000);

        us.clickDropdownLabel();

        us.clickDropdownItemNo();

        // Click Save
        us.clickSave();

        // Verify updating toaster
        page.locator("//div[contains(text(),'Record')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record')]")).isVisible();
        page.locator("//div[contains(text(),'Updated Successfully')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Updated Successfully')]")).isVisible();

        // Verify active toggle
        Locator toggle2 = page.locator("//tr[./td[text()='" + name +"']]//input[@type='checkbox' and @aria-checked='true']");
        assertThat(toggle2).isVisible();
        System.out.println("Status Active Verified Successfully.");

        // Delete Record
        atr.clickDeleteIcon(name);
        at.clickDelete();

        // Verify deleting toaster
        page.locator("//div[contains(text(),'Deleting record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Deleting record [')]")).isVisible();
        System.out.println("Record Delete Verified Successfully.");


    }

}

