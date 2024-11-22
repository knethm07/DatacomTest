package com.datacom.pages;

import com.datacom.utilities.CommonFunctions;
import org.openqa.selenium.By;

public class DummyDashboard extends CommonFunctions {

    static By imageProfilePicture = By.xpath("//img[@alt='profile picture']");

    public static void verifyProfilePictureIsDisplayed() throws Exception {
        verifyObjectIsDisplayed(imageProfilePicture);
    }

}
