package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

public class SystemSetups {

    private Page page;

    private final String countryTitleInput = "//*[@name='Country_Title_P']";

    private final String countryTitleInput2 = "//*[@name='Country_Title_S']";

    private final String CityTitleInput = "//*[@name='City_Title_P']";

    private final String CityTitleInput2 = "//*[@name='City_Title_S']";

    private final String nationalityTitleInput = "//*[@name='Nationality_Title_P']";

    private final String nationalityTitleInput2 = "//*[@name='Nationality_Title_S']";

    private final String countryCodeInput = "//*[@name='Country_Code']";

    private final String CityCodeInput = "//*[@name='City_ID']";

    private final String dialingCodeInput = "//*[@name='Country_Dialing_Code'] | //*[@name='City_Dialing_Code']";

    private final String dropdownStatus = "//*[@data-pc-section='input' and contains(text(), 'Inactive')]";

    private final String optionActive = "//*[@data-pc-section='itemlabel' and text()='Active']";

    private final String dropdownTrigger = "//*[@data-pc-section='input' and contains(text(), 'Enter Title Here')]";

    private final String filterInput = "//*[@data-pc-section='filterinput']";

    private final String dominicaOption = "//*[@data-pc-section='itemlabel' and text()='DOMINICA']";

    private final String inputTitle = "//*[@id='areaTitle--editable']";

    private final String inputSecondaryTitle = "//*[@id='secondaryTitle--editable']";

    private final String plateColorDropdown = "//span[contains(., 'Select Plate Color Here')]";

    private final String redPlateOption = "//*[@data-pc-section='itemlabel' and text()='RED']";

    private final String secondaryTitleInput = "//*[@name='VCat_Title_S']";

    private final String addModelButton = "//*[@aria-label='Add Model']";

    private final String modelTitleInput = "(//*[@id='areaTitle--editable'])[2]";

    private final String submitButton = "(//p[contains(@class, 'first_Save') and text()='Submit'])[1]";

    private final String holidaysTitleInput = "//*[@name='Holidays_Title_P']";

    private final String holidaysTitleInput2 = "//*[@name='Holidays_Title_S']";

    private final String remarksInput = "//*[@name='Remarks']";

    private final String inputShiftCode = "//*[@id='ShiftCode']";

    private final String inputShiftTitle = "//*[@id='areaTitle--editable']";

    private final String inputStartingTime = "//*[@name='Starting_Time']";

    private final String inputEndingTime = "//*[@name='Ending_Time']";

    private final String inputShiftDuration = "//*[@name='Shift_Duration']";

    private final String inputGraceTime = "//*[@name='Grace_Time']";

    public SystemSetups(Page page) {
        this.page = page;
    }

