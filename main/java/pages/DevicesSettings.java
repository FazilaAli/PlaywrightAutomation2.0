package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

public class DevicesSettings {

    private Page page;

    private final String deviceTitleInput = "//*[@id='Device_Title']";

    private final String secondaryTitleInput = "//*[@id='secondaryTitle--editable']";


    public DevicesSettings(Page page) {
        this.page = page;
    }

    public void enterDeviceTitle(String value) {
        page.waitForSelector(deviceTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(deviceTitleInput).fill(value);
    }

    public void enterSecondaryTitle(String value) {
        page.waitForSelector(secondaryTitleInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(secondaryTitleInput).fill(value);
    }

}

