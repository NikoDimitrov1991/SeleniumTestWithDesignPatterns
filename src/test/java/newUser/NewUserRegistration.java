package newUser;

import core.Base;
import org.testng.annotations.Test;
import pages.CompleteRegPage;
import pages.RegistrationPage;
import pages.WelcomePage;

public class NewUserRegistration extends Base {

@Test
public static void newUserRegistration() {
    WelcomePage.startRegistration();
    RegistrationPage.credentialsInfo("Nikolay","Dimitrov","password123!","password123!");
    RegistrationPage.randomMailAndPhone();
    RegistrationPage.agreeTermsAndFinishRegistration();
    CompleteRegPage.verifyValidationMessage();
}

    @Test
    public static void newUserRegistrationAlternative() {
        WelcomePage.startRegistration();
        RegistrationPage.newUserRegistrationData();
        CompleteRegPage.verifyValidationMessage();
    }
}
