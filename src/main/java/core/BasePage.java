package core;

import browser.Basics;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    protected static WebElement waitForElementVisibility(By locator, long timeInSeconds) {
        WebDriverWait wait = new WebDriverWait(Basics.driver, timeInSeconds);
        WebElement foundElement = wait.until(ExpectedConditions.visibilityOfElementLocated(locator));
        return foundElement;
    }
}
