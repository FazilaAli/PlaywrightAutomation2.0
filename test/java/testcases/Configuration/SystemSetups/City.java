package testcases.Configuration.SystemSetups;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class City extends BaseTest {

    @Test
    public void City() {

        // Login
        hp.Login();

        hp.clickConfiguration();

        hp.clickSystemSetups();

        hp.clickCity();

        // Title assertion
        page.locator("//p[text()='List of City']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[text()='List of City']")).isVisible();
        System.out.println("Title Verified Successfully.");

        page.waitForTimeout(5000);

        // Set Access Level for Search
        ac.enterSearchInput("MARIGOT");

        page.waitForTimeout(2000);

        // Click search
        ac.clickSearchButton();

        page.waitForTimeout(5000);

        // Delete Record
        atr.clickDeleteIcon("MARIGOT");
        at.clickDelete();

        // Verify deleting toaster
        page.locator("//div[contains(text(),'Deleting record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Deleting record [')]")).isVisible();
        System.out.println("Record Delete Verified Successfully.");

        // Click Add Record
        hp.clickAddRecord();
        page.waitForTimeout(5000);

        ss.enterCityTitle("MARIGOT");

        ss.clickDropdownTrigger();

        ss.enterFilterInput("DOMINICA");

        ss.clickDominicaOption();

        ss.enterCityCode("MRG");

        ss.enterDialingCode("590");

        us.clickSave();

        ss.enterCityTitle2("MARIGOT");

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
        Locator toggle3 = page.locator("//tr[./td[normalize-space()='MARIGOT']]//input[@type='checkbox' and @aria-checked='true']");
        assertThat(toggle3).isVisible();
        System.out.println("Status Active Verified Successfully.");

        us.clickStatus3("MARIGOT");

        // Verify updating toaster
        page.locator("//div[contains(text(),'Record Updated Successfully')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record Updated Successfully')]")).isVisible();

        // Verify inactive toggle
        Locator toggle4 = page.locator("//tr[./td[normalize-space()='MARIGOT']]//input[@type='checkbox' and @aria-checked='false']");
        assertThat(toggle4).isVisible();
        System.out.println("Status InActive Verified Successfully.");

        // Bug while updating : https://dev.azure.com/SAM-Controls/Digital%20Faciliter/_workitems/edit/1649
//        // Click Edit
//        atr.clickEditIcon("MARIGOT");
//
//        // Wait For Rights Data Fetching
//        page.waitForTimeout(3000);
//
//        ss.clickDropdownStatus();
//
//        ss.clickOptionActive();
//
//        // Click Save
//        us.clickSave();
//
//        // Verify updating toaster
//        page.locator("//div[contains(text(),'Record Updated Successfully')]")
//                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//        assertThat(page.locator("//div[contains(text(),'Record Updated Successfully')]")).isVisible();
//
//        // Verify active toggle
//        Locator toggle4 = page.locator("//tr[./td[normalize-space()='MARIGOT']]//input[@type='checkbox' and @aria-checked='true']");
//        assertThat(toggle4).isVisible();
//        System.out.println("Status Active Verified Successfully.");


    }

}

