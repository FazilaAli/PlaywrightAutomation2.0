package driver;

import com.microsoft.playwright.Page;

public class BrowserManager {

    private static final ThreadLocal<Page> page = new ThreadLocal<>();

    public static Page getPage() {
        return page.get();
    }

    public static void setPage(Page p) {
        page.set(p);
    }

    public static void unload() {
        page.remove();
    }
}
