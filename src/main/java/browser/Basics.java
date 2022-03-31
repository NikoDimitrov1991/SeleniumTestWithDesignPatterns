package browser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Basics {
    public static WebDriver driver;
    public static WebDriverWait wait;

    public static void setUp() {
        System.setProperty("webdriver.chrome.driver", "C:\\Browser Drivers for Selenium\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        wait = new WebDriverWait(driver, 5L);
        driver.get("http://shop.pragmatic.bg");
    }

    public static void tearDown() {
        driver.quit();
    }
}
