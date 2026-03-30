package testcases.AccessControlInsights;

import base.BaseTest;
import org.junit.jupiter.api.Test;

public class AccessApproval extends BaseTest {

    @Test
    public void AccessApproval() {

        // Login
        hp.Login();

        hp.clickAccessControls();

        hp.clickAccessApproval();

        // Bugs
        // https://dev.azure.com/SAM-Controls/Digital%20Faciliter/_workitems/edit/1634
        // https://dev.azure.com/SAM-Controls/Digital%20Faciliter/_workitems/edit/1635
    }

}

