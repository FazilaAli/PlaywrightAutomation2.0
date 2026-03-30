package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

public class AccessSetups {

    private Page page;

    private final String accessLevelTitleInput = "//*[@id='areaTitle--editable']";
    private final String statusDropdown = "//*[@id='status--editable']";
    private final String statusInactive = "(//span[text()='Inactive'])[1]";
    private final String saveButton = "(//*[contains(@class, 'first_Save')])[1]";
    private final String saveButton2 = "(//*[contains(@class, 'first_Save')])[2]";
    private final String secondaryTitleInput = "//*[@id='secondaryTitle--editable']";
    private final String searchInput = "//*[@class='me-2 member_rtn_tr']//input[@placeholder='Search...']";
    private final String searchButton = "//*[@class='me-2 member_rtn_tr']//button[text()='Search']";
    private final String inputSwitch = "(//*[@role='switch'])[1]";
    private final String inputEditIcon = "(//p[@class='peraEdit'])[1]";
    private final String inputDeleteIcon = "(//p/*[name()='svg'])[2]";
    private final String deleteButton = "//*[@class='default-rt-btn first_cancel']";

    public AccessSetups(Page page) {
        this.page = page;
    }

    public void enterAccessLevelTitle(String value) {
        page.waitForSelector(accessLevelTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(accessLevelTitleInput).fill(value);
    }

    public void clickInactiveStatus() {
        page.waitForSelector(statusDropdown, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(statusDropdown).click();
        page.locator(statusInactive).click();
    }

    public void clickSave() {
        page.waitForSelector(saveButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(saveButton).click();
    }

    public void clickSave2() {
        page.waitForSelector(saveButton2, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(saveButton2).click();
    }

    public void enterSecondaryTitle(String value) {
        page.waitForSelector(secondaryTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(secondaryTitleInput).fill(value);
    }

    public void enterSearchInput(String value) {
        page.waitForSelector(searchInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(searchInput).fill(value);
    }

    public void clickSearchButton() {
        page.waitForSelector(searchButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(searchButton).click();
    }

    public void clickInputSwitch() {
        page.waitForSelector(inputSwitch, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputSwitch).click();
    }

    public void clickEditIcon() {
        page.waitForSelector(inputEditIcon, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputEditIcon).click();
    }

    public void clickDeleteIcon() {
        page.waitForSelector(inputDeleteIcon, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputDeleteIcon).click();
    }

    public void clickDelete() {
        page.waitForSelector(deleteButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(deleteButton).click();
    }

}