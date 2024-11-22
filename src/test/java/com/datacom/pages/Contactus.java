package com.datacom.pages;

import com.datacom.utilities.CommonFunctions;
import org.openqa.selenium.By;

public class Contactus extends CommonFunctions {

    static By stickyHeader = By.xpath("//header[@class='cmp-header-mega']");
    static By activeBreadcrumb = By.xpath("//nav[@class='cmp-breadcrumb']//li[contains(@class,'breadcrumb__item--active')]");
    static By headerTabOurLocations = By.xpath("//a[@class='cmp-tabs__anchor-link ' and @href='#our-locations']");
    static By headerTabGetInTouch = By.xpath("//a[@class='cmp-tabs__anchor-link ' and @href='#get-in-touch']");
    static By headerTabMediaPack = By.xpath("//a[@class='cmp-tabs__anchor-link ' and @href='#media-pack']");
    static By titleOurLocations = By.xpath("//div[@class='cmp-title']//*[text()='Our locations']");
    static By titleGetInTouch = By.xpath("//*[@class='text-with-image__heading' and text()='Get in touch']");
    static By titleOurMediaPack = By.xpath("//*[@class='text-with-image__heading' and text()='Our media pack']");
    static By tabNewZealand = By.xpath("//li[contains(@class,'cmp-location__nav__items__item') and normalize-space()='New Zealand']");
    static By tabNewAustralia = By.xpath("//li[contains(@class,'cmp-location__nav__items__item') and normalize-space()='Australia']");
    static By tabAsia = By.xpath("//li[contains(@class,'cmp-location__nav__items__item') and normalize-space()='Asia']");
    static By numberOfNewZealandLocations = By.xpath("//div[@region='New Zealand']/div[@class='cmp-location__location-container']");
    static By numberOAustraliaLocations = By.xpath("//div[@region='Australia']/div[@class='cmp-location__location-container']");
    static By numberOAsiaLocations = By.xpath("//div[@region='Asia']/div[@class='cmp-location__location-container']");
    static By numberofActiveNewZealandCityTabs = By.xpath("//div[@region='New Zealand']//div[@class='cmp-location__location-container']/div[contains(@class,'cmp-location__location__name') and @tabindex='-1']");
    static By numberofActiveAustraliaCountryTabs = By.xpath("//div[@region='Australia']//div[@class='cmp-location__location-container']/div[contains(@class,'cmp-location__location__name') and @tabindex='-1']");
    static By numberofActiveAsiaCountryTabs = By.xpath("//div[@region='Asia']//div[@class='cmp-location__location-container']/div[contains(@class,'cmp-location__location__name') and @tabindex='-1']");

    public static void clickNewZealandTab() throws Exception {
        click(tabNewZealand);
    }

    public static void clickAustraliaTab() throws Exception {
        click(tabNewAustralia);
    }

    public static void clickOurLocationsTab() throws Exception {
        click(headerTabOurLocations);
    }

    public static void clickGetInTouchTab() throws Exception {
        click(headerTabGetInTouch);
    }

    public static void clickMediaPackTab() throws Exception {
        click(headerTabMediaPack);
    }

    public static void clickAsiaTab() throws Exception {
        click(tabAsia);
    }

    public static void verifyStickyHeaderIsDisplayed() throws Exception {
        verifyObjectIsDisplayed(stickyHeader);
    }

    public static void verifyStickyHeaderIsNotDisplayed() throws Exception {
        verifyObjectIsNotDisplayed(stickyHeader);
    }

    public static void verifyTitleOurLocationsIsDisplayed() throws Exception {
        verifyObjectIsDisplayed(titleOurLocations);
    }

    public static void verifyTitleGetInTouchIsDisplayed() throws Exception {
        verifyObjectIsDisplayed(titleGetInTouch);
    }

    public static void verifyTitleMediaPackIsDisplayed() throws Exception {
        verifyObjectIsDisplayed(titleOurMediaPack);
    }

    public static void verifyTheActiveBreadcrumbName(String pExpected) throws Exception {
        verifyObjectTextMatch(activeBreadcrumb, pExpected);
    }

    public static void verifyNewZealandLocationCount(int pExpected) throws Exception {
        verifyObjectCount(numberOfNewZealandLocations, pExpected);
    }

    public static void verifyAustraliaLocationCount(int pExpected) throws Exception {
        verifyObjectCount(numberOAustraliaLocations, pExpected);
    }

    public static void verifyAsiaLocationCount(int pExpected) throws Exception {
        verifyObjectCount(numberOAsiaLocations, pExpected);
    }

    public static void verifyActiveNewZealandCityTabs(int pExpected) throws Exception {
        verifyObjectCount(numberofActiveNewZealandCityTabs, pExpected);
    }

    public static void verifyActiveAustraliaCountryTabs(int pExpected) throws Exception {
        verifyObjectCount(numberofActiveAustraliaCountryTabs, pExpected);
    }

    public static void verifyActiveAsiaCountryTabs(int pExpected) throws Exception {
        verifyObjectCount(numberofActiveAsiaCountryTabs, pExpected);
    }

    public static void scrollNewZealandTabToTop() throws Exception {
        scrollToTop(tabNewZealand);
    }

    public static void scrollNewZealandTabToMiddle() throws Exception {
        scrollToMiddle(tabNewZealand);
    }
}
