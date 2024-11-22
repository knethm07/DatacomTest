package com.datacom.scripts;

import com.datacom.pages.DummyDashboard;
import com.datacom.pages.DummyLogin;
import com.datacom.utilities.CommonFunctions;
import org.testng.annotations.Test;

public class DummyDummyLoginTest extends CommonFunctions{

    @Test
    public static void verifySuccessLogin() throws Exception {
        openBrowser("Chrome");
        goToURL("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        DummyLogin.setTextUsername("Admin");
        DummyLogin.setTextPassword("admin123");
        DummyLogin.clickLogin();
        DummyDashboard.verifyProfilePictureIsDisplayed();
    }


}
