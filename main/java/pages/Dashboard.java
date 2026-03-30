package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

public class Dashboard {

    private Page page;

    // Locators
    private final String liveHeadcountButton = "//div[text()='Live Head Counts']";
    private final String AccessGrantedButton = "//div[text()='Access Granted']";
    private final String AccessDeniedButton = "//div[text()='Access Denied']";
    private final String DoorAlarmsButton = "//div[text()='Door Alarms']";
    private final String dropdownTrigger = "(//div[@data-pc-section='trigger'])[2]";
    private final String item100Label = "//span[@class='p-dropdown-item-label' and text()='100']";
    private final String searchTxtbox = "//input[@placeholder='Search...']";
    private final String searchBtn = "//button[text()='Search']";

    public Dashboard(Page page) {
        this.page = page;
    }

    public void clickLiveHeadCount() {
        page.waitForSelector(liveHeadcountButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(liveHeadcountButton).click();
        System.out.println("Live Head Count tab is clicked.");
    }

    public void clickAccessGranted() {
        page.waitForSelector(AccessGrantedButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AccessGrantedButton).click();
        System.out.println("Access Granted tab is clicked.");
    }

    public void clickAccessDenied() {
        page.waitForSelector(AccessDeniedButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AccessDeniedButton).click();
        System.out.println("Access Denied tab is clicked.");
    }

    public void clickDoorAlarms() {
        page.waitForSelector(DoorAlarmsButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(DoorAlarmsButton).click();
        System.out.println("Door Alarms tab is clicked.");
    }
    
    public void clickDropdownTrigger() {
        page.waitForSelector(dropdownTrigger, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(dropdownTrigger).click();
        System.out.println("Pagination Dropdown is clicked.");
    }

    public void clickItem100Label() {
        page.waitForSelector(item100Label, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(item100Label).click();
        System.out.println("100 records options is clicked.");
    }

    public void searchRecord(String text) {
        page.waitForSelector(searchTxtbox, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));

        page.locator(searchTxtbox).fill(text);

        page.locator(searchBtn).click();
        System.out.println("Search a record.");
    }

    
}


