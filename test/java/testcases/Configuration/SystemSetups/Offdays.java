package testcases.Configuration.SystemSetups;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class Offdays extends BaseTest {

    @Test
    public void Offdays() {

        // Login
        hp.Login();

        hp.clickConfiguration();

        hp.clickSystemSetups();

        hp.clickKeyboardArrowRightIcon();

        hp.clickOffdays();

        // Title assertion
        page.locator("//label[text()='Offdays']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//label[text()='Offdays']")).isVisible();
        System.out.println("Title Verified Successfully.");

        page.waitForTimeout(5000);

        // Click Saturday Toggle
        page.locator("//div[@id='is_Saturday_Offday']")
                .click();

        // Click Sunday Toggle
        page.locator("//div[@id='is_Sunday_Offday']")
                .click();

        us.clickSave();

        page.locator("//div[contains(text(),'The record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'The record [')]")).isVisible();
        page.locator("//div[contains(text(),'] has been successfully updated in the system.')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'] has been successfully updated in the system.')]")).isVisible();
        System.out.println("Record Update Verified Successfully.");

        hp.clickHolidays();

        hp.clickOffdays();

        // Assert Saturday is OFF
        assertThat(page.locator("//div[@id='is_Saturday_Offday']"))
                .hasAttribute("aria-checked", "false");

        // Assert Sunday is OFF
        assertThat(page.locator("//div[@id='is_Sunday_Offday']"))
                .hasAttribute("aria-checked", "false");

        // Click Saturday Toggle
        page.locator("//div[@id='is_Saturday_Offday']")
                .click();

        // Click Sunday Toggle
        page.locator("//div[@id='is_Sunday_Offday']")
                .click();

        us.clickSave();

        page.locator("//div[contains(text(),'The record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'The record [')]")).isVisible();
        page.locator("//div[contains(text(),'] has been successfully updated in the system.')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'] has been successfully updated in the system.')]")).isVisible();
        System.out.println("Record Update Verified Successfully.");


    }

}

