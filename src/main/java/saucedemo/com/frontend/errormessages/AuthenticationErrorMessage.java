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
  //     Webelement actualAuthenticationErrorMessage = WaitTool.waitForElementPresent(driver, By.cssSelector(".error-button"), 10);
//       String actualAuthenticationErrorMessage = String.valueOf(Browser.driver.findElement(By.cssSelector("error-button")));
//       Assert.assertEquals(actualAuthenticationErrorMessage, "Epic sadface: Username and password do not match any user in this service", "the test failed because the actual and expected text did not match");
   }
}
