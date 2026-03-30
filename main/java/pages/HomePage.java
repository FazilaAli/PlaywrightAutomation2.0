package pages;

import com.microsoft.playwright.Page;
import com.microsoft.playwright.options.WaitForSelectorState;
import config.Configuration;

import static config.Configuration.*;
import static config.Configuration.PASSWORD;
import static config.Configuration.USERNAME;

public class HomePage {

    private Page page;

    // Locators
    private final String ipInput = "#ip";
    private final String portInput = "#port";
    private final String submitButton = "//p[contains(text(),'Submit')]";
    private final String userid = "#userId";
    private final String userName = "#Full_Name";
    private final String userpassword = "#Password";
    private final String signInButton = "button.signInButton";
    private final String RequestAccountButton = "span.createAccount";
    private final String emailAddress = "#User_Email";
    private final String phoneInput = "input[name='phone']";
    private final String AccessControlButton = "//span[text()='Access Controls Insights']";
    private final String AccessSetupsButton = "//span[text()='Access Setups']";
    private final String AttendanceControlButton = "//span[text()='Attendance Insights']";
    private final String AttendanceSetupsButton = "//span[text()='Attendance Setups']";
    private final String AttendancePunchingButton = "//span[text()='Attendance Punching']";
    private final String ConfigurationButton = "//span[text()='Configuration']";
    private final String WorkflowSetupsButton = "//span[text()='Workflow Setups']";
    private final String UserManagementButton = "//span[text()='User Management']";
    private final String UserAccountButton = "//button[text()='User Account']";
    private final String btnCity = "//button[text()='City']";
    private final String btnPersonProfile = "//span[text()='Person Profile']";
    private final String btnDepartment = "//button[text()='Department']";
    private final String btnDesignation = "//button[text()='Designation']";
    private final String btnGroup = "//button[text()='Group']";
    private final String btnCategory = "//button[text()='Category']";
    private final String btnVehicleCategory = "//button[text()='Vehicle Category']";
    private final String btnVehicleMakeModel = "//button[text()='Vehicle Make Model']";
    private final String btnHolidays = "//button[text()='Holidays']";
    private final String btnOffdays = "//button[text()='Offdays']";
    private final String btnShifts = "//button[text()='Shifts']";
    private final String btnProcess = "//button[text()='Process']";
    private final String btnSystemHierarchy = "//span[text()='System Hierarchy']";
    private final String btnDevicesSettings = "//span[text()='Devices Settings']";
    private final String btnRegion = "//button[text()='Region']";
    private final String btnLocation = "//button[text()='Location']";
    private final String btnArea = "//button[text()='Area']";
    private final String AccessRequestButton = "//span[text()='Access Request']";
    private final String AttendanceRequestButton = "//span[text()='Attendance Request']";
    private final String AccessApprovalButton = "//span[text()='Access Approval']";
    private final String SystemSetupsButton = "//span[text()='System Setups']";
    private final String AddRecordButton = "//button[text()='Add Record']";
    private final String keyboardArrowRightIcon = "//*[local-name()='svg' and @data-testid='KeyboardArrowRightIcon']";


    public HomePage(Page page) {
        this.page = page;
    }

    // Navigate to URL
    public void navigateToUrl(String url) {
        page.navigate(url);
    }
    
    public void Login(){

        // Navigate to URL
        page.navigate(BASE_URL, new Page.NavigateOptions().setTimeout(TIMEOUTLogin));

        // Set IP and Port
        this.submitIPAndPort(IP, PORT);

        // Set User Id
        this.enterUserId(USERNAME);

        // Set Password
        this.enterPassword(PASSWORD);

        // Click Sign in button
        this.clickSignIn();
        
    }

