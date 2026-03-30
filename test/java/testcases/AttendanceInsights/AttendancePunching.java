package testcases.AttendanceInsights;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.WaitForSelectorState;
import org.junit.jupiter.api.Test;
import utils.Utility;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AttendancePunching extends BaseTest {

    @Test
    public void AttendancePunching() {

        // Login
        hp.Login();

        hp.clickAttendanceControls();

        hp.clickAttendancePunching();

        // Data related bugs
        // https://dev.azure.com/SAM-Controls/Digital%20Faciliter/_workitems/edit/1520
        // https://dev.azure.com/SAM-Controls/Digital%20Faciliter/_workitems/edit/1519

        ap.enterCardNumber("1234567890");

        ap.clickSubmit();

        // "Test Person"
        page.locator("//p[contains(text(),'Test Person')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Test Person')]")).isVisible();

        // "ID: 99998"
        page.locator("//p[contains(normalize-space(),'ID: 99998')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(normalize-space(),'ID: 99998')]")).isVisible();

        // "Dept: General"
        page.locator("//p[contains(normalize-space(),'Dept: General')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(normalize-space(),'Dept: General')]")).isVisible();

        ap.clickCheckIn();

        ap.clickCheckOut();

        // ===== 1. Extract raw text from elements =====
        String clockText = page.locator("span[style*='font-size']").nth(1).innerText(); // e.g. "04:54:33"
        String checkin = page.locator("(//p[text()='Checked in at'])[1]").innerText(); // e.g. "Checked in at 04:54:24"
        String checkedin = page.locator("(//div[@class='timeline-item'])[1]").innerText();
        String checkedout = page.locator("(//div[@class='timeline-item'])[2]").innerText();// e.g. "Check In at 04:54:24"

        // ===== 2. Extract only HH:mm part =====
        // Clock always starts with HH:mm
        String clockHM = clockText.substring(0, 5);

        // Paragraph + timeline → regex to extract HH:mm
        String paraHM = checkin.replaceAll(".*?(\\d{2}:\\d{2}).*", "$1");
        String timelineHM = checkedin.replaceAll(".*?(\\d{2}:\\d{2}).*", "$1");
        String timelineHM2 = checkedout.replaceAll(".*?(\\d{2}:\\d{2}).*", "$1");

        // ===== 3. Compare ignoring seconds =====
        System.out.println("Clock: " + clockHM);
        System.out.println("Paragraph: " + paraHM);
        System.out.println("Timeline: " + timelineHM);
        System.out.println("Timeline: " + timelineHM2);

        // Assertions (Playwright style)
        assertEquals(clockHM, paraHM, "Paragraph time mismatch!");
        assertEquals(clockHM, timelineHM, "Timeline time mismatch!");

        ap.clickLogout();


    }

}

