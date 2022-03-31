package pages;


import browser.Basics;
import core.BasePage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class WelcomePage extends BasePage {

    private static final By MY_ACCOUNT = By.xpath("(//span[normalize-space()='My Account'])[1]");
    private static final By USER_REGISTER = By.xpath("//a[normalize-space()='Register']");


    public static void startRegistration (){
        Basics.driver.findElement(MY_ACCOUNT).click();
        Basics.driver.findElement(USER_REGISTER).click();

    }

}