    public void enterCountryTitle(String value) {
        page.waitForSelector(countryTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(countryTitleInput).fill(value);
    }

    public void enterCountryTitle2(String value) {
        page.waitForSelector(countryTitleInput2, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(countryTitleInput2).fill(value);
    }

    public void enterCityTitle(String value) {
        page.waitForSelector(CityTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(CityTitleInput).fill(value);
    }

    public void enterCityTitle2(String value) {
        page.waitForSelector(CityTitleInput2, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(CityTitleInput2).fill(value);
    }

    public void enterNationalityTitle(String value) {
        page.waitForSelector(nationalityTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(nationalityTitleInput).fill(value);
    }

    public void enterNationalityTitle2(String value) {
        page.waitForSelector(nationalityTitleInput2, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(nationalityTitleInput2).fill(value);
    }

    public void enterCountryCode(String value) {
        page.waitForSelector(countryCodeInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(countryCodeInput).fill(value);
    }

    public void enterCityCode(String value) {
        page.waitForSelector(CityCodeInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(CityCodeInput).fill(value);
    }

    public void enterDialingCode(String value) {
        page.waitForSelector(dialingCodeInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dialingCodeInput).fill(value);
    }

    public void clickDropdownStatus() {
        page.waitForSelector(dropdownStatus, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownStatus).click();
    }

    public void clickOptionActive() {
        page.waitForSelector(optionActive, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(optionActive).click();
    }

    public void clickDropdownTrigger() {
        page.waitForSelector(dropdownTrigger, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownTrigger).click();
    }

    public void enterFilterInput(String value) {
        page.waitForSelector(filterInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(filterInput).fill(value);
    }

    public void clickDominicaOption() {
        page.waitForSelector(dominicaOption, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dominicaOption).click();
    }

    public void enterTitle(String value) {
        page.waitForSelector(inputTitle, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputTitle).fill(value);
    }

    public void enterSecondaryTitle(String value) {
        page.waitForSelector(inputSecondaryTitle, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputSecondaryTitle).fill(value);
    }

    public void clickPlateColorDropdown() {
        page.waitForSelector(plateColorDropdown, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(plateColorDropdown).click();
    }

    public void clickRedPlateOption() {
        page.waitForSelector(redPlateOption, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(redPlateOption).click();
    }

    public void enterSecondaryTitle2(String value) {
        page.waitForSelector(secondaryTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(secondaryTitleInput).fill(value);
    }

    public void clickAddModel() {
        page.waitForSelector(addModelButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(addModelButton).click();
    }

    public void enterModelTitle(String value) {
        page.waitForSelector(modelTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(modelTitleInput).fill(value);
    }

    public void clickSubmit() {
        page.waitForSelector(submitButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(submitButton).click();
    }

    public void clickEditIcon(String value) {
        page.waitForSelector("(//tr[.//td[contains(normalize-space(.),'Automation')]]//div[contains(@class,'wrappedModal')]//*[name()='svg'])[1]", new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator("(//tr[.//td[contains(normalize-space(.),'Automation')]]//div[contains(@class,'wrappedModal')]//*[name()='svg'])[1]").click();
    }

    public void clickDeleteIcon(String value) {
        page.waitForSelector("(//tr[.//td[contains(normalize-space(.),'Automation')]]//div[contains(@class,'wrappedModal')]//*[name()='svg'])[2]", new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator("(//tr[.//td[contains(normalize-space(.),'Automation')]]//div[contains(@class,'wrappedModal')]//*[name()='svg'])[2]").click();
    }

    public void selectHolidayDateAsToday() {
        // Click on Date Input Field
        page.locator("//input[@name='Holiday_Date']")
                .click();
        // Wait for Date Picker Panel to be visible
        page.locator("//div[@id='holidayDate_panel']")
                .waitFor();
        // Click on Today's Date (PrimeFaces specific attribute)
        page.locator("//td[@data-p-today='true']//span")
                .click();
    }

    public void enterHolidaysTitle(String value) {
        page.waitForSelector(holidaysTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(holidaysTitleInput).fill(value);
    }

    public void enterHolidaysTitle2(String value) {
        page.waitForSelector(holidaysTitleInput2, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(holidaysTitleInput2).fill(value);
    }

    public void enterRemarks(String value) {
        page.waitForSelector(remarksInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(remarksInput).fill(value);
    }

    public void enterShiftCode(String value) {
        page.waitForSelector(inputShiftCode, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputShiftCode).fill(value);
    }

    public void enterShiftTitle(String value) {
        page.waitForSelector(inputShiftTitle, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputShiftTitle).fill(value);
    }

    public void enterStartingTime(String value) {
        page.waitForSelector(inputStartingTime, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputStartingTime).fill(value);
    }

    public void enterEndingTime(String value) {
        page.waitForSelector(inputEndingTime, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputEndingTime).fill(value);
    }

    public void enterShiftDuration(String value) {
        page.waitForSelector(inputShiftDuration, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputShiftDuration).fill(value);
    }

    public void enterGraceTime(String value) {
        page.waitForSelector(inputGraceTime, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(inputGraceTime).fill(value);
    }

}

