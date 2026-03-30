package base;

import com.microsoft.playwright.*;
import config.Configuration;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.AfterEach;
import pages.*;

public class BaseTest {

    protected Playwright playwright;
    protected Browser browser;
    protected BrowserContext context;
    protected Page page;

    protected HomePage hp;
    protected Dashboard dash;
    protected AccessSetups ac;
    protected AccessRequest ar;
    protected AttendanceSetups at;
    protected AttendanceRequest atr;
    protected AttendancePunching ap;
    protected User us;
    protected SystemSetups ss;
    protected WorkflowSetups ws;
    protected SystemHierarchy sh;
    protected DevicesSettings ds;
    protected PersonProfile pp;

    @BeforeEach
    public void setUp() {
        playwright = Playwright.create();

        BrowserType.LaunchOptions options = new BrowserType.LaunchOptions()
                .setHeadless(Configuration.HEADLESS);

        switch (Configuration.BROWSER.toLowerCase()) {
            case "firefox":
                browser = playwright.firefox().launch(options);
                break;
            case "webkit":
                browser = playwright.webkit().launch(options);
                break;
            default:
                browser = playwright.chromium().launch(options);
        }

        context = browser.newContext();
        page = context.newPage();
        page.setDefaultTimeout(Configuration.TIMEOUT);

        // Initialize HomePage here
        hp = new HomePage(page);
        dash = new Dashboard(page);
        ac = new AccessSetups(page);
        ar = new AccessRequest(page);
        at = new AttendanceSetups(page);
        atr = new AttendanceRequest(page);
        ap = new AttendancePunching(page);
        us = new User(page);
        ss = new SystemSetups(page);
        ws = new WorkflowSetups(page);
        sh = new SystemHierarchy(page);
        ds = new DevicesSettings(page);
        pp = new PersonProfile(page);
    }

    @AfterEach
    public void tearDown() {
        if (page != null) page.close();
        if (context != null) context.close();
        if (browser != null) browser.close();
        if (playwright != null) playwright.close();
    }
}
