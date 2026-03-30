package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

public class WorkflowSetups {

    private Page page;

    private final String inputNationality = "//*[@class[contains(.,'Nationality')] and @data-pc-name='inputtext']";

    private final String btnAddRecord = "(//button[contains(@class, 'btnRegion') and contains(., 'Add Record')])[2]";

    private final String inputGenericText = "(//input[@data-pc-name='inputtext' and not(contains(@class, 'Nationality')) and not(@name='Order_No')])[1]";

    private final String dropdownEnding = "//span[@data-pc-section='input' and text()='Ending']";

    private final String itemStarting = "//span[@data-pc-section='itemlabel' and text()='Starting']";

    private final String inputOrderNo = "//*[@name='Order_No' and @type='number']";

    private final String submitButton = "(//p[contains(@class, 'first_Save') and text()='Submit'])[2]";

    public WorkflowSetups(Page page) {
        this.page = page;
    }

    public void enterNationality(String value) {
        page.waitForSelector(inputNationality, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputNationality).fill(value);
    }

    public void clickAddRecord() {
        page.waitForSelector(btnAddRecord, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnAddRecord).click();
    }

    public void enterGenericText(String value) {
        page.waitForSelector(inputGenericText, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputGenericText).fill(value);
    }

    public void clickEndingDropdown() {
        page.waitForSelector(dropdownEnding, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownEnding).click();
    }

    public void clickStartingItem() {
        page.waitForSelector(itemStarting, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(itemStarting).click();
    }

    public void enterOrderNo(String value) {
        page.waitForSelector(inputOrderNo, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputOrderNo).fill(value);
    }

    public void clickSubmit() {
        page.waitForSelector(submitButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(submitButton).click();
    }

}

