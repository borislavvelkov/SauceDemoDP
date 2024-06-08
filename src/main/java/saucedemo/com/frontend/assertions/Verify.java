package saucedemo.com.frontend.assertions;

import org.openqa.selenium.By;
import org.testng.Assert;
import saucedemo.com.utils.Browser;

public class Verify {


    public static void itemsIsInTheCart(String expectedItemInTheCart, String messageOnFailure) {
        String actualItemsInTheCart = Browser.driver.findElement(By.cssSelector(".shopping_cart_badge")).getText();
        Assert.assertEquals(actualItemsInTheCart, expectedItemInTheCart, "the number of the items are not equal and your test failed");
    }

    public static void successfulCheckOut(String expectedCheckedout, String messageOnFailure) {
        String actualCheckedOut = Browser.driver.findElement(By.cssSelector(".title")).getText();
        Assert.assertEquals(actualCheckedOut, "Checkout: Your Information", "the text did not match and your test failed");
    }
}
