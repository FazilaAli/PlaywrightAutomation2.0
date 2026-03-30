package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;
import utils.Utility;

import static config.Configuration.*;

public class User {

    private Page page;


    private final String roleDescriptionInput = "//*[@id='areaTitle--editable']";
    private final String customCheckbox = "//input[@class='custom-checkbox']";
    private final String searchInput = "//input[@placeholder='Search...']";
    private final String saveButton = "//p[contains(@class, 'first_Save') and text()='Save']";
    private final String viewAddEditDeleteButton = "//*[@class='dropbtn' and contains(text(), 'View, Add, Edit, Delete')]";
    private final String deleteCheckbox = "//label[contains(., 'Delete')]/input[@type='checkbox']";
    private final String StatusToggle = "//tr[./td[normalize-space()='This is a managing role.']]//input[@type='checkbox' and @aria-checked='true']";
    private final String customSwitch = "//*[@class='custom-switch ']";
    private final String userIdInput = "//*[@id='User_ID']";
    private final String userEmailInput = "//*[@id='User_Email']";
    private final String fullNameInput = "//*[@id='Full_Name']";
    private final String phoneInput = "//*[@name='phone']";
    private final String passwordInput = "//*[@name='User_Password']";
    private final String designationDropdown = "//span[text()='Select Designation']";
    private final String designationOptionItManager = "//span[text()='IT Manager']";
    private final String termsCheckbox = "//label[text()='Check All']/preceding-sibling::input[@type='checkbox']";
    private final String dropdownLabel = "//span[text()='Yes']";
    private final String dropdownItemNo = "//*[@class='p-dropdown-item-label' and text()='No']";

    public User(Page page) {
        this.page = page;
    }


    public void enterRoleDescription(String value) {
        page.waitForSelector(roleDescriptionInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(roleDescriptionInput).fill(value);
    }

    public void clickCustomCheckbox() {
        page.waitForSelector(customCheckbox, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(customCheckbox).click();
    }

    public void enterSearch(String value) {
        page.waitForSelector(searchInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(searchInput).fill(value);
    }

    public void clickSave() {
        page.waitForSelector(saveButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(saveButton).click();
    }
    public void clickViewAddEditDelete() {
        page.waitForSelector(viewAddEditDeleteButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(viewAddEditDeleteButton).click();
    }

    public void clickDelete() {
        page.waitForSelector(deleteCheckbox, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(deleteCheckbox).click();
    }

    public void clickStatus() {
        page.waitForSelector(StatusToggle, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(StatusToggle).click();
    }

    public void clickStatus2(String name) {
        page.waitForSelector("//tr[./td[text()='" + name +"']]//input[@type='checkbox' and @aria-checked='false']", new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator("//tr[./td[text()='" + name +"']]//input[@type='checkbox' and @aria-checked='false']").click();
    }

    public void clickStatus3(String name) {
        page.waitForSelector("//tr[./td[text()='" + name +"']]//input[@type='checkbox' and @aria-checked='true']", new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator("//tr[./td[text()='" + name +"']]//input[@type='checkbox' and @aria-checked='true']").click();
    }

    public void clickCustomSwitch() {
        page.waitForSelector(customSwitch, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(customSwitch).click();
    }

    public void enterUserId(String value) {
        page.waitForSelector(userIdInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(userIdInput).fill(value);
    }

    public void enterUserEmail(String value) {
        page.waitForSelector(userEmailInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(userEmailInput).fill(value);
    }

    public void enterFullName(String value) {
        page.waitForSelector(fullNameInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(fullNameInput).fill(value);
    }

    public void enterPhone(String value) {
        page.waitForSelector(phoneInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(phoneInput).fill(value);
    }

    public void enterUserPassword(String value) {
        page.waitForSelector(passwordInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(passwordInput).fill(value);
    }

    public void clickDesignationDropdown() {
        page.waitForSelector(designationDropdown, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(designationDropdown).click();
    }

    public void clickDesignationOptionItManager() {
        page.waitForSelector(designationOptionItManager, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(designationOptionItManager).click();
    }

    public void clickTermsCheckbox() {
        page.waitForSelector(termsCheckbox, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(termsCheckbox).click();
    }

    public void clickDropdownLabel() {
        page.waitForSelector(dropdownLabel, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownLabel).click();
    }

    public void clickDropdownItemNo() {
        page.waitForSelector(dropdownItemNo, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownItemNo).click();
    }

}

