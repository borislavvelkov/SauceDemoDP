package saucedemo.com.frontend.components.cart;

import org.openqa.selenium.By;
import saucedemo.com.utils.Browser;

public class Cart {
    public static void openCart() {
        Browser.driver.findElement(By.cssSelector(".shopping_cart_link")).click();
    }
}
