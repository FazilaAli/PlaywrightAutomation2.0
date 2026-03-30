package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

import java.time.LocalDate;

public class AccessRequest {

    private Page page;

    private final String requesterIdInput = "//*[@name='Requester_ID']";
    private final String searchRequesterIcon = "(//*[contains(@class, 'icon_search_req')])[1]";
    private final String fromDateInput = "//*[contains(@class, 'form_request') and .//label[contains(text(), 'From Date')]]//input";
    private final String toDateInput = "//*[@id='inTime']//input";
    private final String remarksTextArea = "//*[@name='Remarks']";
    private final String moveAllToTargetButton = "//*[@aria-label='Move All to Target' and @type='button']";

    public AccessRequest(Page page) {
        this.page = page;
    }

    public void enterRequesterId(String value) {
        page.waitForSelector(requesterIdInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(requesterIdInput).fill(value);
    }

    public void clickSearchRequesterIcon() {
        page.waitForSelector(searchRequesterIcon, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(searchRequesterIcon).click();
    }
    public void enterFromDate(int addDays) {
        page.waitForSelector(fromDateInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(fromDateInput).click();

        LocalDate date = LocalDate.now().plusDays(addDays);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue() - 1; // UI uses 0-based month
        int year = date.getYear();

        String locator = String.format(
                "//td[@data-p-day='%d' and @data-p-month='%d' and @data-p-year='%d']",
                day, month, year
        );

        // If the date isn't visible, click "next" month
        while (!page.locator(locator).isVisible()) {
            page.click("button.p-datepicker-next");
        }

        page.locator(locator).click();
    }

    public void enterToDate(int addDays) {
        page.waitForSelector(toDateInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(toDateInput).click();

        LocalDate date = LocalDate.now().plusDays(addDays);

        int day = date.getDayOfMonth();
        int month = date.getMonthValue() - 1; // UI uses 0-based month
        int year = date.getYear();

        String locator = String.format(
                "//td[@data-p-day='%d' and @data-p-month='%d' and @data-p-year='%d']",
                day, month, year
        );

        // If the date isn't visible, click "next" month
        while (!page.locator(locator).isVisible()) {
            page.click("button.p-datepicker-next");
        }

        page.locator(locator).click();
    }

    public void enterRemarks(String value) {
        page.waitForSelector(remarksTextArea, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(remarksTextArea).fill(value);
    }

    public void clickAssignAllRights() {
        page.waitForSelector(moveAllToTargetButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(moveAllToTargetButton).click();
    }

}