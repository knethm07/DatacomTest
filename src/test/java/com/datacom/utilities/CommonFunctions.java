package com.datacom.utilities;

import org.openqa.selenium.*;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterSuite;

import java.time.Duration;
import java.util.List;

public class CommonFunctions {

    public static WebDriver driver = null;
    static WebDriverWait wait;
    private static final int WAIT_IN_SECONDS = 5;
    private static final Duration waitDuration = Duration.ofSeconds(WAIT_IN_SECONDS);
    private static final String projectPath = System.getProperty("user.dir");

    public static void openBrowser(String pBrowserName){

        if (pBrowserName.equalsIgnoreCase("Chrome")){
            System.setProperty("webdriver.chrome.driver", projectPath + "/src/test/resources/chromedriver.exe");
            driver = new ChromeDriver();

            driver.manage().window().maximize();
        }else{
            System.out.println("[INFO] Browser Name unknown");
        }
    }

    public static void goToURL(String pURL){

        driver.get(pURL);
    }

    @AfterSuite
    public void tearDown(){

        try {
            if (driver != null) {
                driver.quit();
            }
        } catch (Exception e) {
            System.out.println("[ERROR] Error during tearDown: " + e.getMessage());
            e.printStackTrace();
        }
    }

    public static boolean isDisplayed(By pLocator) throws Exception{
            try{
                wait = new WebDriverWait(driver, waitDuration);
                wait.until(ExpectedConditions.presenceOfElementLocated(pLocator));
                wait.until(ExpectedConditions.visibilityOfElementLocated(pLocator));
                return true;
            }catch(TimeoutException e){
                System.err.println("[ERROR] Object was not displayed within '" + WAIT_IN_SECONDS + "' seconds: " +e);
                return false;
            }
    }

    public static void click(By pLocator) throws Exception {

        if(isDisplayed(pLocator)){
            driver.findElement(pLocator).click();
            System.out.println("[PASS] Element is clicked");
        }else{
            System.err.println("[ERROR] Element not displayed");
        }

    }

    public static void setText(By pLocator, String pInput) throws Exception {

        if(isDisplayed(pLocator)){
            driver.findElement(pLocator).sendKeys(pInput);
            System.out.println("[PASS] " + pInput + " is entered");
        }else{
            System.err.println("[ERROR] Element not displayed");
        }
    }

    public static void verifyObjectIsDisplayed(By pLocator) throws Exception {

        if(isDisplayed(pLocator)){
            driver.findElement(pLocator).isDisplayed();
            System.out.println("[PASS] Element displayed");
        }
    }

    public static void verifyObjectIsNotDisplayed(By pLocator) throws Exception {

//        if(!isDisplayed(pLocator)){
//            System.out.println("[PASS] Element not displayed");
//        }
        try{
            wait = new WebDriverWait(driver, waitDuration);
            wait.until(ExpectedConditions.presenceOfElementLocated(pLocator));
            wait.until(ExpectedConditions.visibilityOfElementLocated(pLocator));
            System.err.println("[FAILED] Element displayed");
        }catch(TimeoutException e){
            System.out.println("[PASSED] Element not displayed");
        }
    }

    public static void verifyObjectTextMatch(By pLocator, String pExpectedText) throws Exception{

        if(isDisplayed(pLocator)){
            String sActualText = driver.findElement(pLocator).getText();

            System.out.println("[INFO] Object text is: " + sActualText);

            if (sActualText.equals(pExpectedText)){
                System.out.println("[PASS] Object text matches the expected: " + pExpectedText);
            } else{
                System.err.println("[FAILED] Object text does NOT match the expected");
            }
        }else{
            System.err.println("[ERROR] Element not displayed");
        }
    }

    public static void verifyObjectCount(By pLocator, int pExpectedCount) throws Exception{

        if (isDisplayed(pLocator)){
            List<WebElement> elementList = driver.findElements(pLocator);

            int iActualObjectCount = elementList.size();

            System.out.println("[INFO] Object count is: " + iActualObjectCount);

            if (iActualObjectCount == pExpectedCount){
                System.out.println("[PASS] Object count matches the expected: " + pExpectedCount);
            } else{
                System.err.println("[FAILED] Object count does NOT match the expected");
            }
        }else{
            System.err.println("[ERROR] Element not displayed");
        }
    }

    public static void scrollToTop(By pLocator) throws Exception{
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',inline: 'start'});", driver.findElement(pLocator));
            Thread.sleep(200);
        }catch(Exception e){
            System.err.println("[ERROR] '[ERROR] Unable to scroll element due to: " + e);
        }
    }

    public static void scrollToMiddle(By pLocator) throws Exception{
        try{
            JavascriptExecutor executor = (JavascriptExecutor)driver;
            executor.executeScript("arguments[0].scrollIntoView({behavior: 'smooth',block: 'center'});", driver.findElement(pLocator));
            Thread.sleep(500);
        }catch(Exception e){
            System.err.println("[ERROR] '[ERROR] Unable to scroll element due to: " + e);
        }
    }

}
