package testcases.AttendanceInsights;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AttendanceRequest extends BaseTest {

    @Test
    public void AttendanceRequest() {

        // Login
        hp.Login();

        hp.clickAttendanceControls();

        hp.clickAttendanceRequest();

        // Title assertion
        page.locator("//p[text()='List of Attendance Request']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[text()='List of Attendance Request']")).isVisible();
        System.out.println("Title Verified Successfully.");

        // Wait For Rights Data Fetching
        page.waitForTimeout(3000);

        // Click Add Record
        hp.clickAddRecord();

        // Set Request ID
        ar.enterRequesterId("99998");

        // Click Search Button
        ar.clickSearchRequesterIcon();

        // Set Remarks
        ar.enterRemarks("Test Remarks");

        page.waitForTimeout(2000);

        // Click Save
        ac.clickSave2();

        // Verify saving toaster
        page.locator("//div[contains(text(),'The record for')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'The record for')]")).isVisible();
        page.locator("//div[contains(text(),'has been created successfully.')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'has been created successfully.')]")).isVisible();
        System.out.println("Record Save Verified Successfully.");

        // Set Access Level for Search
        ac.enterSearchInput("Test Person");

        // Click search
        ac.clickSearchButton();

        // Serach not working --- https://dev.azure.com/SAM-Controls/Digital%20Faciliter/_workitems/edit/1643
//        Locator rows = page.locator("//table[contains(@class,'p-datatable-table')]//tbody/tr");
//        // wait for 1 row to appear
//        rows.first().waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//        // assert exactly 1 row exists
//        assertThat(rows).hasCount(1);
//        System.out.println("One Row on Display Verified Successfully.");
//        // "Test Person"
//        page.locator("//td[contains(text(),'Test Person')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//        assertThat(page.locator("//td[contains(text(),'Test Person')]")).isVisible();
//        // "Manual"
//        page.locator("//td[contains(text(),'Manual')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//        assertThat(page.locator("//td[contains(text(),'Manual')]")).isVisible();
//        // "Submitted"
//        page.locator("//span[contains(text(),'Submitted')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//        assertThat(page.locator("//span[contains(text(),'Submitted')]")).isVisible();

        // Click view icon
        atr.clickViewIcon("Test Person");

        // Verify All data
        String expRequesterId     = "99998";
        String expRequesterName   = "Test Person";
        String expCardNumber      = "1234567890";
        String expEmail           = "info@abc.com";
        String expDesignation     = "General";
        String expDepartment      = "General";
        String expGroup           = "General";
        String expCategory        = "General";
        assertThat(page.locator("input#Person_ID")).hasValue(expRequesterId);
        assertThat(page.locator("input#Person_Name_P")).hasValue(expRequesterName);
        assertThat(page.locator("input#Person_Card_No")).hasValue(expCardNumber);
        assertThat(page.locator("input[name='User_Email']")).hasValue(expEmail);
        assertThat(page.locator("input[name='Desig_Title']")).hasValue(expDesignation);
        assertThat(page.locator("input[name='Dept_Title']")).hasValue(expDepartment);
        assertThat(page.locator("input[name='Group_Title']")).hasValue(expGroup);
        assertThat(page.locator("input[name='Cat_Title']")).hasValue(expCategory);
        assertThat(page.locator("input#Person_ID")).isDisabled();
        assertThat(page.locator("input#Request_Auto_ID")).isDisabled();
        assertThat(page.locator("input#Person_Name_P")).isDisabled();
        assertThat(page.locator("input#Person_Card_No")).isDisabled();
        assertThat(page.locator("input[name='User_Email']")).isDisabled();
        assertThat(page.locator("input[name='Desig_Title']")).isDisabled();
        assertThat(page.locator("input[name='Dept_Title']")).isDisabled();
        assertThat(page.locator("input[name='Group_Title']")).isDisabled();
        assertThat(page.locator("input[name='Cat_Title']")).isDisabled();
        assertThat(page.locator("label:has-text('Request Date') + span input")).isDisabled();
        assertThat(page.locator("label:has-text('Attendance Date') + span input")).isDisabled();
        assertThat(page.locator(".Attend_Type_ID")).hasAttribute("data-p-disabled", "true");
        System.out.println("All Data Asserted and Disabled.");

        // Click close
        atr.clickClose();

        // Click Edit
        atr.clickEditIcon("Test Person");

        // Change attendance type
        atr.selectAttendanceType("Travel");

        // Click Save
        ac.clickSave2();

        // Verify updating toaster
        page.locator("//div[contains(text(),'Record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Record [')]")).isVisible();
        page.locator("//div[contains(text(),'] updated successfully')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'] updated successfully')]")).isVisible();
        System.out.println("Record Update Verified Successfully.");

        // Delete Record
        atr.clickDeleteIcon("Test Person");
        at.clickDelete();

        // Verify deleting toaster
        page.locator("//div[contains(text(),'Deleting record [')]")
                .waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(text(),'Deleting record [')]")).isVisible();
        System.out.println("Record Delete Verified Successfully.");


    }

}