    // Method to set configuration
    public void submitIPAndPort(String ip, String port) {
        // Wait for IP field to be visible
        page.waitForSelector(ipInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUTLogin));
        // Fill fields
        page.fill(ipInput, ip);
        page.fill(portInput, port);
        // Click submit
        page.click(submitButton);
        System.out.println("IP and Port are set.");

    }

    public void enterUserId(String userId) {
        page.waitForSelector(userid, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUTLogin));
        page.locator(userid).fill(userId);
        System.out.println("User Id is set.");
    }

    public void enterPassword(String password) {
        page.waitForSelector(userpassword, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUTLogin));
        page.locator(userpassword).fill(password);
        System.out.println("Password is set.");
    }

    public void clickSignIn() {
        page.waitForSelector(signInButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUTLogin));
        page.locator(signInButton).click();
        System.out.println("Signin/Next button is clicked.");
    }

    public void clickRequestAccount() {
        page.waitForSelector(RequestAccountButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(RequestAccountButton).click();
        System.out.println("Request an account link is clicked.");
    }

    public void enterUserName(String name) {
        page.waitForSelector(userName, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(userName).fill(name);
        System.out.println("Username is set.");
    }

    public void setEmail(String mail) {
        page.waitForSelector(emailAddress, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(emailAddress).fill(mail);
        System.out.println("Email is set.");
    }

    public void enterPhone(String value) {
        page.waitForSelector(phoneInput, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(phoneInput).click();
        page.locator(phoneInput).type(value);
        System.out.println("Phone Number is set.");
    }

    public void clickAccessControls() {
        page.waitForSelector(AccessControlButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AccessControlButton).click();
        System.out.println("Access Control Insights is clicked.");
    }

    public void clickAccessSetups() {
        page.waitForSelector(AccessSetupsButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AccessSetupsButton).click();
        System.out.println("Access Setups is clicked.");
    }

    public void clickAttendanceControls() {
        page.waitForSelector(AttendanceControlButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AttendanceControlButton).click();
        System.out.println("Attendance Control Insights is clicked.");
    }

    public void clickAttendanceSetups() {
        page.waitForSelector(AttendanceSetupsButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AttendanceSetupsButton).click();
        System.out.println("Attendance Setups is clicked.");
    }

    public void clickAttendancePunching() {
        page.waitForSelector(AttendancePunchingButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AttendancePunchingButton).click();
        System.out.println("Attendance Punching is clicked.");
    }

    public void clickAddRecord() {
        page.waitForSelector(AddRecordButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AddRecordButton).click();
        System.out.println("Add Record Insights is clicked.");
    }

    public void clickAccessRequest() {
        page.waitForSelector(AccessRequestButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AccessRequestButton).click();
        System.out.println("Access Request is clicked.");
    }

    public void clickAttendanceRequest() {
        page.waitForSelector(AttendanceRequestButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AttendanceRequestButton).click();
        System.out.println("Attendance Request is clicked.");
    }

    public void clickAccessApproval() {
        page.waitForSelector(AccessApprovalButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(AccessApprovalButton).click();
        System.out.println("Access Approval is clicked.");
    }

    public void clickUserManagement() {
        page.waitForSelector(UserManagementButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(UserManagementButton).click();
        System.out.println("User Management is clicked.");
    }

    public void clickUserAccount() {
        page.waitForSelector(UserAccountButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(UserAccountButton).click();
        System.out.println("User Account is clicked.");
    }

    public void clickCity() {
        page.waitForSelector(btnCity, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnCity).click();
        System.out.println("City is clicked.");
    }

    public void clickConfiguration() {
        page.waitForSelector(ConfigurationButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(ConfigurationButton).click();
        System.out.println("Configuration is clicked.");
    }

    public void clickSystemSetups() {
        page.waitForSelector(SystemSetupsButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(SystemSetupsButton).click();
        System.out.println("System Setups is clicked.");
    }

    public void clickDepartment() {
        page.waitForSelector(btnDepartment, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnDepartment).click();
        System.out.println("Department is clicked.");
    }

    public void clickDesignation() {
        page.waitForSelector(btnDesignation, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnDesignation).click();
        System.out.println("Designation is clicked.");
    }

    public void clickGroup() {
        page.waitForSelector(btnGroup, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnGroup).click();
        System.out.println("Group is clicked.");
    }

    public void clickCategory() {
        page.waitForSelector(btnCategory, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnCategory).click();
        System.out.println("Category is clicked.");
    }

    public void clickVehicleCategory() {
        page.waitForSelector(btnVehicleCategory, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnVehicleCategory).click();
        System.out.println("VehicleCategory is clicked.");
    }

    public void clickVehicleMakeModel() {
        page.waitForSelector(btnVehicleMakeModel, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnVehicleMakeModel).click();
        System.out.println("VehicleMakeModel is clicked.");
    }

    public void clickHolidays() {
        page.waitForSelector(btnHolidays, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnHolidays).click();
        System.out.println("Holidays is clicked.");
    }

    public void clickOffdays() {
        page.waitForSelector(btnOffdays, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnOffdays).click();
        System.out.println("Offdays is clicked.");
    }

    public void clickKeyboardArrowRightIcon() {
        page.waitForSelector(keyboardArrowRightIcon, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(keyboardArrowRightIcon).click();
    }

    public void clickShifts() {
        page.waitForSelector(btnShifts, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnShifts).click();
        System.out.println("Shifts is clicked.");
    }

    public void clickWorkflowSetups() {
        page.waitForSelector(WorkflowSetupsButton, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(WorkflowSetupsButton).click();
        System.out.println("Workflow Setups is clicked.");
    }

    public void clickProcess() {
        page.waitForSelector(btnProcess, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnProcess).click();
        System.out.println("Process is clicked.");
    }

    public void clickSystemHierarchy() {
        page.waitForSelector(btnSystemHierarchy, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnSystemHierarchy).click();
        System.out.println("SystemHierarchy is clicked.");
    }

    public void clickRegion() {
        page.waitForSelector(btnRegion, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnRegion).click();
        System.out.println("Region is clicked.");
    }

    public void clickLocation() {
        page.waitForSelector(btnLocation, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnLocation).click();
        System.out.println("Location is clicked.");
    }

    public void clickArea() {
        page.waitForSelector(btnArea, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnArea).click();
        System.out.println("Area is clicked.");
    }

    public void clickDevices() {
        page.waitForSelector(btnDevicesSettings, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnDevicesSettings).click();
        System.out.println("DevicesSettings is clicked.");
    }

    public void clickPersonProfile() {
        page.waitForSelector(btnPersonProfile, new Page.WaitForSelectorOptions()
                .setState(WaitForSelectorState.VISIBLE).setTimeout(Configuration.TIMEOUT));
        page.locator(btnPersonProfile).click();
        System.out.println("Person Profile is clicked.");
    }
}

