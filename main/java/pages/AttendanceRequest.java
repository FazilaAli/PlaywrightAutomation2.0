package pages;

import com.microsoft.playwright.Locator;
import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

import java.time.LocalDate;

public class AttendanceRequest {

    private Page page;

    private final String btnClose = "div.default-rt-btn.first_cancel.margin_auto_request svg";


    public AttendanceRequest(Page page) {
        this.page = page;
    }

    public void clickViewIcon(String value) {
        page.waitForSelector("(//tr[./td[normalize-space()='" + value + "']]//span[contains(@class,'pi-eye')])[1]", new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator("(//tr[./td[normalize-space()='" + value + "']]//span[contains(@class,'pi-eye')])[1]").click();
    }

    public void clickEditIcon(String value) {
        page.waitForSelector("(//tr[./td[normalize-space()='" + value + "']]//*[contains(@class,'peraEdit')])[1]", new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator("(//tr[./td[normalize-space()='" + value + "']]//*[contains(@class,'peraEdit')])[1]").click();
    }

    public void clickDeleteIcon(String value) {
        page.waitForSelector("(//tr[.//td[contains(normalize-space(.),'" + value + "')]]//td[contains(@class,'action_center')]//*[name()='svg'])[2]", new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator("(//tr[.//td[contains(normalize-space(.),'" + value + "')]]//td[contains(@class,'action_center')]//*[name()='svg'])[2]").click();
    }

    public void clickClose() {
        page.waitForSelector(btnClose, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnClose).click();
    }

    public void selectAttendanceType(String option) {
        Locator dropdown = page.locator("div.Attend_Type_ID .p-dropdown-trigger");
        dropdown.click();
        page.locator("//li[normalize-space()='" + option + "']").click();
    }


}