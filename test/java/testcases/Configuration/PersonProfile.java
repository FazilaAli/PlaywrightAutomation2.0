package testcases.Configuration;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;

import java.nio.file.Paths;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class PersonProfile extends BaseTest {

    @Test
    public void PersonProfile() {

        // Login
        hp.Login();

        hp.clickConfiguration();

        hp.clickSystemSetups();

        hp.clickPersonProfile();

        // Title assertion
        page.locator("//h6[text()='Person Profile']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//h6[text()='Person Profile']")).isVisible();
        System.out.println("Title Verified Successfully.");

        page.waitForTimeout(5000);

        // Set Access Level for Search
        ac.enterSearchInput("Automation");

        page.waitForTimeout(2000);

        // Click search
        ac.clickSearchButton();

        page.waitForTimeout(5000);

        // Delete Record
        pp.clickDeleteIcon("Automation");
        at.clickDelete();

        // Verify deleting toaster
        page.locator("//div[contains(text(),'Deleting record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Deleting record [')]")).isVisible();
        System.out.println("Record Delete Verified Successfully.");

        // Click Add Record
        hp.clickAddRecord();
        page.waitForTimeout(5000);

        pp.enterPersonNameP("Automation");

        pp.enterPersonCardNo("Automation");

        pp.enterPersonID("Automation");

        pp.enterSecondaryTitle("Automation");

        String filePath = Paths.get(
                System.getProperty("user.dir"),
                "src", "main", "java", "utils",
                "pngwing.com (17).png"
        ).toString();

        page.locator("//div[contains(@class,'photo-upload')]//input[@type='file']")
                .setInputFiles(Paths.get(filePath));

        pp.clickSubmit();

        pp.enterInputMaxLen10("Automation");

        pp.clickDropdownLabel2345();

        pp.clickDropdownItemAutomation();

        page.waitForTimeout(2000);

        pp.enterInputMaxLen30First("Automation");

        pp.enterInputMaxLen30Second("Automation");

        pp.enterInputNumberField("2026");

        pp.enterInputMaxLen30Third("Automation");

        page.locator("(//button[@aria-label='Choose Date'])[4]").click();

        Locator today = page.locator("//td[@data-p-today='true']");
        today.waitFor();
        today.click();

        page.waitForTimeout(2000);

        page.locator("(//button[@aria-label='Choose Date'])[5]").click();

        today = page.locator("//td[@data-p-today='true']");
        today.waitFor();
        today.click();

        page.waitForTimeout(2000);

        filePath = Paths.get(
                System.getProperty("user.dir"),
                "src", "main", "java", "utils",
                "pngwing.com (17).png"
        ).toString();

        page.locator("(//div[contains(@class,'photo-upload')]//input[@type='file'])[2]")
                .setInputFiles(Paths.get(filePath));

        pp.clickSave();

        pp.clickSubmit();

        pp.enterPhoneInput("923397654564");

        pp.enterFirstTextInput("Automation@yopmail.com");

        pp.clickCountryDropdown();

        pp.enterAddressTextInput("Automation Address");

        pp.enterSecondTextInput("PO98120");

        pp.clickFirstCheckbox();
        page.waitForTimeout(5000);

        pp.clickSecondCheckbox();
        page.waitForTimeout(5000);

        pp.clickSubmit();

        // Verify saving toaster
        page.locator("//div[contains(text(),'The record for')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'The record for')]")).isVisible();
        page.locator("//div[contains(text(),'has been created successfully.')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'has been created successfully.')]")).isVisible();
        System.out.println("Record Save Verified Successfully.");

    }

}

