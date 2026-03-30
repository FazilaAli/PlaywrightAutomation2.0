package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

public class AttendancePunching {

    private Page page;

    private final String cardNumberInput = "//*[@placeholder='Enter your card number']";
    private final String submitButton = "//button[contains(@class, 'card-entry-button')]";
    private final String checkInButton = "//button[contains(@class, 'check-in-button')]";
    private final String checkOutButton = "//button[contains(@class, 'check-out-button')]";
    private final String logoutButton = "//button[contains(@class, 'logout-btn')]";

    public AttendancePunching(Page page) {
        this.page = page;
    }

    public void enterCardNumber(String value) {
        page.waitForSelector(cardNumberInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(cardNumberInput).fill(value);
    }

    public void clickSubmit() {
        page.waitForSelector(submitButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(submitButton).click();
    }

    public void clickCheckIn() {
        page.waitForSelector(checkInButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(checkInButton).click();
    }

    public void clickCheckOut() {
        page.waitForSelector(checkOutButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(checkOutButton).click();
    }

    public void clickLogout() {
        page.waitForSelector(logoutButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(logoutButton).click();
    }

}