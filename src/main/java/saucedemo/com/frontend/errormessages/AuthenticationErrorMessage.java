package saucedemo.com.frontend.errormessages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import saucedemo.com.utils.Browser;
import saucedemo.com.utils.WaitTool;

import java.util.Objects;

import static saucedemo.com.utils.Browser.driver;

public class AuthenticationErrorMessage {

    /**
     * Asserts the text of the error message after trying to sign in with invalid credentials
     * @param expectedErrorMessageText the expected error message text you would like to assert for
     * @param messageOnFailure the message that will appear in your reports in case of test failure
     */
   public static void verifyAuthenticationErrorMessage(String expectedErrorMessageText, String messageOnFailure) {
       String actualAuthenticationErrorMessage = Browser.driver.findElement(By.cssSelector("div.error-message-container.error h3")).getText();
       Assert.assertEquals(actualAuthenticationErrorMessage, "Epic sadface: Username and password do not match any user in this service", "the test failed because the actual and expected text did not match");
   }
}
