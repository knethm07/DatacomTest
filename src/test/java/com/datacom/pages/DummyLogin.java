package com.datacom.pages;

import com.datacom.utilities.CommonFunctions;
import org.openqa.selenium.By;

public class DummyLogin extends CommonFunctions {

    static By textboxUsername = By.xpath("//input[@name='username']");
    static By textboxPassword = By.name("password");
    static By buttonLogin = By.xpath("//button[@type='submit']");


    public static void setTextUsername(String pInput) throws Exception {
        setText(textboxUsername, pInput);
    }

    public static void setTextPassword(String pInput) throws Exception {
        setText(textboxPassword, pInput);
    }

    public static void clickLogin() throws Exception {
        click(buttonLogin);
    }
}
