package driver;

import com.microsoft.playwright.*;
import config.Configuration;

public class PlaywrightFactory {

    private static Playwright playwright;
    private static Browser browser;
    private static BrowserContext context;
    private static Page page;

    public static Page initBrowser() {

        playwright = Playwright.create();

        switch (Configuration.BROWSER.toLowerCase()) {
            case "firefox":
                browser = playwright.firefox().launch(
                        new BrowserType.LaunchOptions()
                                .setHeadless(Configuration.HEADLESS));
                break;

            case "webkit":
                browser = playwright.webkit().launch(
                        new BrowserType.LaunchOptions()
                                .setHeadless(Configuration.HEADLESS));
                break;

            default:
                browser = playwright.chromium().launch(
                        new BrowserType.LaunchOptions()
                                .setHeadless(Configuration.HEADLESS));
                break;
        }

        context = browser.newContext(
                new Browser.NewContextOptions()
                        .setViewportSize(1920, 1080)
        );

        page = context.newPage();
        page.setDefaultTimeout(Configuration.TIMEOUT);
        page.navigate(Configuration.BASE_URL);

        return page;
    }

    public static void closeBrowser() {
        if (playwright != null) {
            playwright.close();
        }
    }
}

