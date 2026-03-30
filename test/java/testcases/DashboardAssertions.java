package testcases;

import base.BaseTest;
import com.microsoft.playwright.Locator;
import com.microsoft.playwright.options.BoundingBox;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

import java.util.List;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;
import static config.Configuration.*;

public class DashboardAssertions extends BaseTest {

    @Test
    public void DashboardAssertions() {

        // Login
        hp.Login();

        //Filters
        // "Region"
        page.locator("//p[contains(text(),'Region')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Region')]")).isVisible();

        // "C E N T R A L"
        page.locator("//span[contains(text(),'C E N T R A L')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'C E N T R A L')]")).isVisible();

        // "City"
        page.locator("//p[contains(text(),'City')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'City')]")).isVisible();

        // "R I Y A D H"
        page.locator("//span[contains(text(),'R I Y A D H')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'R I Y A D H')]")).isVisible();

        // "Location"
        page.locator("//p[contains(text(),'Location')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Location')]")).isVisible();

        // "HQ - Tower # 1"
        page.locator("//span[contains(text(),'HQ - Tower # 1')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'HQ - Tower # 1')]")).isVisible();

        // "Area"
        page.locator("//p[contains(text(),'Area')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Area')]")).isVisible();

        // "Ground floor"
        page.locator("//span[contains(text(),'Ground floor')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Ground floor')]")).isVisible();

        // "Brand"
        page.locator("//p[contains(text(),'Brand')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Brand')]")).isVisible();

        // "[ALL]"
        page.locator("//span[contains(text(),'[ALL]')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'[ALL]')]")).isVisible();

        // Live Toggle
        // "Live Updates"
        page.locator("//span[contains(text(),'Live Updates')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Live Updates')]")).isVisible();

        // Dashboard
        // "Access Control Insights"
        page.locator("//button[contains(@class,'MuiTab-root')][normalize-space()='Access Control Insights']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//button[contains(@class,'MuiTab-root')][normalize-space()='Access Control Insights']")).isVisible();

        // "Live Head Counts"
        page.locator("//div[contains(@class,'card-title')][contains(text(),'Live Head Counts')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'card-title')][contains(text(),'Live Head Counts')]")).isVisible();

        // "1067"
        page.locator("//div[contains(@class,'card-value')][contains(text(),'1067')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'card-value')][contains(text(),'1067')]")).isVisible();

        // "Access Granted"
        page.locator("//div[contains(@class,'card-title')][contains(text(),'Access Granted')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'card-title')][contains(text(),'Access Granted')]")).isVisible();

        // "2418"
        page.locator("//div[contains(@class,'card-value')][contains(text(),'2418')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'card-value')][contains(text(),'2418')]")).isVisible();

        // "Access Denied"
        page.locator("//div[contains(@class,'card-title')][contains(text(),'Access Denied')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'card-title')][contains(text(),'Access Denied')]")).isVisible();

        // "44"
        page.locator("//div[contains(@class,'card-value')][contains(text(),'44')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'card-value')][contains(text(),'44')]")).isVisible();

        // "Door Alarms"
        page.locator("//div[contains(@class,'card-title')][contains(text(),'Door Alarms')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'card-title')][contains(text(),'Door Alarms')]")).isVisible();

        // "22" (1st occurrence)
        page.locator("(//div[contains(@class,'card-value')][contains(text(),'22')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[contains(@class,'card-value')][contains(text(),'22')])[1]")).isVisible();

        // "People Entry and Exit Per Hour"
        page.locator("//div[contains(@class,'chart-header-title')][contains(text(),'People Entry and Exit Per Hour')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'chart-header-title')][contains(text(),'People Entry and Exit Per Hour')]")).isVisible();

        // "Both"
        page.locator("//div[contains(@class,'legend-item')][contains(text(),'Both')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'legend-item')][contains(text(),'Both')]")).isVisible();

        // "Entry"
        page.locator("//div[contains(@class,'legend-item')][contains(text(),'Entry')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'legend-item')][contains(text(),'Entry')]")).isVisible();

        // "Exit"
        page.locator("//div[contains(@class,'legend-item')][contains(text(),'Exit')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'legend-item')][contains(text(),'Exit')]")).isVisible();

        // "Device Status"
        page.locator("//div[contains(@class,'headerPie_first_device')][contains(text(),'Device Status')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'headerPie_first_device')][contains(text(),'Device Status')]")).isVisible();

        // "Alarm Per Hour"
        page.locator("//div[contains(@class,'headerPie_first')][contains(text(),'Alarm Per Hour')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'headerPie_first')][contains(text(),'Alarm Per Hour')]")).isVisible();

        // "Alarm Per Hour"
        page.locator("//div[@class='pie-chart-container']").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[@class='pie-chart-container']")).isVisible();

        // "Device Monitoring"
        page.locator("//div[contains(@class,'headerPie_first_monitoring')][contains(text(),'Device Monitoring')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[contains(@class,'headerPie_first_monitoring')][contains(text(),'Device Monitoring')]")).isVisible();

        // "Brand"
        page.locator("//label[contains(@class,'selector-option')][contains(text(),'Brand')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//label[contains(@class,'selector-option')][contains(text(),'Brand')]")).isVisible();

        // "Group"
        page.locator("//label[contains(@class,'selector-option')][contains(text(),'Group')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//label[contains(@class,'selector-option')][contains(text(),'Group')]")).isVisible();

        // "Type"
        page.locator("//label[contains(@class,'selector-option')][contains(text(),'Type')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//label[contains(@class,'selector-option')][contains(text(),'Type')]")).isVisible();

        // "CANON"
        page.locator("//h3[contains(@class,'device-title')][contains(text(),'CANON')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//h3[contains(@class,'device-title')][contains(text(),'CANON')]")).isVisible();

        // "2" (1st occurrence)
        page.locator("(//div[@class='status']/span[contains(@class,'online')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[@class='status']/span[contains(@class,'online')])[1]")).isVisible();

        // "0" (1st occurrence)
        page.locator("(//div[@class='status']/span[contains(@class,'offline')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[@class='status']/span[contains(@class,'offline')])[1]")).isVisible();

        // "Online" (1st occurrence)
        page.locator("(//span[contains(@class,'online-label')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'online-label')])[1]")).isVisible();

        // "Offline" (1st occurrence)
        page.locator("(//span[contains(@class,'offline-label')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'offline-label')])[1]")).isVisible();

        // "DAHUA"
        page.locator("//h3[contains(@class,'device-title')][contains(text(),'DAHUA')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//h3[contains(@class,'device-title')][contains(text(),'DAHUA')]")).isVisible();

        // "4" (1st occurrence)
        page.locator("(//div[@class='status']/span[contains(@class,'online')])[2]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[@class='status']/span[contains(@class,'online')])[2]")).isVisible();

        // "0" (2nd occurrence)
        page.locator("(//div[@class='status']/span[contains(@class,'offline')])[2]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[@class='status']/span[contains(@class,'offline')])[2]")).isVisible();

        // "Online" (2nd occurrence)
        page.locator("(//span[contains(@class,'online-label')])[2]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'online-label')])[2]")).isVisible();

        // "Offline" (2nd occurrence)
        page.locator("(//span[contains(@class,'offline-label')])[2]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'offline-label')])[2]")).isVisible();

        // "DELL"
        page.locator("//h3[contains(@class,'device-title')][contains(text(),'DELL')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//h3[contains(@class,'device-title')][contains(text(),'DELL')]")).isVisible();

        // "2" (2nd occurrence)
        page.locator("(//div[@class='status']/span[contains(@class,'online')])[3]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[@class='status']/span[contains(@class,'online')])[3]")).isVisible();

        // "0" (3rd occurrence)
        page.locator("(//div[@class='status']/span[contains(@class,'offline')])[3]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[@class='status']/span[contains(@class,'offline')])[3]")).isVisible();

        // "Online" (3rd occurrence)
        page.locator("(//span[contains(@class,'online-label')])[3]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'online-label')])[3]")).isVisible();

        // "Offline" (3rd occurrence)
        page.locator("(//span[contains(@class,'offline-label')])[3]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'offline-label')])[3]")).isVisible();

        // "HIK VISION"
        page.locator("//h3[contains(@class,'device-title')][contains(text(),'HIK VISION')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//h3[contains(@class,'device-title')][contains(text(),'HIK VISION')]")).isVisible();

        // "5" (1st occurrence)
        page.locator("(//div[@class='status']/span[contains(@class,'online')])[4]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[@class='status']/span[contains(@class,'online')])[4]")).isVisible();

        // "0" (4th occurrence)
        page.locator("(//div[@class='status']/span[contains(@class,'offline')])[4]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[@class='status']/span[contains(@class,'offline')])[4]")).isVisible();

        // "Online" (4th occurrence)
        page.locator("(//span[contains(@class,'online-label')])[4]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'online-label')])[4]")).isVisible();

        // "Offline" (4th occurrence)
        page.locator("(//span[contains(@class,'offline-label')])[4]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'offline-label')])[4]")).isVisible();

        // "HP"
        page.locator("//h3[contains(@class,'device-title')][contains(text(),'HP')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//h3[contains(@class,'device-title')][contains(text(),'HP')]")).isVisible();

        // "1" (1st occurrence)
        page.locator("(//div[@class='status']/span[contains(@class,'online')])[5]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[@class='status']/span[contains(@class,'online')])[5]")).isVisible();

        // "0" (5th occurrence)
        page.locator("(//div[@class='status']/span[contains(@class,'offline')])[5]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//div[@class='status']/span[contains(@class,'offline')])[5]")).isVisible();

        // "Online" (5th occurrence)
        page.locator("(//span[contains(@class,'online-label')])[5]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'online-label')])[5]")).isVisible();

        // "Offline" (5th occurrence)
        page.locator("(//span[contains(@class,'offline-label')])[5]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'offline-label')])[5]")).isVisible();

        // "SIEMENS"
        page.locator("//h3[contains(@class,'device-title')][contains(text(),'SIEMENS')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//h3[contains(@class,'device-title')][contains(text(),'SIEMENS')]")).isVisible();

        // "19"
        page.locator("//div[@class='status']/span[contains(@class,'online')][contains(text(),'19')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[@class='status']/span[contains(@class,'online')][contains(text(),'19')]")).isVisible();

        // "3"
        page.locator("//div[@class='status']/span[contains(@class,'offline')][contains(text(),'3')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//div[@class='status']/span[contains(@class,'offline')][contains(text(),'3')]")).isVisible();

        // "Online" (6th occurrence)
        page.locator("(//span[contains(@class,'online-label')])[6]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'online-label')])[6]")).isVisible();

        // "Offline" (6th occurrence)
        page.locator("(//span[contains(@class,'offline-label')])[6]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//span[contains(@class,'offline-label')])[6]")).isVisible();

        System.out.println("Dashboard Assertions are Verified Successfully.");
    }

    @Test
    public void LiveHeadCountAssertions() {

        // Login
        hp.Login();

        // Click on Live Head Count
        dash.clickLiveHeadCount();

        //Filters
        // "Region"
        page.locator("//p[contains(text(),'Region')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Region')]")).isVisible();

        // "C E N T R A L"
        page.locator("//span[contains(text(),'C E N T R A L')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'C E N T R A L')]")).isVisible();

        // "City"
        page.locator("//p[contains(text(),'City')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'City')]")).isVisible();

        // "R I Y A D H"
        page.locator("//span[contains(text(),'R I Y A D H')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'R I Y A D H')]")).isVisible();

        // "Location"
        page.locator("//p[contains(text(),'Location')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Location')]")).isVisible();

        // "HQ - Tower # 1"
        page.locator("//span[contains(text(),'HQ - Tower # 1')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'HQ - Tower # 1')]")).isVisible();

        // "Area"
        page.locator("//p[contains(text(),'Area')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Area')]")).isVisible();

        // "Ground floor"
        page.locator("//span[contains(text(),'Ground floor')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Ground floor')]")).isVisible();

        // "Brand"
        page.locator("//p[contains(text(),'Brand')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Brand')]")).isVisible();

        // "[ALL]"
        page.locator("//span[contains(text(),'[ALL]')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'[ALL]')]")).isVisible();

        // Verify complete data is visible.
        dash.clickDropdownTrigger();
        dash.clickItem100Label();
        // "Page 1 of 11"
        page.locator("//span[@class='page_info'  and contains(normalize-space(.), 'Page')  and contains(normalize-space(.), '1') and contains(normalize-space(.), 'of')  and contains(normalize-space(.), '11')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[@class='page_info'  and contains(normalize-space(.), 'Page')  and contains(normalize-space(.), '1') and contains(normalize-space(.), 'of')  and contains(normalize-space(.), '11')]")).isVisible();

        // Search Record
        dash.searchRecord("Test");

        // Asssert Searched Record
        // "Person ID"
        page.locator("//span[contains(text(),'Person ID')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Person ID')]")).isVisible();

        // "Card Number"
        page.locator("//span[contains(text(),'Card Number')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Card Number')]")).isVisible();

        // "Person Name & Info"
        page.locator("//span[contains(text(),'Person Name & Info')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Person Name & Info')]")).isVisible();

        // "Department"
        page.locator("//span[contains(text(),'Department')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Department')]")).isVisible();

        // "Designation"
        page.locator("//span[contains(text(),'Designation')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Designation')]")).isVisible();

        // "Area"
        page.locator("//span[contains(text(),'Area')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Area')]")).isVisible();

        // "Entry Time"
        page.locator("//span[contains(text(),'Entry Time')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Entry Time')]")).isVisible();

        // "1234567890" (1st occurrence)
        page.locator("(//td[contains(text(),'1234567890')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1234567890')])[1]")).isVisible();

        // "1234567890" (2nd occurrence)
        page.locator("(//td[contains(text(),'1234567890')])[2]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1234567890')])[2]")).isVisible();

        // "Test Person (General) Valid card 1234567890 Facility 0"
        page.locator("//td[contains(text(),'Test Person (General) Valid card 1234567890 Facility 0')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[contains(text(),'Test Person (General) Valid card 1234567890 Facility 0')]")).isVisible();

        // "General" (1st occurrence)
        page.locator("(//td[contains(text(),'General')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'General')])[1]")).isVisible();

        // "General" (2nd occurrence)
        page.locator("(//td[contains(text(),'General')])[2]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'General')])[2]")).isVisible();

        // "Ground floor"
        page.locator("//td[contains(text(),'Ground floor')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[contains(text(),'Ground floor')]")).isVisible();

        // "18:31:58"
        page.locator("//td[contains(text(),'18:31:58')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[contains(text(),'18:31:58')]")).isVisible();

    }

    @Test
    public void AccessGrantedAssertions() {

        // Login
        hp.Login();

        // Click on Access Granted
        dash.clickAccessGranted();

        //Filters
        // "Region"
        page.locator("//p[contains(text(),'Region')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Region')]")).isVisible();

        // "C E N T R A L"
        page.locator("//span[contains(text(),'C E N T R A L')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'C E N T R A L')]")).isVisible();

        // "City"
        page.locator("//p[contains(text(),'City')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'City')]")).isVisible();

        // "R I Y A D H"
        page.locator("//span[contains(text(),'R I Y A D H')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'R I Y A D H')]")).isVisible();

        // "Location"
        page.locator("//p[contains(text(),'Location')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Location')]")).isVisible();

        // "HQ - Tower # 1"
        page.locator("//span[contains(text(),'HQ - Tower # 1')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'HQ - Tower # 1')]")).isVisible();

        // "Area"
        page.locator("//p[contains(text(),'Area')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Area')]")).isVisible();

        // "Ground floor"
        page.locator("//span[contains(text(),'Ground floor')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Ground floor')]")).isVisible();

        // "Brand"
        page.locator("//p[contains(text(),'Brand')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Brand')]")).isVisible();

        // "[ALL]"
        page.locator("//span[contains(text(),'[ALL]')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'[ALL]')]")).isVisible();

        // Verify charts
        Locator charts = page.locator("div.echarts-for-react");
        // Assert that at least 2 charts exist
        assertThat(charts).hasCount(2);
        // Assert that both charts are visible
        charts.nth(0).isVisible();
        charts.nth(1).isVisible();
        // Assert Titles
        page.locator("//p[contains(text(),'Daily Access Granted Overview for the month of December, 20')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Daily Access Granted Overview for the month of December, 20')]")).isVisible();
        page.locator("//p[contains(text(),'Hourly Access Granted Overview for')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Hourly Access Granted Overview for')]")).isVisible();
        System.out.println("Chart existence is asserted.");

    }

    @Test
    public void AccessDeniedAssertions() {

        // Login
        hp.Login();

        // Click on Access Denied
        dash.clickAccessDenied();

        //Filters
        // "Region"
        page.locator("//p[contains(text(),'Region')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Region')]")).isVisible();

        // "C E N T R A L"
        page.locator("//span[contains(text(),'C E N T R A L')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'C E N T R A L')]")).isVisible();

        // "City"
        page.locator("//p[contains(text(),'City')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'City')]")).isVisible();

        // "R I Y A D H"
        page.locator("//span[contains(text(),'R I Y A D H')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'R I Y A D H')]")).isVisible();

        // "Location"
        page.locator("//p[contains(text(),'Location')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Location')]")).isVisible();

        // "HQ - Tower # 1"
        page.locator("//span[contains(text(),'HQ - Tower # 1')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'HQ - Tower # 1')]")).isVisible();

        // "Area"
        page.locator("//p[contains(text(),'Area')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Area')]")).isVisible();

        // "Ground floor"
        page.locator("//span[contains(text(),'Ground floor')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Ground floor')]")).isVisible();

        // "Brand"
        page.locator("//p[contains(text(),'Brand')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Brand')]")).isVisible();

        // "[ALL]"
        page.locator("//span[contains(text(),'[ALL]')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'[ALL]')]")).isVisible();

        // Verify charts
        Locator charts = page.locator("div.echarts-for-react");
        // Assert that at least 2 charts exist
        assertThat(charts).hasCount(2);
        // Assert that both charts are visible
        charts.nth(0).isVisible();
        charts.nth(1).isVisible();
        // Assert Titles
        page.locator("//p[contains(text(),'Daily Access Denied Overview for the month of December, 20')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Daily Access Denied Overview for the month of December, 20')]")).isVisible();
        page.locator("//p[contains(text(),'Hourly Access Denied Overview for')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Hourly Access Denied Overview for')]")).isVisible();
        System.out.println("Chart existence is asserted.");

    }

    @Test
    public void DoorAlarmsAssertions() {

        // Login
        hp.Login();

        // Click on Access Denied
        dash.clickDoorAlarms();

        //Filters
        // "Region"
        page.locator("//p[contains(text(),'Region')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Region')]")).isVisible();

        // "C E N T R A L"
        page.locator("//span[contains(text(),'C E N T R A L')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'C E N T R A L')]")).isVisible();

        // "City"
        page.locator("//p[contains(text(),'City')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'City')]")).isVisible();

        // "R I Y A D H"
        page.locator("//span[contains(text(),'R I Y A D H')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'R I Y A D H')]")).isVisible();

        // "Location"
        page.locator("//p[contains(text(),'Location')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Location')]")).isVisible();

        // "HQ - Tower # 1"
        page.locator("//span[contains(text(),'HQ - Tower # 1')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'HQ - Tower # 1')]")).isVisible();

        // "Area"
        page.locator("//p[contains(text(),'Area')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Area')]")).isVisible();

        // "Ground floor"
        page.locator("//span[contains(text(),'Ground floor')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'Ground floor')]")).isVisible();

        // "Brand"
        page.locator("//p[contains(text(),'Brand')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Brand')]")).isVisible();

        // "[ALL]"
        page.locator("//span[contains(text(),'[ALL]')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//span[contains(text(),'[ALL]')]")).isVisible();

        // Verify charts
        Locator charts = page.locator("div.echarts-for-react");
        // Assert that at least 2 charts exist
        assertThat(charts).hasCount(2);
        // Assert that both charts are visible
        charts.nth(0).isVisible();
        charts.nth(1).isVisible();
        // Assert Titles
        page.locator("//p[contains(text(),'Door 1_L00-KAFD-GF-GATE-05/R1-IN- Alarm Overview for the month of December, 20')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Door 1_L00-KAFD-GF-GATE-05/R1-IN- Alarm Overview for the month of December, 20')]")).isVisible();
        page.locator("//p[contains(text(),'Hourly 1_L00-KAFD-GF-GATE-05/R1-IN- Alarm Overview for')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//p[contains(text(),'Hourly 1_L00-KAFD-GF-GATE-05/R1-IN- Alarm Overview for')]")).isVisible();
        System.out.println("Chart existence is asserted.");
        // Assert table
        // "1_L00-KAFD-GF-GATE-05/R1-IN-" (1st occurrence)
        page.locator("(//td[contains(text(),'1_L00-KAFD-GF-GATE-05/R1-IN-')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1_L00-KAFD-GF-GATE-05/R1-IN-')])[1]")).isVisible();

        // "1" (1st occurrence)
        page.locator("(//td[contains(text(),'1')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1')])[1]")).isVisible();

        // "0" (1st occurrence)
        page.locator("(//td[contains(text(),'0')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'0')])[1]")).isVisible();

        // "1_L00-KAFD-GF-Speed Gate1/R1-IN" (1st occurrence)
        page.locator("(//td[contains(text(),'1_L00-KAFD-GF-Speed Gate1/R1-IN')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1_L00-KAFD-GF-Speed Gate1/R1-IN')])[1]")).isVisible();

        // "4"
        page.locator("//td[(text()='4')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[(text()='4')]")).isVisible();

        // "0" (2nd occurrence)
        page.locator("(//td[contains(text(),'0')])[2]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'0')])[2]")).isVisible();

        // "1_L00-KAFD-GF-Speed Gate2/R1-IN" (1st occurrence)
        page.locator("(//td[contains(text(),'1_L00-KAFD-GF-Speed Gate2/R1-IN')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1_L00-KAFD-GF-Speed Gate2/R1-IN')])[1]")).isVisible();

        // "1" (2nd occurrence)
        page.locator("(//td[contains(text(),'1')])[2]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1')])[2]")).isVisible();

        // "0" (3rd occurrence)
        page.locator("(//td[contains(text(),'0')])[3]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'0')])[3]")).isVisible();

        // "1_L00-KAFD-GF-Speed Gate3/R2-IN" (1st occurrence)
        page.locator("(//td[contains(text(),'1_L00-KAFD-GF-Speed Gate3/R2-IN')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1_L00-KAFD-GF-Speed Gate3/R2-IN')])[1]")).isVisible();

        // "5"
        page.locator("//td[(text()='5')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[(text()='5')]")).isVisible();

        // "0" (4th occurrence)
        page.locator("(//td[contains(text(),'0')])[4]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'0')])[4]")).isVisible();

        // "1_L00-KAFD-GF-Speed Gate4/R2-IN" (1st occurrence)
        page.locator("(//td[contains(text(),'1_L00-KAFD-GF-Speed Gate4/R2-IN')])[1]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1_L00-KAFD-GF-Speed Gate4/R2-IN')])[1]")).isVisible();

        // "8"
        page.locator("//td[contains(text(),'8')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[contains(text(),'8')]")).isVisible();

        // "0" (5th occurrence)
        page.locator("(//td[contains(text(),'0')])[5]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'0')])[5]")).isVisible();

        // "2_L00-KAFD-GF-GATE-09/R1-OUT-"
        page.locator("//td[contains(text(),'2_L00-KAFD-GF-GATE-09/R1-OUT-')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[contains(text(),'2_L00-KAFD-GF-GATE-09/R1-OUT-')]")).isVisible();

        // "1" (3rd occurrence)
        page.locator("(//td[contains(text(),'1')])[3]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1')])[3]")).isVisible();

        // "0" (6th occurrence)
        page.locator("(//td[contains(text(),'0')])[6]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'0')])[6]")).isVisible();

        // "First Floor IP Camera"
        page.locator("//td[contains(text(),'First Floor IP Camera')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[contains(text(),'First Floor IP Camera')]")).isVisible();

        // "1" (4th occurrence)
        page.locator("(//td[contains(text(),'1')])[4]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1')])[4]")).isVisible();

        // "0" (7th occurrence)
        page.locator("(//td[contains(text(),'0')])[7]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'0')])[7]")).isVisible();

        // "Ground Floor IP Camera"
        page.locator("//td[contains(text(),'Ground Floor IP Camera')]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("//td[contains(text(),'Ground Floor IP Camera')]")).isVisible();

        // "1" (5th occurrence)
        page.locator("(//td[contains(text(),'1')])[5]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'1')])[5]")).isVisible();

        // "0" (8th occurrence)
        page.locator("(//td[contains(text(),'0')])[8]").waitFor(new Locator.WaitForOptions().setState(WaitForSelectorState.VISIBLE));
        assertThat(page.locator("(//td[contains(text(),'0')])[8]")).isVisible();

        System.out.println("Table is asserted successfully.");

    }
}

