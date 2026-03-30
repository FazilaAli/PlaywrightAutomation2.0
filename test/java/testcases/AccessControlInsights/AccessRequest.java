package testcases.AccessControlInsights;

import base.BaseTest;
import org.junit.jupiter.api.Test;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class AccessRequest extends BaseTest {

    @Test
    public void AccessRequest() {

        // Login
        hp.Login();

        hp.clickAccessControls();

        hp.clickAccessRequest();

//        // Title assertion
//        page.locator("//p[text()='List of Access Request']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
//        assertThat(page.locator("//p[text()='List of Access Request']")).isVisible();
//        System.out.println("Title Verified Successfully.");
        // Title in incorrect --- https://dev.azure.com/SAM-Controls/Digital%20Faciliter/_workitems/edit/1632

        // Wait For Rights Data Fetching
        page.waitForTimeout(3000);

        // Click Add Record
        hp.clickAddRecord();

        // Set Request ID
        ar.enterRequesterId("99998");

        // Click Search Button
        ar.clickSearchRequesterIcon();

        // Set Dates
        ar.enterFromDate(0);
        ar.enterToDate(5);

        // Set Remarks
        ar.enterRemarks("Test Remarks");

        // Assign Rights
        ar.clickAssignAllRights();

        // Click Save
        ac.clickSave2();

    }

}

