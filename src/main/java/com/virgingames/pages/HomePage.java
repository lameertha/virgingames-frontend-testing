package com.virgingames.pages;

import com.cucumber.listener.Reporter;
import com.virgingames.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/* Created
 * by Lamee */
public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    /**
     * stored elements locator
     */
    @FindBy(xpath = "//button[@class='button close-cookie-policy']")
    WebElement _cookie;
    @FindBy(xpath = "//a[contains(text(),'Login')]")
    WebElement _loginTab;



    public void clickOnCookie() {
        Reporter.addStepLog("Clicking on cookie" + _cookie.toString() + "<br>");
        clickOnElement(_cookie);
        log.info("Clicking on cookie" + _cookie.toString());
    }


    public void clickOnLoginButton() {
        Reporter.addStepLog("Clicking on login button" + _loginTab.toString() + "<br>");
        clickOnElement(_loginTab);
        log.info("Clicking on login button " + _loginTab.toString());
    }


}
