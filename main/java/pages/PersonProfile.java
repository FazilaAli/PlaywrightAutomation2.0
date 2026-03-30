package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

public class PersonProfile {

    private Page page;

    private final String personNamePInput = "//*[@id='Person_Name_P']";

    private final String personCardNoInput = "//*[@id='Person_Card_No']";

    private final String personIDInput = "//*[@id='Person_ID']";

    private final String secondaryTitleInput = "//*[@id='secondaryTitle--editable']";

    private final String submitButton = "//p[contains(@class, 'first_Save') and text()='Submit']";

    private final String inputMaxLen10 = "//input[@maxlength='10']";

    private final String dropdownLabel2345 = "//span[contains(@class, 'p-dropdown-label') and text()='2345']";

    private final String dropdownItemAutomation = "//span[text()='Automation']";

    private final String dropdownSelectModel = "//span[text()='Select Model']";

    private final String inputMaxLen30First = "(//input[@maxlength='30'])[1]";

    private final String inputMaxLen30Second = "(//input[@maxlength='30'])[2]";

    private final String inputNumberField = "//input[@type='number']";

    private final String inputMaxLen30Third = "(//input[@maxlength='30'])[3]";

    private final String saveButton = "(//*[@class='default-rt-btn first_Save'])[2]";

    private final String phoneInput = "//*[@type='tel']";

    private final String firstTextInput = "(//*[@data-pc-name='inputtext'])[8]";

    private final String cityDropdown = "//*[@id='Country_ID']";
    private final String citySaudi = "(//span[text()='SAUDI ARABIA'])[3]";

    private final String addressTextInput = "(//*[@data-pc-name='inputtext'])[9]";

    private final String secondTextInput = "(//*[@data-pc-name='inputtext'])[10]";

    private final String firstCheckbox = "(//*[@type='checkbox'])[1]";

    private final String secondCheckbox = "(//*[@type='checkbox'])[2]";


    public PersonProfile(Page page) {
        this.page = page;
    }

    public void enterPersonNameP(String value) {
        page.waitForSelector(personNamePInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(personNamePInput).fill(value);
    }

    public void enterPersonCardNo(String value) {
        page.waitForSelector(personCardNoInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(personCardNoInput).fill(value);
    }

    public void enterPersonID(String value) {
        page.waitForSelector(personIDInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(personIDInput).fill(value);
    }

    public void enterSecondaryTitle(String value) {
        page.waitForSelector(secondaryTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(secondaryTitleInput).fill(value);
    }

    public void clickSubmit() {
        page.waitForSelector(submitButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(submitButton).click();
    }

    public void enterInputMaxLen10(String value) {
        page.waitForSelector(inputMaxLen10, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputMaxLen10).fill(value);
    }

    public void clickDropdownLabel2345() {
        page.waitForSelector(dropdownLabel2345, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownLabel2345).click();
    }

    public void clickDropdownItemAutomation() {
        page.waitForSelector(dropdownItemAutomation, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownItemAutomation).click();
    }

    public void clickDropdownSelectModel() {
        page.waitForSelector(dropdownSelectModel, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownSelectModel).click();
    }

    public void enterInputMaxLen30First(String value) {
        page.waitForSelector(inputMaxLen30First, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputMaxLen30First).fill(value);
    }

    public void enterInputMaxLen30Second(String value) {
        page.waitForSelector(inputMaxLen30Second, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputMaxLen30Second).fill(value);
    }

    public void enterInputNumberField(String value) {
        page.waitForSelector(inputNumberField, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputNumberField).fill(value);
    }

    public void enterInputMaxLen30Third(String value) {
        page.waitForSelector(inputMaxLen30Third, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputMaxLen30Third).fill(value);
    }

    public void clickSave() {
        page.waitForSelector(saveButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(saveButton).click();
    }
    public void enterPhoneInput(String value) {
        page.waitForSelector(phoneInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(phoneInput).fill(value);
    }

    public void enterFirstTextInput(String value) {
        page.waitForSelector(firstTextInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(firstTextInput).fill(value);
    }

    public void clickCountryDropdown() {
        page.waitForSelector(cityDropdown, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(cityDropdown).click();
        page.waitForSelector(citySaudi, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(citySaudi).click();
    }

    public void enterAddressTextInput(String value) {
        page.waitForSelector(addressTextInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(addressTextInput).fill(value);
    }

    public void enterSecondTextInput(String value) {
        page.waitForSelector(secondTextInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(secondTextInput).fill(value);
    }

    public void clickFirstCheckbox() {
        page.waitForSelector(firstCheckbox, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(firstCheckbox).click();
    }

    public void clickSecondCheckbox() {
        page.waitForSelector(secondCheckbox, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(secondCheckbox).click();
    }

    public void clickDeleteIcon(String value) {
        page.waitForSelector("(//tr[.//td[contains(normalize-space(.),'" + value + "')]]//td[contains(@class,'action_id')]//*[name()='svg'])[2]", new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator("(//tr[.//td[contains(normalize-space(.),'" + value + "')]]//td[contains(@class,'action_id')]//*[name()='svg'])[2]").click();
    }

}

