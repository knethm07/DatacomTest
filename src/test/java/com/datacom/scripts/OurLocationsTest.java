package com.datacom.scripts;

import com.datacom.pages.Contactus;
import com.datacom.utilities.CommonFunctions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import static com.datacom.pages.Contactus.scrollNewZealandTabToMiddle;
import static com.datacom.pages.Contactus.scrollNewZealandTabToTop;

public class OurLocationsTest extends CommonFunctions {

    @BeforeClass
    public static void openApplication(){
        openBrowser("Chrome");
        goToURL("https://datacom.com/nz/en/contact-us");
    }

    @Test(priority = 0, description = "Verify upon landing to contact us link, Our Locations is selected in Breadcrumb.")
    public static void verifyActiveBreadcrumb() throws Exception {
        Contactus.verifyTheActiveBreadcrumbName("Our locations");
    }

    @Test(priority = 1, description = "Verify clicking header tabs will show each section of the page.")
    public static void verifySectionTitlesAreDisplayed() throws Exception {
        Contactus.verifyStickyHeaderIsDisplayed();
        Contactus.verifyTitleOurLocationsIsDisplayed();
        Contactus.clickGetInTouchTab();
        Contactus.verifyTitleGetInTouchIsDisplayed();
        Contactus.verifyStickyHeaderIsNotDisplayed();
        Contactus.clickMediaPackTab();
        Contactus.verifyTitleMediaPackIsDisplayed();
    }

    @Test(priority = 2, description = "Verify the number of cities or countries per location.")
    public static void verifyCountriesCountPerLocation() throws Exception {
        Contactus.verifyNewZealandLocationCount(10);
        Contactus.verifyActiveNewZealandCityTabs(1);
        scrollNewZealandTabToMiddle();
        Contactus.clickAustraliaTab();
        Contactus.verifyAustraliaLocationCount(8);
        Contactus.verifyActiveAustraliaCountryTabs(1);
        Contactus.clickAsiaTab();
        Contactus.verifyAsiaLocationCount(3);
        Contactus.verifyActiveAsiaCountryTabs(1);
    }
}
