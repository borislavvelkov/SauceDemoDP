package saucedemo.com.pages.frontend.components;

import org.openqa.selenium.By;
import org.testng.Assert;
import saucedemo.com.utils.Browser;

public class Header {

    /**
     * Asserts the text of the header component after successfull login
     * @param expectedHeaderComponentText the expected text you would like to assert for
     * @param messageOnFailure the message that will appear in your reports in case of test failure
     */
    public static void verifyCartAvailability(String expectedHeaderComponentText, String messageOnFailure) {
        String actualHeaderComponentText = Browser.driver.findElement(By.className("app_logo")).getText();
        Assert.assertEquals(actualHeaderComponentText, expectedHeaderComponentText,messageOnFailure);

    }
}
