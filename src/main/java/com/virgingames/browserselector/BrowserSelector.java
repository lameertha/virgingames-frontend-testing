package com.virgingames.browserselector;

import com.virgingames.basepage.BasePage;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

/* Created
 * by Lamee */
public class BrowserSelector extends BasePage {
    private static final Logger log = LogManager.getLogger(BrowserSelector.class.getName());

    String projectPath = System.getProperty("user.dir");

    public void selectBrowser(String browser) {
        if (browser.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", projectPath + "\\driver\\chromedriver.exe");
            driver = new ChromeDriver();
            log.info("Chrome browser is Launching");
        }
        if (browser.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver", projectPath + "\\driver\\geckodriver.exe");
            driver = new FirefoxDriver();
            log.info("Fire Fox browser is Launching");
        }
        if (browser.equalsIgnoreCase("ie")) {
            System.setProperty("webdriver.ie.driver", projectPath + "\\driver\\IEDriverServer.exe");
            driver = new InternetExplorerDriver();
            log.info("Internet Explore browser is Launching");
        } else {
            System.out.println("Browser is not available");
            log.info("Browser is not available");
        }
    }

}
