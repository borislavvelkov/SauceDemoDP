package saucedemo.com.frontend.negative;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import saucedemo.com.frontend.errormessages.AuthenticationErrorMessage;
import saucedemo.com.pages.frontend.Login;
import saucedemo.com.utils.Browser;
import static org.openqa.selenium.WebElement.*;

import static saucedemo.com.frontend.errormessages.AuthenticationErrorMessage.*;

public class LoginTests {
    @BeforeMethod
    public void setup() {
        Browser.open();
    }

    @Test
    public void loggingWithInvalidUserName() {
        Login.navigate();
        Login.login("notstandartuser", "secret_sauce");
        AuthenticationErrorMessage.
                verifyAuthenticationErrorMessage
                        ( "expectedErrorMessageText", "messageOnFailure");
    }

    @AfterMethod
    public void tearDown() {
        Browser.quit();
    }
}

