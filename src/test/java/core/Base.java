package core;


import browser.Basics;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Base {

    @BeforeMethod
    protected static void setupBrowser() {
        Basics.setUp();
    }

    @AfterMethod
    protected static void quitBrowser() {
        Basics.tearDown();
    }
}




