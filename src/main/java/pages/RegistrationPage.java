package pages;

import browser.Basics;
import core.BasePage;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class RegistrationPage extends BasePage {

    private static final By FIRST_NAME = By.id("input-firstname");
    private static final By LAST_NAME = By.id("input-lastname");
    private static final By EMAIL = By.id("input-email");
    private static final By TELEPHONE = By.id("input-telephone");
    private static final By PASSWORD = By.id("input-password");
    private static final By PASSWORD_CONFIRMATION = By.id("input-confirm");
    private static final By TERMS_AGREE = By.xpath("//input[@name='agree']");
    private static final By CONTINUE_BUTTON = By.cssSelector("input[value='Continue']");

    static String mail = RandomStringUtils.randomAlphanumeric(10);
    static String randomMail = mail + "@yahoo.com";

    static String phoneNumberGenerator = RandomStringUtils.randomNumeric(8);
    static String randomTelephone = "08" + phoneNumberGenerator;

    public static void newUserRegistrationData() {
        waitForElementVisibility(TERMS_AGREE,4);
        Basics.driver.findElement(FIRST_NAME).sendKeys("Nikolay");
        Basics.driver.findElement(LAST_NAME).sendKeys("Dimitrov");
        Basics.driver.findElement(EMAIL).sendKeys(randomMail);
        Basics.driver.findElement(TELEPHONE).sendKeys(randomTelephone);
        Basics.driver.findElement(PASSWORD).sendKeys("parola123!!!!");
        Basics.driver.findElement(PASSWORD_CONFIRMATION).sendKeys("parola123!!!!");
        Basics.driver.findElement(TERMS_AGREE).click();
        Basics.driver.findElement(CONTINUE_BUTTON).click();
    }

    public static void credentialsInfo (String firstName,String lastName, String password, String passwordConfirm){
        waitForElementVisibility(TERMS_AGREE,4);
        Basics.driver.findElement(FIRST_NAME).sendKeys(firstName);
        Basics.driver.findElement(LAST_NAME).sendKeys(lastName);
        Basics.driver.findElement(PASSWORD).sendKeys(password);
        Basics.driver.findElement(PASSWORD_CONFIRMATION).sendKeys(passwordConfirm);
    }
    public static void randomMailAndPhone(){
        Basics.driver.findElement(EMAIL).sendKeys(randomMail);
        Basics.driver.findElement(TELEPHONE).sendKeys(randomTelephone);
    }

    public static void agreeTermsAndFinishRegistration(){
        Basics.driver.findElement(TERMS_AGREE).click();
        Basics.driver.findElement(CONTINUE_BUTTON).click();
    }
}

