package saucedemo.com.frontend.negative;

import org.testng.annotations.Test;
import saucedemo.com.frontend.BaseTest;
import saucedemo.com.frontend.errormessages.AuthenticationErrorMessage;
import saucedemo.com.pages.frontend.Login;

public class LoginTests extends BaseTest {
//    @BeforeMethod
//    public void setup() {
//        Browser.open();
//    }

    @Test
    public void loggingWithInvalidUserName() {
        Login.navigate();
        Login.login("notstandartuser", "secret_sauce");
        AuthenticationErrorMessage.
                verifyAuthenticationErrorMessage
                        ( "expectedErrorMessageText", "messageOnFailure");
    }

//    @AfterMethod
//    public void tearDown() {
//        Browser.quit();
//    }
}

