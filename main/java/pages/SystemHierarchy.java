package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

public class SystemHierarchy {

    private Page page;

    private final String dropdownSelectOption = "//span[contains(text(),'Select an option')]";

    private final String dropdownSelectLocation = "//span[contains(text(),'Select Location')]";

    private final String optionCentral = "//*[@data-pc-section='itemlabel' and text()='C E N T R A L']";

    private final String optionMadina = "//*[@data-pc-section='itemlabel' and text()='Madina']";

    private final String optionhq = "//*[@data-pc-section='itemlabel' and text()='HQ- Tower2']";

    public SystemHierarchy(Page page) {
        this.page = page;
    }

    public void clickDropdownSelectOption() {
        page.waitForSelector(dropdownSelectOption, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownSelectOption).click();
    }

    public void clickDropdownSelectLocation() {
        page.waitForSelector(dropdownSelectLocation, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownSelectLocation).click();
    }

    public void clickOptionCentral() {
        page.waitForSelector(optionCentral, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(optionCentral).click();
    }

    public void clickOptionMadina() {
        page.waitForSelector(optionMadina, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(optionMadina).click();
    }

    public void clickOptionhq() {
        page.waitForSelector(optionhq, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(optionhq).click();
    }

}

