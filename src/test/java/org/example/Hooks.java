package org.example;

import org.example.driver.DriverManager;
import org.junit.After;
import org.junit.Before;

public class Hooks {
    DriverManager driverManager = new DriverManager();
    @Before
    public void setup() throws IllegalAccessException {
        driverManager.runOnLocalBrowser();
        driverManager.goToUrl();
        driverManager.maxBrowser();
        driverManager.implicitWait();
    }

    @After
    public void exit(){driverManager.closeBrowse();}
}
