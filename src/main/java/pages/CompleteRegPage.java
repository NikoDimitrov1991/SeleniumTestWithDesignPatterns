package pages;

import browser.Basics;
import core.BasePage;
import org.openqa.selenium.By;
import org.testng.Assert;

public class CompleteRegPage extends BasePage {

    private static final By NEW_USER_ASSERT = (By.xpath("//h1[normalize-space()='Your Account Has Been Created!']"));


    public static void verifyValidationMessage() {
        waitForElementVisibility(NEW_USER_ASSERT, 3);
        String newUserTextAssert = Basics.driver.findElement(NEW_USER_ASSERT).getText();
        Assert.assertEquals(newUserTextAssert,"Your Account Has Been Created!");
    }
}
